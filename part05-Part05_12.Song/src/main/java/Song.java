
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // compare address
        if (this == compared) {
            return true;
        }

        // compare type
        if (!(compared instanceof Song)) {
            return false;
        }

        // compare values
        Song comparedPerson = (Song) compared;
        if (this.artist == comparedPerson.artist && this.name == comparedPerson.name
                && this.durationInSeconds == comparedPerson.durationInSeconds) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
