package domain.attachment;

public class Poll {
    private int pollId;
    private int posterId;
    private int date;
    private String question;
    private int votes;
    private Answer[] answers;
    private Boolean anonymous;
    private Boolean multiple;
    private Answer[] answerIds;
    private int endDate;
    private Boolean closed;
    private Boolean isBoard;
    private Boolean canEdit;
    private Boolean canReport;
    private Boolean canShare;
    private int authorId;
    private Photo photo;
    private Background background;
    private int[] friends;
}
