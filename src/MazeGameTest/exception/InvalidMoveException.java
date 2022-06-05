package MazeGameTest.exception;

/**
 * Created by wu on 2018-03-18.
 */


public class InvalidMoveException extends RuntimeException {
    public InvalidMoveException(String s){
        super(s);
    }
}
