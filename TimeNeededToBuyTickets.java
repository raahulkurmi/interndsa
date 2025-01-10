public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            // Calculate the time based on the current index
            if (i <= k) {
                // If the person is before or at 'k', count all tickets they need
                time += Math.min(tickets[i], tickets[k]);
            } else {
                // If the person is after 'k', count all tickets except the last ticket
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return time;
    }

    public static void main(String[] args) {
        TimeNeededToBuyTickets solution = new TimeNeededToBuyTickets();
        int[] tickets = {2, 3, 2};
        int k = 2;
        System.out.println(solution.timeRequiredToBuy(tickets, k)); // Output: 6
    }
}
