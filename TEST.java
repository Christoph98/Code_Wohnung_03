

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TEST
{
    @Test
    public void anzahlzuklein()
    {
        Wohnung Wien;
        
        Wien = new Wohnung("Wien","Spenger 5",true, false, 20000,0);
        
        assertEquals(Wien.getAnzZimmer(), 4);
    }
}
