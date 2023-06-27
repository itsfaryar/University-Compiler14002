/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 1998-2018  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import java.io.*;

public class JavaParser {

  public static void main(String argv[]) {
	  
    for (int i = 0; i < argv.length; i++) {
      try {
        System.out.println("Parsing [" + argv[i] + "]");
        Scanner s = new Scanner(new FileReader(argv[i]));
        Parser p = new Parser(s);
        p.parse();

        System.out.println("No errors.");
      } catch (Exception e) {
       // e.printStackTrace(System.err);
        System.exit(1);
      }
    }
  }
}
