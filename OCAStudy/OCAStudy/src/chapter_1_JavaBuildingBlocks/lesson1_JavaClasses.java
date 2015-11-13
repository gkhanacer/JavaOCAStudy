package chapter_1_JavaBuildingBlocks;

// In java, classes are basic building blocks.
// Java class a word with special meaning a 'keyword'.

// public keyword means the class can be used by other class.
// class keyword indicates you're defining a class.
// lesson1_JavaClasses gives the name of class.

// Most of the time, each Java class is defined in its own *.java file.
public class lesson1_JavaClasses {
	
	// Field
	String name;
	
	// Methods
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	// Commments aren't executable code.
	
	// Comment until end of line
	
	/*
	 * Multiple 
	 * line comment
	 People often type an asterisk(*) at the begining of each line of a
	 multiline comment to make easier to read.
	 * 
	 * But it isn't a rule.
	 */
	
	/**
	 * Javadoc comments.
	 * Javadoc tools knows how to read these comments.
	 */
	
	// Problem 
	//  /* */ */
	
			
}

/* 
 * You can even put two classses in the same file.
 * Only one public class can be exist in a file.
 * If you hava a public class, it needs to match filaname.
*/ 
class Animal{
	
}