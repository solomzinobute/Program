package computerApp;

public class Computer {
    //Member function to store IPAddress and value
    String IPAddress;
    float Value;
    
    //Parametrized constructor
    public Computer(String ip,float value ){
        this.IPAddress = ip;
        this.Value = value;
    }

    //Getters
    public String getIpAddress(){
        return this.IPAddress;
    }
    public float getValue(){
        return this.Value;
    }

    //Setters
    public void setIpAddress(String IpAddress){
        this.IPAddress = IpAddress;
    }
    public void setValue(int value){
        this.Value = value;
    }
    //toString method
    @Override
    public String toString(){
        String string = this.IPAddress + " $ " + this.Value+"\n";
        return string;
    }
}
