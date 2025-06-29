import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {
        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // Act
        service.runSequence();

        // Assert - verify order
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).initialize();
        inOrder.verify(mockApi).process();
        inOrder.verify(mockApi).shutdown();
    }
}
