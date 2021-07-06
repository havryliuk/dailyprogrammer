package saxparser;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SAXParserTest {

    private static final List<Plane> EXPECTED = new ArrayList<>();

    static {
        Plane plane1 = Plane.builder().year(1977).make("c").model("Skyhawk").colour("Light blue and white").description(
            "New paint, nearly new interior,\n" + "            685 hours SMOH, full IFR King avionics").price(23.495)
                            .seller(new Seller("Skyway Aircraft", null, "555-222-3333"))
                            .location(new Location("Rapid City,", "South Dakota")).build();
        Plane plane2 = Plane.builder().year(1965).make("p").model("Cherokee").colour("Gold").description(
            "240 hours SMOH, dual NAVCOMs, DME,\n" + "            new Cleveland brakes, great shape")
                            .seller(new Seller("John Seller", "jseller@www.axl.com", "555-333-2222"))
                            .location(new Location("St. Joseph,", "Missouri")).build();

        EXPECTED.add(plane1);
        EXPECTED.add(plane2);
    }

    @Test
    void testSAXParser() {
        File file = new File("src/test/resources/saxparser/planes.xml");

        PlanesXMLParser parser = new PlanesXMLParser();
        List<Plane> planes = parser.getPlanes(file);
        assertEquals(2, planes.size());
        assertEquals(EXPECTED, planes);
    }
}
