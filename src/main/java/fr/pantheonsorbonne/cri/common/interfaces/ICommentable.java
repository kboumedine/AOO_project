package fr.pantheonsorbonne.cri.common.interfaces;

import java.util.List;

import fr.pantheonsorbonne.cri.common.exceptions.CommentException;
import fr.pantheonsorbonne.cri.support_network.model.Comment;

public interface ICommentable {
    void addComment(Comment comment) throws CommentException;
    List<Comment> GetComments() throws CommentException;
}

