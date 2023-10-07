package menu.Model.validator;

import menu.Model.MenuFinder;

public class InputValidator {
    public void validateMemberName(String input) {
        permittedInputValidator(input);
        nameLengthValidator(input);
        memberLengthValidator(input);
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
            String member = memberList[i].trim();
            if (member.length() > 4 || member.length() < 2) {
                throw new IllegalArgumentException("[ERROR] 코치의 이름은 최소 2글자 최대 4글자 입니다");
            }
        }
    }

    private void memberLengthValidator(String input) {
        String[] memberList = input.split(",");
        if (memberList.length > 5 || memberList.length < 2) {
            throw new IllegalArgumentException("[ERROR] 코치는 최소 2명 최대 5명까지 입력 가능합니다.");
        }
    }

    public void validateDislike(String dislike) {
        if (dislike.equals("")) {
            return;
        }
        validateMemberDislike(dislike);
        validateDislikeLength(dislike);
        findFromMenuList(dislike);
    }
    private void validateMemberDislike(String dislike) {
        String str = dislike.replace(",", "");
        if (str.matches("[a-zA-Z가-힣,\\s]*")) {
            return;
        }
        throw new IllegalArgumentException("[ERROR] 허용되지 않은 문자가 포함되어 있습니다.");
    }

    private void findFromMenuList(String dislike) {
        String[] dislikeList = dislike.split(",");
        MenuFinder menuFinder = new MenuFinder();
        for (int i = 0; i < dislikeList.length; i++) {
            String menu = dislikeList[i].trim();
            menuFinder.findMenu(menu);
        }
    }

    private void validateDislikeLength(String dislike) {
        if (dislike.split("").length > 2) {
            throw new IllegalArgumentException("[ERROR] 못먹는 메뉴는 최대 2개까지 입력 가능합니다");
        }
    }
}
