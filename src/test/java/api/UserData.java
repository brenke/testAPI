package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserData {
    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;

    @JsonCreator
    public UserData(@JsonProperty("id") int id, @JsonProperty("avatar") String avatar,
                    @JsonProperty("email") String email, @JsonProperty("first_name") String first_name,
                    @JsonProperty("last_name") String last_name) {
                this.id = id;
                this.avatar = avatar;
                this.email = email;
                this.first_name = first_name;
                this.last_name = last_name;
    }

    //public UserData(Integer id, String avatar) {
      //  this.id = id;
        //this.avatar = avatar;
    //}


    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAvatar() {
        return avatar;
    }
}
