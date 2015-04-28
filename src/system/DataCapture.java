package system;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import model.ProblemaResolvido;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

import util.HtmlTableDataParser;
import util.NodeParser;

public class DataCapture {

    public static Map<String, String> problemalevels;

    public static int problemasLevelsInitialize() {
        problemalevels = new HashMap<>();
        try {
            File levelFile = new File("src/assets/levels.txt");
            InputStream levelsStream = new FileInputStream(levelFile);
            try (BufferedReader rd = new BufferedReader(new InputStreamReader(levelsStream))) {
                String line = rd.readLine();
                while (line != null) {
                    String[] dados = line.split("	");
                    problemalevels.put(dados[0], dados[1]);
                    line = rd.readLine();
                }
            }
        } catch (Exception except) {
        }
        return -1;
    }

    public static List<ProblemaResolvido> getProblemasResolvidos(String idAluno) {
        List<ProblemaResolvido> problemas = new ArrayList<>();
        int page = 1;
        while (true) {
            try {
                HtmlTableDataParser parser = new HtmlTableDataParser(idAluno, page);
                Document doc = Jsoup.parse(parser.fillOutForm().html());
                List<String> problemaTemp = new LinkedList<>();
                int headerCrop = 0;
                for (Node node : doc.body().childNodes()) {
                    if (!node.toString().equals(" ") && headerCrop > 12) {
                        if (node.toString().startsWith("<a href")) {
                            problemaTemp.add(NodeParser.Parser(node.toString()));
                        } else {
                            problemaTemp.add(node.toString());
                        }
                    }
                    if (problemaTemp.size() == 7) {
                        problemas.add(new ProblemaResolvido(problemaTemp.get(0),
                                problemalevels.get(problemaTemp.get(0)),
                                problemaTemp.get(1), problemaTemp.get(2),
                                problemaTemp.get(3), problemaTemp.get(4),
                                problemaTemp.get(5), problemaTemp.get(6)));
                        problemaTemp.clear();
                    }
                    headerCrop++;
                }
                page++;

            } catch (Exception e) {
                break;
            }

        }
        return problemas;

    }

    public static String getNome(String idURI) {
        try {
            URL url = new URL("https://www.urionlinejudge.com.br/judge/pt/profile/" + idURI);
            URLConnection con = url.openConnection();
            InputStream is = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
                if (sb.length() >= 40) {
                    System.out.println(line);
                    System.out.println(line.substring(0, 27));
                    if (sb.substring(0, 27).equals("		<div class=\"pb-username\">")) {
                        return NodeParser.Parser(line);
                    }
                }
                sb.delete(0, sb.length());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
