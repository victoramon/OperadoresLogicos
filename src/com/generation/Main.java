package com.generation;

public class Main {

    public static void main(String[] args) {
	    boolean x = true;
	    boolean y = false;
	    boolean z = true;

	    System.out.println( (x && y) || (x && z) );
		System.out.println( (x || !y) && (!x || z) );
		System.out.println( x || y && z );
		System.out.println( !(x || y) && z );
		System.out.println( x || y || x && !z && !y );
		System.out.println( !x || !y || z && x && !y);
    }
}

