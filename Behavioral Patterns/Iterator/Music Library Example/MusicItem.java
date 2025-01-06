public class MusicItem {
    private final String singer;
    private final String song;
    private final double duration;

    public MusicItem(String singer, String song, double duration){
        this.singer = singer;
        this.song = song;
        this.duration = duration;
    }

    public String getSinger(){
        return singer;
    }

    public String getSong(){
        return song;
    }

    public double getDuration(){
        return duration;
    }

    @Override
    public String toString() {
        return "MusicItem{" +
                "singer='" + singer + '\'' +
                ", song='" + song + '\'' +
                ", duration=" + duration +
                '}';
    }
}
