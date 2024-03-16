package fr.pantheonsorbonne.cri.support_network.controller;

import fr.pantheonsorbonne.cri.entity.User;

/*
 * This class represents a the interaction between user and the database
 * When he sign up, the user is added to the database
 * When he log in, the user is checked in the database
 * When he log out, the user is removed from the database
 * When he report an incident, the incident is added to the database
 * When he publish a publication, the publication is added to the database
 * When he comment a publication, the comment is added to the database
 * When he see the incidents reported, the incidents are retrieved from the database
 */

/*
 * We have to learn about JDBC to use the database
 * No one method could be implemented if we don't know how to use the database
 */

public class UserRepository {

    public User findUserByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUserByEmail'");
    }

    public boolean saveUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveUser'");
    }
}
