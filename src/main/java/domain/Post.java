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
    private boolean friendsOnly;
    private CommentsWidget commentWidget;
    private Copyright copyright;
    private LikeWidget likeWidget;
    private ShareWidget shareWidget;
    private Views views;
    private String postType;
    private PostSource postSource;
    private GeoLocation location;
    private int signerId;
    private boolean canPin;
    private boolean canEdit;
    private boolean canDelete;
    private boolean isPinned;
    private boolean isAd;
    private boolean isFavorite;

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

    public boolean getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
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

    public boolean getCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean getPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean getAd() {
        return isAd;
    }

    public void setAd(boolean ad) {
        isAd = ad;
    }

    public boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }


}


