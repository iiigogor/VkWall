package ru.netology.domain;

public class LikesInfo {
    private int id;
    private int ownerId;
    private int data;
    private String typeLike;
    private CountTheAmountID countTheAmountID;
    // + get/set на все поля

}

public class CountTheAmountID {
    private int count;
    private boolean userLikes;
    private boolean canLike;
    private boolean canPublish;
    // + get/set
}

public class CommentsInfo {
    private int authorid;
    private int countId;
    private CoundComments coundCommets;
    private String textInfo;
    // + get/set
}

public class CoundComments {
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
}

public class RepostsInfo {
    private int ownerPostId;
    private boolean userRepost;
    private CountRepost countRepost;
    // + get/set
}

public class CountRepost {
    private int count;
    private boolean userReposted;
    // + get/set
}

public class countView {
    private int count;

    // + get/set

}


