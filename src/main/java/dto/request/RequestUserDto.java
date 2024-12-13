package dto.request;

public class RequestUserDto {
    private String email;
    private String fName;
    private String lName;

    @Override
    public String toString() {
        return "UserDto{" +
                "email='" + email + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", contact='" + contact + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private String contact;
    private String password;

    public RequestUserDto(){

    }
    public RequestUserDto(String email, String fName, String lName, String contact, String password) {
        this.setEmail(email);
        this.setfName(fName);
        this.setlName(lName);
        this.setContact(contact);
        this.setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
