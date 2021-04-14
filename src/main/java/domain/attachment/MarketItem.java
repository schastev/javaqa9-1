package domain.attachment;

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
    private boolean isFavorite;
    //optional
    private Photo[] photos;
    private boolean canComment;
    private boolean canRepost;
    private LikeWidget likes; //this one is different from the one used for posts
    private String url;
    private String buttonTitle;
}
