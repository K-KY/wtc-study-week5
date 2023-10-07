package menu.View;

public class SystemOutput {
    private final String START_MESSAGE = "점심 메뉴 추천을 시작합니다.";
    private final String INPUT_MEMBER = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private final String INPUT_MEMBERS_DISLIKE = " (이)가 못 먹는 메뉴를 입력해 주세요.";
    private final String THIS_IS_RESULT = "메뉴 추천 결과입니다.";
    private final String RECOMMEND_COMPLETE = "추천을 완료했습니다.";

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }
    public void printInputMember() {
        System.out.println(INPUT_MEMBER);
    }
    public void printInputMemberDislike(String member) {
        System.out.println(member + INPUT_MEMBERS_DISLIKE);
    }

}
