package domain.attachment;

import domain.LikeWidget;

public class MarketItem {
    private int itemId;
    private int posterId;
    private String title;
    private String description;
    private Price price;
    private Dimension dimensions;
    private int weight;
    private Category category;
    private String thumbPhoto;
    private int dateCreated;
    private int availability;
    private Boolean isFavorite;
    //optional
    private Photo[] photos;
    private Boolean canComment;
    private Boolean canRepost;
    private LikeWidget likes; //this one probably shouldn't be in this package since it's used elsewhere
    private String url;
    private String buttonTitle;
}
