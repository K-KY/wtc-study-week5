package menu.View;

import camp.nextstep.edu.missionutils.Console;
import menu.Model.DataMapping;
import menu.Model.validator.InputValidator;

import java.util.ArrayList;

public class InputMemberDislike {
    public ArrayList<String> memberDislike(String member, InputValidator validator) {
        new SystemOutput().printInputMemberDislike(member);
        String dislike = Console.readLine();
        isCorrect(validator, dislike, member);
        return new DataMapping().StringToList(dislike);
    }

    private void isCorrect(InputValidator validator, String dislike, String member) {
        try{
            validator.validateDislike(dislike);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            memberDislike(member, validator);
        }
    }


}
