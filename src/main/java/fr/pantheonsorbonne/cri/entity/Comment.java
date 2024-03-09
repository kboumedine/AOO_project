package fr.pantheonsorbonne.cri.entity;

import java.util.List;

import fr.pantheonsorbonne.cri.common.exceptions.CommentException;
import fr.pantheonsorbonne.cri.common.interfaces.ICommentable;

public class Comment implements ICommentable {

    @Override
    public void addComment(Comment comment) throws CommentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addComment'");
    }

    @Override
    public List<Comment> GetComments() throws CommentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetComments'");
    }
    
}
