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

}
