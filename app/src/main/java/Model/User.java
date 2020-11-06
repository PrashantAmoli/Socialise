package Model;

public class User {

    private String name;
    private String email;
    private String username;
    private String bio;
    private String imageurl;
    private String id;

    public User() {
    }

    public User(String name, String email, String username, String bio, String imageurl, String id) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.bio = bio;
        this.imageurl = imageurl;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/*
public class User {

    private String username;
    private String name;
    private String email;
    private String imageurl;
    private String id;
    private String bio;

    public User() {
        }

    public User(String username, String name, String email, String imageurl, String id, String bio) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.imageurl = imageurl;
        this.id = id;
        this.bio = bio;

        public String getUsername() {
            return username;
        }

        public void setUsername (String username){
            this.username = username;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getImageurl () {
            return imageurl;
        }

        public void setImageurl (String imageurl){
            this.imageurl = imageurl;
        }

        public String getId () {
            return id;
        }

        public void setId (String id){
            this.id = id;
        }

        public String getBio () {
            return bio;
        }

        public void setBio (String bio){
            this.bio = bio;
        }
    }

}*/
