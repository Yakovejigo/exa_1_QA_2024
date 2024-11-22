package exa_1_QA_20224_1.exa_1_QA_20224;

//Yakov Ejigo - 305777955

public class Question1 {
	public static String calculate (double a, double b, String mod) {
		switch (mod) {
		case "regular":
			if (a < b)
				return "b";
			else
				return "a";
		case "negatives":
			if (-a < -b)
				return "b";
			else
				return "a";
		case "reciprocals":
			if ((1/a) < b)
				return "a";
			else
				return "b";
		}
		return "error";	
	}

}