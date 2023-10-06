package menu.Model.validator;

public class InputValidator {
    public void validateMemberName(String input) {
        permittedInputValidator(input);
        nameLengthValidator(input);
    }
    private void permittedInputValidator(String input) {

        String str = input.replace(",", "");
        if (str.matches("[a-zA-Z가-힣,\\s]*")) {
            return;
        }
        throw new IllegalArgumentException("[ERROR] 허용되지 않은 문자가 포함되어 있습니다.");
    }

    private void nameLengthValidator(String input) {
        String[] memberList = input.split(",");
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].trim().length() > 4 || memberList[i].trim().length() < 2) {
                throw new IllegalArgumentException("[ERROR] 코치의 이름은 최소 2글자 최대 4글자 입니다");
            }
        }

    }
}
