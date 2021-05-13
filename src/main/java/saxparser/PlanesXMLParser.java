package saxparser;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class PlanesXMLParser {

    List<Plane> getPlanes(File file) {
        List<Plane> planes = new ArrayList<>();

        var saxParserFactory = SAXParserFactory.newInstance();
        try {
            var saxParser = getSAXParser(saxParserFactory);
            var planeHandler = new PlaneHandler();
            saxParser.parse(file, planeHandler);
            planes = planeHandler.getPlanes();
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        return planes;
    }

    private SAXParser getSAXParser(SAXParserFactory saxParserFactory) throws ParserConfigurationException, SAXException {
        var saxParser = saxParserFactory.newSAXParser();
        saxParser.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        saxParser.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        return saxParser;
    }
}
