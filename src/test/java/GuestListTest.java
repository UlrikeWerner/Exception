import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GuestListTest {
    @Test
    void GuestListShouldBeEmptyInitially(){
        GuestList testGuestList = new GuestList();
        testGuestList.setGuests(List.of());
        List<String> testList = testGuestList.getGuests();

        Assertions.assertTrue(testList.isEmpty());
    }
}
