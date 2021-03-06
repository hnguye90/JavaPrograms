

import RandomGeneratorWin.Mode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestMemberDetailsGenerator {
    private List<TestMemberDetails> memberList = new LinkedList();
    private static final RandomGeneratorWin rand = new RandomGeneratorWin();
    Set<String> uniqueMemberIDSet;

    public TestMemberDetailsGenerator(int num_details) {
        this.uniqueMemberIDSet = new HashSet(num_details);

        for(int i = 0; i < num_details; ++i) {
            String newMemberID;
            do {
                newMemberID = RandomGeneratorWin.generateRandomString((int)(Math.random() * 10.0D), Mode.ALPHANUMERIC);
            } while(this.uniqueMemberIDSet.contains(newMemberID));

            this.uniqueMemberIDSet.add(newMemberID);
            TestMemberDetails newMember = new TestMemberDetails(rand, newMemberID);
            this.memberList.add(newMember);
        }

    }

    public String getAllDetails() {
        String allDetails = "";

        TestMemberDetails member;
        for(Iterator i$ = this.memberList.iterator(); i$.hasNext(); allDetails = allDetails + member.getDetails() + System.lineSeparator()) {
            member = (TestMemberDetails)i$.next();
        }

        return allDetails;
    }

    public void printAllDetails() {
        Iterator i$ = this.memberList.iterator();

        while(i$.hasNext()) {
            TestMemberDetails member = (TestMemberDetails)i$.next();
            System.out.println(member.getDetails());
        }

    }
}
