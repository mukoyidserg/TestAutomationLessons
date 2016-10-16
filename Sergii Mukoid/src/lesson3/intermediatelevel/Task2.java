package lesson3.intermediatelevel;

public class Task2 {

	public int luckyTicketCalculator() {
		int result = 0;
		for (int i = 1; i <= 999999; i++) {
			String ticket = String.format("%06d", i);
			if (Integer.parseInt(ticket.substring(0, 1)) + Integer.parseInt(ticket.substring(1, 2))
					+ Integer.parseInt(ticket.substring(2, 3)) == Integer.parseInt(ticket.substring(3, 4))
							+ Integer.parseInt(ticket.substring(4, 5)) + Integer.parseInt(ticket.substring(5)))
				result += 1;
		}
		return result;
	}

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		System.out.println(myInstance.luckyTicketCalculator());
	}
}
