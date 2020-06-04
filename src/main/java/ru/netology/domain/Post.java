package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;         //идентификатор автора записи (от чьего имени опубликована запись)
    private int createdBy;      //идентификатор администратора, который опубликовал запись
    private int postTime;       //время публикации записи в формате unixtime
    private String postText;
    private int replyOwnerId;   //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;    //идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly;    //1, если запись была создана с опцией «Только для друзей»
    private String copyright;   //источник материала
    private String postType;    //тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private int signerId;       //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int canPin;         //информация о том, может ли текущий пользователь закрепить запись
    private int canDelete;      //информация о том, может ли текущий пользователь удалить запись
    private int canEdit;        //информация о том, может ли текущий пользователь редактировать
    private int isPinned;       //информация о том, что запись закреплена
    private int markedAsAds;    //информация о том, содержит ли запись отметку "реклама"
    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя
    private int postponedId;    //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
    private String postImage;
    private String postImageLink;
    private likesList likesList;
    private commentsList commentsList;
    private repostsList repostsList;
    private viewerList viewerList;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getPostTime() {
        return postTime;
    }

    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostImageLink() {
        return postImageLink;
    }

    public void setPostImageLink(String postImageLink) {
        this.postImageLink = postImageLink;
    }

    public likesList getLikesList() {
        return likesList;
    }

    public void setLikesList(likesList likesList) {
        this.likesList = likesList;
    }

    public commentsList getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(commentsList commentsList) {
        this.commentsList = commentsList;
    }

    public repostsList getRepostsList() {
        return repostsList;
    }

    public void setRepostsList(repostsList repostsList) {
        this.repostsList = repostsList;
    }

    public viewerList getViewerList() {
        return viewerList;
    }

    public void setViewerList(viewerList viewerList) {
        this.viewerList = viewerList;
    }

}
