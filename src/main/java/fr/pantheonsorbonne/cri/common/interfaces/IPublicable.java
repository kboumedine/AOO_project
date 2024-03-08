package fr.pantheonsorbonne.cri.common.interfaces;

import fr.pantheonsorbonne.cri.common.exceptions.PublicationException;

public interface IPublicable {
    void publish() throws PublicationException; 
    String displayDetails() throws PublicationException; 
}
