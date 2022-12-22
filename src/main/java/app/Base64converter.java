//package app;
//
//import org.apache.xml.security.Init;
//import org.apache.xml.security.c14n.CanonicalizationException;
//import org.apache.xml.security.c14n.Canonicalizer;
//import org.apache.xml.security.c14n.InvalidCanonicalizerException;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.IOException;
//import java.util.Base64;
//
//public class Base64converter {
//
//    public static String canonicalizeXML(String text) {
//        Init.init();
//        try {
//            Canonicalizer canon = Canonicalizer.getInstance(Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS);
//            return new String(canon.canonicalize(text.getBytes()));
//        } catch (InvalidCanonicalizerException | CanonicalizationException | ParserConfigurationException |
//                 IOException | SAXException e) {
//            throw new IllegalStateException("could not create a canonical version of the xml", e);
//        }
//    }
//    public static String base64encoder(String s) {
//        return Base64.getEncoder().encodeToString(s.getBytes());
//    }
//
//    public static String base64decoder(String s) {
//        byte[] actualByte= Base64.getDecoder().decode(s);
//        return new String(actualByte);
//    }
//
//    public static void main(String[] args) {
//        String s = "<ns1:UploadRequest xmlns:ns1=\"http://oree.com.ua/etsua/soapsvc/bankaccountstatus/2020/09\"><ns1:BANKLIMITS answer-required=\"true\" date-time=\"2022-05-23T10:05:32Z\" dtd-version=\"1\" id=\"220523\" message-code=\"301\"><ns1:SenderIdentification coding-scheme=\"NAME\" id=\"TESTBANK\"></ns1:SenderIdentification><ns1:ReceiverIdentification coding-scheme=\"EIC\" id=\"62X-OPERRYNKU--3\"></ns1:ReceiverIdentification><ns1:Limits date=\"2022-01-28T09:00:05Z\"><ns1:Participant edrpou=\"42069164\" iban=\"UA633226690000026030300721502\" name=\"ТОВ «ЕНЕРДЖІКС»\"><ns1:DataGroups><ns1:TotalsData><ns1:Data currency=\"UAH\" type=\"limit\" value=\"100000.00\"></ns1:Data></ns1:TotalsData></ns1:DataGroups></ns1:Participant><ns1:Participant edrpou=\"42069164\" iban=\"UA823004650000026034300704963\" name=\"ТОВ «ЕНЕРДЖІКС»\"><ns1:DataGroups><ns1:TotalsData><ns1:Data currency=\"UAH\" type=\"limit\" value=\"300000.00\"></ns1:Data></ns1:TotalsData></ns1:DataGroups></ns1:Participant></ns1:Limits></ns1:BANKLIMITS></ns1:UploadRequest>";
////        String canon = canonicalizeXML(s);
//        String strencode = base64encoder(s);
////        String strdecode = base64decoder(strencode);
//        System.out.println(strencode);
////        System.out.println(strdecode);
//    }
//}
