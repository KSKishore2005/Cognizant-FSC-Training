import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testMultipleReturns() {
        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getStatus())
            .thenReturn("Loading")
            .thenReturn("Processing")
            .thenReturn("Done");

        MyService service = new MyService(mockApi);

        // Act
        String[] results = service.checkStatusMultipleTimes();

        // Assert
        assertEquals("Loading", results[0]);
        assertEquals("Processing", results[1]);
        assertEquals("Done", results[2]);
    }
}
