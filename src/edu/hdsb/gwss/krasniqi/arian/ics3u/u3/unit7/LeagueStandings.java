package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

public class LeagueStandings {

    public static void main(String[] args) {

        //building existing file
        File file = new File("AllStandings.xml");
        Builder builder = new Builder();
        Document leagueDocument;
        Element americanLeagueTeams;

        try {
            //new document for east
            Element americanEastLeague = new Element("americanEastLeague");
            Document eastLeagueStandings = new Document(americanEastLeague);

            //declaring for reading from all standing
            leagueDocument = builder.build(file);
            americanLeagueTeams = leagueDocument.getRootElement();
            Elements team = americanLeagueTeams.getChildElements();

            System.out.println("American League East" + "\n" + "-------------------------");

            System.out.format("%-15s %15s\n", "Team", "Record");
            for (int i = 0; i < team.size(); i++) {

                if (team.get(i).getFirstChildElement("division").getValue().equals("East")) {

                    System.out.format("%-15s %15s\n", team.get(i).getFirstChildElement("name").getValue(), team.get(i).getFirstChildElement("record").getValue());

                    // writing to only east document
                    Element teams = new Element("teams");

                    Element eastname = new Element("name");
                    eastname.appendChild(team.get(i).getFirstChildElement("name").getValue());
                    teams.appendChild(eastname);

                    Element eastdivision = new Element("division");
                    eastdivision.appendChild(team.get(i).getFirstChildElement("division").getValue());
                    teams.appendChild(eastdivision);

                    Element record = new Element("record");
                    record.appendChild(team.get(i).getFirstChildElement("record").getValue());
                    teams.appendChild(record);

                    americanEastLeague.appendChild(teams);

                }

            }

            BufferedWriter output = new BufferedWriter(new FileWriter("eastLeagueStandings.xml"));

            output.write(eastLeagueStandings.toXML());

            output.close();
            //writing out east teams
            System.out.println();
            System.out.println("American League West" + "\n" + "-------------------------");

            System.out.format("%-15s %15s\n", "Team", "Record");
            for (int i = 0; i < team.size(); i++) {

                if (team.get(i).getFirstChildElement("division").getValue().equals("West")) {
                    System.out.format("%-15s %15s\n", team.get(i).getFirstChildElement("name").getValue(), team.get(i).getFirstChildElement("record").getValue());
                }

            }

            //writing out west teams
            System.out.println();
            System.out.println("American League Central" + "\n" + "-------------------------");

            System.out.format("%-15s %15s\n", "Team", "Record");
            for (int i = 0; i < team.size(); i++) {

                if (team.get(i).getFirstChildElement("division").getValue().equals("Central")) {
                    System.out.format("%-15s %15s\n", team.get(i).getFirstChildElement("name").getValue(), team.get(i).getFirstChildElement("record").getValue());
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
