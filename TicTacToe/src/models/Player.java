package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(String name, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Cell makeMove(Board board) {
        Scanner sc=new Scanner(System.in);
        System.out.println(this.getName()+"'s turn");
        int row,col;
        do{
            do{
                System.out.println("Enter row Number :");
                row=sc.nextInt();
                if(row<0 || row>= board.getDimension()){
                    System.out.println("Invalid row Number please Enter again :");
                }

            }while(row<0 || row>= board.getDimension());

            do{
                System.out.println("Enter col Number :");
                col=sc.nextInt();
                if(col<0 || col>= board.getDimension()){
                    System.out.println("Invalid row Number please Enter again :");
                }

            }while(col<0 || col>= board.getDimension());
        }while(board.getBoard().get(row).get(col).getCellState()!=CellState.EMPTY);
        return new Cell(row,col);
    }
}
