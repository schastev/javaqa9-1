package domain;

import domain.attachment.LikeWidget;

public class Post {
    private int postId;
    private int postTime;
    private int posterId;
    private int authorId;
    private String postBody;
    private int replyPostId;
    private int replyPosterId;
    private Boolean friendsOnly;
    private CommentsWidget commentWidget;
    private Copyright copyright;
    private LikeWidget likeWidget;
    private ShareWidget shareWidget;
    private Views views;
    private String postType;
    private PostSource postSource;
    private GeoLocation location;
    private int signerId;
    private Boolean canPin;
    private Boolean canEdit;
    private Boolean canDelete;
    private Boolean isPinned;
    private Boolean isAd;
    private Boolean isFavorite;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostTime() {
        return postTime;
    }

    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getReplyPosterId() {
        return replyPosterId;
    }

    public void setReplyPosterId(int replyPosterId) {
        this.replyPosterId = replyPosterId;
    }

    public Boolean getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(Boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentsWidget getCommentWidget() {
        return commentWidget;
    }

    public void setCommentWidget(CommentsWidget commentWidget) {
        this.commentWidget = commentWidget;
    }

    public LikeWidget getLikeWidget() {
        return likeWidget;
    }

    public void setLikeWidget(LikeWidget likeWidget) {
        this.likeWidget = likeWidget;
    }

    public ShareWidget getShareWidget() {
        return shareWidget;
    }

    public void setShareWidget(ShareWidget shareWidget) {
        this.shareWidget = shareWidget;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public GeoLocation getLocation() {
        return location;
    }

    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public Boolean getCanPin() {
        return canPin;
    }

    public void setCanPin(Boolean canPin) {
        this.canPin = canPin;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public Boolean getPinned() {
        return isPinned;
    }

    public void setPinned(Boolean pinned) {
        isPinned = pinned;
    }

    public Boolean getAd() {
        return isAd;
    }

    public void setAd(Boolean ad) {
        isAd = ad;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }


}


