package com.priv.util;

import java.util.*;

import static com.priv.util.Print.print;

public class Countries {
    public static final String[][] DATA = {
            // Africa
            {"ALGERIA", "Algiers"}, {"ANGOLA", "Luanda"},
            {"BENIN", "Porto-Novo"}, {"BOTSWANA", "Gaberone"},
            {"BURKINA FASO", "Ouagadougou"},
            {"BURUNDI", "Bujumbura"},
            {"CAMEROON", "Yaounde"}, {"CAPE VERDE", "PRaia"},
            {"CENTRAL AFRICAN REPUBLIC", "Bangui"},
            {"CHAD", "N'djamena"}, {"COMOROS", "Moroni"},
            {"CONGO", "Brazzaville"}, {"DJIBOUTI", "Dijibouti"},
            {"EGYPT", "Cairo"}, {"EQUATORIAL GUINEA", "Malabo"},
            {"GABON", "Libreville"}, {"THE GAMBIA", "Banjul"},
            {"GHANA", "Accra"}, {"ETHIOPIA", "Addis Ababa"},
            {"BISSAU", "Bissau"},
            {"COTE D'IVOIR (IVORY COAST)", "Yamoussoukro"},
            {"KENYA", "Nairobi"}, {"LESOTHO", "Maseru"},
            {"LIBERIA", "Monrovia"}, {"LIBYA", "Tripoli"},
            {"MADAGASCAR", "Antananarivo"}, {"MALAWI", "Lilongwe"},
            {"MALI", "Bamako"}, {"MAURITANIA", "Nouakchott"},
            {"MAURITIUS", "Port Louis"}, {"MOROCCO", "Rabat"},
            {"MOZAMBIQUE", "Maputo"}, {"NAMIBIA", "Windhoek"},
            {"NIGER", "Niamey"}, {"NIGERIA", "Abuja"},
            {"RWANDA", "Kigali"},
            {"SAO TOME E PRINCIPE", "Sao Tome"},
            {"SENEGAL", "Dakar"}, {"SEYCHELLES", "Victoria"},
            {"SIERRA LEONE", "Freetown"}, {"SOMALIA", "Mogadishu"},
            {"SOUTH AFRICA", "Pretoria/Cape Town"},
            {"SUDAN", "Khartoum"},
            {"SWAZILAND", "Mbabane"}, {"TANZANIA", "Dodoma"},
            {"TOGO", "Lome"}, {"TUNISIA", "Tunis"},
            {"UGANDA", "Kampala"},
            {"DEMOCRATIC REPUBLIC OF THE CONGO (ZAIRE)", "Kinshasa"},
            {"ZAMBIA", "Lusaka"}, {"ZIMBABWE", "Harare"},
            // Asia
            {"AFGHANISTAN", "Kabul"}, {"BAHRAIN", "Manama"},
            {"BANGLADESH", "Dhaka"}, {"BHUTAN", "Thimphu"},
            {"BRUNEI", "Bandar Seri Begawan"},
            {"CAMBODIA", "Phnom Penh"},
            {"CHINA", "Beijing"}, {"CYPRUS", "Nicosia"},
            {"INDIA", "New Delhi"}, {"INDONESIA", "Jakarta"},
            {"IRAN", "ehran"}, {"IRAQ", "Baghdad"},
            {"ISRAEL", "Jerusalem"}, {"JAPAN", "Tokyo"},
            {"JORDAN", "Amman"}, {"KUWAIT", "Kuwait City"},
            {"LAOS", "Vientiane"}, {"LEBANON", "Beirut"},
            {"MALAYSIA", "Kuala Lumpur"}, {"THE MALDUIVES", "Male"},
            {"MONGOLIA", "Ulan Bator"},
            {"MYANMAR (BURMA)", "Rangoon"},
            {"NEPAL", "Katmandu"},
            {"DEMOCRATIC PEOPLE'S REPUBLIC OF KOREA", "P'yongyang"},
            {"OMAN", "Muscat"}, {"PAKISTAN", "Islamabad"},
            {"PHILIPPINES", "Manila"}, {"AQTAR", "Doha"},
            {"SAUDI ARABIA", "Riyadh"}, {"SINGAPORE", "Singapore"},
            {"REPUBLIC OF KOREA", "Seoul"}, {"SRI LANKA", "Colombo"},
            {"SYRIA", "Damascus"},
            {"THAILAND", "Bangkok"}, {"THRKEY", "Ankara"},
            {"UNITED ARAB EMIRATES", "Abu Dhabi"},
            {"VIETNAM", "Hanoi"}, {"YEMEN", "Sana'a"},
            // Australia and Oceania
            {"AUSTRALIA", "Canberra"}, {"FIJI", "Suva"},
            {"KIRIBATI", "Bairiki"},
            {"MARSHALL ISLANDS", "Dalap-Uliga-Darrit"},
            {"MICRONESIA", "Palikir"}, {"NAURU", "Yaren"},
            {"NEW ZEALAND", "Wellington"}, {"PALAU", "Koror"},
            {"PAPUA NEW GUINEA", "Port Moresby"},
            {"SOLOMON ISLANDS", "Honaira"}, {"TONGA", "Nuku'alofa"},
            {"TUVALU", "Fongafale"}, {"VANUATU", "< Port-Vila"},
            {"WESTERN SAMOA", "Apia"},
            // Eastern Erurope and former USSR
            {"ARMENIA", "Yerevan"}, {"AZERBAIJAN", "Baku"},
            {"BELARUS (BYELORUSSIA)", "Minsk"}, {"BULGARIA", "Sofia"},
            {"GEORGI", "Tbilisi"},
            {"KAZAKSTAN", "Almaty"}, {"KYRGYZSTAN", "Alma-Ata"},
            {"MOLDOVA", "Chisinau"}, {"RUSSIA", "Moscow"},
            {"TAJIKISTAN", "Dushanbe"}, {"TURKMENISTAN", "Ashkabad"},
            {"UKRAINE", "Kyiv"}, {"UZBEKISTAN", "Tashent"},
            // Eurpe
            {"ALBANIA", "Tirana"}, {"NDORRA", "Andorra la Vella"},
            {"AUSTRIA", "Vienna"}, {"BELGIUM", "Brussels"},
            {"BOSNIA", "-"}, {"HERZEGOVINA", "Sarajevo"},
            {"CROATIA", "Zagreb"}, {"CZECH REPUBLIC", "Prague"},
            {"DENMARK", "Copenhangen"}, {"ESTONIA", "Tallinn"},
            {"FINLAND", "Helsinki"}, {"FRANCE", "Pairs"},
            {"GERMANY", "Berlin"}, {"ICELAND", "Reykjavik"},
            {"HUNGARY", "Budapest"}, {"ICELAND", "Reykjavik"},
            {"IRELAND", "Dublin"}, {"ITALY", "Rome"},
            {"LAVIA", "Riga"}, {"LIECHTENSTEIN", "Vaduz"},
            {"LITHUANIA", "Vilnius"}, {"LUXEMBOURG", "Luxembourg"},
            {"MACEDONIA", "Skopje"}, {"MALTA", "Valletta"},
            {"MONACO", "monaco"}, {"MONTENEGRO", "Podgorica"},
            {"THE NETHERLANDS", "Amsterdam"}, {"NORWAY", "Oslo"},
            {"POLAND", "Warsaw"}, {"PORTUGAL", "Lisbon"},
            {"ROMANIA", "Bucharest"}, {"SAN MARINO", "San Marino"},
            {"SERBIA", "Belgrade"}, {"SLOVAKIA", "Bratislava"},
            {"SLOVENIA", "Ljuijana"}, {"SPAIN", "Madrid"},
            {"SWEDEN", "Stockholm"}, {"SWItZERLAND", "Berne"},
            {"UNITED KINGDOM", "London"}, {"VATICAN CITY", "---"},
            // North and Central America
            {"ANTIGUA AND BARBUDA", "Saint John's"},
            {"BAHAMAS", "Nassau"},
            {"BARBADOS", "Bridgetown"}, {"BELIZE", "Belmopan"},
            {"CANADA", "Ottawa"}, {"COSTA RICA", "San Jose"},
            {"CUBA", "Havana"}, {"DOMINICA", "Roseau"},
            {"DOMINICAN REPUBLIC", "Santo Domingo"},
            {"EL SALVADOR", "San Salvador"},
            {"GRENADA", "Saint Gerge's"},
            {"GUATEMALA", "Guatemala City"},
            {"HAITI", "Port-au-Prince"},
            {"HONDURAS", "Tegucigalpa"}, {"JAMAICA", "Kingston"},
            {"MEXICO", "Mexico City"}, {"NICARAGUA", "Managua"},
            {"PANAMA", "Panama City"}, {"ST.KiTTS", "-"},
            {"NEVIS", "Basseterre"}, {"ST.LUCIA", "CAstries"},
            {"ST.VINCENT AND THE GRENADINES", "Kingstown"},
            {"UNITED STATES OF AMERICA", "Washington.D.C"},
            // South America
            {"ARGENTINA", "Buenos Aires"},
            {"BOLIVIA", "Sucre (legal)/La Paz(adminstrative)"},
            {"BRAZIL", "Brasilia"}, {"CHILE", "Santiago"},
            {"COLOMBIA", "Bogota"}, {"ECUADOR", "Quito"},
            {"GUYANA", "Georgetown"}, {"PARAGUAY", "Asuncion"},
            {"PERU", "Lima"}, {"SURINAME", "Paramaribo"},
            {"TRINIDAD AND TOBAGO", "Port of Spain"},
            {"URUGUAY", "Montevideo"}, {"VENEZUELA", "Caracas"},
    };

