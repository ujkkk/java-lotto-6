package view;

import constant.ErrorMessage;
import constant.UserRequestMessage;
import constant.UserResponeMessage;
import domain.Lotto;

public class Output {

    /* request message */
    public static void printPurchaseCostRequestMessage(){
        System.out.println(UserRequestMessage.PURCHASE_COST_REQUEST_MESSAGE);
    }

    public static void printWinningNumberRequestMessage(){
        System.out.println(UserRequestMessage.WINNING_NUMBER_REQUEST_MESSAGE);
    }

    /* respone message */
    public static void printLottoPurchaseMessage(int count){
        System.out.println(String.format("%d%s", count, UserResponeMessage.PURCHASE_MESSAGE));
    }


    public static void printErrorNullMessage(){
        System.out.println(ErrorMessage.NULL_MESSAGE);
    }

    public static void printErrorNumbericMessage(){
        System.out.println(ErrorMessage.NUMBERIC_MESSAGE);
    }

    public static void printErrorFitLottoCostMessage(){
        System.out.println(ErrorMessage.FIT_LOTTO_COST_MESSAGE);
    }

    public static void printLotto(Lotto lotto){
        System.out.println(lotto);
    }
    public static void errorMessage(Exception error) {
        System.out.println(error.getMessage());
    }
}
