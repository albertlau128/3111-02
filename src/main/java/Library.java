/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import lab2.ex1.Book;
public class Library {
	public static void main(String arg[]) {
		final String arr[]= {"Basic Java","Advance Java","Forget about Java"};
		Book b = new Book(arr);
		System.out.println("The title of Ch. 1 is " + b.getChapter(1));
		String anotherArr[]=b.getChapters();
		
		System.out.println("There're "+anotherArr.length+" chapters.");
		System.out.println(anotherArr);
	}
    public boolean someLibraryMethod() {return true;}
}