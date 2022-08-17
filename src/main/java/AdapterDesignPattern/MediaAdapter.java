package AdapterDesignPattern;

public class MediaAdapter implements MediaPlayer {

    AdvanceAudioPlayer advanceAudioPlayer;

    public MediaAdapter(AudioType audioPlayer){
        switch (audioPlayer){
            case VLC:
                advanceAudioPlayer = new VLCplayer();
            case MP4:
                advanceAudioPlayer = new Mp4player();

        }
    }
    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType){
            case VLC:
                advanceAudioPlayer.playVLC(fileName);
            case MP4:
                advanceAudioPlayer.playMp4(fileName);
        }
    }
}
