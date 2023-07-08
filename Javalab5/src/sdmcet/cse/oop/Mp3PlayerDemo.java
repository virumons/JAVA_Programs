package sdmcet.cse.oop;

interface MediaPlayer{
	void play();
	void pause();
	void stop();
	
}

class Mp3 implements MediaPlayer{
	public void play() {
		System.out.println("Mp3 play");
	}
	public void pause() {
		System.out.println("Mp3 PAUSE");
		
	}
	public void stop() {
		System.out.println("Mp3 STOP");
	}
}
class Mp4 implements MediaPlayer{
	public void play() {
		System.out.println("Mp4 PLAY");
		
	}
	public void pause() {
		System.out.println("Mp4 PAUSE");
		
	}
	public void stop() {
		System.out.println("Mp4 STOP");
	}
}
class WmA implements MediaPlayer{
	public void play() {
	System.out.println("WMA PLAY");
	
}
public void pause() {
	System.out.println("WMA PAUSE");
	
}
public void stop() {
	System.out.println("WMA STOP");
}
}
	class WAV implements MediaPlayer{
		public void play() {
			System.out.println("WMA PLAY");
			
		}
		public void pause() {
			System.out.println("WMA PAUSE");
			
		}
		public void stop() {
			System.out.println("WMA STOP");
		}
	}
public class Mp3PlayerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  Mp3 mp3=new Mp3();
          Mp4 mp4=new Mp4();
          WAV wav=new WAV();
          WmA wma=new WmA();
          
          mp3.play();
          mp3.pause();
          mp3.stop();
          System.out.println();
          
          mp4.play();
          mp4.pause();
          mp4.stop();
          System.out.println();
          
          wav.play();
          wav.pause();
          wav.stop();
          System.out.println();
          
          wma.play();
          wma.pause();
          wma.stop();
          System.out.println();
	}

}
