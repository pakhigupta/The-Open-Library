
package tables;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class login {
    @Id
    String email_id;
    String password;
    String name;

    public login() {
    }

    public login(String email_id, String password, String name, String role) {
        this.email_id = email_id;
        this.password = password;
        this.name = name;
        this.role = role;
    }
    

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    String role;//admin/user
    
    
    
}
