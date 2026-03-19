import java.util.LinkedList;

public class TicketQueueManager {
    public static void main(String[] args) {
        // 1. Create a LinkedList to act as a Queue
        LinkedList<Integer> supportQueue = new LinkedList<>();
        // 2. New Tickets Arrive (Add to tail using Queue method)
        supportQueue.offer(101);
        supportQueue.offer(102);
        supportQueue.offer(103);
        // 3. Agent Checks Queue (Peek)
        int peek = supportQueue.peek();
        System.out.println("Next ticket to be handled (peek): " + peek);
        // 4. Process Ticket (Poll) - removes from head
        int poll = supportQueue.poll();
        System.out.println("Processing ticket: " + poll);
        // 5. Urgent New Ticket (Offer First)
        supportQueue.offerFirst(99);
        // 6. Process Next
        int processedTicket = supportQueue.poll();
        System.out.println("Processing ticket: " + processedTicket);
        // Final Check
        System.out.println("Tickets remaining in queue: " + supportQueue);

    }
}