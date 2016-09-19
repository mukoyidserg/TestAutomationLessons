package lesson3.preintermediatelevel;


public class Task1 {
	public boolean visitCinema(boolean heSmile, boolean sheSmile) {
		boolean result = false;
		if (heSmile == sheSmile)
			result = true;
		return result;
	}

	public static void main(String[] args) {
		Task1 myInstance = new Task1();
        System.out.println(myInstance.visitCinema(true,true));
        System.out.println(myInstance.visitCinema(false,false));
        System.out.println(myInstance.visitCinema(true,false));
        System.out.println(myInstance.visitCinema(false,true));
	}

}
