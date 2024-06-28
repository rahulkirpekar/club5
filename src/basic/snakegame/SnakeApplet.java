package basic.snakegame;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeApplet extends Applet implements Runnable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int UNIT_SIZE = 20;
    private static final int GAME_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private static final int DELAY = 140;

    private final List<int[]> snake = new ArrayList<>();
    private int[] food;
    private char direction = 'R'; // R - right, L - left, U - up, D - down
    private boolean running = false;
    private Thread gameThread;

    public void init() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') direction = 'L';
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') direction = 'R';
                        break;
                    case KeyEvent.VK_UP:
                        if (direction != 'D') direction = 'U';
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') direction = 'D';
                        break;
                }
            }
        });
    }

    public void start() {
        running = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {
        initializeGame();
        while (running) {
            move();
            checkCollision();
            checkFood();
            repaint();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void initializeGame() {
        snake.clear();
        snake.add(new int[]{WIDTH / 2, HEIGHT / 2});
        placeFood();
    }

    private void move() {
        int[] head = snake.get(0);
        int[] newHead = new int[]{head[0], head[1]};

        switch (direction) {
            case 'U':
                newHead[1] -= UNIT_SIZE;
                break;
            case 'D':
                newHead[1] += UNIT_SIZE;
                break;
            case 'L':
                newHead[0] -= UNIT_SIZE;
                break;
            case 'R':
                newHead[0] += UNIT_SIZE;
                break;
        }

        snake.add(0, newHead);
        if (newHead[0] == food[0] && newHead[1] == food[1]) {
            placeFood();
        } else {
            snake.remove(snake.size() - 1);
        }
    }

    private void checkCollision() {
        int[] head = snake.get(0);

        // Check if the snake hits the wall
        if (head[0] < 0 || head[0] >= WIDTH || head[1] < 0 || head[1] >= HEIGHT) {
            running = false;
        }

        // Check if the snake hits itself
        for (int i = 1; i < snake.size(); i++) {
            if (head[0] == snake.get(i)[0] && head[1] == snake.get(i)[1]) {
                running = false;
            }
        }
    }

    private void checkFood() {
        if (snake.get(0)[0] == food[0] && snake.get(0)[1] == food[1]) {
            placeFood();
        }
    }

    private void placeFood() {
        Random random = new Random();
        int x = random.nextInt((int) (WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        int y = random.nextInt((int) (HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        food = new int[]{x, y};
    }

    public void paint(Graphics g) {
        super.paint(g);

        if (running) {
            g.setColor(Color.RED);
            g.fillRect(food[0], food[1], UNIT_SIZE, UNIT_SIZE);

            for (int[] part : snake) {
                g.setColor(Color.GREEN);
                g.fillRect(part[0], part[1], UNIT_SIZE, UNIT_SIZE);
            }
        } else {
            gameOver(g);
        }
    }

    private void gameOver(Graphics g) {
        String message = "Game Over";
        g.setColor(Color.RED);
        g.drawString(message, WIDTH / 2 - g.getFontMetrics().stringWidth(message) / 2, HEIGHT / 2);
    }
}

//public class SnakeGame 
//{
//    public static void main(String[] args) 
//    {
//        GameBoard gameBoard = new GameBoard();
//        gameBoard.initializeGame();
//        gameBoard.runGame();
//    }
//}
