package fr.pantheonsorbonne.cri.entity;

import java.util.List;

import javax.security.auth.login.LoginException;

import fr.pantheonsorbonne.cri.common.exceptions.CommentException;
import fr.pantheonsorbonne.cri.common.exceptions.IncidentException;
import fr.pantheonsorbonne.cri.common.exceptions.LogoutException;
import fr.pantheonsorbonne.cri.common.exceptions.PublicationException;
import fr.pantheonsorbonne.cri.common.exceptions.RegisterException;
import fr.pantheonsorbonne.cri.common.exceptions.ReportsException;
import fr.pantheonsorbonne.cri.common.exceptions.SignUpException;
import fr.pantheonsorbonne.cri.common.interfaces.ICommentable;
import fr.pantheonsorbonne.cri.common.interfaces.IPublicable;
import fr.pantheonsorbonne.cri.common.interfaces.IUserActions;


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

public class User implements IUserActions, ICommentable, IPublicable{
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

    @Override
    public void addComment(Comment comment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addComment'");
    }

    @Override
    public List<Comment> GetComments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetComments'");
    }

    @Override
    public boolean login(String email, String password) throws LoginException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public void logout() throws LogoutException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }

    @Override
    public void register(String email, String password) throws RegisterException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public void signUp(String email, String password) throws SignUpException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'signUp'");
    }

    @Override
    public void reportIncident(Incident incident) throws IncidentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reportIncident'");
    }

    @Override
    public void publishPublication(Publication publication) throws PublicationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'publishPublication'");
    }

    @Override
    public void commentPublication(Comment comment, Publication publication) throws CommentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'commentPublication'");
    }

    @Override
    public void seeIncidentsReported() throws ReportsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seeIncidentsReported'");
    }

    @Override
    public void publish() throws PublicationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'publish'");
    }

    @Override
    public String displayDetails() throws PublicationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayDetails'");
    }

}
