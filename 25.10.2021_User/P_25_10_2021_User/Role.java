package P_25_10_2021_User;
public class Role {
    private String name;
    private String authority;

    public  Role(String Name,String Authority){
        this.name = Name;
        this.authority = Authority;
    }
    public void SetName(String n){
        this.name = n;
    }
    public void Authority(String a){
        this.authority = a;
    }
    public String getName(){
        return name;
    }
    public String getAuthority(){
        return authority;
    }
}
