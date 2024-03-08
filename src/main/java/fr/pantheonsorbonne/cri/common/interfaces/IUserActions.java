package fr.pantheonsorbonne.cri.common.interfaces;

import javax.security.auth.login.LoginException;
import fr.pantheonsorbonne.cri.common.exceptions.LogoutException;
import fr.pantheonsorbonne.cri.common.exceptions.RegisterException;
import fr.pantheonsorbonne.cri.common.exceptions.SignUpException;
import fr.pantheonsorbonne.cri.security_map.model.Incident;
import fr.pantheonsorbonne.cri.support_network.model.Comment;
import fr.pantheonsorbonne.cri.support_network.model.Publication;
import fr.pantheonsorbonne.cri.common.exceptions.IncidentException;
import fr.pantheonsorbonne.cri.common.exceptions.PublicationException;
import fr.pantheonsorbonne.cri.common.exceptions.CommentException;
import fr.pantheonsorbonne.cri.common.exceptions.ReportsException;



public interface IUserActions {
    boolean login(String email, String password) throws LoginException; 
    void logout() throws LogoutException; 
    void register(String email, String password) throws RegisterException; 
    void signUp(String email, String password) throws SignUpException; 
    void reportIncident(Incident incident) throws IncidentException; 
    void publishPublication(Publication publication) throws PublicationException; 
    void commentPublication(Comment comment, Publication publication) throws CommentException; 
    void seeIncidentsReported() throws ReportsException;
}