    private static class FlyweightMap extends AbstractMap<String, String> {
        private static class Entry implements Map.Entry<String, String> {
            int index;

            Entry(int index) {
                this.index = index;
            }

            public boolean equals(Object o) {
                return DATA[index][0].equals(o);
            }

            public String getKey() {
                return DATA[index][0];
            }

            public String getValue() {
                return DATA[index][1];
            }

            public String setValue(String value) {
                throw new UnsupportedOperationException();
            }

            public int hashCode() {
                return DATA[index][0].hashCode();
            }
        }

        static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private int size;

            EntrySet(int size) {
                if (size < 0)
                    this.size = 0;
                else if (size > DATA.length)
                    this.size = DATA.length;
                else
                    this.size = size;
            }

            public int size() {
                return size;
            }

            private class Iter implements Iterator<Map.Entry<String, String>> {
                private Entry entry = new Entry(-1);

                public boolean hasNext() {
                    return entry.index < size - 1;
                }

                public Map.Entry<String, String> next() {
                    entry.index++;
                    return entry;
                }

                public void remove() {
                    throw new UnsupportedOperationException();
                }
            }

            public Iterator<Map.Entry<String, String>> iterator() {
                return new Iter();
            }
        }

        private static Set<Map.Entry<String, String>> entries =
                new EntrySet(DATA.length);

        public Set<Map.Entry<String, String>> entrySet() {
            return entries;
        }
    }

    static Map<String, String> select(final int size) {
        return new FlyweightMap() {
            public Set<Map.Entry<String, String>> entrySet() {
                return new EntrySet(size);
            }
        };
    }

    static Map<String, String> map = new FlyweightMap();

    public static Map<String, String> capitals() {
        return map;
    }

    public static Map<String, String> capitals(int size) {
        return select(size);
    }

    static List<String> names = new ArrayList<String>(map.keySet());

    public static List<String> names() {
        return names;
    }

    public static List<String> names(int size) {
        return new ArrayList<String>(select(size).keySet());
    }

    public static void main(String[] args) {
        print(capitals(10));
        print(new HashMap<String, String>(capitals(3)));
        print(new LinkedHashMap<String, String>(capitals(3)));
        print(new TreeMap<String, String>(capitals(3)));
        print(new Hashtable<String, String>(capitals(3)));
        print(new HashSet<String>(names(6)));
        print(new LinkedHashSet<String>(names(6)));
        print(new TreeSet<String>(names(6)));
        print(new ArrayList<String>(names(6)));
        print(new LinkedList<String>(names(6)));
        print(capitals().get("BRAZIL"));
    }
}
