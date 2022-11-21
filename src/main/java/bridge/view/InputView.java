package bridge.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        try {
            int size = Integer.parseInt(Console.readLine());
            if (size < 3 || size > 20) throw new IllegalArgumentException();
            return size;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력해주세요.");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 알맞은 숫자 범위를 입력해주세요.");
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public char readMoving() {
        String moves = Console.readLine();
        if(moves.length() != 1) throw new IllegalArgumentException("[ERROR] 한 자의 문자만 입력해 주세요.");
        char move = moves.charAt(0);
        if(move != 'U' || move != 'D') throw new IllegalArgumentException("[ERROR] 형식에 맞는 문자를 입력해주세요.");
        return move;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public char readGameCommand() {
        String games = Console.readLine();
        if(games.length() != 1) throw new IllegalArgumentException("[ERROR] 한 자의 문자만 입력해 주세요.");
        char game = games.charAt(0);
        if(game != 'R' || game != 'Q') throw new IllegalArgumentException("[ERROR] 형식에 맞는 문자를 입력해주세요.");
        return game;
    }
}
