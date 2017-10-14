
import java.sql.*;

public class Database {
	
	private static Connection connessioneDB;
	private static ResultSet resultSet;
	private static Statement statement;
	
	private static String urlDatabase;
	private static String nomeUtente;
	private static String passwUtente;
	private static String driver;
	private static Database istance;
	
	//res.close(); // chiudere le risorse DB è obbligatorio
	//cmd.close();
	
	private Database(String urlDatabase, String nomeUtente, String passwdUtente, String driver) {
		if (!(urlDatabase == null)) {
			setUrlDatabase(urlDatabase);
		} else {
			setUrlDatabase("jdbc:mysql://127.0.0.1/prova");
		}
		if (!(nomeUtente == null)) {
			setNomeUtente(nomeUtente);
		} else {
			setNomeUtente("root");
		}
		if (!(passwdUtente == null)) {
			setPasswdUtente("");
		}
		if (!(driver == null)) {
			setDriver(driver);
		} else {
			setDriver("com.mysql.jdbc.Driver");
		}
		if (this.connetti()) {
			System.out.println("Connesso al Database " + getUrlDatabase());
		}else {
			System.out.println("Non Connesso al Database " + getUrlDatabase());
		}
	}

	public static Database create(String urlDatabase, String nomeUtente, String passwdUtente, String driver) {
		if (istance == null) {
			istance = new Database(urlDatabase, nomeUtente, passwdUtente, driver);
		}
		return istance;
	}
	
	public boolean connetti() {
		try {
			Class.forName(getDriver());
			setConnessioneDB(DriverManager.getConnection(getUrlDatabase(), getNomeUtente(), getPasswUtente()));
		} catch (SQLException e1) {
			System.out.println("Errore connessione Database");			
			return false;
		} catch (ClassNotFoundException e2) {
			System.out.println("Errore caricamento Driver");
			return false;
		}
		return true;
	}

	public boolean disconnetti() {
		try {
			getConnessioneDB().close();
		} catch (SQLException e) {
			System.out.println("Fallimento disconnessione Database " + getUrlDatabase());
			return false;
		}
		return true;
	}
	
	public boolean isTabellaEsistente(String nomeTabella) {
		DatabaseMetaData md;
		boolean ritorno;
		try {
			md = getConnessioneDB().getMetaData();
			ResultSet rs = md.getTables(null, null, nomeTabella, null);
			if (rs.next()) {
				ritorno = true;
			}else {
				ritorno = false;
			}			
		} catch (SQLException e) {
			System.out.println("Errore ricerca tabella");
			ritorno = false;
		}
		return ritorno;
	}

	public boolean creaTabella(String nomeDominio, String tipoTabella ) {
		String nomeTabella;
		String query;
		switch (tipoTabella) {
		case "blacklist":
			nomeTabella = "blacklist_" + nomeDominio;
			query = "CREATE TABLE " + nomeTabella + "(" 
						+ "id INT NOT NULL AUTO_INCREMENT, "
						+ "link VARCHAR(100) NOT NULL, "
						+ "analizzato` BOOLEAN NOT NULL, "
						+ "PRIMARY KEY (id));";			
			try {
				setStatement(getConnessioneDB().createStatement());
				getStatement().executeUpdate(query);
				getStatement().close();
			} catch (SQLException e) {
				System.out.println("errore creazione tabella " + nomeTabella);
				return false;
			}
			return true;
		
		case "parole":
			nomeTabella = "parole_" + nomeDominio;
			query = "CREATE TABLE " + nomeTabella + "("
					+ "id INT NOT NULL AUTO_INCREMENT, "
					+ "parola VARCHAR(100) NOT NULL, "
					+ "occorrenza INT NOT NULL, "
					+ "PRIMARY KEY (id));";			
			try {
				setStatement(getConnessioneDB().createStatement());
				getStatement().executeUpdate(query);
				getStatement().close();
			} catch (SQLException e) {
				System.out.println("errore creazione tabella " + nomeTabella);
				return false;
			}
			return true;
			
		case "links":
			nomeTabella = "links" + nomeDominio;
			query = "CREATE TABLE links_ooo ("
					+ "id INT NOT NULL AUTO_INCREMENT, "
					+ "link VARCHAR(100) NOT NULL, "
					+ "analizzato BOOLEAN NOT NULL, "
					+ "PRIMARY KEY (`id`));";
			try {
				setStatement(getConnessioneDB().createStatement());
				getStatement().executeUpdate(query);
				getStatement().close();
			} catch (SQLException e) {
				System.out.println("errore creazione tabella " + nomeTabella);
				return false;
			}
			return true;
		}
		return false;
	}
	
	/////////////////////////////////////////setter&getter////////////////////////////////////////////77
	
 	public static void setUrlDatabase(String urlDatabase) {
		Database.urlDatabase = urlDatabase;
	}

	public static void setNomeUtente(String nomeUtente) {
		Database.nomeUtente=nomeUtente;
	}
	
	public static void setPasswdUtente(String passwdUtente) {
		Database.passwUtente=passwdUtente;
	}

	public static void setDriver(String driver) {
		Database.driver = driver;
	}

	public static void setConnessioneDB(Connection connessioneDB) {
		Database.connessioneDB = connessioneDB;
	}

	public static void setStatement(Statement statement) {
		Database.statement = statement;
	}
	
	public static void setResultSet(ResultSet resultSet) {
		Database.resultSet = resultSet;
	}
	
	public static Connection getConnessioneDB() {
		return connessioneDB;
	}
	
	public static Statement getStatement() {
		return statement;
	}
	
	public static ResultSet getResultSet() {
		return resultSet;
	}
	
	public static String getUrlDatabase() {
		return urlDatabase;
	}
	
	public static String getNomeUtente() {
		return nomeUtente;
	}
	
	public static String getPasswUtente() {
		return passwUtente;
	}

	public static String getDriver() {
		return driver;
	}
	
}