package AdapterDesignPattern;

public class AdapterPatternDemo {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(AudioType.MP3 ,"beyond the horizon.mp3");
        audioPlayer.play(AudioType.VLC , "alone.mp4");
        audioPlayer.play(AudioType.AVI , "alone.mp4");
    }
}
