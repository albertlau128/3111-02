package lab2.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS = 10;
	public Book() {
		chapters = new String[DEFAULT_CHAPTERS];
		for(int i=0;i<chapters.length;i++)
			chapters[i]="Chapter "+i;		
	}
	
	public Book(String argu[]) {
		chapters = new String[argu.length];
		for(int i=0;i<argu.length;i++)
			chapters[i]=argu[i];
	}
	
	public String getChapter(int i) {
		if (i<0 || i>chapters.length)
			return "invalid chapter";
		else return chapters[i];
	}
	
	public String[] getChapters() {
		return chapters;
	}
}
