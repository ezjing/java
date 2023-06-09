public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else {
            this.volume = volume;
        }
        System.out.println("Audio 현재 볼륨 : " + this.volume);
    }
}
