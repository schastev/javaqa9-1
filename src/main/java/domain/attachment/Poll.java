package domain.attachment;

public class Poll {
    private int pollId;
    private int posterId;
    private int date;
    private String question;
    private int votes;
    private Answer[] answers;
    private boolean anonymous;
    private boolean multiple;
    private Answer[] answerIds;
    private int endDate;
    private boolean closed;
    private boolean isBoard;
    private boolean canEdit;
    private boolean canReport;
    private boolean canShare;
    private int authorId;
    private Photo photo;
    private Background background;
    private int[] friends;
}
