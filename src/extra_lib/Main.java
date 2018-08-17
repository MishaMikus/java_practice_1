package extra_lib;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //make CustomClass instance
        House house = new House();
        house.setAddress("Ukraine, Lviv, Naukova 7g");
        house.getResidentList().add(new User("misha", 29));
        house.getResidentList().add(new User("vasja", 99));
        //print it
        System.out.println(house);

        //save object to file as object
        saveToFileAsObject(house, "houseObject");
        //load object from file as object
        house = loadFromFileAsObject("houseObject");
        //print it
        System.out.println(house);

        //save object to file as text
        saveToFileAsText(house, "houseText.txt");

        //save it to xml
        saveToFileAsXML(house, "house.xml");
        //load as text and print it
        System.out.println(readTextFromFile("house.xml"));
        //load it form xml
        house = loadFromFileAsXML("house.xml");
        //print it
        System.out.println(house);

        //save it to jason
        saveToFileAsJSON(house, "house.json");
        //load as test and print it
        System.out.println(readTextFromFile("house.json"));
        //load it form jason
        house = loadFromFileAsJson("house.json");
        //print it
        System.out.println(house);
    }

    private static House loadFromFileAsJson(String fileName) {
        try {
            return new ObjectMapper().readValue(new File(fileName), House.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void saveToFileAsJSON(House house, String fileName) {
        try {
            saveTextToFile(new ObjectMapper().writeValueAsString(house), fileName);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    private static House loadFromFileAsXML(String fileName) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(House.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = context.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            return (House) unmarshaller.unmarshal(new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String readTextFromFile(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(new File(fileName).getAbsolutePath())));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void saveToFileAsXML(House house, String fileName) {
        String xmlString;
        try {
            JAXBContext context = JAXBContext.newInstance(House.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            m.marshal(house, sw);
            xmlString = sw.toString();
            saveTextToFile(xmlString, fileName);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    private static void saveToFileAsText(House house, String filename) {
        saveTextToFile(house.toString(), filename);
    }

    private static void saveTextToFile(String text, String filename) {
        try (PrintStream out = new PrintStream(new FileOutputStream(filename))) {
            out.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static House loadFromFileAsObject(String fileName) {
        House house = null;
        try {
            FileInputStream fis = new FileInputStream(new File(fileName));
            ObjectInputStream oos = new ObjectInputStream(fis);
            house = (House) oos.readObject();
            oos.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return house;
    }

    private static void saveToFileAsObject(House house, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(new File(fileName));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(house);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
