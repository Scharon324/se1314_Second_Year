public class College
{
    private String attributes;
    private String name;
    private String address;
    private long tel;
    private String email;
    // constructors
    public College(String name, String attributes ){
        this.name = name;
        this.attributes = attributes;       
    }
    
    public College(String address, long tel){
        this.address = address;
        this.email = email;
            }
            // mutators and accessors
    public void setAttributes(String attributes){
        this.attributes = attributes;
    }
    public String getAttributes(){
        return attributes;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setTel(long tel){
        this.tel = tel;
    }
    public long getTel(){
        return tel;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}