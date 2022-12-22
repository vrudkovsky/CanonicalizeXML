package app;


import jdk.internal.org.xml.sax.SAXException;
import org.apache.xml.security.Init;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.parser.XMLParserException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class CanonicalXML {
    public static String canonicalizeXML(String xml) {
        try {
            Init.init();
            Canonicalizer canon = Canonicalizer.getInstance(Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS);
            OutputStream writer = new ByteArrayOutputStream();
            canon.canonicalize(xml.getBytes(), writer, false);
            return writer.toString();
        } catch (InvalidCanonicalizerException | CanonicalizationException |
                 IOException e) {
            throw new IllegalStateException("could not create a canonical version of the xml", e);
        } catch (XMLParserException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String canon = canonicalizeXML("<UploadRequest XMLNS=\"http://oree.com.ua/etsua/soapsvc/bankaccountstatus/2020/09\"><BANKLIMITS message-code=\"301\" id=\"171\" dtd-version=\"1\" dtd-release=\"1\" date-time=\"2022-07-25T05:07:22Z\" answer-required=\"true\"><SenderIdentification id=\"UKREXIMBANK\" coding-scheme=\"NAME\"><ReceiverIdentification id=\"62X-OPERRYNKU--3\" coding-scheme=\"EIC\"><Limits title=\"FinancialLimitMarketParticipants\" date=\"2022-07-25T05:07:22Z\"><Participant name=\"ТОВ &quot;ШАНС-2013&quot;\" iban=\"UA023223130000026000000002124\" edrpou=\"34625935\" bankCode=\"322313\"><DataGroups><TotalsData><Data value=\"828.28\" TYPE=\"limit\" currency=\"UAH\"/></TotalsData></DataGroups></Participant></Limits></ReceiverIdentification></SenderIdentification></BANKLIMITS></UploadRequest>").trim();
        System.out.println(canon);
    }
}