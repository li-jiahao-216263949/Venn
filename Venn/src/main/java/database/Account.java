package database;

import java.io.File;
import java.util.List;

public abstract class Account {
	String name;
	long pwd;
	static int User = 0;
	List<File> files;
	public Account(String name, long pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	
	public static long gethash(String p) {
		long result = 0L;
		for (int i = 0; i < p.length(); i++) {
			result += p.charAt(i);
		}
		return result;
	}
	
}
