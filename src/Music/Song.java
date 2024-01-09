package Music;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Song implements Serializable {
    private int songId;
    private String songTitle;
    private double rating;
    private String lyrics;
    private boolean single;
}
