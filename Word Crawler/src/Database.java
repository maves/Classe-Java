import java.sql.*;

public class Database {
	//String urlDatabase = "http://172.16.99.94/phpmyadmin/";
	Connection con;ResultSet res;Statement cmd;
	
	
	
	private static Database istanza;
	private String urlDatabase;
	private String nomeUtente;
	private String passwUtente;
	private static String driver = "com.mysql.jdbc.Driver";

	private Database(String urlDatabase, String nomeUtente, String passwdUtente) {
		super();
		setUrlDatabase(urlDatabase);
		setNomeUtente(nomeUtente);
		setpasswdUtente(passwdUtente);
	}

	public static Database createSingleton(String urlDatabase, String nomeUtente, String passwdUtente) {
		if (istanza == null)
			new Database(urlDatabase, nomeUtente, passwdUtente);
		return istanza;
	}

	public void connetti() {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(this.urlDatabase, this.nomeUtente, this.passwUtente);
			Statement cmd = con.createStatement();

			String query = "SELECT * FROM nomeTabella";
			ResultSet res = cmd.executeQuery(query);
			while (res.next()) {
				System.out.println(res.getString("nomeColonna1"));
				System.out.println(res.getString("nomeColonna2"));
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
	}
	
	public void eseguiquery(String query) {
		
	}
	
	public void disconnetti() throws SQLException {
		res.close(); // chiudere le risorse DB è obbligatorio
		cmd.close();
		con.close();
	}
	
	public void setUrlDatabase(String urlDatabase) {
		this.urlDatabase = urlDatabase;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente=nomeUtente;
	}
	
	public void setpasswdUtente(String passwdUtente) {
		this.passwUtente=passwdUtente;
	}

}