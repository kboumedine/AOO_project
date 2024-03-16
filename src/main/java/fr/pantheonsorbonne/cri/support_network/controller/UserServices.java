package fr.pantheonsorbonne.cri.support_network.controller;

import javax.security.auth.login.LoginException;

import fr.pantheonsorbonne.cri.common.exceptions.CommentException;
import fr.pantheonsorbonne.cri.common.exceptions.IncidentException;
import fr.pantheonsorbonne.cri.common.exceptions.LogoutException;
import fr.pantheonsorbonne.cri.common.exceptions.PublicationException;
import fr.pantheonsorbonne.cri.common.exceptions.ReportsException;
import fr.pantheonsorbonne.cri.common.exceptions.SignUpException;
import fr.pantheonsorbonne.cri.common.interfaces.IUserActions;
import fr.pantheonsorbonne.cri.entity.Comment;
import fr.pantheonsorbonne.cri.entity.Incident;
import fr.pantheonsorbonne.cri.entity.Publication;
import fr.pantheonsorbonne.cri.entity.User;

public class UserServices implements IUserActions{
    private UserRepository userRepository = new UserRepository();

    @Override
    public boolean login(String email, String password) throws LoginException {
        User user = userRepository.findUserByEmail(email);
        if (user != null){
            if(checkPassword(password, user.getPassword())){
                return true;
            }
        } else {
            throw new LoginException("User not found");
        }
        return false;
    }

    private boolean checkPassword(String password, String password2) {
        return password.equals(password2);
    }

    @Override
    public void logout() throws LogoutException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }

    @Override
    public boolean signUp(User user) throws SignUpException {
        if (user == null || user.getEmail() == null || user.getPassword() == null) {
            throw new SignUpException("User cannot be null");
        }
        //Does we hashing the password before saving it to the database? if YES then there is the code :
        /*
         * String hashedPassword = hashPassword(user.getPassword());
         * user.setPassword(hashedPassword);
         */
        return userRepository.saveUser(user);

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
    
}
