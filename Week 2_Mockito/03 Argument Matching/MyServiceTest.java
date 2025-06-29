import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.ArgumentMatchers.*;
public class MyServiceTest {

    @Test
    public void testArgumentMatching() {
        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getUserById(anyInt())).thenReturn("User");

        MyService service = new MyService(mockApi);

        // Act
        String result = service.getUser(42);

        // Assert
        verify(mockApi).getUserById(eq(42));
    }
}
