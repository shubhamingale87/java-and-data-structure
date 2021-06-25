package interfaces;

public class person implements student,youtuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			person p=new person();
			p.study();
			p.makevideo();
			p.videoeditor();
			p.watch();
			youtuber y;
			
	}
	public void study() {
		System.out.println("the student is studying right now");
	}
	public void makevideo() {
		System.out.println("The youtuber is making videos");
	}
	public void videoeditor() {
		System.out.println("legts edit");
	}
	public void watch() {
		System.out.println("watching youtube");
	}
}
