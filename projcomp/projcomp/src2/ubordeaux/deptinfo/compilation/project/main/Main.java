package ubordeaux.deptinfo.compilation.project.main;

import java.io.*;


import beaver.Scanner;
import beaver.Parser;

import ubordeaux.deptinfo.compilation.project.node.Node;

public class Main {
	private static boolean checksType;

	public static void main(String[] args) throws Exception {
		for (String arg : args) {
			if (arg.charAt(0) == '-') {
				if (arg.equals("-checkType"))
					checksType = true;
			} else {
				Scanner input = new ScannerExp(new FileReader(arg));
				Parser parser = new ParserExp();
				try {
					System.err.println("*** Fichier " + arg);
					Node result = (Node) parser.parse(input);
					System.err.println("*** Analyse syntaxique ok");
					System.out.println(result.toString());
					
					result.toDot(arg.replaceAll(".lea", ".dot"));
					
					String command = "dot -Tpng -o " + arg.replaceAll(".lea", ".png") +" "+ arg.replaceAll(".lea", ".dot");
					System.out.println(command);
					Process process = Runtime.getRuntime().exec(command);
					if (checksType) {
						if (!result.checksType())
							System.err.println("*** Erreur de typage");
						else
							System.err.println("*** Typage correct");
					}
				} catch (beaver.Parser.Exception e) {
					System.err.println("*** Erreur de syntaxe: " + arg + ":" + e.getMessage());
				}
			}

		}
	}
}