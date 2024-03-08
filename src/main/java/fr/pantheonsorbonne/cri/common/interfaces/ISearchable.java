package fr.pantheonsorbonne.cri.common.interfaces;

import java.util.List;

import fr.pantheonsorbonne.cri.common.exceptions.SearchException;

public interface ISearchable {
    List<?> search(String motClef) throws SearchException;
}
