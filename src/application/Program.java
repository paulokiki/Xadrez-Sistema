package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.chessException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        try {
            while (true) {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

            }
        } catch (chessException e) {
            System.out.println(e.getMessage());
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            sc.nextLine();
        }
    }
}
