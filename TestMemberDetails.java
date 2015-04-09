
import RandomGeneratorWin.Mode;
import java.util.concurrent.atomic.AtomicInteger;

public class TestMemberDetails {
    private static AtomicInteger nextID = new AtomicInteger();
    private int recordID;
    private String uniqueMemberID;
    private static final String customerID = "111111111111111";
    private String firstName;
    private String middleName;
    private String lastName;
    private String nameSuffix;
    private String dateOfBirth;
    private String gender;
    private String details;

    public TestMemberDetails(RandomGeneratorWin rand, String newMemberID) {
        this.recordID = nextID.incrementAndGet();
        this.uniqueMemberID = newMemberID;
        this.firstName = RandomGeneratorWin.generateRandomString(RandomGeneratorWin.generateRandomNum(1, 35), Mode.ALPHA);
        this.middleName = RandomGeneratorWin.generateRandomString(RandomGeneratorWin.generateRandomNum(1, 35), Mode.ALPHA);
        this.lastName = RandomGeneratorWin.generateRandomString(RandomGeneratorWin.generateRandomNum(1, 35), Mode.ALPHA);
        this.nameSuffix = RandomGeneratorWin.generateRandomString(RandomGeneratorWin.generateRandomNum(1, 35), Mode.ALPHA);
        this.dateOfBirth = RandomGeneratorWin.generateRandomDOB();
        this.gender = RandomGeneratorWin.generateRandomGender();
        this.details = this.generateDetailString();
    }

    public int getRecordID() {
        return this.recordID;
    }

    public static String getCustomerID() {
        return "111111111111111";
    }

    public String getNameSuffix() {
        return this.nameSuffix;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getGender() {
        return this.gender;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getUniqueMemberID() {
        return this.uniqueMemberID;
    }

    public String getDetails() {
        return this.details;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String generateDetailString() {
        String str = "DTL|" + this.recordID + "|" + this.uniqueMemberID + "|" + "111111111111111" + "|" + this.firstName + "|" + this.middleName + "|" + this.lastName + "|" + this.nameSuffix + "|" + this.dateOfBirth + "|" + this.gender;
        return str;
    }
}
