public class Contacts {
    String FirstName;
    String LastName;
    String Address;
    String City;
    String Zip;
    String PhoneNum;
    String Email;

    public Contacts(String firstName, String lastName, String address, String city, String zip, String phoneNum, String email) {
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        City = city;
        Zip = zip;
        PhoneNum = phoneNum;
        Email = email;
    }

    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getAddress(){
        return Address;
    }
    public String getCity(){
        return City;
    }
    public String getZip(){
        return Zip;
    }
    public String getPhoneNum(){
        return PhoneNum;
    }
    public String getEmail(){
        return Email;
    }

    public void setFirstName(String firstName){
        FirstName = firstName;
    }
    public void setLastName(String lastName){
        LastName = lastName;
    }
    public void setAddress(String address){
        Address = address;
    }
    public void setCity(String city){
        City = city;
    }
    public void setZip(String zip){
        Zip = zip;
    }
    public void setPhoneNum(String phoneNum){
        PhoneNum = phoneNum;
    }
    public void setEmail(String email){
        Email = email;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Zip='" + Zip + '\'' +
                ", PhoneNum='" + PhoneNum + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
