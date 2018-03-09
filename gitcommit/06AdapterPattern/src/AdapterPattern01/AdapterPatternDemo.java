package AdapterPattern01;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer ap=new AudioPlayer();
		ap.play("mp4", "ÍÛ¹ş¹ş");
		ap.play("mp3", "ÑÎ¾¼¼¦×¦");
		ap.play("vlc", "Ğ¡±±¾©");
		ap.play("not", "ÃØÂ³ÍÜÖ­");
	}

}
