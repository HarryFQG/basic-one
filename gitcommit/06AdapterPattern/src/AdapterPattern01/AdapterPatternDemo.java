package AdapterPattern01;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer ap=new AudioPlayer();
		ap.play("mp4", "�۹���");
		ap.play("mp3", "�ξ���צ");
		ap.play("vlc", "С����");
		ap.play("not", "��³��֭");
	}

}
