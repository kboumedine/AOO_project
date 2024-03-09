package fr.pantheonsorbonne.cri.common.interfaces;

import fr.pantheonsorbonne.cri.common.exceptions.CalculateSecurityLevelException;
import fr.pantheonsorbonne.cri.common.exceptions.SignalDangerousAreaException;
import fr.pantheonsorbonne.cri.entity.Localisation;

public interface ISecurisable {
    void signalDangerousArea(Localisation localisation) throws SignalDangerousAreaException; 
    int calculateSecurityLevel(Localisation localisation) throws CalculateSecurityLevelException; 
}

