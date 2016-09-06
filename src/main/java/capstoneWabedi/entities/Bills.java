package capstoneWabedi.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 * Created by Justin on 9/1/16.
 */
@Entity
@Table(name = "bills")
public class Bills {
    public static enum relevance { STATE,NATIONAL}


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    String title;

    @NotNull
    @Column(columnDefinition = "Blob")
    private ArrayList<String> content;

    @NotNull
    String author;

    @NotNull
    @Column(columnDefinition = "Blob")
    private ArrayList<String> synopsis;

    long yesVote;

    long noVote;

    long billViews;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getContent() {
        return content;
    }

    public void setContent(ArrayList<String> content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<String> getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(ArrayList<String> synopsis) {
        this.synopsis = synopsis;
    }

    public long getYesVote() {
        return yesVote;
    }

    public void setYesVote(long yesVote) {
        this.yesVote = yesVote;
    }

    public long getNoVote() {
        return noVote;
    }

    public void setNoVote(long noVote) {
        this.noVote = noVote;
    }

    public long getBillViews() {
        return billViews;
    }

    public void setBillViews(long billViews) {
        this.billViews = billViews;
    }
}
