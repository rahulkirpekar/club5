package basic.snakegame;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class GameBoard 
{
    private final int WIDTH = 20;
    private final int HEIGHT = 20;
    private final char EMPTY_CELL = '.';
    private final char SNAKE_CELL = 'O';
    private final char FOOD_CELL = '*';
    private char[][] board;
    private Queue<int[]> snake;
    private int[] food;
    private int[] direction;
    private boolean gameOver;

    public void initializeGame() {
        board = new char[HEIGHT][WIDTH];
        snake = new LinkedList<>();
        direction = new int[] { 0, 1 }; // Initially moving right
        gameOver = false;

        // Initialize the board
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }

        // Create initial snake
        int initialX = HEIGHT / 2;
        int initialY = WIDTH / 2;
        snake.add(new int[] { initialX, initialY });
        board[initialX][initialY] = SNAKE_CELL;

        // Place initial food
        placeFood();
    }

    public void runGame() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            printBoard();
            System.out.print("Enter move (WASD): ");
            char move = scanner.next().charAt(0);
            changeDirection(move);
            moveSnake();
            checkGameOver();
        }
        System.out.println("Game Over!");
    }

    private void printBoard() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private void changeDirection(char move) {
        switch (move) {
            case 'W':
                direction = new int[] { -1, 0 }; // Up
                break;
            case 'A':
                direction = new int[] { 0, -1 }; // Left
                break;
            case 'S':
                direction = new int[] { 1, 0 }; // Down
                break;
            case 'D':
                direction = new int[] { 0, 1 }; // Right
                break;
            default:
                break;
        }
    }

    private void moveSnake() {
        int[] head = snake.peek();
        int newX = head[0] + direction[0];
        int newY = head[1] + direction[1];

        // Check if snake eats the food
        if (newX == food[0] && newY == food[1]) {
            snake.add(new int[] { newX, newY });
            board[newX][newY] = SNAKE_CELL;
            placeFood();
        } else {
            // Move snake
            int[] tail = snake.poll();
            board[tail[0]][tail[1]] = EMPTY_CELL;
            snake.add(new int[] { newX, newY });
            board[newX][newY] = SNAKE_CELL;
        }
    }

    private void placeFood() {
        Random random = new Random();
        int foodX, foodY;
        do {
            foodX = random.nextInt(HEIGHT);
            foodY = random.nextInt(WIDTH);
        } while (board[foodX][foodY] == SNAKE_CELL);
        board[foodX][foodY] = FOOD_CELL;
        food = new int[] { foodX, foodY };
    }

    private void checkGameOver() {
        int[] head = snake.peek();
        int headX = head[0];
        int headY = head[1];

        // Check for collisions with walls
        if (headX < 0 || headX >= HEIGHT || headY < 0 || headY >= WIDTH) {
            gameOver = true;
        }

        // Check for collisions with itself
        for (int[] part : snake) {
            if (part != head && part[0] == headX && part[1] == headY) {
                gameOver = true;
            }
        }
    }
}

