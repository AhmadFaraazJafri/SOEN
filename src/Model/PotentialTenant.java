package Model;

public class PotentialTenant implements TenantObserver{
    private String name;
    private String email;

    public PotentialTenant(String name,String email){
        this.name=name;
        this.email=email;
    }
    @Override
    public void update() {

    }
    public void sendEmail(){
        System.out.println("Email sent to "+name+"("+email+") : The property you wanted is available. ");
    }
}
