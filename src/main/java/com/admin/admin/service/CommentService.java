package com.admin.admin.service;


import java.util.List;

public interface CommentService {
    List<Comment> getCommentByTimeshare(Long id);
    boolean addComment(Comment comment);
    List<Comment> getAll();
    boolean deleteComment(Long id);
}
