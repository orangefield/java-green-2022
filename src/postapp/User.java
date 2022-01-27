package postapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
