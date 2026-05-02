import javax.swing.*;
public class GameWindow {
	public static void main(String[] args) {
		int rowCount;
		int columnCount;
		int boardWidth;
		int boardHeight;
		int tileSize;
		JFrame window;
		GameWindow(String title, GameCenter gc, int rowCount, int columnCount, int tilesize) {
			window = new JFrame(title);
			this.tileSize = tilesize;
			this.rowCount = rowCount;
			this.columnCount = columnCount;
			boardWidth = columnCount*tileSize;
			boardHeight = rowCount*tileSize;
			window.setSize(boardWidth, boardHeight);
			window.setResizable(false);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setLocationRelativeTo(null);
			window.add(gc);
			window.setVisible(true);
			}
		}
	}

			
			