package menu.View;

import camp.nextstep.edu.missionutils.Console;
import menu.Model.DataMapping;
import menu.Model.validator.InputValidator;

import java.util.ArrayList;

public class UserInput {
    SystemOutput systemOutput = new SystemOutput();
    public ArrayList<String> inputMembers(InputValidator validator) {
        systemOutput.printInputMember();
        String members = Console.readLine();
        isCorrect(validator, members);
        return new DataMapping().StringToList(members);
    }

    private void isCorrect(InputValidator validator, String members) {
        try{
            validator.validateMemberName(members);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            inputMembers(validator);
        }
    }
}
