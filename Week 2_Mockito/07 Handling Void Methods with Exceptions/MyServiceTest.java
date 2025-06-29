import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVoidMethodWithException() {
        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // Stub the void method to throw an exception
        doThrow(new RuntimeException("Failure")).when(mockApi).riskyOperation();

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            service.performRiskyAction();
        });

        assertEquals("Failure", exception.getMessage());

        // Verify the method was called
        verify(mockApi).riskyOperation();
    }
}
