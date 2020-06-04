package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int postTime;
    private String postText;
    private String postImage;
    private String postImageLink;
    private likesList likesList;
    private commentsList commentsList;
    private repostsList repostsList;
    private viewerList viewerList;
}
