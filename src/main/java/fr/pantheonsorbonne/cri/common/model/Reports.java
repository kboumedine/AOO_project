package fr.pantheonsorbonne.cri.common.model;

import java.util.ArrayList;
import java.util.List;

import fr.pantheonsorbonne.cri.security_map.model.Incident;

    /*
     * This class represents a report of the application
     * 
     */

public class Reports {
    private List<Incident> incidents = new ArrayList<Incident>();

    public Reports() {
    }

    public List<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
    }

    public void addIncident(Incident incident) {
        this.incidents.add(incident);
    }
    
}
