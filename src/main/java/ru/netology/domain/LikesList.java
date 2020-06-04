package ru.netology.domain;

public class LikesList {
    private int likesCount;
    private int userLikes;  //наличие отметки «Мне нравится» от текущего пользователя
    private int canLike;    //информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private int canPublish; // информация о том, может ли текущий пользователь сделать репост записи
}
