package menu.View;

import camp.nextstep.edu.missionutils.Console;
import menu.Model.DataMapping;
import menu.Model.validator.InputValidator;

import java.util.ArrayList;

public class InputMembers {
    SystemOutput systemOutput = new SystemOutput();
    String validatedMembers = "";
    public ArrayList<String> inputMembers(InputValidator validator) {
        systemOutput.printInputMember();
        String members = Console.readLine();
        isCorrect(validator, members);
        return new DataMapping().StringToList(validatedMembers);
    }

    private void isCorrect(InputValidator validator, String members) {
        try{
            validator.validateMemberName(members);
            validatedMembers = members;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            inputMembers(validator);
        }
    }
}
