package P_25_10_2021_User;

public class User {
    private  int id;
    private String username,password;
    private Role[] roles;

    public User(int id,String username,String password,Role[] roles){
        this.id = id;
        this.password = password;
        this.username = username;
        this.roles = roles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void toStringClass(){
        System.out.println("ID: " + id);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        for(int i = 0; i < roles.length; i++){
            System.out.println("name [" + i + "]: "+ roles[i].getName());
            System.out.println("authority [" + i + "]: " + roles[i].getAuthority());
        }
    }
}
