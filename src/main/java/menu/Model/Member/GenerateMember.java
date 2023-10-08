package menu.Model.Member;

import java.util.HashMap;
import java.util.List;

public class GenerateMember {

    public Member generateMember(List<String> dislike) {
        return new Member(dislike);
    }


}
