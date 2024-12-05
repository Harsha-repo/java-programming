package javacn;
import java.util.Scanner;

public class SlidingWindowProtocol {
    private static final int MAX_WINDOW_SIZE = 4; // Maximum window size
    private static int[] window; // To store the sent frames
    private static int windowSize; // Size of the window
    private static int sendBase; // First unacknowledged frame
    private static int nextSeqNum; // Next frame to be sent
    private static int totalFrames; // Total number of frames

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of frames to be sent: ");
        totalFrames = scanner.nextInt();
        windowSize = Math.min(MAX_WINDOW_SIZE, totalFrames);

        window = new int[windowSize];
        sendBase = 0;
        nextSeqNum = 0;

        // Simulate the sending of frames
        while (sendBase < totalFrames) {
            // Send frames as long as the window is not full
            while (nextSeqNum < sendBase + windowSize && nextSeqNum < totalFrames) {
                sendFrame(nextSeqNum);
                nextSeqNum++;
            }

            // Simulate receiving an acknowledgment for the oldest frame in the window
            receiveAck();
        }

        System.out.println("All frames have been sent and acknowledged.");
        scanner.close();
    }

    // Function to simulate sending a frame
    private static void sendFrame(int frameNum) {
        System.out.println("Sending frame: " + frameNum);
    }

    // Function to simulate receiving an acknowledgment
    private static void receiveAck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the acknowledgment for frame " + sendBase + ": ");
        int ack = scanner.nextInt();

        if (ack == sendBase) {
            System.out.println("Acknowledgment received for frame: " + sendBase);
            sendBase++; // Move the window forward
        } else {
            System.out.println("Acknowledgment not received for frame: " + sendBase + ". Retransmitting.");
            nextSeqNum = sendBase; // Retransmit from the base frame
        }
    }
}
