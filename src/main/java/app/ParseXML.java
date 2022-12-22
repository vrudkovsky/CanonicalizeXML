//package app;
//
//import java.io.File;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.DocumentBuilder;
//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;
//import org.w3c.dom.Node;
//import org.w3c.dom.Element;
//
//public class ParseXML {
//
//    public static void main(String[] args) {
//
//        try {
//            File inputFile = new File("src/main/resources/request.xml");
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(inputFile);
//            doc.getDocumentElement().normalize();
//            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
//            NodeList nList = doc.getElementsByTagName("ns1:BANKLIMITS");
//            System.out.println("----------------------------");
//
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//                Node nNode = nList.item(temp);
//                System.out.println("\nCurrent Element :" + nNode.getNodeName());
//
//
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) nNode;
//
//                    System.out.println("date-time: "
//                            + eElement.getAttribute("date-time"));
//                    System.out.println("dtd-version: "
//                            + eElement.getAttribute("dtd-version"));
//                    System.out.println("id: "
//                            + eElement.getAttribute("id"));
//                    System.out.println("message-code: "
//                            + eElement.getAttribute("message-code"));
//                    System.out.println("answer-required: "
//                            + eElement.getAttribute("answer-required"));
//
////                    System.out.println("dtd-version: "
////                            + eElement
////                            .getElementsByTagName("firstname")
////                            .item(0)
////                            .getTextContent());
////
////                    System.out.println("Last Name : "
////                            + eElement
////                            .getElementsByTagName("lastname")
////                            .item(0)
////                            .getTextContent());
////
////                    System.out.println("Nick Name : "
////                            + eElement
////                            .getElementsByTagName("nickname")
////                            .item(0)
////                            .getTextContent());
////
////                    System.out.println("Marks : "
////                            + eElement
////                            .getElementsByTagName("marks")
////                            .item(0)
////                            .getTextContent());
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}