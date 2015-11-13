package chapter_1_JavaBuildingBlocks;

// Java classes are grouped into packages.
// These are logical grouping for classes.

// import tells us where to find Random.
import java.util.Random;

/* Wilcards
* You might think that including so many classes slows down your  program, but it doesn't.
* The compiler figures out what's actually needed.
* Using the wilcard can shorten the import list.
* java.lang is special in that it is automatically imported.
*/

/*
 * Example:
 * Files and Paths are both in the package java.nio.file.
 */

// 1. The shorter ıne is to use wilcard to import both at the same time.
import java.nio.file.*;

// 2. The other choice is to import both classes explicitly.
import java.nio.file.Paths;
import java.nio.file.Files;

/*
 * IMPORTANT
 * 
 * import java.nio.*; // NO GOOD - a wilcard only matches class names, not "file.Files"
 * 
 * import java.nio.*.*; // NO GOOD - you can only have one wilcard and it must be at the end.
 * 
 * import java.nio.files.Paths.*; // NO GOOD - you cannot import methods, only class names.
 * 
 */


import java.util.*; 

public class lesson3_PackageAndImport {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.println(r.nextInt(10)); // Print a number between 0 and 9.
	}

}
