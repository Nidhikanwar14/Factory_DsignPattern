package AdapterDesignPattern;

interface AdvanceAudioPlayer {

    public void playVLC(String fileName);
    public void playMp4(String fileName);

}

class VLCplayer implements AdvanceAudioPlayer{

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}

class Mp4player implements AdvanceAudioPlayer{

    @Override
    public void playVLC(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file name: "+fileName);
    }
}