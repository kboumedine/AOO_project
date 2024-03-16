package fr.pantheonsorbonne.cri.entity;

    /*
     * This class represents a user of the application
     the topic of this application is about security for people in city called "SafePath"
     An User can sign up and log in to the application
        An User can report a incident in the city
        An User can see the incidents reported in the city (on map with futur API google map)
        An User can see the incidents reported by him
        An User can see the incidents published message
        An User can see the incidents published comment in other user publication

     */

public class User {
    String userId ; // Have to be from the database
    String name;
    String email;
    String password;
    Reports reports;

    public User(String userId, String name, String email, String password, Reports reports) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.reports = reports;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Reports getReports() {
        return reports;
    }

    public void setReports(Reports reports) {
        this.reports = reports;
    }
}
