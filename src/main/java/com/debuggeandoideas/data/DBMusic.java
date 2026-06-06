package com.debuggeandoideas.data;

import com.debuggeandoideas.dtos.Album;
import com.debuggeandoideas.dtos.Artist;
import com.debuggeandoideas.dtos.Song;

import java.util.List;

public class DBMusic {

        private DBMusic() {}

        public static final List<Artist> ARTISTS = List.of(

                // ── Rock ────────────────────────────────────────────────────
                new Artist("The Beatles", "UK", "Rock", List.of(
                        new Album("Abbey Road", 1969, List.of(
                                new Song("Come Together",            259, 980_000_000),
                                new Song("Something",                182, 750_000_000),
                                new Song("Here Comes the Sun",       185, 1_200_000_000),
                                new Song("Oh! Darling",              207, 430_000_000),
                                new Song("Golden Slumbers",          183, 520_000_000)
                        )),
                        new Album("Let It Be", 1970, List.of(
                                new Song("Let It Be",                243, 890_000_000),
                                new Song("The Long and Winding Road",218, 600_000_000),
                                new Song("Get Back",                 190, 750_000_000),
                                new Song("Across the Universe",      228, 580_000_000)
                        )),
                        new Album("Revolver", 1966, List.of(
                                new Song("Eleanor Rigby",            127, 980_000_000),
                                new Song("Yellow Submarine",         160, 1_100_000_000),
                                new Song("Here There and Everywhere",164, 520_000_000),
                                new Song("Tomorrow Never Knows",     178, 460_000_000)
                        ))
                )),

                new Artist("Led Zeppelin", "UK", "Rock", List.of(
                        new Album("Led Zeppelin IV", 1971, List.of(
                                new Song("Stairway to Heaven",       482, 1_500_000_000),
                                new Song("Black Dog",                296, 700_000_000),
                                new Song("Rock and Roll",            220, 650_000_000),
                                new Song("When the Levee Breaks",    427, 480_000_000)
                        )),
                        new Album("Physical Graffiti", 1975, List.of(
                                new Song("Kashmir",                  509, 980_000_000),
                                new Song("Trampled Under Foot",      336, 520_000_000),
                                new Song("Ten Years Gone",           391, 410_000_000)
                        )),
                        new Album("Houses of the Holy", 1973, List.of(
                                new Song("The Song Remains the Same",284, 620_000_000),
                                new Song("The Rain Song",            479, 480_000_000),
                                new Song("Over the Hills and Far Away",266,590_000_000)
                        ))
                )),

                new Artist("Pink Floyd", "UK", "Rock", List.of(
                        new Album("The Dark Side of the Moon", 1973, List.of(
                                new Song("Money",                    382, 820_000_000),
                                new Song("Time",                     413, 760_000_000),
                                new Song("The Great Gig in the Sky", 284, 580_000_000),
                                new Song("Breathe",                  163, 640_000_000),
                                new Song("Us and Them",              470, 520_000_000)
                        )),
                        new Album("The Wall", 1979, List.of(
                                new Song("Another Brick in the Wall",238, 1_200_000_000),
                                new Song("Comfortably Numb",         382, 1_400_000_000),
                                new Song("Hey You",                  318, 720_000_000),
                                new Song("Wish You Were Here",       334, 1_100_000_000)
                        )),
                        new Album("Wish You Were Here", 1975, List.of(
                                new Song("Shine On You Crazy Diamond",841, 780_000_000),
                                new Song("Welcome to the Machine",   455, 620_000_000),
                                new Song("Have a Cigar",             305, 480_000_000)
                        ))
                )),

                new Artist("Queen", "UK", "Rock", List.of(
                        new Album("A Night at the Opera", 1975, List.of(
                                new Song("Bohemian Rhapsody",        354, 1_600_000_000),
                                new Song("Love of My Life",          209, 720_000_000),
                                new Song("You're My Best Friend",    173, 540_000_000),
                                new Song("Death on Two Legs",        219, 380_000_000)
                        )),
                        new Album("News of the World", 1977, List.of(
                                new Song("We Will Rock You",         122, 1_800_000_000),
                                new Song("We Are the Champions",     179, 1_700_000_000),
                                new Song("Sheer Heart Attack",       198, 420_000_000)
                        )),
                        new Album("Jazz", 1978, List.of(
                                new Song("Don't Stop Me Now",        210, 1_500_000_000),
                                new Song("Fat Bottomed Girls",       257, 680_000_000),
                                new Song("Bicycle Race",             181, 590_000_000)
                        ))
                )),

                new Artist("Nirvana", "USA", "Rock", List.of(
                        new Album("Nevermind", 1991, List.of(
                                new Song("Smells Like Teen Spirit",  301, 1_400_000_000),
                                new Song("Come as You Are",          219, 900_000_000),
                                new Song("Lithium",                  257, 700_000_000),
                                new Song("Polly",                    175, 480_000_000),
                                new Song("In Bloom",                 255, 620_000_000)
                        )),
                        new Album("In Utero", 1993, List.of(
                                new Song("Heart-Shaped Box",         281, 980_000_000),
                                new Song("All Apologies",            229, 870_000_000),
                                new Song("Rape Me",                  196, 640_000_000),
                                new Song("Dumb",                     222, 520_000_000)
                        )),
                        new Album("Bleach", 1989, List.of(
                                new Song("About a Girl",             167, 720_000_000),
                                new Song("Blew",                     238, 380_000_000),
                                new Song("School",                   161, 340_000_000)
                        ))
                )),

                new Artist("The Rolling Stones", "UK", "Rock", List.of(
                        new Album("Exile on Main St.", 1972, List.of(
                                new Song("Rocks Off",                229, 480_000_000),
                                new Song("Tumbling Dice",            228, 520_000_000),
                                new Song("Happy",                    213, 390_000_000),
                                new Song("Sweet Virginia",           262, 340_000_000)
                        )),
                        new Album("Let It Bleed", 1969, List.of(
                                new Song("Gimme Shelter",            271, 980_000_000),
                                new Song("You Can't Always Get What You Want",448,870_000_000),
                                new Song("Midnight Rambler",         412, 520_000_000)
                        )),
                        new Album("Sticky Fingers", 1971, List.of(
                                new Song("Brown Sugar",              229, 820_000_000),
                                new Song("Wild Horses",              344, 760_000_000),
                                new Song("Moonlight Mile",           345, 430_000_000)
                        ))
                )),

                new Artist("David Bowie", "UK", "Rock", List.of(
                        new Album("Ziggy Stardust", 1972, List.of(
                                new Song("Starman",                  254, 720_000_000),
                                new Song("Suffragette City",         208, 560_000_000),
                                new Song("Rock 'n' Roll Suicide",    299, 420_000_000),
                                new Song("Ziggy Stardust",           196, 650_000_000)
                        )),
                        new Album("Heroes", 1977, List.of(
                                new Song("Heroes",                   381, 1_100_000_000),
                                new Song("Beauty and the Beast",     222, 480_000_000),
                                new Song("Sons of the Silent Age",   235, 390_000_000)
                        )),
                        new Album("Let's Dance", 1983, List.of(
                                new Song("Let's Dance",              458, 870_000_000),
                                new Song("China Girl",               342, 720_000_000),
                                new Song("Modern Love",              263, 680_000_000)
                        ))
                )),

                new Artist("Radiohead", "UK", "Rock", List.of(
                        new Album("OK Computer", 1997, List.of(
                                new Song("Karma Police",             264, 890_000_000),
                                new Song("Paranoid Android",         387, 780_000_000),
                                new Song("No Surprises",             228, 820_000_000),
                                new Song("Fake Plastic Trees",       290, 720_000_000),
                                new Song("Lucky",                    262, 580_000_000)
                        )),
                        new Album("Kid A", 2000, List.of(
                                new Song("Everything in Its Right Place",262,640_000_000),
                                new Song("How to Disappear Completely", 336, 720_000_000),
                                new Song("Idioteque",                   254, 580_000_000)
                        )),
                        new Album("The Bends", 1995, List.of(
                                new Song("Fake Plastic Trees",       290, 620_000_000),
                                new Song("High and Dry",             257, 780_000_000),
                                new Song("Just",                     232, 690_000_000)
                        ))
                )),

                new Artist("Red Hot Chili Peppers", "USA", "Rock", List.of(
                        new Album("Californication", 1999, List.of(
                                new Song("Californication",          329, 980_000_000),
                                new Song("Scar Tissue",              217, 870_000_000),
                                new Song("Otherside",                256, 760_000_000),
                                new Song("Road Trippin'",            206, 520_000_000)
                        )),
                        new Album("Blood Sugar Sex Magik", 1991, List.of(
                                new Song("Under the Bridge",         256, 1_400_000_000),
                                new Song("Give It Away",             269, 980_000_000),
                                new Song("Breaking the Girl",        311, 620_000_000)
                        )),
                        new Album("Stadium Arcadium", 2006, List.of(
                                new Song("Dani California",          268, 1_100_000_000),
                                new Song("Snow (Hey Oh)",            322, 980_000_000),
                                new Song("Tell Me Baby",             243, 720_000_000)
                        ))
                )),

                new Artist("Foo Fighters", "USA", "Rock", List.of(
                        new Album("The Colour and the Shape", 1997, List.of(
                                new Song("Everlong",                 250, 1_100_000_000),
                                new Song("My Hero",                  258, 890_000_000),
                                new Song("Monkey Wrench",            228, 650_000_000),
                                new Song("Walking After You",        302, 480_000_000)
                        )),
                        new Album("There Is Nothing Left to Lose", 1999, List.of(
                                new Song("Learn to Fly",             238, 980_000_000),
                                new Song("Stacked Actors",           266, 520_000_000),
                                new Song("Generator",                240, 430_000_000)
                        )),
                        new Album("In Your Honor", 2005, List.of(
                                new Song("Best of You",              256, 1_200_000_000),
                                new Song("DOA",                      234, 620_000_000),
                                new Song("The Last Song",            248, 480_000_000)
                        ))
                )),

                // ── Pop ─────────────────────────────────────────────────────
                new Artist("Michael Jackson", "USA", "Pop", List.of(
                        new Album("Thriller", 1982, List.of(
                                new Song("Thriller",                 358, 1_100_000_000),
                                new Song("Billie Jean",              294, 1_800_000_000),
                                new Song("Beat It",                  258, 980_000_000),
                                new Song("Wanna Be Startin' Somethin'",363,720_000_000),
                                new Song("P.Y.T.",                   239, 680_000_000)
                        )),
                        new Album("Bad", 1987, List.of(
                                new Song("Bad",                      247, 760_000_000),
                                new Song("Man in the Mirror",        320, 850_000_000),
                                new Song("The Way You Make Me Feel", 297, 720_000_000),
                                new Song("Dirty Diana",              291, 630_000_000)
                        )),
                        new Album("Off the Wall", 1979, List.of(
                                new Song("Don't Stop 'Til You Get Enough",366,980_000_000),
                                new Song("Rock with You",            222, 870_000_000),
                                new Song("Off the Wall",             235, 680_000_000)
                        ))
                )),

                new Artist("Madonna", "USA", "Pop", List.of(
                        new Album("Like a Virgin", 1984, List.of(
                                new Song("Like a Virgin",            223, 870_000_000),
                                new Song("Material Girl",            238, 690_000_000),
                                new Song("Angel",                    211, 480_000_000)
                        )),
                        new Album("Ray of Light", 1998, List.of(
                                new Song("Ray of Light",             295, 720_000_000),
                                new Song("Frozen",                   390, 820_000_000),
                                new Song("The Power of Good-Bye",    232, 560_000_000)
                        )),
                        new Album("Music", 2000, List.of(
                                new Song("Music",                    219, 780_000_000),
                                new Song("Don't Tell Me",            241, 620_000_000),
                                new Song("What It Feels Like for a Girl",244,480_000_000)
                        ))
                )),

                new Artist("Taylor Swift", "USA", "Pop", List.of(
                        new Album("1989", 2014, List.of(
                                new Song("Shake It Off",             219, 1_300_000_000),
                                new Song("Blank Space",              231, 1_200_000_000),
                                new Song("Style",                    231, 980_000_000),
                                new Song("Bad Blood",                211, 870_000_000),
                                new Song("Wildest Dreams",           221, 820_000_000)
                        )),
                        new Album("Midnights", 2022, List.of(
                                new Song("Anti-Hero",                200, 1_500_000_000),
                                new Song("Lavender Haze",            202, 890_000_000),
                                new Song("Midnight Rain",            174, 720_000_000),
                                new Song("Snow on the Beach",        270, 680_000_000)
                        )),
                        new Album("Reputation", 2017, List.of(
                                new Song("Look What You Made Me Do", 211, 1_100_000_000),
                                new Song("Delicate",                 229, 920_000_000),
                                new Song("Don't Blame Me",           236, 840_000_000)
                        ))
                )),

                new Artist("Beyoncé", "USA", "Pop", List.of(
                        new Album("Lemonade", 2016, List.of(
                                new Song("Formation",                213, 980_000_000),
                                new Song("Hold Up",                  219, 870_000_000),
                                new Song("Sorry",                    222, 820_000_000),
                                new Song("Freedom",                  280, 760_000_000)
                        )),
                        new Album("Dangerously in Love", 2003, List.of(
                                new Song("Crazy in Love",            236, 1_500_000_000),
                                new Song("Baby Boy",                 245, 1_100_000_000),
                                new Song("Naughty Girl",             220, 780_000_000)
                        )),
                        new Album("4", 2011, List.of(
                                new Song("Love on Top",              268, 920_000_000),
                                new Song("Countdown",                193, 780_000_000),
                                new Song("Best Thing I Never Had",   244, 840_000_000)
                        ))
                )),

                new Artist("Adele", "UK", "Pop", List.of(
                        new Album("21", 2011, List.of(
                                new Song("Rolling in the Deep",      228, 1_700_000_000),
                                new Song("Someone Like You",         285, 1_600_000_000),
                                new Song("Set Fire to the Rain",     242, 1_100_000_000),
                                new Song("Rumour Has It",            224, 820_000_000)
                        )),
                        new Album("25", 2015, List.of(
                                new Song("Hello",                    295, 2_100_000_000),
                                new Song("Send My Love",             207, 980_000_000),
                                new Song("Water Under the Bridge",   261, 720_000_000)
                        )),
                        new Album("30", 2021, List.of(
                                new Song("Easy On Me",               224, 1_800_000_000),
                                new Song("Oh My God",                215, 920_000_000),
                                new Song("Hold On",                  341, 780_000_000)
                        ))
                )),

                new Artist("Ed Sheeran", "UK", "Pop", List.of(
                        new Album("Divide", 2017, List.of(
                                new Song("Shape of You",             234, 1_500_000_000),
                                new Song("Castle on the Hill",       261, 1_200_000_000),
                                new Song("Galway Girl",              170, 890_000_000),
                                new Song("Perfect",                  263, 1_800_000_000)
                        )),
                        new Album("Multiply", 2014, List.of(
                                new Song("Sing",                     225, 980_000_000),
                                new Song("Don't",                    219, 870_000_000),
                                new Song("Thinking Out Loud",        281, 1_600_000_000)
                        )),
                        new Album("Subtract", 2023, List.of(
                                new Song("Eyes Closed",              213, 720_000_000),
                                new Song("Boat",                     212, 580_000_000),
                                new Song("Life Goes On",             220, 640_000_000)
                        ))
                )),

                new Artist("Billie Eilish", "USA", "Pop", List.of(
                        new Album("When We All Fall Asleep", 2019, List.of(
                                new Song("Bad Guy",                  194, 2_100_000_000),
                                new Song("When the Party's Over",    196, 1_300_000_000),
                                new Song("Bury a Friend",            193, 980_000_000),
                                new Song("Xanny",                    245, 720_000_000)
                        )),
                        new Album("Happier Than Ever", 2021, List.of(
                                new Song("Happier Than Ever",        299, 1_100_000_000),
                                new Song("NDA",                      181, 820_000_000),
                                new Song("Lost Cause",               192, 780_000_000)
                        ))
                )),

                new Artist("The Weeknd", "Canada", "Pop", List.of(
                        new Album("After Hours", 2020, List.of(
                                new Song("Blinding Lights",          200, 1_800_000_000),
                                new Song("Save Your Tears",          215, 2_100_000_000),
                                new Song("In Your Eyes",             238, 1_400_000_000),
                                new Song("Heartless",                214, 1_100_000_000)
                        )),
                        new Album("Starboy", 2016, List.of(
                                new Song("Starboy",                  230, 1_600_000_000),
                                new Song("I Feel It Coming",         269, 1_400_000_000),
                                new Song("Die for You",              260, 1_800_000_000)
                        )),
                        new Album("Beauty Behind the Madness", 2015, List.of(
                                new Song("Can't Feel My Face",       213, 1_500_000_000),
                                new Song("The Hills",                242, 1_200_000_000),
                                new Song("Earned It",                251, 1_100_000_000)
                        ))
                )),

                // ── Hip-Hop ──────────────────────────────────────────────────
                new Artist("Kendrick Lamar", "USA", "Hip-Hop", List.of(
                        new Album("To Pimp a Butterfly", 2015, List.of(
                                new Song("Alright",                  239, 780_000_000),
                                new Song("King Kunta",               234, 650_000_000),
                                new Song("These Walls",              309, 420_000_000),
                                new Song("The Blacker the Berry",    322, 480_000_000)
                        )),
                        new Album("DAMN.", 2017, List.of(
                                new Song("HUMBLE.",                  177, 1_400_000_000),
                                new Song("DNA.",                     185, 1_100_000_000),
                                new Song("LOVE.",                    213, 980_000_000)
                        )),
                        new Album("Mr. Morale & The Big Steppers", 2022, List.of(
                                new Song("N95",                      198, 720_000_000),
                                new Song("Die Hard",                 274, 680_000_000),
                                new Song("Father Time",              243, 590_000_000)
                        ))
                )),

                new Artist("Eminem", "USA", "Hip-Hop", List.of(
                        new Album("The Slim Shady LP", 1999, List.of(
                                new Song("My Name Is",               261, 900_000_000),
                                new Song("Guilty Conscience",        288, 540_000_000),
                                new Song("Rock Bottom",              300, 420_000_000)
                        )),
                        new Album("The Marshall Mathers LP", 2000, List.of(
                                new Song("The Real Slim Shady",      284, 1_100_000_000),
                                new Song("Stan",                     404, 980_000_000),
                                new Song("Kim",                      430, 310_000_000),
                                new Song("The Way I Am",             291, 720_000_000)
                        )),
                        new Album("The Eminem Show", 2002, List.of(
                                new Song("Without Me",               290, 1_200_000_000),
                                new Song("Cleanin' Out My Closet",   297, 980_000_000),
                                new Song("Sing for the Moment",      330, 870_000_000)
                        ))
                )),

                new Artist("Jay-Z", "USA", "Hip-Hop", List.of(
                        new Album("The Blueprint", 2001, List.of(
                                new Song("Izzo (H.O.V.A.)",          231, 760_000_000),
                                new Song("Song Cry",                 271, 480_000_000),
                                new Song("Never Change",             254, 390_000_000),
                                new Song("Heart of the City",        240, 520_000_000)
                        )),
                        new Album("The Black Album", 2003, List.of(
                                new Song("99 Problems",              228, 1_100_000_000),
                                new Song("Change Clothes",           205, 680_000_000),
                                new Song("Encore",                   244, 590_000_000)
                        )),
                        new Album("4:44", 2017, List.of(
                                new Song("The Story of O.J.",        256, 720_000_000),
                                new Song("Family Feud",              264, 580_000_000),
                                new Song("4:44",                     270, 490_000_000)
                        ))
                )),

                new Artist("Drake", "Canada", "Hip-Hop", List.of(
                        new Album("Take Care", 2011, List.of(
                                new Song("Take Care",                245, 1_100_000_000),
                                new Song("Marvins Room",             383, 780_000_000),
                                new Song("Crew Love",                253, 650_000_000),
                                new Song("Headlines",                237, 720_000_000)
                        )),
                        new Album("Nothing Was the Same", 2013, List.of(
                                new Song("Started From the Bottom",  206, 1_200_000_000),
                                new Song("Hold On We're Going Home", 231, 980_000_000),
                                new Song("Wu-Tang Forever",          382, 580_000_000)
                        )),
                        new Album("Scorpion", 2018, List.of(
                                new Song("God's Plan",               198, 1_800_000_000),
                                new Song("In My Feelings",           218, 1_500_000_000),
                                new Song("Nice for What",            210, 1_100_000_000)
                        ))
                )),

                new Artist("Kanye West", "USA", "Hip-Hop", List.of(
                        new Album("The College Dropout", 2004, List.of(
                                new Song("Through the Wire",         237, 820_000_000),
                                new Song("Jesus Walks",              202, 980_000_000),
                                new Song("All Falls Down",           237, 720_000_000),
                                new Song("Slow Jamz",                261, 680_000_000)
                        )),
                        new Album("Graduation", 2007, List.of(
                                new Song("Stronger",                 311, 1_400_000_000),
                                new Song("Good Life",                207, 1_100_000_000),
                                new Song("Flashing Lights",          238, 820_000_000)
                        )),
                        new Album("My Beautiful Dark Twisted Fantasy", 2010, List.of(
                                new Song("POWER",                    292, 1_200_000_000),
                                new Song("Runaway",                  549, 980_000_000),
                                new Song("All of the Lights",        298, 1_100_000_000)
                        ))
                )),

                // ── Latin ────────────────────────────────────────────────────
                new Artist("Bad Bunny", "Puerto Rico", "Latin", List.of(
                        new Album("Un Verano Sin Ti", 2022, List.of(
                                new Song("Me Porto Bonito",          178, 1_400_000_000),
                                new Song("Tití Me Preguntó",         268, 1_200_000_000),
                                new Song("Después de la Playa",      196, 870_000_000),
                                new Song("El Apagón",                357, 980_000_000)
                        )),
                        new Album("YHLQMDLG", 2020, List.of(
                                new Song("Yo Perreo Sola",           195, 1_100_000_000),
                                new Song("La Difícil",               192, 820_000_000),
                                new Song("Bichiyal",                 183, 750_000_000)
                        )),
                        new Album("El Último Tour Del Mundo", 2020, List.of(
                                new Song("Dakiti",                   196, 1_500_000_000),
                                new Song("Booker T",                 167, 720_000_000),
                                new Song("La Noche de Anoche",       181, 680_000_000)
                        ))
                )),

                new Artist("J Balvin", "Colombia", "Latin", List.of(
                        new Album("Vibras", 2018, List.of(
                                new Song("Safari",                   212, 780_000_000),
                                new Song("Machika",                  187, 690_000_000),
                                new Song("Ambiente",                 225, 540_000_000)
                        )),
                        new Album("Colores", 2020, List.of(
                                new Song("Rojo",                     177, 620_000_000),
                                new Song("Amarillo",                 186, 580_000_000),
                                new Song("Azul",                     198, 540_000_000)
                        ))
                )),

                new Artist("Shakira", "Colombia", "Latin", List.of(
                        new Album("Laundry Service", 2001, List.of(
                                new Song("Whenever Wherever",        210, 980_000_000),
                                new Song("Underneath Your Clothes",  242, 650_000_000),
                                new Song("Objection (Tango)",        239, 720_000_000)
                        )),
                        new Album("She Wolf", 2009, List.of(
                                new Song("She Wolf",                 193, 870_000_000),
                                new Song("Did It Again",             196, 580_000_000)
                        )),
                        new Album("El Dorado", 2017, List.of(
                                new Song("Chantaje",                 195, 980_000_000),
                                new Song("Me Enamoré",               204, 820_000_000),
                                new Song("La Bicicleta",             213, 760_000_000)
                        ))
                )),

                new Artist("Maluma", "Colombia", "Latin", List.of(
                        new Album("F.A.M.E.", 2018, List.of(
                                new Song("Felices los 4",            228, 870_000_000),
                                new Song("Corazón",                  198, 720_000_000),
                                new Song("Marinero",                 203, 580_000_000)
                        )),
                        new Album("Papi Juancho", 2020, List.of(
                                new Song("Hawái",                    193, 1_200_000_000),
                                new Song("Insinuar",                 185, 680_000_000),
                                new Song("No Me Ames",               196, 590_000_000)
                        ))
                )),

                new Artist("Ozuna", "Puerto Rico", "Latin", List.of(
                        new Album("Aura", 2018, List.of(
                                new Song("Taki Taki",                202, 1_100_000_000),
                                new Song("Única",                    199, 680_000_000),
                                new Song("Baila Baila Baila",        185, 890_000_000)
                        )),
                        new Album("Nibiru", 2019, List.of(
                                new Song("Vacía Sin Ti",             192, 720_000_000),
                                new Song("Adicto",                   188, 650_000_000),
                                new Song("Juju",                     184, 580_000_000)
                        ))
                )),

                // ── Electronic ───────────────────────────────────────────────
                new Artist("Daft Punk", "France", "Electronic", List.of(
                        new Album("Random Access Memories", 2013, List.of(
                                new Song("Get Lucky",                369, 1_300_000_000),
                                new Song("Instant Crush",            337, 780_000_000),
                                new Song("Lose Yourself to Dance",   345, 620_000_000),
                                new Song("Give Life Back to Music",  275, 720_000_000)
                        )),
                        new Album("Discovery", 2001, List.of(
                                new Song("One More Time",            320, 1_500_000_000),
                                new Song("Digital Love",             301, 1_100_000_000),
                                new Song("Harder Better Faster Stronger",224,1_400_000_000)
                        )),
                        new Album("Homework", 1997, List.of(
                                new Song("Around the World",         428, 980_000_000),
                                new Song("Da Funk",                  330, 820_000_000),
                                new Song("Revolution 909",           347, 560_000_000)
                        ))
                )),

                new Artist("The Chemical Brothers", "UK", "Electronic", List.of(
                        new Album("Dig Your Own Hole", 1997, List.of(
                                new Song("Block Rockin Beats",       299, 540_000_000),
                                new Song("Setting Sun",              295, 390_000_000),
                                new Song("The Privateer",            280, 320_000_000)
                        )),
                        new Album("Come with Us", 2002, List.of(
                                new Song("Come with Us",             305, 420_000_000),
                                new Song("Galaxy Bounce",            268, 380_000_000)
                        ))
                )),

                new Artist("Aphex Twin", "UK", "Electronic", List.of(
                        new Album("Selected Ambient Works", 1992, List.of(
                                new Song("Xtal",                     310, 280_000_000),
                                new Song("Tha",                      289, 240_000_000),
                                new Song("Pulsewidth",               244, 210_000_000),
                                new Song("Actium",                   494, 190_000_000)
                        )),
                        new Album("Richard D. James Album", 1996, List.of(
                                new Song("4",                        177, 220_000_000),
                                new Song("Milkman",                  175, 180_000_000),
                                new Song("Fingerbib",                164, 170_000_000)
                        ))
                )),

                new Artist("Deadmau5", "Canada", "Electronic", List.of(
                        new Album("4x4=12", 2010, List.of(
                                new Song("Some Chords",              422, 480_000_000),
                                new Song("Raise Your Weapon",        386, 520_000_000),
                                new Song("Animal Rights",            322, 380_000_000)
                        )),
                        new Album("Album Title Goes Here", 2012, List.of(
                                new Song("Superliminal",             381, 420_000_000),
                                new Song("The Veldt",                545, 580_000_000),
                                new Song("Channel 42",               328, 460_000_000)
                        ))
                )),

                // ── Jazz ─────────────────────────────────────────────────────
                new Artist("Miles Davis", "USA", "Jazz", List.of(
                        new Album("Kind of Blue", 1959, List.of(
                                new Song("So What",                  562, 320_000_000),
                                new Song("Freddie Freeloader",       583, 280_000_000),
                                new Song("Blue in Green",            327, 240_000_000),
                                new Song("All Blues",                692, 210_000_000)
                        )),
                        new Album("Bitches Brew", 1970, List.of(
                                new Song("Pharaoh's Dance",          1115,180_000_000),
                                new Song("Bitches Brew",             1018,170_000_000),
                                new Song("Miles Runs the Voodoo Down",788,160_000_000)
                        )),
                        new Album("In a Silent Way", 1969, List.of(
                                new Song("Shhh/Peaceful",            1097,150_000_000),
                                new Song("In a Silent Way",          680, 140_000_000)
                        ))
                )),

                new Artist("John Coltrane", "USA", "Jazz", List.of(
                        new Album("A Love Supreme", 1965, List.of(
                                new Song("Acknowledgement",          470, 210_000_000),
                                new Song("Resolution",               437, 190_000_000),
                                new Song("Pursuance",                459, 180_000_000),
                                new Song("Psalm",                    422, 170_000_000)
                        )),
                        new Album("Giant Steps", 1960, List.of(
                                new Song("Giant Steps",              220, 240_000_000),
                                new Song("Cousin Mary",              313, 200_000_000),
                                new Song("Naima",                    274, 220_000_000)
                        ))
                )),

                new Artist("Thelonious Monk", "USA", "Jazz", List.of(
                        new Album("Monk's Dream", 1963, List.of(
                                new Song("Monk's Dream",             328, 150_000_000),
                                new Song("Body and Soul",            288, 140_000_000),
                                new Song("Bright Mississippi",       258, 130_000_000)
                        )),
                        new Album("Brilliant Corners", 1957, List.of(
                                new Song("Brilliant Corners",        466, 120_000_000),
                                new Song("Pannonica",                454, 110_000_000)
                        ))
                )),

                // ── Soul / R&B ────────────────────────────────────────────────
                new Artist("Aretha Franklin", "USA", "Soul", List.of(
                        new Album("I Never Loved a Man", 1967, List.of(
                                new Song("Respect",                  147, 980_000_000),
                                new Song("Dr. Feelgood",             176, 420_000_000),
                                new Song("Do Right Woman",           213, 380_000_000),
                                new Song("I Never Loved a Man",      151, 340_000_000)
                        )),
                        new Album("Lady Soul", 1968, List.of(
                                new Song("Chain of Fools",           177, 720_000_000),
                                new Song("(You Make Me Feel Like) A Natural Woman",175,820_000_000),
                                new Song("Since You've Been Gone",   132, 480_000_000)
                        ))
                )),

                new Artist("Marvin Gaye", "USA", "Soul", List.of(
                        new Album("What's Going On", 1971, List.of(
                                new Song("What's Going On",          234, 760_000_000),
                                new Song("Mercy Mercy Me",           196, 650_000_000),
                                new Song("Inner City Blues",         258, 540_000_000),
                                new Song("Save the Children",        234, 420_000_000)
                        )),
                        new Album("Let's Get It On", 1973, List.of(
                                new Song("Let's Get It On",          271, 980_000_000),
                                new Song("You Sure Love to Ball",    267, 580_000_000),
                                new Song("Keep Gettin' It On",       247, 460_000_000)
                        ))
                )),

                new Artist("Amy Winehouse", "UK", "Soul", List.of(
                        new Album("Back to Black", 2006, List.of(
                                new Song("Rehab",                    213, 1_200_000_000),
                                new Song("Back to Black",            243, 980_000_000),
                                new Song("Valerie",                  231, 870_000_000),
                                new Song("Tears Dry on Their Own",   185, 720_000_000),
                                new Song("Love Is a Losing Game",    134, 820_000_000)
                        )),
                        new Album("Frank", 2003, List.of(
                                new Song("Stronger Than Me",         197, 540_000_000),
                                new Song("In My Bed",                322, 420_000_000),
                                new Song("Take the Box",             205, 380_000_000)
                        ))
                )),

                // ── DUPLICADOS ───────────────────────────────────────────────
                new Artist("The Beatles", "UK", "Rock", List.of(
                        new Album("Abbey Road", 1969, List.of(
                                new Song("Come Together",            259, 980_000_000),
                                new Song("Something",                182, 750_000_000)
                        ))
                )),

                new Artist("Bad Bunny", "Puerto Rico", "Latin", List.of(
                        new Album("Un Verano Sin Ti", 2022, List.of(
                                new Song("Me Porto Bonito",          178, 1_400_000_000),
                                new Song("Tití Me Preguntó",         268, 1_200_000_000)
                        ))
                ))
        );
}