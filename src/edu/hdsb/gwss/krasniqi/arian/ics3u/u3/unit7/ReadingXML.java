/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7;

import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1krasniqiari
 */
public class ReadingXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        File file = new File("friends.xml");
        Builder builder = new Builder();
        Document friendsDocument;
        Element friendsroot;

        try {
            friendsDocument = builder.build(file);
            friendsroot = friendsDocument.getRootElement();
            Elements friends = friendsroot.getChildElements();

            for (int i = 0; i < friends.size(); i++) {
                System.out.println(friends.get(i).getFirstChildElement("name").getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
