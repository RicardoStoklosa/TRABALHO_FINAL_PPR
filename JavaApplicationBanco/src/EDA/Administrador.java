package EDA;

public class Administrador{
	private String login;
	private String senha;
        public Administrador(String l, String s) {
            this.login = l;
            this.senha = s;
        }
    
    public String getLogin() {
        return login;
    }

    
    public String getSenha() {
        return senha;
    }
 
}
