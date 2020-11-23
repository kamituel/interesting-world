(ns kamituel.ngm-toc.data.ngm
  "")


;; TODO: gdzie jest miasto, dodać też kraj.
;; TODO: jak są dziwne znaki, np. Ciuárez, to wyszukiwać po polskim "a".
;; TODO: kiedy jedno miejsce jest w dwóch krajach (np. K2), podać trzy mapy w :places: jedna z 1 krajem,
;;       druga z 2-gim krajem, trzecia z lokalizacją.

(def ngm
  [{:year 2019 :month 8 :vol -1
    :articles [{:title "Tokio"
                :description "Największa metropolia świata siłą rzeczy musi być chaosem, ale jest to chaos zdumiewająco uporządkowany. Mimo starzejącej się populacji pozostaje kreatywna i witalna."
                :places [{:country "Japonia" :city "Tokio" :coords [35.683333 139.683333]}]}
               {:title "Drogi migrantów"
                :description "Paul Salopek w swej podróży dookoła świata śladami pierwszych ludzi zasiedlających ziemię wszędzie spotyka migrantów, zmuszonych przez los do opuszczenia rodzinnych stron."
                :places [{:country "Etiopia"}
                         {:country "Dżibuti"}
                         {:country "Jordania"}
                         {:country "Turcja"}
                         {:country "Uzbekistan"}
                         {:country "Indie"}]}
                {:title "Portrety z Tijuany"
                 :description "Granica między USA i Meksykiem w mieście Tijuana jest miejscem węzłowym dla wielu ludzkich historii."
                 :places [{:country "Meksyk" :city "Tijuana" :coords [32.5 -117.0]}]}
                {:title "Dalajlama"
                 :description "Żywy symbol tybetańskiego narodu i kultury, od 60 lat na wygnaniu, wciąż widzi świat w jasnych barwach."
                 :places [{:country "Indie" :city "Dharamsala" :coords [32.231585 76.323638]}]}
                {:title "Rosomak"
                 :description "Niezbyt urodziwy ale szaleńczo odważny i wytrwały. Lubi śnieżne środowisko Północy,a z tym nie jest dobrze."
                 :places [{:country "Kanada"}
                          {:country "USA"}]}]}
   {:year 2019 :month 7 :vol -1
    :articles [{:title "Jak dostaliśmy się na Księżyc..."
                :description "Dzięki ludzkiej determinacji, dzielności i ogromnym pieniądzom 66 lat po locie braci Wright dokonaliśmy rzeczy niebywałej."
                :places [{:country "USA" :tags ["NASA"]}]}
               {:title "... i co dalej"
                :description "Dziś kosmiczny wyścig jest bardziej międzynarodowy, sprywatyzowany, nastawiony na zyski i tłoczny. Na co liczą jego zwycięzcy?"
                :places [{:country "USA" :tags ["Virgin Galactic" "Boeing" "NASA"]}]}
               {:title "Niger"
                :description "Ten biedny zachodnioafrykański kraj otoczony przez niestabilnych sąsiadów usiłuje bronić się przed osunięciem w społeczno-polityczny chaos."
                :places [{:country "Niger"}]}
               {:title "Namorzynowy wał"
                :description "Kiedyś przybrzeżny las mangrowców chronił ląd przed wodami oceanu. Teraz ta bariera pada."
                :places [{:country "Indie" :coords [21.840236 88.989891]}
                         {:country "Bangladesz"}]}
               {:title "Morski koniec świata"
                :description "Argentyna właśnie postanowiła chronić ogromny morski obszar u swoich południowych krańców, pełen cudów podwodnego życia."
                :places [{:country "Argentyna" :tags ["Zatoka Thetis"] :coords [-53.854038 -66.426958]}]}]}
   {:year 2019 :month 6 :vol 237
    :articles [{:title "Zooturystyka"
                :description "Kontakt z dzikimi zwierzętami bywa dla ludzi źródłem euforycznych doznań. Ale za pięknymi fotografiami prezentowanymi w mediach społecznościowych kryje się przemysł pełen okrucieństwa i brutalnej eksploatacji zwierząt."
                :places [{:country "Tajlandia"}
                         {:country "Rosja"}]}
               {:title "Strażniczki"
                :description "W Zimbabwe kobiety, które same były ofiarami przemocy, sprawdzają się w roli strażniczek dzikiej natury w walce z kłusownictwem."
                :places [{:country "Zimbabwe" :coords [-16.161136 29.500340]}]}
               {:title "Morskie winogrona"
                :description "Tajemnicze Morze Sargassowe to jedyna w swoim rodzaju, pełna życia \"oceaniczna sawanna\"."
                :places [{:coords [28 -66] :tags ["Morze Sargassowe"]}]}
               {:title "Łuskowce"
                :description "Łuski, zbudowane ze zwykłej kreatyny, ale mające rzekomo cudowne właściwości, stały się dla tych ssaków przekleństwem."}]}
   {:year 2018 :month 10 :vol 229
    :articles [{:title "Kazimierz Wielki"
                :description "Król Kazimierz był wielki. Dla Polaków to fakt tak domyślnie oczywisty, że nawet nie jesteśmy w stanie mówić o tym władcy w jakikolwiek inny sposób. Dlaczego jako jedyny władca Polski zyskał ten przydomek? I czy słusznie? Na okładce jest Andrzej Hausner, odtwórca roli Kazimierza III Wielkiego w drugim sezonie serialu Telewizji Polskiej pt. „Korona królów”."
                :places [{:country "Polska"}
                         {:country "Polska" :city "Bobolice" :coords [50.613264  19.493005] :tags ["zamek"]}
                         {:country "Polska" :city "Będzin" :coords [50.327221 19.129121] :tags ["zamek"]}
                         {:country "Polska" :city "Pieskowa Skała" :coords [50.244238 19.779446] :tags ["zamek"]}]}
               {:title "Sokoły"
                :description "Od stuleci ludzi łączyła wyjątkowa więź z sokołami, najszybszymi zwierzętami świata. Teraz pewien szejk i jego sokolnik hodują i szkolą te ptaki w sposób, który może być wzorcem dla ich ochrony. (\"Władcy nieba\", Peter Gwin) Artykuł powstał w ramach kampanii National Geographic „2018 ROK PTAKÓW” koncentrującej się na znaczeniu oraz ochronie tych niezwykłych stworzeń."
                :places [{:country "Zjednoczone Emiraty Arabskie"}]}
               {:title "Park narodowy Sarek"
                :description "Niewiele jest w Europie krain tak dziewiczych jak Park Narodowy Sarek. W surowych, odludnych wspaniałościach Laponii turyści są pozostawieni sami sobie. („Dzikie serce Szwecji”, Don Belt)"
                :places [{:country "Szwecja" :coords [67.3 17.7] :tags ["park narodowy sarek"]}]}
               {:title "Irańscy nomadzi"
                :description "Współczesny świat przyciąga młode pokolenie koczowników do miast. A wielu z tych, którzy wciąż jeszcze tego stylu życia nie porzucili, zastanawia się, ile jest warte takie życie."
                :places [{:country "Iran" :tags ["nomadzi bakhtiari"] :coords [32.7 49.4]}]}
               {:title "Gorsi Amerykanie"
                :description "W czasie II wojny USA uwięziły bez sądu ponad 100 tys. obywateli z japońskimi korzeniami."
                :places [{:country "USA" :city "Los Angeles" :coords [34.137757 -118.043938] :tags ["Santa Anita (detention facility)"]}
                         {:country "USA" :tags ["Heart Mountain Relocation Center"] :coords [44.671667 -108.946389]}
                         {:country "USA" :tags ["Puyallup Assembly Center" "Camp Harmony"] :coords [47.182879 -122.295397] :city "Puyallup"}
                         {:country "USA" :city "Phoenix" :tags ["Gila River War Relocation Center"] :coords [33.065083 -111.830528]}]}
               {:title "Meduzy"
                :description "Może i są bezmózgie. Ale także piękne, a czasami nawet... nieśmiertelne."}
               {:title "Szwedzka Laponia"
                :description "Niewiele jest w Europie krain równie dziewiczych."
                :places [{:country "Szwecja" :tags ["kraina laponii"] :coords [67.4 17.3]}]}]}
   {:year 2018 :month 6 :vol 225
    :articles [{:title "Plastik"
                :description "Stworzyliśmy go. Jesteśmy od niego uzależnieni. Nieświadomie wypełniliśmy nim oceany. Miliardy ton plastikowych odpadów będą się rozkładać przez wieki, jeśli nie tysiąclecia. Aby ograniczyć ten potok musimy zwiększać wtórne wykorzystanie surowców i zużywać ich znacznie mniej. Czy możemy jednocześnie cieszyć się zaletami plastiku i mieć czyste środowisko?"}
               {:title "Kaszmir"
                :description "Śrutówki służb bezpieczeństwa oślepiają ludzi – i podgrzewają trwający od dekad indyjsko-pakistański konflikt. Władze stosują je, aby tłumić zamieszki, nie zabijając ludzi, jednak śrut okalecza przypadkowe ofiary."
                :places [{:country "Indie" :coords [33.8 76.1]}
                         {:country "Pakistan" :coords [33.8 76.1]}]}
               {:title "Afryka"
                :description "Nowe technologie i gospodarka naturalna - takie kontrasty tylko a Afryce."
                :places [{:tags ["Afryka"]}]}
               {:title "Papugi"
                :description "Budzą wielkie zainteresowanie ludzi, bo bardziej niż inne ptaki przypominają nas samych."}
               {:title "Dzika Alaska"
                :description "Ostatniej prawdziwie dzikiej połaci Ameryki zagrażają znajdujące się pod nią złoża ropy."
                :places [{:country "USA" :tags ["Alaska"] :coords [69.7  -143.6]}]}]}
   {:year 2018 :month 5 :vol 224
    :articles [{:title "Pablo Picasso"
                :description "To nazwisko zna chyba każdy. Nie tylko ze względu na znaczenie tej postaci w sztukach plastycznych, ale też świadome budowanie przez nią \"marki\" . Wielka samoświadomość, siła woli, obsesyjne poświęcenie się pracy i spora doza bezwzględności - oto co stworzyło geniusza."}
               {:title "Być muzułmaninem w Ameryce"
                :description "Jest ich 3,45 mln. Są imigrantami z ponad 75 krajów. Choć często funkcjonują w otoczeniu im niechętnym, organizują się, budują meczety - i rosną w siłę."
                :places [{:country "USA"}]}
               {:title "Dinozaury, które nie wyginęły"
                :description "Skąd się wzięły ptaki? W prostej linii od dinozaurów. Niedobitków, które przetrwały uderzenie asteroidy sprzed 66 mln lat."}
               {:title "Śmierć dla życia"
                :description "Atol Fakarava na Polinezji Francuskiej w czerwcu oferuje rzadki spektakl: amory populacji garników pod okiem bezwzględnego rekiniego stada."
                :places [{:country "Francja" :coords [-16.3 -145.633333] :tags ["Atol Fakarava" "Polinezja Francuska"]}]}]}
   {:year 2018 :month 4 :vol 223
    :articles [{:title "Pozory mylą"
                :description "Przez wiele lat koncepcja wyższości jednych ras nad innymi znajdowała sprzymierzeńców w środowiskach naukowych. Aktualne wyniki badań DNA potwierdzają, że nie ma stałych cech kojarzonych z określonymi lokalizacjami geograficznymi. Wbrew pozorom wszyscy jesteśmy bardzo do siebie podobni."}
               {:title "Co nas dzieli"
                :description "Człowiek ma niezwykłą zdolność do budowania swej tożsamości w opozycji do innych. Czy jesteśmy więc skazani na wieczny konflikt My kontra Oni?"}
               {:title "Granica"
                :description "500 kilometrową granicę pomiędzy Republiką Irlandii a Irlandią Północną nie oddziela żaden mur. Mimo to pamięć o trwającym 30 lat konflikcie pomiędzy republikanami a zwolennikami pozostania w granicach Wielkiej Brytanii jest wciąż żywa. Rozmowy toczące się wokół Brexitu zostały w Irlandii Północnej przyjęte ze strachem i gniewem – burzą one kruchą równowagę społeczną w regionie."
                :places [{:country "Irlandia Północna"}]}
               {:title "Jane i Szympansy"
                :description "Jane Goodall ma status ikony National Geographic, a jej badania nad szympansami w rezerwacie Gombe Stream stanowiły przedmiot licznych filmów, reportaży oraz wystąpień. Niepublikowane dotąd zdjęcia autorstwa Hugo van Lawicka stały się pretekstem, aby tę historię opowiedzieć jeszcze raz: bardzo szczerze, intymnie i od początku."
                :places [{:country "Tanzania" :tags ["Park narodowy Gombe"] :coords [-4.7 29.65]}]}
               {:title "Komplikacje życia"
                :description "Przez 3 mld lat życie na Ziemi miało formę prostych, jednokomórkowych organizmów. Aż w pewnym momencie zaczęło się mocno komplikować."}
               {:title "Czarny opór"
                :description "Jak pokazać światową historię walki czarnych o swoje prawa? Omar Victor Diop znalazł na to oryginalny fotograficzny sposób."}]}
   {:year 2018 :month 2 :vol 221
    :articles [{:title "Tęgie głowy"
                :description "Wyrażenie „ptasi móżdżek” na określenie intelektualnego deficytu ma niewiele wspólnego z prawdą. Niektóre ptaki dysponują bowiem możliwościami, o jakie nigdy byśmy ich nie podejrzewali. Artykuł powstał w ramach kampanii National Geographic „2018 ROK PTAKÓW” koncentrującej się na znaczeniu oraz ochronie ptaków."}
               {:title "Jesteś pod obserwacją"
                :description "Rozwój nowoczesnych technologii i mediów społecznościowych radykalnie zmienia społeczeństwo. Co wynika z faktu powszechnej inwigilacji i czy z tej drogi możemy jeszcze zawrócić?"}
               {:title "Nakarmić Chiny"
                :description "Chińczycy jeszcze nigdy nie jedli tak dobrze jak dziś, a ich potrzeby wciąż rosną. To ma swoje konsekwencje dla chińskiej wsi, stosunków społecznych i krajobrazu."
                :places [{:country "Chiny"}]}
               {:title "Urok Falklandów"
                :description "Ten archipelag na południowym Atlantyku pokazuje, jak natura potrafi wspaniale się odrodzić, gdy tylko człowiek zostawi ją  w spokoju. Na dowód pokazujemy obrazy kojącej, nieskażonej dzikości. Autorem tekstu oraz zdjęć jest Paul Nicklen."
                :places [{:country "Wielka Brytania" :coords [-51.752485 -60.003573]}]}
               {:title "Rodzic w pułapce"
                :description "Robotyczne niemowlęta pod opieką nastolatków w Kolumbii pozwalają im zrozumieć, co znaczyłoby dla nich zbyt wczesne rodzicielstwo."
                :places [{:country "Kolumbia"}]}
               {:title "Biegiem z dachu Afryki"
                :description "Na Kilimandżaro, najwyższej górze Afryki, stanęło już mnóstwo osób. Jednak w rozgrywanym na jego stokach maratonie wystartowało tylko 10. Iwona El Tanbouli-Jabłońska, dyrektor artystyczna National Geographic Polska, relacjonuje przebieg najwyżej startującego maratonu na świecie."
                :places [{:country "Tanzania" :coords [-3.067434 37.355611] :tags ["Kilimanjaro" "Kilimandżaro"]}]}]}
   {:year 2018 :month 1 :vol 220
    :articles [{:title "Świat do zaszczepienia"
                :description "Szczepionki to jeden z kamieni milowych medycyny. Ocaliły życie milionom ludzi. I byłoby ich jeszcze więcej, gdyby świat nie był pełen ekonomicznych kontrastów."}
               {:title "Ostatni lód"
                :description "Już niedługo na biegunie północnym żadnej flagi zatknąć się nie da, bo będzie tam falował ocean. To zła wiadomość. Dobra jest taka, że trochę lodowej pokrywy przetrwa, tyle że – czego można by oczekiwać – akurat nie tam."
                :tags ["Zatoka Hudsona" "Ziemia Baffina" "Wyspa Devon"]}
               {:title "Kolumbia"
                :description "Pół wieku wojny domowej zrodziło ogromne społeczne problemy. Bo jak dziś żyć w obok wczorajszych prześladowców?"
                :places [{:country "Kolumbia"}]}
               {:title "Kabul dla Bogatszych"
                :description "Klasa średnia w zrujnowanej stolicy zrujnowanego kraju? Tak. Oczywiście na miarę afgańskich możliwości."
                :places [{:country "Afganistan" :city "Kabul" :coords [34.53 69.18]}]}
               {:title "Ile znaczą ptaki"
                :description "Ciągle jeszcze są wszędzie. Stanowią nasz ostatni związek ze światem przyrody, który coraz bardziej znika. Dlatego przejrzyjmy im się uważniej."}
               {:title "Odcisk lotu"
                :description "Zwierzęta poruszające się po lądzie pozostawiają ślady swojej bytności – odciski ciał, łap, kopyt. A jak wyglądałoby niebo, gdyby po fruwających po nim ptakach też pozostawał ślad? Sami zobaczcie."}]}

#_{:year 2017 :month 10 :vol 217
    :articles [{:title "Dubaj gra w zielone"
                :description ""}]}
   {:year 2017 :month 5 :vol 212
    :articles [{:title "Geniusz"
                :description "Co decyduje o ponadprzeciętnych zdolnościach? Jakie czynniki mają na to wpływ? Jednoznacznych odpowiedzi brak, ale badania trwają i pewne tropy już mamy."}
               {:title "Płonące serce Afryki"
                :description "Republika Środkowoafrykańska - jak na Afrykę mało ludna i potencjalnie zamożna - pogrąża się w chaosie religijnych waśni. Dlaczego tak się dzieje?"
                :places [{:country "Republika Środkowoafrykańska" :coords [6.551769 20.487064]}]}
               {:title "Drzewa"
                :description "Trudno wyobrazić sobie świat bez drzew. Zbyt ważne są dla naszej kultury i wyobraźni."}
               {:title "Wrzosowiska bogaczy"
                :description "Słynne szkockie wrzosowiska to na ogół gigantyczne myśliwskie latyfundia. Klasowy charakter tego stanu rzeczy jest dziś trudny do utrzymania. Wiele wskazuje na to, że ikoniczny krajobraz Szkocji czekają poważne zmiany."
                :places [{:country "Wielka Brytania" :region "Szkocja" :coords [57.510291 -4.697443]}]}
               {:title "Topnienie"
                :description "Znikający lód na Alasce odkrywa doskonale zachowane artefakty plemion sprzed wieków."
                :places [{:country "USA" :region "Alaska" :coords [59.742208 -161.894099]}]}
               {:title "Pelikany"
                :description "Mimo swych imponujących rozmiarów pelikany wielkich emocji nie budzą. A chyba powinny, czego postaramy się dowieść."
                :places [{:country "Grecja" :region "Jezioro Kerkini" :coords [41.209750 23.129979]}]}]}

   {:year 2017 :month 2 :vol 209
   :articles [{:title "Pił sobie człowiek"
               :description "Alkohol jest jednym z najbardziej uniwersalnych produktów w całej historii człowieka. I jakkolwiek kontrowersyjnie by to zabrzmiało - w pewnym sensie nas uformował."}
              {:title "Jak zostać mężczyzną"
               :description "Dawne kultury ułatwiały przejście od wieku chłopięcego do męskiego, oferując młodemu człowiekowi odwieczne rytuały. Dziś musi on zmierzyć się z tym wyzwaniem sam."}
              {:title "Martwe za życia"
               :description "Wdowy w niektórych społeczeństwach mają status szczególny. I nie chodzi tu wcale o uprzywilejowanie, ale uznanie za 'pechowe' i zepchnięcie na margines."}
              {:title "Koty wychodzą z cienia"
               :description "Oprócz lwów, tygrysów i pum na świecie żyje wiele gatunków małych dzikich kotów. Poznaliśmy je dość słabo, choć wcale nie dlatego, że nie są interesujące."}
              {:title "Współczesna Amazonia"
               :description "W tropikalnej puszczy plemienne sposoby życia w dużej mierze są już tylko wspomnieniem. Powab nowoczesności także tam trudno jest zignorować, zwłaszcza że wielu dzisiejszych mieszkańców to ludność napływowa."
               :places [{:country "Ekwador" :coords [-1.516472 -74.038972]}]}]}
   {:year 2017 :month 1 :vol 208
    :articles [{:title "Gender"
                :description "Termin 'gender' w naszym kraju budzi emocje. W centrum sporu znajduje się pytanie, czy problemy z tożsamością płciową to kwestia natury, czy kultury. Jak widzi to nauka? Poniżej Mandy z Samoa - fa'alafine, czyli przedstawicielka tamtejszej trzeciej płci."}
               {:title "Duch ponad materią"
                :description "To, w co wierzysz, twoje myśli i przekonania, potrafią bezpośrednio przekładać się na stan twojego ciała. Nawet jeśli jest to tylko wiara w medycynę."}
               {:title "Przybysz z innej planety"
                :description "Trwająca blisko cztery lata 'rodzinna podróż Tony'ego Halika przez obie Ameryki przyniosła mu rozgłos i uznanie podróżników. Dziś takich wypraw już nie ma."}
               {:title "Śmierć ojca"
                :description "Panujący przez 70 lat król Tajlandii był dla mieszkańców tego kraju 'odwieczny'. Śmierć chodzącej doskonałości, władcy o boskim statusie, rodzi jednak problemy, bo jak może go zastąpić zwykły śmiertelnik?"
                :places [{:country "Tajlandia" :coords [15 101]}]}
               {:title "Batalia o Wirungę"
                :description "Wirunga to prawdziwa perła natury Czarnego Lądu. Ale ochrona dzikiej przyrody w chaosie aftykańskiego jądra ciemności jest zadaniem dla straceńców."
                :places [{:country "Demokratyczna Republika Konga" :coords [-0.91667 29.16667]}]}]}
   {:year 2016 :month 12 :vol 207
    :articles [{:title "Cienie wątpliwości"
                :description "Techniki kryminalistyczne to bardziej rzemiosło niż nauka. Wielu niewinnych posłały za kraty lub na tamten świat."}
               {:title "Generacja Putina"
                :description "Młodzi Rosjanie, jak ci, którzy świętują koniec roku szkolnego, dorastali w czasach rządów Władimira Putina. Jacy są, jakiej Rosji chcą i dokąd zaprowadzą swój kraj?"
                :places [{:country "Rosja"}]} ;; TODO: coords
               {:title "Polarny dryf"
                :description "W kolektywnym radzieckim społeczeństwie sukcesy nauki brały się z hartu i pasji wybitnych indywidualistów."
                :places [{:country "Rosja"}]} ;; TODO: coords}
               {:title "Na cienkiej gałęzi"
                :description "Orangutany z pierwotnych puszcz dopiero od niedawna, m.in. dzięki dronom, zaczynamy naprawdę poznawać."
                :places [{:country "Sumatra" :coords [0 102]}
                         {:country "Borneo" :coords [1 114]}]}
               {:title "Zakonnice z Meksyku"
                :description "Zrytualizowane życie za klasztornym murem dla ludzi postronnych jest dość tajemnicze i budzi trudną do zaspokojenia ciekawość. Ale od czego są fotografowie?"
                :places [{:country "Meksyk" :coords [19.063333 -98.306389]}]}]}
   {:year 2016 :month 11 :vol 206
    :articles [{:title "Rozmowa NG"
                :description "Wywiad z Piotrem Pogonem, który umierał cztery razy, a mimo to, a może właśnie dlatego, zdołał pomóc wielu ludziom. "}
               {:title "Mars dla Ziemian"
                :description "Czy i kiedy polecimy na Marsa? I czy może on stanowić alternatywę dla Ziemi po możliwej katastrofie?"}
               {:title "Polski jaskiniowy rekord"
                :description "Rzecz o człowieku, który się zawziął, i jaskini, która w końcu uległa."
                :places [{:country "Czechy" :coords [49.532 17.750778]}]}
               {:title "Po drugiej stronie życia"
                :description "Teoretycznie zza granicy między życiem i śmiercią nie ma powrotu. Okazuje się ona jednak dość płynna."}
               {:title "Kruchy pokój"
                :description "Rajska Sri Lanka na 26 lat ugrzęzła w wojnie domowej. Dziś konflikt się wypalił, ale rachunki krzywd wciąż czekają na wyrównanie."
                :places [{:country "Sri Lanka" :coords [7 81]}]}
               {:title "Moc ósemki"
                :description "Są trochę jak kosmici, a trochę jak ludzie. Ośmiornice naprawdę potrafią wprawić w zdumienie."}]}
   {:year 2016 :month 10 :vol 205
    :articles [{:title "Nowa Europa"
                :description "Największa część fali uchodźców, jaka w 2015 r. stanęła u wrót Europy, przyjęły Niemcy. Jak to znoszą?"
                :places [{:country "Niemcy" :coords [51 10]}]}
               {:title "Tułaczka do Nowej Zelandii"
                :description "W czasie II wojny światowej z ZSRR z armią Andersa wyprowadzono tysiące polskich sierot. Publikujemy fragmenty ich wspomnień."}
               {:title "Jankeska fala"
                :description "W stosunkach Kuba - USA nastała odwilż. Czy wyspa udźwignie związany z tym ociepleniem najazd?"
                :places [{:country "Kuba" :coords [23.133333 -82.383333]}]}
               {:title "Życie duchowe starożytnych Greków"
                :description "Olimppijskich bogów, z ich przywarami i słabostkami, od ludzi odróżniała tylko nieśmiertelność. Można było więc liczyć, że dadzą się uprosić."
                :places [{:country "Grecja" :coords [37.983972 23.727806]}]}
               {:title "Wilki morskie"
                :description "Wbrew pozorom artykuł poświęcony jest czworonożnym drapieżnikom, tyle że... na morskiej diecie."
                :places [{:country "Kanada" :coords [53.742583 -128.707727]}]}
               {:title "Śnieżne małpy"
                :description "Kąpiące się w gorących źródłach, wśród śniegu - małpy w takich okolicznościach można zobaczyć tylko w Japonii."
                :places [{:country "Japonia" :coords [36.732534 138.461934]}]}]}
   {:year 2016 :month 9 :vol 204
    :articles [{:title "Wzrok do poprawki"
                :description "W okulistyce trwa rewolucja. Ale nawet bez niej miliony ludzi za małe pieniądze mogłyby odzyskać wzrok."}
               {:title "Zobaczyć niewidzialne"
                :description "Jak w życiu codziennym funkcjonują ludzie, którzy nie widzą? Kluczem do odnalezienia się w świecie jest trening i determinacja."}
               {:title "Kanion Kolorado"
                :description "Ogrom i piękno tego cudu natury w jednych wywołują zachwyty, w innych pokusę zrobienia na nim biznesu."
                :places [{:country "USA" :coords [36.3 -112.6]}]}
               {:title "Imperium królów Węży"
                :description "Opowieść o niezwykłym okresie w cywilizacji Majów."
                :places [{:country "Gwatemala" :city "Tikal" :coords [17.222094 -89.623614]}
                         {:country "Meksyk" :city "Calakmul" :coords [18.105392 -89.810829]}]}
               {:title "Moda na zabijanie"
                :description "Futra po latach banicji wracają do łask świata mody. Dlaczego tak się dzieje i co to oznacza dla zwierząt?"}
               {:title "Z dziennika fotografa | Barwy mroku"
                :description ""}]}
   {:year 2016 :month 8 :vol 203
    :articles [{:title "Sport na dopingu"
                :description "Po co zwalczać doping, skoro to syzyfowa praca? Nie tylko w imię zasad, ale też by sportowe igrzyska nie stały się igrzyskami śmierci."}
               {:title "Gangi tracą Ciudad Juárez"
                :description "Miasto, w którym trup słał się gęsto, a spacer po parku był ryzykiem, nagle odżyło. Jak do tego doszło? "
                :places [{:country "Meksyk" :city "Ciudad Juárez" :coords [31.739444 -106.486944]}]}
               {:title "Nauka vs. komary"
                :description "Malaria, zika, denga, żółta febra – tym wszystkim mogą uraczyć człowieka komary. Mimo to na razie nie mamy przeciw nim skutecznej broni. "}
               {:title "Panda na swoim"
                :description "Mało które duże zwierzę tak bardzo przypomina maskotkę. A już chyba żadne nie budzi takiego entuzjazmu. "
                :places [{:country "Chiny" :coords [31.02 103.1]}]}
               {:title "Rekiny"
                :description "Żarłacze białopłetwe, „oceaniczne szybowce”, były kiedyś tak liczne jak bizony na prerii. Dziś trzeba mieć szczęście, by na nie trafić."}
               {:title "Sieciowe studio"
                :description "Ptaki sportretowane w sieciach ornitologów – ten fotograficzny projekt ma budzić naszą empatię."}]}
   {:year 2016 :month 7 :vol 202
    :articles [{:title "Wywiad z Martinem Caparrosem"
                :description "Reporter zjeździł świat, by zrozumieć, dlaczego tylu ludzi na świecie wciąż nie ma co jeść. Jego 'Głód' oddaje głos najbiedniejszym."}
               {:title "Szaber starożytności"
                :description "Na terenach wielu starych kultur trwa społeczny zamęt. A to sprzyja archeologicznym rabunkom."}
               {:title "Sztuka szukania"
                :description "Wykrywacz metalu to towarzysz coraz większej liczby Polaków przeczeszujących kraj w poszukiwaniu rozmaitych skarbów."
                :places [{:country "Polska"}]}
               {:title "Robinson Cruzoe"
                :description "Postać najsłynniejszego rozbitka świata jest pisarską kreacją, ale miał on pierwowzór z krwi i kości."
                :places [{:country "Chile" :coords [-33.641389 -78.841111]}]}
               {:title "Jaskinie na miarę Chin"
                :description "Na południu Państwa Środka istnieje region z niezwykle spektakularnymi, często dziewiczymi formami krasu."
                :places [{:country "Chiny" :coords [25.4 105.9]}] }
               {:title "Rekiny"
                :description "Żarłacze białe zależnie od perspektywy mogą mieć wygląd głupkowatego błazna lub morderczej bestii."}]}
   {:year 2016 :month 6 :vol 201
    :articles [{:title "Jędrek Bargiel: Człowiek Roku NG"
                :description "Jeśli zjeżdżanie na deskach ze szczytów ośmiotysięczników nie jest szaleństwem, to co nim jest?"}
               {:title "Indianie Amazonii"
                :description "Choć może trudno w to uwierzyć, w deszczowym lesie żyją jeszcze tzw. plemiona bez kontaktu."
                :places [{:country "Peru" :region "Park Narodowy Manu" :coords [-11.856389 -71.721389]}]}
               {:title "Haiti od katastrofy do katastrofy"
                :description "Kraj uchodzi za skazany na łaskę możnych. Ale młodzi mieszkańcy chcą widzieć go inaczej. "
                :places [{:country "Haiti" :coords [19 -72.416667]}]}
               {:title "Oko natury"
                :description "Mimo że ewolucja jest ślepa, swoje dzieła potrafiła wyposażyć w doskonały wzrok."}
               {:title "Filipiny okiem fotografa"
                :description "Próba pokazania życia społecznego przez pryzmat obrazków klatki schodowej to dobry koncept? Zobaczcie sami."
                :places [{:country "Filipiny" :coords [14.583333 121]}]}
               {:title "Rekiny"
                :description "Może i mają reputację krwiożerczych bestii, ale dla ekologicznego zdrowia oceanów są niezbędne."}]}
   {:year 2016 :month 5 :vol 200
    :articles [{:title "Miasto Jaguara"
                :description "Nieznane ruiny ukryte w tropikalnym lesie? Wydawałoby się, że to tylko fantazja. A jednak..."
                :places [{:country "Honduras" :coords [14.85 -85.2]}]}
               {:title "Skarby dla zuchwałych"
                :description "Troja, Petra, Machu Picchu. Największe odkrycia były dziełem raczej awanturników i obieżyświatów niż naukowców. "
                :places [{:country "Turcja" :city "Troja" :coords [39.9575 26.238889]}
                         {:country "Jordania" :city "Petra" :coords [30.328611 35.441944]}
                         {:country "Peru" :city "Machu Picchu" :coords [-13.163333 -72.545556]}]}
               {:title "Fatamorgana"
                :description "140 tys. ludzi żyjących w jednym miejscu na pustyni. Prawdziwe miasto, którego nie ma, bo w istocie jest obozem dla uchodźców."
                :places [{:country "Jordania" :city "Zaatari" :coords [32.295667 36.32375]}]}
               {:title "Kongo"
                :description "Rejs barką po rzece Kongo jest podróżą do geograficznego i mitycznego serca Afryki."
                :places [{:country "Demokratyczna Republika Konga" :city "Mbandaka" :coords [0.047778 18.255833]}]}
               {:title "Ziemia Franciszka Józefa"
                :description "Pustkowia Arktyki wciąż pozwalają doświadczyć świata, w którym to natura dominuje nad człowiekiem."
                :places [{:country "Rosja" :coords [80.566667 54.783333]}]}
               {:title "Na gruzach utopii"
                :description "Dzieła potęgi ZSRR sfotografowane w śnieżnej bieli są jak metafora postapokaliptycznej przyszłości."}]}
   {:year 2016 :month 4 :vol 199
    :articles [{:title "56 sekund"
                :description "Jak katastrofalne trzęsienie ziemi zmieniło Nepal. "
                :places [{:country "Nepal" :coords [28.289976 84.68975]}]}
               {:title "Żywe boginie Nepalu"
                :description "Małe dziewczynki jako inkarnacje bogini? Ta barwna religijna tradycja w Himalajach wciąż jest żywa."
                :places [{:country "Nepal" :city "Katmandu" :coords [27.7 85.333333]}]}
               {:title "Chorobotwórcze mikroby"
                :description "Wydawało się, że mamy je pod kontrolą. Tymczasem, z wielu powodów, w tym naszych zaniedbań, przystąpiły do kontrataku."}
               {:title "Ziemia duchów"
                :description "Ludobójstwo dokonane sto lat temu w Anatolii to trauma, która wciąż dzieli Ormian i Turków."
                :places [{:country "Turcja" :region "Anatolia" :coords [39 35]}]}
               {:title "Co do jednego"
                :description "Joel Sartore chce zrobić portrety tylu stworzeniom, ilu zdoła. Ten projekt zajmie mu całe życie."}
               {:title "Królestwo dziewcząt"
                :description "Matriarchalnych społeczności jest na świecie niewiele. My pokażemy jedną z nich, w Indiach."
                :places [{:country "Indie" :city "Mawlynnong" :coords [25.199722 91.931667]}]}]}
   {:year 2016 :month 3 :vol 198
    :articles [{:title "Frank Stella"
                :description "Najbardziej wpływowy artysta USA. Kontrowersyjny, ale chętnie wystawiany i kupowany. Zainspirował się pewną polską książką."}
               {:title "Śmietnik suto zastawiony"
                :description "Z jednej strony miliony ludzi nie dojada. Z drugiej - świat marnuje co trzecią wytworzoną tonę żywności."}
               {:title "Ten drugi Irak"
                :description "Kurdowie, próbując wywalczyć sobie państwo, muszą się mierzyć z siłami brutalnych islamistów z ISIS."
                :places [{:country "Irak" :region "Kurdystan" :coords [36.183333 44]}]}
               {:title "Akrtyczna gorączka"
                :description "Arktyka skrywa pokłady cennych surowców. Kilka państw podjęło już wyścig po te skarby."}
               {:title "Kolor nieskończoności"
                :description "Jest na świecie kilka miejsc, gdzie w architektonicznym pejzażu dominuje błękit. Powody tych skłonności bywają zaskakujące."
                :places [{:country "Maroko" :city "Szawfszawan" :coords [35.171389 -5.269722]}
                         {:country "Indie" :city "Dźondhpur" :coords [26.28 73.02]}
                         {:country "Turcja" :city "Stambuł" :coords [41.005385 28.976825]}
                         {:country "Polska" :city "Smerekowiec" :coords [49.510833 21.218333]}]}
               {:title "Slalom o północy"
                :description "Noc, dziewicze stoki i szusujący narciarze. Sfotografowanie takiej scenerii okazało się wyzwaniem."}]}
   {:year 2016 :month 2 :vol 197
    :articles [{:title "Islam"
                :description "Za sprawą uchodźców z Bliskiego Wschodu ciągnących do Europy temat islamu stał się w naszym kraju gorący jak nigdy dotąd. Jaka zatem jest prawda o islamie? Na ile lęki Europejczyków są uzasadnione?"}
               {:title "Kobiety królestwa Saudów"
                :description "Choć zgodnie z prawem nie wolno im prowadzić aut, nie jest to ich największym zmartwieniem. W skrajnie konserwatywnym społeczeństwie Arabii Saudyjskiej, w kórym obowiązuje pełna segregacja płci, kobiety muszą iść na daleko idące kompromisy."
                :places [{:country "Arabia Saudyjska" :coords [24.711667 46.726944]}]}
               {:title "Denali"
                :description "Ogromna połać dziewiczej przyrody, jedna z ostanich takich na świecie. Królestwo wilków i niedźwiedzi, w którym najpewniejszym zimowym środkiem lokomocji pozostaje psi zaprzęg. Ziemia chroniona jako park narodowy, ale taki, w którym można swobodnie wędrować i biwakować. Witajcie w Alasce!"
                :places [{:country "USA" :region "Alaska" :coords [63.333333 -150.5]}]}
               {:title "Londyn od podszewki"
                :description "Ziemia pod zamieszkiwanym od tysiącleci miastem takim jak Londyn kryje niezwykle pamiątki przeszłości. Jeśli więc trafi się ogromny projekt infrastrukturalny taki jak budowa metra, zyskujemy nagle niezwykłą możliwość ich 'poławiania'."
                :places [{:country "Wielka Brytania" :city "Londyn" :coords [51.507222 -0.1275]}]}
               {:title "Nosorożce"
                :description "Tysiącami giną z rąk kłusowników z powodu swojego spiczastego oręża, które przynosi wielkie zyski. Ale czy wyobrażacie sobie te ogromne zwierzęta hodowane dla ich rogów niczym krowy? W RPA tak się dzieje."
                :places [{:country "RPA" :coords [-29 24]}]}
               {:title "Fotoreportaż"
                :description "Kirgijskie brutalne zawody jeźdźców mają długą tradycję i niezmienną zasadę, którą jest brak zasad."
                :places [{:country "Kirgistan" :coords [41.266667 74.983333]}]}]}
   {:year 2016 :month 1 :vol 196
    :articles [{:title "Kuracja Naturą"
                :description "Jesteśmy częścią wielkiego systemu Natury, o czym zdajemy się zapominać, wierząc przede wszystkim w zdobycze cywilizacji. Tymczasem nie można jej porzucić ot tak, bezkarnie. Kontakt z naturą to warunek naszego dobrego zdrowia i samopoczucia. I coraz częściej lekarze przepisują go swoim pacjentom."}
               {:title "Polskie parki narodowe"
                :description "W aktualnym stanie prawnym powołanie do życia nowego parku narodowego w Polsce jest praktycznie niemożliwe. Czym ryzykujemy, utrzymując  taki stan rzeczy, i czy możemy sobie na to pozwolić?"}
               {:title "Gumowa Azja"
                :description "Rosnący popyt na kauczuk wywołał coś na kształ lateksowej gorączki złota. Generując wysokie dochody, pozwolił najuboższym regionom Azji wyjść z biedy. Kosztem jest jednak znikanie wielkich połaci dzikiej puszczy z całą jej bioróżnorodnością."
                :places [{:region "Azja"}]}
               {:title "Dobry jak sęp"
                :description "Sępy kojarzą się źle i pozytywnych emocji nie budzą. A powinny, bo ich znaczenie dla ekosystemów ciepłych krain jest znacznie większe niż każdnego z wielkich zwierząt, które ludzi elektryzują."}
               {:title "Food trucki"
                :description "Niby uliczne, ale z pretensjami do kulinarnej sztuki. Jedzenie z gastrobusów, które urosły na kryzysie finansowym, zrobiło w Ameryce prawdziwą furorę."
                :places [{:country "USA"}]}
               {:title "Mapy NG"
                :description "W dobie geolokalizacji mapy powstają i wyglądają inaczej niż dawniej. National Geographic mimo zmian technologicznych pozostaje w tej dziedzinie liderem. A oglądanie starych map wciąż przynosi wielką frajdę."}]}
   {:year 2015 :month 12 :vol 195
    :articles [{:title "Matka Boska"
                :description "Choć wiadomo o niej niewiele – w ewangeliach poza małymi wyjątkami niemal nie dochodzi do głosu – Matka Jezusa cieszy się na świecie powszechnym kultem, od Polski, przez Rwandę, po Meksyk. Czasem nawet gorętszym niż ten, jaki otacza jej syna. Pielgrzymki ciągną do miejsc, gdzie ponoć się objawiła. Z czego wynika ten stan rzeczy i co to mówi o naturze człowieka?"}
               {:title "Wywiad"
                :description "Z prof. Zbigniewem Mikołejką o socjologiczno-psychologicznych fundamentach kultu Maryi "}
               {:title "Kwestia smaku"
                :description "Myliłby się ten, kto by sądził, że smak to sprawa kubków smakowych. Rzecz jest znacznie bardziej złożona, bo rozkosze podniebienia są polifonią wielu zmysłów. Weźmy taką słodycz truskawek: w istocie jest ona małym oszustwem. Oto roślina uwalnia związki sugerujące, że ma większą niż w rzeczywistości „zawartość cukru w cukrze”. I jak tu nie posmakować? "}
               {:title "Lamparty"
                :description "Oczyma wyobraźni te wielkie i dzikie koty widzimy w scenerii dżungli lub sawanny. Kto to słyszał, żeby matecznikiem lamparta była plantacja trzciny cukrowej? Albo żeby polował on na psy na przedmieściach wielomilionowej metropolii. Tak się jednak dzieje. I dzięki Bogu, bo „prawdziwych” siedlisk jest coraz mniej. "}
               {:title "Nowy Jork"
                :description "Kiedyś zachwycał drapaczami chmur, ale oprócz Manhattanu były tam też rejony w ludzkiej skali. Dziś coraz więcej dzielnic pnie się w górę, przyciągając pieniądze superbogaczy z całego świata. Jaki zatem jest nowy Nowy Jork? Proponujemy wycieczkę po metropolii z pisarzem, rodowitym nowojorczykiem, który zna ją od czasów powojennego dzieciństwa."
                :places [{:country "USA" :city "Nowy Jork" :coords [40.716667 -74]}]}]}
   {:year 2015 :month 11 :vol 194
    :articles [{:title "Zielona Rewolucja"
                :description "Niemcy nie są krajem przesadnie wietrznym czy słonecznym. Mimo to w ciągu dwóch dekad sprawili, że energia ze źródeł odnawialnych „trafiła pod strzechy”. A wszystko dzięki osobliwej mieszance idealizmu i chęci zysku."
                :places [{:country "Niemcy" :coords [51 10]}]}
               {:title "Słoneczny prąd"
                :description "Miliony mieszkańców Indii z powodu braku dostępu do sieci elektrycznej żyły dotąd w ciemnościach. Na szczęście słońce grzeje tam mocno, a współczesna technologia pozwala zamienić jego energię na prąd nawet w środku puszczy."
                :places [{:country "Indie" :coords [21 77]}]}
               {:title "Podgrzana Grendlandia"
                :description "Grenlandzcy myśliwi w ciągu wieków wypracowali techniki, które pozwalały im przetrwać w polarnym ekosystemie. Podstawą ich stylu życia był jednak lód. Cóż mają robić, gdy jest go coraz mniej?"
                :places [{:country "Grenlandia" :coords [72 -40]}]}
               {:title "Mokre Kiribati"
                :description "Poziom oceanów wciąż się podnosi, a wiele wysp na Oceanie Spokojnym wystaje ponad wodę zaledwie metr–dwa. Czy małe pacyficzne raje są skazane na zagładę? Na razie wyspiarze nie tracą ducha i walczą."
                :places [{:country "Kiribati" :coords [1.416667 173]}]}
               {:title "Sztuka przetrwania"
                :description "Zmiana klimatu dla jednych stworzeń oznacza katastrofę, dla innych przeciwnie – możliwość ekspansji. Niestety, dobrze mieć się będą tylko gatunki najbardziej odporne, najszybciej się mnożące i najmniej wybredne pokarmowo. Dla oryginałów, smakoszy i wrażliwców miejsca będzie coraz mniej."}
               {:title "EKG Ziemi"
                :description "Nieustanne monitorowanie klimatu jest dziś kwestią niezwykle ważną. Czołowe ośrodki naukowe świata tworzą więc programy i konstruują urządzenia, które mają sprostać temu zadaniu. A funkcjonowanie naszego globu najlepiej obserwować z orbity."}]}
   {:year 2015 :month 10 :vol 193
    :articles [{:title "Górale z Podhala"
                :description "Dlaczego przetrwali jako grupa kulturowa, która ceni swoją odrębność i pielęgnuje korzenie? Z czego wynika witalność tradycji, której nowoczesność nie zdołała pokonać, tak jak to się stało z ludowymi tradycjami innych regionów kraju? Zapewne wpływ na to miały warunki geograficzne, niezwykłe „okoliczności przyrody”."
                :places [{:country "Polska" :region "Podhale" :coords [49.479259 20.029127]}]}
               {:title "Granice Rzymu"
                :description "Misją starożytnego Rzymu była ekspansja. Ale że nic nie może rosnąć w nieskończoność, w pewnym momencie imperium także stało się zbyt duże, by dało się nim efektywnie zarządzać. Cesarz Hadrian jął więc wytyczać stabilne, wyraźne granice, od Brytanii, którą podzielił kamienną barierą, po pustynie Syrii. Czemu te umocnienia służyły, jaka była ich faktyczna funkcja? Na pewno nie chodziło o obronę przed armiami barbarzyńców. A czy możemy w tym dostrzec jakieś analogie do naszych czasów?"
                :places [{:country "Włochy" :city "Rzym" :coords [41.883333 12.483333]}]}
               {:title "Tajemniczy przodek"
                :description "Historię najdawniejszych przodków człowieka próbujemy rekonstruować na podstawie niewielkich fragmentów szkieletów. Luk w niej jest więc sporo. I oto mamy nagle niezwykłe znalezisko z RPA, które trudno datować: może mieć 2 mln, a może kilkaset tysięcy lat. Ale w obu przypadkach mamy małą rewolucję w paleontologii."
                :places [{:country "RPA" :region "Dinaledi" :coords [-25.916667 27.783333]}]}
               {:title "Dzika obsesja"
                :description "Mieć tygrysa na podwórku, pytona pod łóżkiem... Posiadanie groźnego dzikiego zwierza w mniemaniu niektórych czyni ich ludźmi wyjątkowymi. Rzecz w tym, że stworzenia trzymane w niewoli nie są już dzikie, ale nie stają się też domowymi pupilami. Zostają zawieszone w jakimś pośrednim stanie, co czasem prowadzi do tragedii, a niemal zawsze – do straty dla przyrody."}]}
   {:year 2015 :month 9 :vol 192
    :articles [{:title "Krwawa kość"
                :description "Dla kłusownika słoń wart jest tyle, ile jego ciosy. A że za te ostatnie klienci są skłonni płacić coraz więcej, każde dźwigające je zwierzę jest potencjalnym celem. W Afryce, gdzie władza jest słaba, a na wielu obszarach prawo stanowią rozmaite zbrojne bandy, walka z kłusownictwem przynosi liczne ofiary także po stronie obrońców zwierząt. To jest prawdziwa wojna."
                :places [{:country "Republika Środkowoafrykańska" :coords [5.315706 25.957947]}
                         {:country "Demokratyczna Republika Konga"}
                         {:country "Sudan"}]}
               {:title "Birmańskie Himalaje"
                :description "Mjanma przez dekady była krajem zamkniętym. Oczywiście strzelające w górę z tamtejszej dżungli szczyty też były odizolowane – miłośnicy wspinaczki nie mieli okazji, by się z nimi mierzyć. Teraz nadrabiają te zaległości, w końcu to jeden z ostatnich tak dziewiczych dla nich obszarów. Wyruszyliśmy zatem z wyprawą na blisko sześciotysięczny Hkakabo Razi, najwyższy szczyt kraju. "
                :places [{:country "Birma" :coords [27.333056 97.4275]}]}
               {:title "Afgańske Mes Aynak"
                :description "Starożytny buddyjski ośrodek kwitnący dzięki miedzi na wieki zniknął pod zwałami osadów. Dziś archeolodzy odkopują imponujące klasztory i warownie. Sęk w tym, że chętnych do kopania w tym miejscu jest więcej. Aby dostać się do ogromnego pokładu miedzi, trzeba zebrać gigantyczną górę..."
                :places [{:country "Afganistan" :city "Mes Aynak" :coords [34.4 69.366667]}]}
               {:title "Kameleon zmienny jest"
                :description "Te jaszczurki słyną ze swoich anatomicznych osobliwości, z których najciekawsze są radykalne zmiany koloru skóry. Co oznaczają i jaki mechanizm się za nimi kryje? Wydaje się, że naukowcy ostatecznie zgłębili ten problem."
                :places [{:country "Madagaskar" :city "Antananarywa" :coords [-18.933333 47.516667]}]}
               {:title "Argentyńska prowincja"
                :description "Świat argentyńskich grup etnicznych jest wprawdzie niezwykle fotogeniczny, ale fotograficzny projekt, który tu prezentujemy, ma również pozaestetyczny cel."
                :places [{:country "Argentyna" :coords [-34 -64]}]}]}
   {:year 2015 :month 8 :vol 191
    :articles [{:title "Franciszek i Watykan"
                :description "Papież Franciszek to „najlepszy piarowiec świata”. Człowiek, który wniósł do Watykanu nową energię, sposób komunikacji z wiernymi, nowe rozumienie misji tej instytucji. Wynik jego zmagań ze skostniałą strukturą rzymskiej kurii może zadecydować o przyszłości Kościoła."
                :places [{:country "Watykan" :coords [41.904 12.453]}]}
               {:title "Jezioro Rudolfa"
                :description "Nad kenijskim jeziorem zbierają się czarne chmury. Ale nie niosą one deszczu – przeciwnie. Zapory na zasilającej akwen rzece Omo w Etiopii grożą stopniowym znikaniem jeziora. Dla plemion znad jego brzegów, dla ich kultury, jest to sprawa życia i śmierci."
                :places [{:country "Kenia" :coords [3.583333 36.116667]}]}
               {:title "Sztuka wypychania"
                :description "Taksydermia, czyli wypychanie trofeów, praktykowana jest od dawna. Wiele przyrodniczych muzeów ma ogromne kolekcje preparowanej fauny. Dziś sztuka ta stała się jednak tak kontrowersyjna, że pojawiła się jej rekonstrukcyjna odmiana, niezwiązana z zabijaniem zwierząt."}
               {:title "Zbiory Muzeum Zoologii"
                :description "W magazynach pod Puszczą Kampinoską znajduje się 7,5 mln okazów wypreparowanych zwierząt."
                :places [{:country "Polska" :region "Kampinoski Park Narodowy" :coords [52.363328, 20.788525]}]}
               {:title "Laos bomb"
                :description "Na ten azjatycki kraj w czasie wojny wietnamskiej Amerykanie zrzucili niewiarygodne ilości bomb. Pozostałością tego okresu są leje widoczne w krajobrazie i mnóstwo niewybuchów. Dziś stają się one rezerwuarem surowców wtórnych oraz atrakcją turystyczną. "
                :places [{:country "Laos" :region "Równina dzbanów" :coords [19.43 103.153]}]}
               {:title "Afryka rybaków"
                :description "Południowa Afryka, u brzegów której zbiegają się dwa oceany, miała do niedawna jedne z najbogatszych łowisk świata. Jednak rząd RPA dopuścił do tego stołu zbyt wielu biesiadników."
                :places [{:country "RPA" :coords [-34.065328 24.914294]}]}
               {:title "Kabaty pod stopami"
                :description "Dla pasjonatów świata owadów wycieczka na podmiejską łąkę jest niczym wyprawa w tropiki."
                :places [{:country "Polska" :region "Las Kabacki" :coords [52.1161 21.0572]}]}]}
   {:year 2015 :month 7 :vol 190
    :articles [{:title "Japonia"
                :description "Kraj Kwitnącej Wiśni jest fascynujący z wielu powodów. Niezwykła tradycja, wyrafinowana technologiczna współczesność i społeczeństwo rozpięte między tymi biegunami, które dorobiło się paru fenomenów."
                :places [{:country "Japonia" :coords [35 136]}]}
               {:title "Na tropach eboli"
                :description "Wiemy o nim niewiele. Zabójczy wirus kryje się gdzieś w trzewiach Afryki, by co jakiś czas na krótko wychynąć, zaatakować i znów się przyczaić. Ostatnia epidemia miała jednak rozmiar dotąd nie notowany. Czy dopadniemy ebolę?"
                :places [{:country "Liberia" :coords [6.313333 -10.801389]}
                         {:country "Sierra Leone" :coords [8.484444 -13.234444]}]}
               {:title "Pluton po degradacji"
                :description "Długo uchodził za ostatnią planetę w Układzie Słonecznym. Ostatnio jednak został zdegradowany do klasy planet karłowatych. Mimo to zagadki z nim związane są warte poznania, zwłaszcza że w lipcu minie go sonda, która pozwoli lepiej mu się przyjrzeć."}
               {:title "Amazonka"
                :description "Wiadomo było, że źródła największej rzeki świata znajdują się gdzieś w Andach. Ale który strumień uznać za początek? Rozstrzygnięcie związanych z tym kontrowersji wymagało paru wypraw, a do ostatecznych ustaleń walnie przyczynili się Polacy."
                :places [{:country "Brazylia" :region "Amazonka" :coords [0.707778,-50.089444]}]}
               {:title "Gandhi superstar"
                :description "Ten asceta, intelektualista i działacz społeczny w pewien sposób stworzył współczesne Indie – dał im polityczną tożsamość i ideę walki bez przemocy. Co z jego dziedzictwa przetrwało do naszych czasów?"
                :places [{:country "Indie" :region "Asram Sabarmati" :coords [23.06 72.580833]}]}
               {:title "Orki na uczcie"
                :description "Mimo że orki noszą też groźne miano zabójców wielorybów, w relacjach z członkami swego stada potrafią być bardzo altruistyczne, a przede wszystkim tworzyć i przekazywać niezwykłe techniki polowań."}]}
   {:year 2015 :month 6 :vol 189
    :articles [{:title "Prof. Zofia Kielan-Jaworowska"
                :description "Badaczka w swej długiej naukowej karierze zbierała trylobity i polowała na skamieniałości dinozaurów. Jej mongolskie wyprawy z lat 60. okazały się największym sukcesem polskiej paleontologii."}
               {:title "Dwoista natura trawki"
                :description "Marihuana – jak każdy narkotyk – może mieć zgubne skutki, dlatego w większości krajów jest używką nielegalną. Okazuje się jednak, że roślina ta ma też inne oblicze – zaskakująco skutecznego leku."}
               {:title "Bodi z Etiopii"
                :description "W tym plemieniu z doliny Omo grube jest piękne i pożądane. Panowie hodują więc imponujące brzuchy na diecie, której podstawą są miód, krew i mleko. Na dorocznym święcie Kael chcą zadać szyku i zdobyć uznanie, przede wszystkim płci przeciwnej."
                :places [{:country "Etiopia" :coords [4.800353 35.967069]}]}
               {:title "Delfiny"
                :description "„Pracujący w rozrywce” ku uciesze ludzi delfin wypuszczony na wolność jest niczym więzień opuszczający zakład karny po dekadach odsiadki. Bezradny. Aby przetrwał w bezkresnym oceanie, musi się najpierw wiele nauczyć."}
               {:title "Jezioro Aralskie"
                :description "Zanim władza radziecka postanowiła nawodnić pustynie Azji Środkowej, było czwartym pod względem wielkości śródlądowym akwenem na świecie. Dziś zostały po nim nędzne resztki i przypominające fatamorganę obrazy – rdzewiejące kutry w morzu piasków. "
                ;; Two countries one coord because lake lies on a border.
                :places [{:country "Uzbekistan" :coords [45 59.5]}
                         {:country "Kazahstan"}]}
               {:title "Makrooczy"
                :description "Nawet za pomocą mikroskopu niełatwo spojrzeć owadowi w oczy, zwłaszcza że niektóre mogą ich mieć, powiedzmy, ośmioro. Ale zdecydowanie warto im się przyjrzeć, bo są to prawdziwe cuda ewolucji."}]}
   {:year 2015 :month 5 :vol 188
    :articles [{:title "Cena albinosa"
                :description "Magiczny specyfik z ciała albinosa? Tak, w Tanzanii wciąż poluje się na ludzi i brutalnie ich okalecza, żeby zdobyć rzekome źródło mocy wykorzystywane w rytuałach czarnej magii."
                :places [{:country "Tanzania" :coords [-3.452611 33.602641]}]}
               {:title "Język delfinów"
                :description "Niewiele chyba zwierząt na świecie cieszy się taką sympatią ludzi jak delfiny. Ich inteligencja fascynuje nas, dlatego tak frustrujący jest brak możliwości „wymiany myśli”. Istnieją jednak naukowcy, którzy wierzą w możliwość rozmowy z delfinami."}
               {:title "Upadłe Detroit"
                :description "Miasto symbol amerykańskiego przemysłu samochodowego przeżyło spektakularny upadek. Jego bogate i ludne niegdyś dzielnice zamieniły się w hektary „miejskiej prerii” pełnej opuszczonych domów. Ale że na rozłożonych szczątkach zawsze coś wyrasta, w Detroit też widać kiełkowanie nowego."
                :places [{:country "USA" :city "Detroit" :coords [42.330268 -83.045927]}]}
               {:title "Pszczoły"
                :description "Owadzie pracusie przynoszą nam nieocenione korzyści. I wcale nie miód jest tu najważniejszy, tylko zapylanie mnóstwa roślin, które żywią ludzkość. Tymczasem stres, jakiemu pszczoły podlegają, jest coraz większy. Co się stanie, gdy ich zabraknie?"}
               {:title "Ujarzmianie Mekongu"
                :description "Dzika rzeka karmi miliony ludzi w Azji Południowo-Wschodniej. Ale mogłaby też zapewnić im prąd. Wybór: ryby czy zapory dokonywany jest na naszych oczach. Na razie wygrywa beton."
                :places [{:country "Wietnam" :coords [10.009 105.824]}
                         {:country "Kambodża"}
                         {:country "Tajlandia"}
                         {:country "Laos"}
                         {:country "Birma"}
                         {:country "Chiny"}]}
               {:title "Pielgrzymka"
                :description "Marsz Drogą św. Jakuba równie często jak chrześcijanie podejmują ludzie niereligijni. I dla jednych, i dla drugich jest to doznanie duchowe."
                :places [{:country "Hiszpania" :coords [42.880602 -8.544377]}]}]}
   {:year 2015 :month 4 :vol 187
    :articles [{:title "Pogromca oceanu"
                :description "Emerytura pana Aleksandra wygląda niekonwencjonalnie. Jej stałym elementem wydaje się kajak oceaniczny wykorzystywany do... samotnych podróży przez Atlantyk."
                :tags ["Aleksander Doba"]}
               {:title "Kolumna Trajana"
                :description "Rozrzeźbiony niemal 40-metrowy monument wznosi się nad Rzymem od 19 wieków, świadcząc o triumfie legionów nad Dakami. Co możemy wyczytać z tego starożytnego komiksu wyrytego w marmurze?"
                :places [{:country "Włochy" :city "Rzym" :coords [41.895833 12.484167]}]}
               {:title "10 hitów Hubble'a"
                :description "Był pierwszym tego typu urządzeniem wyniesionym na orbitę, co dało ludzkości zupełnie nową perspektywę. Zrobił mnóstwo zdjęć niedostępnych wcześniej naszym oczom najdalszych zakątków wszechświata. Niektóre z tych obrazów zachwycają pięknem."}
               {:title "Chińskie fortece"
                :description "Południowe Chiny mogą się pochwalić niezwykłymi budowlami – wielorodzinnymi klanowymi budynkami mieszkalnymi i wiejskimi fortecami zarazem. Tak oryginalne konstrukcje, do niedawna szerzej nieznane, musiały trafić na listę dziedzictwa UNESCO."
                :places [{:country "Chiny" :coords [24.483586 117.137875]}]}
               {:title "Pociąg Lincolna"
                :description "Ciało zastrzelonego przez zamachowca prezydenta Stanów Zjednoczonych przez wiele dni jechało pociągiem przez Amerykę. Hołd oddawały mu miliony ludzi – także czarnych, którym dał wolność. Co zostało z tych czasów do dziś?"
                :places [{:country "USA"}]}
               {:title "Malowanie słonie"
                :description "Zwierzęta te w kulturze Indii grają rolę szczególną, co widać np. w czasie festiwalu słoni w Dźajpurze."
                :places [{:country "Indie" :region "Radżastan" :city "Dźajpur" :coords [26.922317 75.825531]}]}]}
   {:year 2015 :month 3 :vol 186
    :articles [{:title "Tajemnice Bałtyku"
                :description "W XVI w. Mars był największym okrętem, jaki pływał po wodach tego morza. Potężnie uzbrojony galeon został jednak zatopiony w bitwie u brzegów Olandii. Po latach poszukiwań badacze namierzyli jego doskonale zachowany wrak."
                :places [{:region "Morze Bałtyckie" :coords [57.217192 17.256970]}]}
               {:title "Dwa oblicza Europy"
                :description "Ateny i Berlin stały się symbolami północy i południa Europy, czyli regionu prosperity i strefy kryzysu. Skąd się wzięła taka różnica położenia w jednym gospodarczym organizmie? Powodów było wiele, lecz najwyraźniej przesądziły o tym kwestie kulturowe."
                :places [{:country "Grecja" :city "Ateny" :coords [38 23.716667]}
                         {:country "Niemcy" :city "Berlin" :coords [52.51 13.38]}]}
               {:title "Naukowe niedowiarki"
                :description "Mimo że kształt współczesnemu społeczeństwu nadały osiągnięcia nauki, dziś są one często odrzucane jako fałszywe. Dlaczego ludzie kwestionują np. wartość szczepionek czy realność procesów ewolucji i globalnego ocieplenia? Paradoksalnie wpływ na to ma łatwość komunikowania się i dostępu do informacji."}
               {:title "Pieszo przez świat"
                :description "W swej pieszej wędrówce śladami pierwszych ludzi kolonizujących naszą planetę Paul Salopek trafił do Turcji. Mimowolnie stał się towarzyszem milionów bezradnych wygnańców z Syrii, którzy tułają się po szlakach Anatolii – ziemi oglądającej takie obrazy od tysiącleci."
                :places [{:country "Syria" :coords [36.54 37.26]}]}
               {:title "Światło życia"
                :description "Wydawać by się mogło, że zdolność emisji fal świetlnych nie przynależy do świata istot żywych. A jednak świecących stworzeń, przede wszystkim morskich, jest całkiem sporo. I pokaźny jest też zestaw celów i sposobów, w jaki wykorzystują one tę umiejętność."}]}
   {:year 2015 :month 2 :vol 185
    :articles [{:title "Hawaje"
                :description "Ten archipelag jest znany z wulkanów, gigantycznych fal oraz... surfingu. Dla tubylców ślizganie się po falach oceanu stanowi coś więcej niż sport. Jest ważnym elementem tutejszej kultury."
                :places [{:country "USA" :region "Hawaje" :coords [21.30 -157.85]}]}
               {:title "Maski weteranów"
                :description "Już weterani I wojny światowej, pozornie cali i zdrowi, cierpieli na dziwne przypadłości. Ale dopiero badania żołnierzy z Iraku i Afganistanu wykazały, że wybuchy dewastują mózg. W walce z jego dysfunkcjami pomaga... terapia artystyczna."}
               {:title "Bonobo"
                :description "Te małpy człekokształtne znane są z trybu życia przesyconego seksem. Swoje społeczne cele osiągają raczej na drodze cielesnych kontaktów niż przemocy. Dlaczego tak się dzieje, dlaczego różnią się tym od swych najbliższych kuzynów szympansów i czy badania nad nimi powiedzą coś o nas samych?"
                :places [{:country "Demokratyczna Republika Konga" :coords [-0.25 21.76]}]}
               {:title "Bretonki"
                :description "Fantazyjne nakrycia głowy, którymi szczyciły się mieszkanki bretońskich wsi, kilka dekad temu zaczęły uchodzić za żenujące. Dziś stają się symbolem tożsamości."
                :places [{:country "Francja" :region "Bretania" :coords [48.17 -2.92]}]}
               {:title "Gran Paradiso"
                :description "Ten alpejski park narodowy był wcześniej łowieckim rezerwatem króla Włoch. Dziś jest ostoją koziorożców, skrawkiem dzikiej przyrody w ludnym i zurbanizowanym kraju."
                :places [{:country "Włochy" :coords [45.502 7.31]}]}
               {:title "Roztocze"
                :description "Te drapieżniki wyposażone w cały arsenał tnących i kłujących broni są mikroskopijne. Żyją w niszach najdziwniejszych miejsc na ciałach większych od nich żywych stworzeń. I wciąż znamy tylko wycinek bogactwa ich gatunków."}]}
   {:year 2015 :month 1 :vol 184
    :articles [{:title "Pierwsi artyści"
                :description "Licząca dziesiątki tysięcy lat sztuka odnajdowana na ścianach jaskiń pokazuje moment przełomu, w którym zaczęliśmy wymykać się ze świata zwierząt."}
               {:title "Pierwszy rok życia"
                :description "Niemowlęcy mózg gwałtownie się w tym czasie rozwija i uczy komunikować ze światem. Okazuje się, że kluczowa dla jego architektury jest... miłość."}
               {:title "Lagos"
                :description "Wciąż jeszcze biedna, ale kipiąca przedsiębiorczością największa metropolia Afryki. MiIiony jej mieszkańców napędzają boom, jakiego kontynent nie widział."
                ;; TODO: Lagos appears two times with exact same location.
                :places [{:country "Nigeria" :city "Lagos" :coords [6.45 3.38]}]}
               {:title "Spojrzenie na wszechświat"
                :description "Kosmos, który możemy zobaczyć, to ledwie część jego masy. Jest jeszcze niewidzialna ciemna materia, która ma nań przemożny wpływ."}
               {:title "Sekretarz nr 1"
                :description "Towarzysz Edward Gierek budzi ambiwalentne uczucia. Komunistyczny aparatczyk, który dał Polakom namiastkę konsumpcyjnego stylu życia. Dlaczego jego rządy skończyły się katastrofą?"
                :places [{:country "Polska"}]}
               {:title "Pierwszy ptak RP i USA"
                :description "To oczywiście orzeł. Na godła trafił zapewne z powodu swoich imponujących rozmiarów oraz pewności siebie widocznej w konstrukcji gniazd."
                :places [{:country "Polska"}
                         {:country "USA"}]}
               {:title "Pierwsi Amerykanie"
                :description "Przyszli z Azji czy przypłynęli? A jeśli tak, to kiedy? I dlaczego dzisiejsi rdzenni mieszkańcy kontynentu tak się różnią od „pierwszego desantu”? Ten temat kryje wiele zagadek. "
                :places [{:region "Ameryka"}]}]}
   {:year 2014 :month 12 :vol 183
    :articles [{:title "Dookoła świata"
                :description "Paul Salopek zgodnie z planem obejścia globu przemierza tereny, na których człowiek porzucił koczowniczy tryb życia. Nasza miejska rzeczywistość narodziła się na Bliskim Wschodzie."}
               {:title "Jerozolima"
                :description "Miasto święte dla trzech abrahamowych religii. Dlaczego akurat tutaj doszło do wielkiego zapętlenia religijnych prawd i emocji, od których cały Bliski Wschód zdaje się kipieć?"
                :places [{:country "Izrael" :city "Jerozolima" :coords [31.776667 35.234167]}]}
               {:title "Patagonia"
                :description "Dzikie pustkowia – to z powodu ich braku kowboje stracili rację bytu. Jest jednak takie miejsce, gdzie i bydło jest jeszcze dość dzikie, i bezludzia wystarczająco rozległe, by można było poczuć smak życia kowboja, czy raczej – gaucza."
                :places [{:country "Argentyna" :region "Patagonia" :coords [-41.81015 -68.90627]}]}
               {:title "Mandela"
                :description "Jak stał się legendą, ikoną? Czy stworzyła go sytuacja, potrzeba wykreowania symbolu walki z apartheidem, czy też osobiste przymioty? Oto jest pytanie."
                :places [{:country "RPA"}]}
               {:title "Świat z 3D"
                :description "Ile jest prawdy w przekonaniu, że drukarki 3D wydrukują naszą przyszłość? Możliwości wydają się nieograniczone, ale... "}
               {:title "Radość jedzenia"
                :description "Jedzenie daje nam energię, ale ma też funkcję społeczną: wspólny posiłek to coś więcej niż tylko „tankowanie kalorii”."}
               {:title "Norwegia"
                :description "Kraj z najbardziej zawiłą linią brzegową na świecie na krajobrazową monotonię narzekać nie może."
                :places [{:country "Norwegia" :coords [61 8]}]}]}
   {:year 2013 :month 11 :vol 182
    :articles [{:title "Fotoreportaż"
                :description "Polowanie na wieloryby sympatii nie budzi. Ale czasem bywa sposobem na przeżycie"}
               {:title "Bogowie Indii"
                :description "Hinduski panteon zasiedla armia bóstw, czasem szokujących. Jak szukać w nim porządku, jak odnajdują się w tym hindusi?"
                :places [{:country "Indie"}]}
               {:title "Afryka po chińsku"
                :description "Czarny Ląd od dekolonizacji nie potrafił wyjść z biedy. Teraz może się to zmienić – m.in. za sprawą Chińczyków i telefonów."
                :places [{:region "Afryka"}
                         {:country "Chiny"}]}
               {:title "Szerpowie"
                :description "Trudno wyobrazić sobie bez nich wspinaczkę na Everest. Wielu stanęło na tym szczycie po wielokroć i wielu zginęło."
                :places [{:country "Nepal" :coords [27.824 86.691]}]}
               {:title "Zwierzęce zombi"
                :description "Diaboliczne pasożyty. Jak przejmują kontrolę nad mózgami swoich ofiar, sprawiając, by im bezwolnie służyły?"}
               {:title "Małpy z Maroka"
                :description "Jedyne małpy żyjące w Afryce na północ od Sahary. I jedyne migrantki w Europie."
                :places [{:country "Maroko" :coords [31.386486 -5.262048]}]}
               {:title "Dylemat mięzożercy"
                :description "Czy rezygnacja z wołowiny może pomóc planecie? Zdania są podzielone."}
               {:title "Odzyskana przyroda Karoliny"
                :description "Wojna secesyjna spustoszyła wielkie ryżowe farmy. A natura szybko uczyniła z nich swoje sanktuarium."
                :places [{:country "USA" :region "Karolina Południowa" :coords [32.511709 -80.403627]}]}]}
   {:year 2013 :month 10 :vol 181
    :articles [{:title "Wielki Konkurs Fotograficzny"
                :description "Jak typowało tegoroczne jury? Publikujemy wszystkie nagrodzone zdjęcia opatrzone komentarzami autorów."}
               {:title "Król spinozaur"
                :description "T. rex zdetronizowany. Zapraszamy na spotkanie z nowym królem – największym drapieżnym dinozaurem, jaki chodził po Ziemi. A może raczej pływał."}
               {:title "Wyprawa do średniowiecza"
                :description " Swanetia – pozbawiona dróg, gruzińska kraina odizolowana od świata przez wysokie szczyty Kaukazu – była niczym szkatułka, która przechowała społeczną rzeczywistość sprzed wieków."
                :places [{:country "Gruzja" :region "Swanetia" :coords [43.114 42.377]}]}
               {:title "Turystyka nuklearna"
                :description "Czarnobyl – strefa zamknięta, miejsce największej w historii katastrofy atomowej – staje się turystyczną atrakcją. Przeraża i... zachwyca bujną przyrodą."
                :places [{:country "Ukraina" :city "Czarnobyl" :coords [51.386663 30.095867]}]}
               {:title "Malowidła z Faras"
                :description "Umknęły przed potopem na pustyni – do Warszawy. Losy dzieł sztuki z Nubii przypominają fabułę przygodowego filmu."
                :places [{:country "Sudan" :coords [22.2 31.466667]}]}
               {:title "Druga zielona rewolucja"
                :description "W XX w. jedna już się nam udała. Teraz musimy doprowadzić do drugiej. Inaczej czeka nas potężny żywnościowy kryzys."}
               {:title "Kiedy śnieg zawodzi"
                :description "Kalifornia odkrywa, że zamiana pustyń w kwitnące ogrody ma swoje ograniczenia. Przede wszystkim... śniegowe."
                :places [{:country "USA" :region "Kalifornia" :coords [35.30 -118.33]}]}]}
   {:year 2014 :month 9 :vol 180
    :articles [{:title "Owadzia sesja"
                :description "Niezwykłość form, kolorów i kształtów całej tej drobnicy fruwającej i bzykającej gdzieś w naszym otoczeniu umyka ludzkim oczom. Trzeba dopiero utalentowanego makrofotografa, żeby je przed nami odsłonić. "}
               {:title "Neron"
                :description "Potwór. Szalony kabotyn gotów do największych zbrodni – oto potoczna opinia o tym rzymskim cesarzu, który dla własnej fantazji podpalił ponoć Rzym. Cóż, wiele z wysuwanych przeciw niemu zarzutów jest prawdziwych. Ale z drugiej strony – sporo jest efektem czarnego piaru jego politycznych przeciwników. Czy zatem Neron wymaga rehabilitacji?"
                :places [{:country "Włochy"}]}
               {:title "Podwodny skarb"
                :description "Rafa Mezoamerykańska jest wprawdzie mniejsza od Wielkiej Rafy Australijskiej, ale blisko 1000 km długości to przecież imponujący rozmiar. A że jest znacznie bliżej lądu, tworzy niepowtarzalny wodno-lądowy ekosystem. Rzecz w tym, że bliskość lądu oznacza też bliskość człowieka. I jak zwykle nie wiadomo, czy ten uszanuje arcydzieło natury."
                :places [{:region "Ameryka" :coords [17.532 -86.302]}]}
               {:title "Jak Taj z Tajem"
                :description "Królestwo Tajów, które w ostatnich dekadach przeżyło gospodarczy boom i stało się turystycznym rajem, mogłoby się wydawać przykładem sukcesu. Jednak dla zbyt wielu obywateli sukces państwa nie okazał się ich własnym. Tajlandia wpadła w gigantyczny polityczny kryzys, który pachnie wojną domową."
                ;; TODO: drugi punkt z Tajlandii.
                :places [{:country "Tajlandia" :coords [15 101]}]}
               {:title "Dieta jaskiniowa"
                :description "Mówi się, że dieta współczesnych społeczeństw oparta na produktach wysokoprzetworzonych i równie wysoko kalorycznych odpowiada za epidemie chorób cywilizacyjnych. Czy zatem powrót do menu myśliwych-zbieraczy mógłby nam pomóc? A jeśli tak, to czy jesteście gotowi porzucić mąkę i nabiał, i dania gotowane? Pytań jest sporo, odpowiedzi wciąż kontrowersyjne, ale z pewnością wiele od nich zależy."}
               {:title "Minnesota Keillora"
                :description "Całe życie w jednym miejscu – w Ameryce rzecz to raczej rzadka. Spędzenie go wśród ludzi znanych od dzieciństwa, w stałych, bliskich relacjach przyjacielskich i rodzinnych, ale na tle zmieniającego się miasta i społeczeństwa, daje niezwykłą perspektywę. 70-letni dziennikarz Garrison Keillor spróbował pokazać ją w swoich wspomnieniach z Minneapolis."
                :places [{:country "USA" :region "Minnesota" :coords [45.73 -94.57]}]}]}
   {:year 2014 :month 8 :vol 179
    :articles [{:title "Plemiona"
                :description "Plemienne życie rdzennych ludów oznacza zupełnie inny niż nasz model istnienia. Jimmy Nelson w odległych zakątkach świata w niezwykły sposób sfotografował te społeczności, które wciąż jeszcze nie utraciły kontaktu z czasem sprzed tysięcy lat. Nasza cywilizacja stoi już jednak u ich progu."}
               {:title "„Miasto” z neolitu"
                :description "Czy 5 tys. lat temu niewielkie szkockie wyspy mogły być ludną, kwitnącą krainą promieniującą kulturowo na południe? Czy dokonania ich mieszkańców mogły się stać inspiracją dla budowniczych Stonehenge? Oczywiście. Na Orkadach wystarczy ruszyć łopatą, by znaleźć kamienne odpowiedzi na te pytania."
                :places [{:country "Wielka Brytania" :region "Szkocja" :coords [58.996762 -3.215115]}]}
               {:title "Podziemia wojny"
                :description "Okopy I wojny światowej czasem przebiegały... głęboko pod ziemią. Gdy nie dało się na powierzchni, próbowano dopaść wroga pod nią. Sieci tuneli stawały się, zależnie od okoliczności, schronami, sypialniami, śmiertelnymi pułapkami, korytarzami transportowymi dla minerów. I wreszcie – jedyną w swoim rodzaju galerią sztuki, gdzie żołnierze próbowali uporać się z frontowymi traumami."
                :places [{:country "Francja"}]}
               {:title "Głuptaki"
                :description "Te morskie ptaki na swoją nazwę w żaden sposób nie zasłużyły. Są energiczne, znakomicie nurkują i potrafią walczyć o swoje, choć z człowiekiem, gdy ten postanowił przerabiać je na smar, oczywiście przegrywały. Na szczęście w porę przyszło opamiętanie i pozostawiona w spokoju populacja pięknie się odrodziła."
                :places [{:country "Wielka Brytania" :region "Szkocja" :coords [60.812202 -0.897722]}]}
               {:title "Głodna Ameryka"
                :description "Żyją w niedostatku i wiecznie martwią się o jutrzejszy obiad, a mimo to – tyją. Choć strojem przypominają przedstawicieli klasy średniej, nie przetrwaliby bez żywnościowych bonów z pomocy społecznej. I to mimo że mają oficjalną pełnoetatową pracę i żyją w USA, najbogatszym kraju świata. Amerykańska bieda jest paradoksalna, niepodobna do tej z krajów Trzeciego Świata, ale ogranicza tak samo."
                :places [{:country "USA"}]}
               {:title "Transylwania"
                :description "Na wzgórzach Siedmiogrodu, gdzie od wieków prowadzono gospodarkę naturalną, kosząc trawę kosami i wypasając owce, ukształtował się niezwykły ekosystem łąk oszałamiających botanicznym kwiatowym bogactwem. Czas sianokosów jest tu prawdziwą orgią kolorów i zapachów. Metod nowoczesnego rolnictwa to bogactwo nie przetrwa."
                :places [{:country "Rumunia" :region "Siedmiogród" :coords [46.766 23.583]}]}]}
   {:year 2014 :month 7 :vol 178
    :articles [{:title "Miedziane złoto"
                :description "Kopalnie i huty to brudny ciężki przemysł. A jednak kadry z takich miejsc potrafią być naprawdę fascynujące, i to nie tylko wówczas, gdy w grę wchodzi srebro i złoto. Oto obrazy z KGHM."
                :places [{:country "Polska"}]}
               {:title "Cuda natury"
                :description "Miejsca najbardziej zachwycające, dziewicze, z największą obfitością dzikiego życia. Jeśli przetrwały do naszych czasów, to w jakimś sensie dzięki XIX-wiecznej jeszcze idei parku narodowego. Podróż po najcenniejszych światowych parkach to litania zachwytów nad pięknem, jakie potrafi tworzyć przyroda."
                :places [{:country "Uganda" :region "Park Narodowy Królowej Elżbiety" :coords [-0.2 29.9167]}
                         {:country "USA" :region "Park Narodowy Kaloko-Honokohau" :coords [19.6787 -156.022]}
                         {:country "Polska" :region "Biebrzański Park Narodowy" :coords [53.59 22.82]}
                         {:country "Nambia" :region "Park Narodowy Namib-Naukluft" :coords [-24.54 15.32]}
                         {:country "USA" :region "Park Narodowy Yellowstone" :coords [44.6 -110.5]}
                         {:country "USA" :region "Park Narodowy Canyonlands" :coords [38.29 -109.93]}
                         {:country "Argentyna" :region "Park Narodowy Los Glaciares" :coords [-50.40 -72.95]}
                         {:country "Australia" :region "Park Narodowy Uluru-Kata Tjuta" :coords [-25.31 131.01]}]}
               {:title "Żywy kosmos?"
                :description "Czy życie podobne do ziemskiego istnieje gdzieś we wszechświecie? A może wcale nie jest ono jego jedyną możliwą formą? Poszukiwania – życia, a zarazem odpowiedzi na powyższe pytania – trwają. "}
               {:title "Dookoła świata"
                :description "Od studni do studni przez pustkowia saudyjskiego dziś Hidżazu, regionu pielgrzymkowych szlaków wiodących do świętych miejsc islamu. Kolejny etap pieszej wędrówki Paula Salopka śladami kolonizacji ziemi przez wyruszającego z Afryki Homo sapiens."}
               {:title "Taaka ryba"
                :description "Mieszkanka raf koralowych, ale wielka i głośna. Mimo to niegroźna. Co więcej – sama zagrożona. Granik itajara to domator, którego z pieleszy wyrwać może jedynie tarło. Ten miks imponującego wyglądu i łagodności charakteru gatunek może przypłacić swym istnieniem."
                :places [{:country "USA" :region "Floryda" :coords [26.59 -82.98]}]}
               {:title "Afryka obfitości"
                :description "Choć kontynent kojarzy się z głodem i wielu jego mieszkańców permanentnie nie dojada, Afryka dysponuje wielkimi rezerwami produkcji rolnej. Międzynarodowe koncerny przed kilku laty zwietrzyły w tym interes, na naszych oczach zmieniając afrykańskie rolnictwo. Pytanie tylko, czy na pewno kierunek zmian jest właściwy."
                :places [{:region "Afryka"}]}
               {:title "Ludzie i konie"
                :description "Indianie prerii osiągnęli w hippice taką biegłość, że zdawali się stanowić ze swymi wierzchowcami jedność. Konie, które przyniosły w ich społecznym życiu prawdziwą rewolucję, zawdzięczali białym. Zanim ich świat uległ zagładzie, przez kilka wieków preria była królestwem mustanga."
                :places [{:country "USA"}]}]}
   {:year 2014 :month 6 :vol 177
    :articles [{:title "Fotoreportaż"
                :description "Krokodyl nie jest miłym i wdzięcznym modelem dla fotografa, zwłaszcza podwodnego. Są jednak tacy, którzy zasadzają się na portret gada."}
               {:title "Grobowiec Wari"
                :description "Odkrycie niezrabowanego królewskiego grobowca zawierającego złote artefakty jest dziś prawie niemożliwe. Dlatego gdy polscy archeolodzy odnaleźli takowy w Andach, wywołali światową sensację."
                :places [{:country "Peru" :coords [-10.062916 -78.125779]}]}
               {:title "Wywiad"
                :description "Miłosz Giersz, odkrywca grobowca królowych Wari, wyjawia sekrety tajemniczej kultury, która poprzedzała imperium Inków."}
               {:title "Psy wojny"
                :description " Amerykańska armia ma w swoich szeregach także czworonożnych zawodowców. A służba na froncie wyjątkowo cementuje saperski duet człowieka z psem."
                :places [{:country "USA"}]}
               {:title "Strażacki nos"
                :description "Emocjonalna asceza na co dzień i akcja jako zabawa – oto sposób na wyszkolenie dla straży pożarnej psa umiejącego poszukiwać ludzi w gruzowiskach. "}
               {:title "Rohingjowie"
                :description "Bez przynależności państwowej, bez dokumentów, bez pracy. Wielu spośród nich oficjalnie nie istnieje. A jednak są. Dziesiątkami tysięcy zaludniają obozy dla uchodźców, wygnani przez dyskryminujące mniejszości władze Mjanmy."
                :places [{:country "Birma" :coords [19.5 94]}
                         {:country "Bangladesz" :coords [22.09 92.01]}]}
               {:title "Maskonury"
                :description "Te morskie ptaki na kilka miesięcy w roku po prostu znikają. Bytują gdzieś samotne wśród wokółbiegunowych mórz. Na ląd wychodzą tylko na czas godów. A obrazki z ich kolonii koją strapione dusze."}
               {:title "Morza do uprawy"
                :description "Wiele wskazuje na to, że jednym ze sposobów wykarmienia rosnącej populacji będzie akwakultura. Hodowla wodnych stworzeń może być bowiem wydajniejsza niż tuczenie zwierząt na lądzie. Nie wspominając już o zdrowotnej wyższości morskiej diety."}
               {:title "Lekarze na torach"
                :description "Syberia to gigantyczne przestrzenie, samotne osady i brak dróg. Jak zapewnić żyjącym tam ludziom pomoc medyczną? Skoro człowiek nie może dotrzeć do przychodni, ta musi dojechać do człowieka. Po szynach Bajkalsko-Amurskiej Magistrali."
                :places [{:country "Rosja" :region "Sybiera" :coords [48.491663 135.109202]}]}]}
   {:year 2014 :month 5 :vol 176
    :articles [{:title "Fotoreportaż"
                :description "Aby konkurować z trawlerami, rybacy z wybrzeża Ghany dysponujący jedynie drewnianymi łodziami muszą wykazać się fizyczną krzepą, optymizmem, a przede wszystkim – duchem współpracy."
                :places [{:country "Ghana" :city "Elmina" :coords [5.091849 -1.341662]}]}
               {:title "Plan dla 9 mld"
                :description "Jest nas coraz więcej, chcemy jeść coraz lepiej, a wszystkich lądów zaorać nie możemy. Co zatem robić? Jak wykarmić ludzkość, nie doprowadzając przy tym planety do ruiny?"}
               {:title "Co je świat"
                :description "Od 12 tys. do 900 kcal dziennie – kaloryczność ludzkich posiłków wykazuje zdumiewające zróżnicowanie. I choć podstawowym czynnikiem decydującym o diecie jest zasobność portfela, to jednak liczy się także wiele innych względów."}
               {:title "Raj dinozaurów"
                :description "W czasach, kiedy w środku Ameryki szumiały morskie fale, dzisiejszy stan Utah był tropikalną, wilgotną ziemią obiecaną dla niezwykłego bogactwa gatunków dinozaurów."
                :places [{:country "USA" :region "Utah" :coords [39.27 -111.50]}]}
               {:title "Bangladesz"
                :description "Jak wiadomo, surowce wtórne mogą być żyłą złota. Dotyczy to także wielkich statków rozbieranych przez brygady młodych ludzi gołymi rękami wprost na plażach Bangladeszu."
                :places [{:country "Bangladesz" :city "Chittagong" :coords [22.390182 91.760569]}]}
               {:title "Zagadki kosmosu"
                :description "Gdzie jest kres naszego wszechświata? Jak długo będzie się rozszerzał? Co było przed Wielkim Wybuchem? Czy wszechświatów może być więcej? Jednoznacznych odpowiedzi brak."}
               {:title "Na falach Sekwany"
                :description "W środku światowej metropolii, ale też blisko natury. Mieszczańskie, ale podszyte duchem swobody. Wielkomiejskie paryskie życie, jak się okazuje, ma też swoją odmianę „marynarską”, czyli w domu na barce."
                ;; TODO: second time Paryż is here.
                :places [{:country "Francja" :city "Paryż" :coords [48.866667 2.35]}]}
               {:title "Ostatni śpiew"
                :description "Ptaki migrujące z Europy do Afryki muszą gdzieś odpoczywać. Dziś w miejscach ich tradycyjnych przelotów i popasów na Bałkanach i nad Morzem Śródziemnym czekają bezwzględni myśliwi. Rzeź dla mięsa, pieniędzy, zabawy trwa."}]}
   {:year 2014 :month 4 :vol 175
    :articles [{:title "Fotoreportaż"
                :description "Zachody słońca są fotografowane powszechnie, robienie zdjęć wschodom wymaga jednak pewnej determinacji. Efekty mogą być jednak bardzo interesujące."}
               {:title "Poczet przodków"
                :description "Historia istot człowiekowatych ma miliony lat. Wprawdzie z rozmaitych skamieniałości paleontologom wiele udało się wyczytać, ale z naszym drzewem genealogicznym wciąż związanych jest mnóstwo fascynujących zagadek. No a grzebanie w rodowej historii zwykle przynosi niespodzianki."}
               {:title "Planeta małp"
                :description "Wystarczy popatrzeć na szympansa, by dostrzec oczywiste podobieństwo do naszego własnego gatunku. Co zatem nas łączy? Ile dzieli? I czy intelekt to tylko człowiecza właściwość?"}
               {:title "Jaskinia Denisowa"
                :description "W rozświetlanej słońcem grocie znaleziono dowody na pomieszkiwanie w niej Homo sapiens, neandertalczyków i całkiem nowego gatunku – denisowian. Wszystkie te formy człowieka współistniały i krzyżowały się. Dlaczego więc wcześniej nie znajdowano śladów denisowian?"
                :places [{:country "Rosja" :region "Sybera" :coords [51.397581 84.676206]}]}
               {:title "Węgiel"
                :description "Choć od początku rewolucji przemysłowej spaliliśmy go już miliardy ton, wciąż pozostaje głównym paliwem ludzkości. Jest tani, ale też „brudny”, zanieczyszcza atmosferę. A że szybko porzucić go nie zdołamy, trzeba poszukać sposobu, by stał się czystszy."}
               {:title "Sudan"
                :description "Lata brutalnej wojny domowej przeorały społeczności Sudanu Południowego. Mieszanina myślenia magicznego, wiary we wszystkowidzących proroków oraz bezwzględnej walki o władzę przynosi wszystko, tylko nie pokój i stabilizację."
                :places [{:country "Sudan" :coords [15.8 29.9]}]}
               {:title "Łódź z Arles"
                :description "Wyłoniła się z fal Rodanu, a raczej ze starożytnego śmietniska wprost na jego dnie. I przyniosła posąg Neptuna, popiersie Cezara, nie mówiąc już o pomniejszych skarbach. Nic dziwnego, że zasłużyła na całe skrzydło muzeum."
                :places [{:country "Francja" :coords [43.440957 4.425362]}]}
               {:title "Indiańskie ziemie"
                :description "Rdzenne ludy Ameryki Północnej, prześladowane przez wieki, przetrwały w niewielkich populacjach. Dziś, aby zachować swoją tradycję i tożsamość, które nie istnieją bez związków z naturą, próbują odzyskiwać i oddawać dzikiej przyrodzie ostatnie skrawki ich plemiennych ziem."
                :places [{:country "USA" :region "Wyoming" :coords [43.08 -109.15]}]}]}
   {:year 2014 :month 3 :vol 174
    :articles [{:title "Kambodża"
                :description "Osada ludzi HIV-pozytywnych funkcją i trybem powstania przypomina dawne kolonie trędowatych. Nie mając wielkiego wyboru, jej mieszkańcy próbują jakoś układać się z życiem."
                :places [{:country "Kambodża" :coords [11.5 104.7]}]}
               {:title "Czarne dziury"
                :description "Co kryje się w środku niewyobrażalnie ciężkich, wciąż tuczących się materią kosmicznych tworów, z których nawet światło nie może uciec? Osobliwości. Niewyobrażalnie małe. Być może... ziarenka nowych wszechświatów."}
               {:title "Lista UNESCO"
                :description "Pięknych miejsc na świecie jest wiele, ale jak zawsze istnieje też ekstraklasa. Jej rejestr pod egidą UNESCO to prawdziwa lista skarbów. Jest jak stempel jakości, co bywa i wyróżnieniem, i wyzwaniem zarazem."}
               {:title "Damaszek"
                :description "Przez wieki jeden z salonów kultury Bliskiego Wschodu, jej bogactwa i wyrafinowania, przeżywa czas wojny domowej. Mieszkańcy robią wszystko, aby ofiarą konfliktu nie padły zabytki i specyficzna tkanka społeczna miasta, które zawsze było pluralistyczne i wielokulturowe."
                :places [{:country "Syria" :city "Damaszek" :coords [33.51 36.29]}]}
               {:title "Wikingowie"
                :description "Wiele wskazuje na to, że żeglarze ze Skandynawii dotarli do Ameryki na długo przed Kolumbem. Co ciekawe, ich motorem był raczej handel niż łupy. Bo też jakie bogactwa można było zabrać Indianom?"
                :places [{:country "Kanada" :region "Nowa Funlandia i Labrador" :coords [51.595267 -55.531222]}]}
               {:title "Dziki Europejczyk"
                :description "Tradycje karnawałowych przebierańców korzeniami sięgają czasów pogańskich. Formy bywają różne, ale istota ta sama. Dziki Człowiek – postać znana jak Europa długa i szeroka – pokazuje wspólny kulturowy rdzeń kontynentu."
                :places [{:region "Europa"}]}
               {:title "Tuńczyk"
                :description "Jedna ryba warta milion dolarów? Tak, i nie jest to cena za złotą rybkę, ale za tuńczyka błękitnopłetwego. Japończyk naprawdę jest w stanie dużo zapłacić za dobre sushi. Dla tuńczyków to fatalna wiadomość."}
               {:title "Wyspa Wrangla"
                :description "Jest niczym Galapagos Północy. Bezludny raj dla arktycznych zwierząt. W czasie ostatnich epok lodowcowych wyspa nie była pokryta w całości przez lód ani zalana, więc przechowała unikalny skrawek dziewiczej plejstoceńskiej tundry."
                :places [{:country "Russia" :coords [71.2 -179.3]}]}]}
   {:year 2014 :month 2 :vol 173
    :articles [{:title "Góry Stołowe"
                :description "Choć góry piękne są zawsze, nic nie robi im tak dobrze jak wilgotny oddech Królowej Śniegu. Szron zmienia je w zupełnie inną krainę."
                :places [{:country "Polska" :coords [50.47 16.30]}]}
               {:title "Birma"
                :description "Kraj długo odizolowany przez juntę generałów teraz otwiera się na świat. Jego turystyczna świeżość sprawia, że niezwykłości architektury, pamiątki po historii buddyjskich imperiów, nie zdążyły jeszcze obrosnąć „przemysłem rozrywkowym”."
                :places [{:country "Birma" :coords [21.7 95.9]}]}
               {:title "Mózg"
                :description "Ludzki mózg, niezwykła struktura, za pomocą której zdołaliśmy stworzyć cywilizację, ujarzmić planetę i polecieć w kosmos, sam wymyka się poznaniu. Mimo to badacze nie ustają w wysiłkach, by zrozumieć, jak działa biologiczny superkomputer."}
               {:title "Oman na żywca"
                :description "Czego szukają wspinacze? Wyzwań o dużej skali trudności. No i „pięknych okoliczności przyrody” oferujących dziewicze ściany, których nikt wcześniej nie pokonał. Na wybrzeżu Omanu znajdują i jedno, i drugie."
                :places [{:country "Oman" :region "Półwysep Musandam" :coords [26.308 56.387]}]}
               {:title "Morsy"
                :description "O morsach trudno powiedzieć, że są piękne. Te żywe góry mięsa na lądzie są niezgrabne i bezradne, za to w wodzie zyskują wdzięk, wigor i moc. Nurkowanie z nimi przypomina trochę grę w rosyjską ruletkę – i dlatego jest tak rzadkie i tak fascynujące."}
               {:title "Katedra"
                :description " Rajcy Florencji postanowili zadziwić Włochy. Uznali, że najlepszą drogą do celu będzie katedralna kopuła, jakiej świat nie widział. Imponujący majstersztyk oparty na nowatorskich rozwiązaniach. Śmiałek, który podjął się zadania, zbił przy tym majątek i... rozpoczął epokę renesansu."
                :places [{:country "Włochy" :city "Florencja" :region "Katedra Santa Maria del Fiore" :coords [43.773118 11.255959]}]}
               {:title "Święto Dzbana"
                :description "Czy wielomilionowe zgromadzenie religijne może nieść otuchę? Czy przebywanie w tłumie może poprawić zdrowie? Czy milionowa rzesza może emanować braterstwem? Tak – odpowiadają hindusi."
                :places [{:country "Indie" :city "Allahabad" :region "Uttar Pradesh" :coords [25.44 81.86]}]}
               {:title "Jukon"
                :description "Ta ogromna bezludna kraina przed wiekiem przeżywała już gorączkę złota. Dziś znowu dotyka ją stan chorobowy, bo prócz złota jest tu mnóstwo innych minerałów. A ludzka chciwość urokom pięknej przyrody raczej nie ulega."
                :places [{:country "Kanada" :coords [64 -135]}]}]}
   {:year 2014 :month 1 :vol 172
    :articles [{:title "Cuda żywej inżynierii"
                :description "Świat przyrody to niewyczerpane źródło fotograficznych inspiracji i magnetycznych kadrów. Zaś rejestracja i pokazywanie tego piękna jest dla autora rodzajem hołdu dla maszynerii sił natury."}
               {:title "Kayapo"
                :description "Wśród wielu plemion Amazonii Kayapo są wyjątkowi. Żadne inne nie ma tak dobrego PR-u, a nawet kontaktów w świecie gwiazd. Przetrwali prześladowania, bo mieli liderów, dzięki którym obronili swoje tradycje, tożsamość i dumę, a przede wszystkim źródło tego wszystkiego – dziką puszczę. Całkiem nieźle jak na „lud pierwotny”."
                :places [{:country "Brazylia" :coords [-8.11 -52.38]}]}
               {:title "Chleb na pustyni"
                :description "Przypominające pustynny miraż emiraty arabskie wręcz ociekają bogactwem. Ten luksus budowany jest rękami pozbawionej praw azjatyckiej siły roboczej, którą wabi perspektywa zarobku. Jednak poprawa statusu materialnego wiąże się z dramatycznymi kosztami w innych sferach."
                :places [{:country "Zjednoczone Emiraty Arabskie" :coords [23.4 54.2]}]}
               {:title "Smok z Komodo"
                :description "Osiągający trzy metry długości, toczący z pyska ślinę z jadem waran z Komodo to jaszczur ze wszech miar spektakularny. Ale w dzisiejszym świecie duży zwierz ma gorzej – bo zwraca uwagę, bo potrzebuje większych siedlisk i większej ilości pożywienia. Jak zatem radzą sobie warany?"
                :places [{:country "Indonezja" :region "Park Narodowy Komodo" :coords [-8.55 119.46]}]}
               {:title "Soczi Putina"
                :description "W organizacji olimpiad sportowe współzawodnictwo już dawno przestało być głównym celem. Liczą się promocja, prestiż i biznes. Nic nie ilustruje tego lepiej niż zimowa olimpiada w Soczi, która ma kosztować astronomiczne 50 mld dol."
                :places [{:country "Rosja" :city "Soczi" :coords [43.58 39.72]}]}
               {:title "Kolekcje"
                :description "Kiedyś kolekcjonowanie okazów dzikiej przyrody – motyli, chrząszczy itd. – było powszechne. Dziś patrzymy na to trochę inaczej, ale zalegające w muzeach setki milionów osobników zebrane przez badaczy i odkrywców z poprzednich wieków są gigantyczną kopalnią wiedzy."}
               {:title "Mount Erebus"
                :description "W Antarktyce jest miejscem, w którym wrząca lawa sąsiaduje z wiecznym lodem. Na granicy tych dwóch światów istnieją skrawki ziemi, w których może utrzymać się życie. Skrawki są maleńkie, a życie ubogie, ale właśnie dlatego można je tam badać na granicy przetrwania."
                :places [{:region "Antarktyda" :coords [-77.543127 167.180082]}]}]}
   {:year 2013 :month 12 :vol 171
    :articles [{:title "Fotoreportaż"
                :description "Kopalnia soli w Wieliczce jest unikatowa w skali świata. A setki kilometrów wyrobisk poza trasami turystycznymi jest dostępnych tylko dla wtajemniczonych. Nasi czytelnicy dzięki wspaniałym zdjęciom też mogą tam jednak zajrzeć."
                :places [{:country "Polska" :coords [49.983442 20.053792]}]}
               {:title "Obejść świat"
                :description "Dookoła Ziemi pieszo przez siedem lat. Ta wędrówka śladami Homo sapiens kolonizującego naszą planetę, przez różne strefy klimatyczne i ekosystemy, choć fizycznie realna, w zamyśle autora jest przede wszystkim podróżą duchową."}
               {:title "Zabytek cyfrowy"
                :description "Wiele zabytków architektury, owoców geniuszu minionych wieków, nieubłaganie niszczeje. Musimy walczyć o ich zachowanie, ale na wszelki wypadek dobrze byłoby mieć oddające wszelkie detale cyfrowe kopie 3D. I niektóre obiekty właśnie takowych się dorabiają."}
               {:title "Narciarze z Ałtaju"
                :description "Badacze nie są zgodni, w jakiej części świata człowiek po raz pierwszy przypiął narty. Jedna z teorii mówi, że w Ałtaju, ale nawet jeśli nie jest to prawda, to właśnie tam myśliwi wciąż jeżdżą, posługując się własnoręcznie wystruganym sprzętem i techniką według wzorów wypracowanych przed tysiącami lat."
                :places [{:country "Rosja" :region "Ałtaj" :coords [50.7 86.9]}]}
               {:title "Zielona inwazja"
                :description " Kule toczone przez wiatr po amerykańskiej prerii – takich westernowych obrazków jeszcze do połowy XIX w. Ameryka nie widziała. Zaraz potem mogła się jednak przekonać, jak roślina może efektywnie użyć koła i co z tego wynika."
                ;; Zachodnie USA
                :places [{:country "USA" :coords [36 -113]}]}
               {:title "Bielizna"
                :description "Kiedyś wstydliwie skrywana, dziś wręcz przeciwnie. Kiedyś niemal uniseks – dziś manifestacja płci. Niegdyś słusznych rozmiarów, dziś nad wyraz skąpa. Jej parowiekowa ewolucja podążała krok w krok za zmianami obyczajowości."}
               {:title "Puma"
                :description "Wielki kot uznawany za szkodnika, konkurenta dla myśliwych do zwierzyny łownej, został wytępiony w większości stanów USA. Dziś powoli kolonizuje je na powrót. A jest tak nieuchwytny, że potrafi się utrzymać na leśnych terenach w środku aglomeracji Los Angeles, spacerując wokół słynnego napisu Hollywood!"
                :places [{:country "USA" :coords [38 -100]}]}]}
   {:year 2013 :month 11 :vol 170
    :articles [{:title "Fotoreportaż"
                :description "W Manili miasto umarłych jest jednocześnie miastem żywych. Nekropolia stała się osiedlem mieszkaniowym dla biedoty, gdzie wśród grobów toczy się zwyczajne życie."
                :places [{:country "Filipiny" :city "Manila" :coords [14.633 120.989]}]}
               {:title "Królowie Egiptu"
                :description "Faraon zgodnie z tradycją był płci męskiej. Zdarzały się jednak kobiety o silnych osobowościach, które zdobywały władzę i kierowały państwem, a kilka z nich, jak Kleopatra czy Nefertiti, zapracowało na status ikon starożytnego Egiptu."
                :places [{:country "Egipt" :coords [29.9 31.1]}]}
               {:title "Ostatnia pogoń"
                :description "Tim Samaras był znanym łowcą tornad. Szukał ich po Wielkich Równinach, próbując je dopaść i wydrzeć im tajemnice. Gdy pewnego razu opuściło go szczęście, jedna ze ściganych atmosferycznych bestii zadała śmiertelny cios."
                :places [{:country "USA" :region "Oklahoma" :city "El Reno" :coords [35.5 -97.9]}]}
               {:title "Nigeria"
                :description "Północ kraju wstrząsaną aktami przemocy ogarnia chaos. Czy terrorystyczna organizacja Boko Haram naprawdę jest tak potężna, czy też jej wszechmoc to tylko propagandowy konstrukt? Tak czy inaczej obywatele kraju leżącego na ropie niewiele z niej korzystają."
                :places [{:country "Nigeria" :coords [11.7 12.9]}]}
               {:title "Pierwiastkowanie"
                :description "W zaawansowanych laboratoriach człowiek może tworzyć pierwiastki nieistniejące aktualnie na ziemi. Choć taki nowy byt powstaje niezwykle rzadko i trwa ledwie maleńki ułamek sekundy, tablica Mendelejewa wzbogaca się o nowy symbol. Jaki jest kres tej drogi?"}
               {:title "Cukier"
                :description "Ewolucja zaprogramowała nasz organizm tak, by wycisnął ile się da z niewielkiej dostępnej ilości cukru. Gdy zatem człowiek opanował wytwarzanie słodyczy na wielką skalę, oprócz przyjemności zafundował sobie też potężne kłopoty. Bo cukier to nałóg tylko z pozoru niewinny."}
               {:title "Medycyna"
                :description "Imponujący rozwój medycyny jest jednym z największych dobrodziejstw cywilizacji. Ale na drodze od praktyk magicznych do wyrafinowanej nauki pełno było pułapek i ślepych uliczek, a tym samym – ofiar."}
               {:title "Kaniony Australii"
                :description "Kaniony w płaskiej na ogół Australii? Tak, i to niedaleko Sydney. Pocięte wąskimi i głębokimi szczelinami Góry Błękitne oferują labirynt fascynujących dzikich tras i takichże widoków."
                :places [{:country "Australia" :region "Kanangra Main" :coords [-33.963062 150.113266]}
                         {:country "Australia" :region "Claustral" :coords [-33.567362 150.402438]}]}]}
   {:year 2013 :month 10 :vol 169
    :articles [{:title "Wielki Konkurs Fotograficzny"
                :description "Dziewiąta edycja naszego konkursu dobiegła końca. Czas zatem na publikację zwycięskich fotografii – wraz z komentarzami ich autorów."}
               {:title "Fotoreportaż"
                :description "Niemal każda fabryka może być interesującym miejscem dla fotografa. Cóż dopiero, gdy są to cukrownie z maszynami i technologią sprzed stu lat funkcjonujące od czasów kolonialnych na indonezyjskiej Jawie."
                :places [{:country "Indonezja" :region "Jawa" :coords [-6.99 109.13]}]}
               {:title "Puszcze złota"
                :description "Jedno z największych i potencjalnie najbogatszych państw Afryki jest dziś nędzarzem trawionym przez dziką przemoc. A wszystko przez niewiarygodną obfitość minerałów, z powodu których Kongo od lat nie zna pokoju. Czy fotografia może wydobyć ten konflikt z zapomnienia?"
                :places [{:country "Demokratyczna Republika Konga" :coords [-0.89 27.95]}]}
               {:title "Twarze Ameryki"
                :description "„Etniczny tygiel” w wypadku USA to slogan, który ma swoje estetyczne konsekwencje. Mieszanka typów fizycznych ze wszystkich niemal zakątków globu owocuje bowiem oryginalną urodą obywateli. Zapraszamy do galerii fascynujących portretów Amerykanów."
                :places [{:country "USA"}]}
               {:title "Korea Północna"
                :description "Obrazy z kraju odizolowanego od świata, w którym niemal wszystko jest tajne i objęte zakazem fotografowania, budzą szczególną ciekawość. Jak zresztą zdjęcia zza wszelkiego rodzaju kulis."
                :places [{:country "Korea Północna" :coords [38.4 126.0]}]}
               {:title "Parki inaczej"
                :description "Czy camera obscura w dobie cyfrowej ma sens? Abelardo Morell pokazuje, że tak, tworząc za jej pomocą zdjęcia krajobrazów znanych, a jednak tajemniczych. Wiwat stara technika!"
                :places [{:country "USA"}]}
               {:title "Cyfrowa wioska"
                :description "Ludzkość nigdy jeszcze nie produkowała tylu zdjęć. Dziś można być fotografem, nie mając aparatu – wystarczy wyszukiwać atrakcyjne obrazy z automatycznych rejestratorów. Co ta inflacja oznacza dla siły oddziaływania i społecznej roli fotografii?"}
               {:title "Fotograficzne Zoo"
                :description "Zdjęciowy katalog gatunków świata przyrody to ambitne zadanie. Okazuje się, że dziś najlepszymi miejscami do jego budowania są... ogrody zoologiczne."}]}
   {:year 2013 :month 9 :vol 168
    :articles [{:title "Fotoreportaż"
                :description "Największe w Europie (około 2 tys. sztuk) skupisko pomnikowych dębów w wielkopolskim Rogalinie jest dla fotografa przyrody jak zaproszenie do pracy. Maciej Fiszer z zaproszenia skorzystał..."
                :places [{:country "Polska" :region "Wielkopolska" :city "Rogalin" :coords [52.234819 16.933119]}]}
               {:title "Wielki potop"
                :description "opniejące w coraz szybszym tempie lodowce stale podnoszą poziom mórz, tymczasem w metropoliach na wybrzeżach całego świata mieszkają miliony ludzi. Czy te miasta są skazane na zagładę? I gdzie znalazłyby się plaże, gdyby cały ziemski lód zamienił się w wodę?"}
               {:title "Kinszasa"
                :description "Stolicę Demokratycznej Republiki Konga, wielkiego kraju w sercu Afryki, trawią bieda, korupcja i przemoc. Sztuka wydawać by się mogła ostatnią potrzebą mieszkańców, tymczasem działalność artystyczna okazuje się jednym ze sposobów przetrwania w chaosie."
                :places [{:country "Demokratyczna Republika Konga" :city "Kinszasa" :coords [-4.386 15.294]}]}
               {:title "Kazuary"
                :description "Te wielkie nielotne ptaki spokrewnione ze strusiami w samoobronie potrafią zabić człowieka pazurem. Nie ma w nich jednak nic krwiożerczego: to zjadacze owoców charakteryzujący się tym, że mają zindywidualizowaną fizjonomię. Całkiem jak ludzie."
                :places [{:country "Australia" :coords [-17.47 145.87]}]}
               {:title "Antarktyda"
                :description "Co jest najgroźniejsze we wspinaczce na antarktyczne turnie? Wcale nie temperatura. Najbardziej niebezpieczne okazują się wiatry, które potrafią uderzyć w najmniej spodziewanym momencie, a mają siłę huraganu."
                :places [{:region "Antarktyda" :coords [-71.5 12.2]}]}
               {:title "Wiwat porażka"
                :description "Każda ludzka działalność obarczona jest ryzykiem porażki i wielu najsławniejszych eksploratorów naszej planety boleśnie doświadczało tej prawdy. Wszystkie takie wydarzenia niosły jednak także naukę, z której korzystali oni sami lub ich następcy."}
               {:title "Tongariro"
                :description "Niesamowite pejzaże z filmu Władca pierścieni istnieją naprawdę. Choć trzeba ich szukać aż na antypodach, w nowozelandzkim parku narodowym Tongariro."
                :places [{:country "Nowa Zelandia" :region "Park Narodowy Tongariro" :coords [-39.3 175.6]}]}]}
   {:year 2013 :month 8 :vol 167
    :articles [{:title "Grzyby"
                :description "Bez dwóch zdań – Polak ma duszę grzybiarza. Wielka namiętność do grzybów nie zawsze jednak idzie w parze ze znajomością tematu."
                :places [{:country "Polska"}]}
               {:title "Fotoreportaż"
                :description "Statek pod pełnymi żaglami to samo piękno, a więc dla fotografa temat wdzięczny, choć trudny zarazem. Jak można się z nim zmierzyć?"}
               {:title "Biskupin"
                :description "Kto i jak go zbudował, w jaki sposób funkcjonował i dlaczego upadł? Ikoniczne stanowisko polskiej archeologii pod lupą."
                :places [{:country "Polska" :city "Biskupin" :coords [52.788333 17.744444]}]}
               {:title "Król lew"
                :description "Można by powiedzieć, że przed nim kroczy śmierć. Okazuje się jednak, że nieustannie kroczy również za nim, bo władca sawanny żyje w ciągłym zagrożeniu ze strony pobratymców."
                :places [{:country "Tanzania" :region "Serengeti" :coords [-2.08 34.10]}]}
               {:title "Lwy i ludzie"
                :description "Życie w pobliżu siedlisk wielkich kotów do łatwych nie należy. Atak lwa – jeśli uda się go przeżyć – jest doświadczeniem traumatycznym."
                :places [{:region "Afryka"}]}
               {:title "Cenoty Majów"
                :description "Krasowe studnie Jukatanu były dla tamtejszych ludów czymś więcej niż tylko zbiornikami deszczówki, dlatego dziś archeolodzy szukają w nich rozwiązania naukowych zagadek."
                :places [{:country "Meksyk" :region "Jukatan" :coords [20.574 -88.634]}]}
               {:title "Piękno ciała"
                :description "Człowiek w naszym kręgu kulturowym ma kłopot z ciałem i definiowaniem jego piękna, a problem ten zyskał na znaczeniu wraz z opracowaniem procesu produkcji... tanich luster. Plemiona pierwotne nie estetyzowały przesadnie – piękne było dla nich przede wszystkim to, co użyteczne."}
               {:title "Romskie place"
                :description "Wizyta w rumuńskim miasteczku, przy ulicach którego wyrosła ponad setka fantazyjnych rezydencji romskich bogaczy."
                :places [{:country "Rumunia" :city "Buzescu" :coords [44.011 25.226]}]}
               {:title "Rzeka Klamath"
                :description "Zburzyć cztery tamy, żeby chronić środowisko? Całkiem możliwe, że do tego dojdzie i kalifornijska rzeka Klamath odzyska pierwotne oblicze."
                :places [{:country "USA" :region "Kalifornia" :coords [41.984 -122.313]}]}]}
   {:year 2013 :month 7 :vol 166
    :articles [{:title "Dieta paleo"
                :description "Jesteśmy tym, co jemy. Czy zatem powrót do diety człowieka pierwotnego mógłby nas uzdrowić? I z czego musielibyśmy zrezygnować?"}
               {:title "Fotoreportaż"
                :description "Obrazy z powstania styczniowego w świadomości Polaków to przede wszystkim ryciny Artura Grottgera. A jak wyglądałby ten zryw na zdjęciach? Proponujemy fotograficzną podróż w czasie – przez historię powstania i fotografii zarazem."}
               {:title "Wyścig natury"
                :description "Wszystko, co żyje, walczy o byt – zmaga się ze stworzeniami innych gatunków i konkuruje z przedstawicielami własnego. W tej walce hartuje się odporność, doskonalą sprawności i umiejętności, którymi zwierzęta zdumiewają Homo sapiens, uważającego się za koronę stworzenia."}
               {:title "Chaos w Układzie"
                :description "Wokół naszego Słońca krąży osiem planet – ustawionych w określonym porządku, o pewnych orbitach. Oaza stałości – dzisiaj. Okazuje się bowiem, że ten stan spokoju osiągnięty został po okresach „wielkiego wymiatania”, w którym planety zderzały się ze sobą i przyjmowały bombardowanie kosmicznego rumoszu, wysyłając w kosmos miliardy obiektów. Bo na początku był chaos."}
               {:title "Mars"
                :description "Droga do kolonizacji kosmosu wiedzie przez Marsa. Być może kiedyś to na nim ludzkość postawi pierwszy krok. Na razie posyłamy tam maszyny, które fotografują, mierzą, wiercą, analizują. Na niektórych zdjęciach Czerwona Planeta wygląda całkiem „domowo”. Prawie jak ziemia (choć „prawie” robi wielką różnicę)."}
               {:title "Aborygeni"
                :description "Przez 50 tys. lat panowali nad kontynentem. Tak stare były ich zbieracko-łowiecki tryb życia, sztuka o specyficznych formach, niezwykła mitologia. Przyjście białych zburzyło wszystko i zniszczyło ducha Aborygenów. Dla niektórych powrót do trybu życia przodków jest drogą do odrodzenia."
                :places [{:country "Australia" :coords [-23 128]}]}
               {:title "Hazard"
                :description "Dreszczyk ryzyka nęci nas wszystkich, choć w różnym stopniu. Człowiek nie byłby jednak sobą, gdyby nie wykorzystał okazji i na kanwie tej skłonności nie wymyślił mnóstwa sposobów rozrywki, rywalizacji i – ależ tak, zarabiania."}]}
   {:year 2013 :month 6 :vol 165
    :articles [{:title "Jedz z głową"
                :description "Nasze ciało potrzebuje codziennej porcji kalorycznego paliwa. Sztuka polega na tym, by nauczyć się zasilać organizm racjonalnie."}
               {:title "Wywiad"
                :description "Dlaczego Polska jest biedniejsza niż kraje Zachodu? Który władca był najlepszym gospodarzem, a kiedy najbardziej traciliśmy dystans?"
                :places [{:country "Polska"}]}
               {:title "Fotoreportaż"
                :description "Połączenie dwóch pasji – do koni i do fotografii – przyniosło doskonałe rezultaty. Zresztą – oceńcie sami."}
               {:title "Kosmiczne dno"
                :description "Słynny reżyser i eksplorator James Cameron zbudował batyskaf, w którym osiągnął największą głębię na ziemi. Publikujemy relację z opadania w otchłań piekielnych ciśnień."
                :places [{:region "Głębia Challengera" :coords [11.373 142.591]}]}
               {:title "Everest"
                :description "Najwyższy szczyt świata emanuje magnetyzmem tak wielkim, że znalazł się – rzecz przed kilku dekadami niewyobrażalna – w stanie prawdziwego oblężenia. Jak opanować chaos na Górze Gór?"
                :places [{:country "Chiny" :region "Tybet" :coords [27.988056 86.925278]}
                         {:country "Nepal"}]}
               {:title "Wielorybnicy"
                :description "Polowanie na walenie w dzisiejszej Norwegii nie przynosi już prestiżu i pieniędzy takich jak niegdyś. Odległe rybackie społeczności wraz z ich stylem życia umierają. Wieloryby, które przetrwały rzezie, mogą odetchnąć."
                :places [{:country "Norwegia" :coords [69.3 15.4]}]}
               {:title "Gorongosa"
                :description "Wyrastająca z sawann Mozambiku święta góra zasilana monsunami wykształciła niezwykłe zbiorowisko fauny i flory. Ekosystem spustoszony w czasie długich lat wojny domowej powoli wraca do zdrowia."
                :places [{:country "Mozambik" :coords [-18.396 34.093]}]}
               {:title "Macierzyństwo"
                :description "Ile w nim natury, a ile kultury? Choć ludzkość wykształciła różne jego modele, jedno jest pewne: nasza cywilizacja ma z macierzyństwem coraz większy problem."}
               {:title "Tunele Gazy"
                :description "Półoficjalny system kanałów przemytniczych to dla jednych śmiertelna pułapka, a dla innych źródło fortuny. W trudnych warunkach ludzka pomysłowość owocuje czasem kuriozalnymi rozwiązaniami."
                :places [{:country "Izrael" :region "Strefa Gazy" :coords [31.42 34.37]}]}]}
   {:year 2013 :month 5 :vol 164
    :articles [{:title "Jedz z głową"
                :description "Ryby to bez dwóch zdań ważny składnik zdrowej diety. Ale jakie jeść, a jakich nie – i dlaczego?"}
               {:title "Fotoreportaż"
                :description "Pokazać Stambuł bez uciekania się do łatwej efektowności, przez pryzmat mieszkańców metropolii – oto cel autorki."
                :places [{:country "Turcja" :city "Stambuł" :coords [41.1 29.0]}]}
               {:title "Mamut jak nowy"
                :description "Przywrócić życie wymarłemu gatunkowi to perspektywa kusząca, zwłaszcza że długa jest lista takich stworzeń. "}
               {:title "Czarna despotia"
                :description "Zimbabwe to ja – myśli zapewne Robert Mugabe, który rządzi tym państwem od uzyskania niepodległości w 1980 r. Interes kraju wyraźnie bowiem już dawno pomylił mu się z własnym."
                :places [{:country "Zimbabwe" :coords [-18.2 30.8]}]}
               {:title "Chiński kanał"
                :description "W przeludnionym Państwie Środka zmobilizowanie milionów robotników na rozkaz cesarza nigdy nie było problemem. Tak też powstała licząca 2 tys. km wodny szlak transportowy, równie imponujący jak znacznie bardziej słynny Wielki Mur."
                :places [{:country "Chiny" :coords [35.2 116.6]}]}
               {:title "Długowieczność"
                :description "Czy średnia 100 lat życia dla przedstawicieli naszego gatunku jest możliwa? Naukowcy pracują nad tym, badając odizolowane populacje wyróżniające się liczbą stulatków."}
               {:title "Rajskie ptaki"
                :description "Przegląd niezwykłej rodziny, w której samce dla zaimponowania partnerkom zainwestowały zadziwiającą godową ekstrawagancję."
                :places [{:country "Papua Nowa Gwinea" :coords [-6.1 143.5]}
                         {:country "Indonezja" :region "Nowa Gwinea" :coords [-4.3 139.7]}
                         {:country "Australia" :coords [-11.2 142.6]}]}
               {:title "Straszenie bólem"
                :description "Kary cielesne przez tysiące lat stosowano jak świat długi i szeroki. Zdumiewający był (i jest) nie tylko ich repertuar, ale też teoretyczne uzasadnienia dla ich wymierzania."}
               {:title "Przenawożenie"
                :description "Rośliny do szybkiego wzrostu potrzebują azotu, czyli nawozów. Ale że we wszystkim trzeba zachować jest umiar, a z tym człowiek ma problem, przenawożenie staje się poważnym problemem w ochronie środowiska"}]}
   {:year 2013 :month 4 :vol 163
    :articles [{:title "Jedz z głową"
                :description "Czy owoce to samo zdrowie? I czy egzotyczne są lepsze od rodzimych? A może przeciwnie?"}
               {:title "Fotoreportaż"
                :description "Fotograf na Szlaku Orlich Gniazd szukał współpracy ze światłem – czasem słońca, a czasem zwykłej latarki."
                :tags ["zamek" "zamki" "warownia"]
                :places [{:country "Polska" :city "Bydlin" :coords [50.388768 19.64282]}
                         {:country "Polska" :city "Mirów" :coords [50.61461 19.475133]}
                         {:country "Polska" :city "Rabsztyn" :coords [50.300833 19.594167]}
                         {:country "Polska" :city "Smoleń" :coords [50.438611 19.675]}
                         {:country "Polska" :city "Olsztyn" :coords [50.749664 19.27413]}
                         {:country "Polska" :city "Będzin" :coords [50.327222 19.129167]}]}
               {:title "Cywilizacje"
                :description "Ludzkość zdobyła się na kilka takich „wielkich projektów”. Wszystkie były próbą ujarzmienia przyrody i określenia miejsca człowieka w świecie. I każdej z nich nasza współczesność coś zawdzięcza."
                :tags ["Majowie" "Rzymianie" "Hindusi" "Ludy Mezopotamii"]
                :places [{:country "Indie"}
                         {:country "Włochy" :city "Rzyn"}
                         {:country "Meksyk" :region "Jukatan"}
                         {:country "Chiny"}
                         {:country "Grecja"}
                         {:country "Egipt"}
                         {:country "Syria"}]}
               {:title "Piramidy"
                :description "Dlaczego ta forma budowli była tak popularna w różnych kulturach, odległych w czasie i przestrzeni? Tu nie ma zagadki – odpowiedź okazuje się nad wyraz prosta."
                :places [{:country "Sudan" :city "Meroe" :coords [16.933333 33.726389]}
                         {:country "Gwatemala" :city "Tikal" :coords [17.222094 -89.623614]}]}
               {:title "Mamuty"
                :description "Nasi przodkowie polowali na nie dla mięsa. Dziś możliwe są już tylko bezkrwawe łowy w tundrze na imponujące mamucie ciosy, które oddaje wieczna zmarzlina. To zajęcie dla samotników – bywa niebezpieczne, ale szczęściarzom przynosi fortunę."
                :places [{:country "Rosja" :region "Syberia" :coords [70.7 140.3]}]}
               {:title "Mahoń"
                :description "Strzelające pod niebo pnie mahoniowców były ozdobą amazońskich lasów. No właśnie – były. Bo czy człowiek może przejść obojętnie obok złota, nawet jeśli jest to „czerwone złoto”?"
                :places [{:country "Peru" :coords [-10.10 -72.97]}]}
               {:title "Manaty"
                :description "Nie mają naturalnych wrogów. Nie mają też ochronnej warstwy tłuszczu, więc żeby przetrwać zimę, gromadzą się przy ciepłych źródłach. A że ludzie uwielbiają takie spektakle natury, też tam ściągają i... konflikt gotowy."
                :places [{:country "USA" :region "Floryda" :coords [24.88 -81.68]}]}
               {:title "Narkotyki"
                :description "Z substancji psychoaktywnych znajdowanych w naturze człowiek korzystał „od zawsze” – w celach leczniczych i magicznych. Dziś narkotyczna moc okazuje się głównie mocą społecznej destrukcji."}
               {:title "Nocne ogrody"
                :description "Czym nocna wizyta w ogrodzie góruje nad dzienną? Przede wszystkim intensywnymi zapachami. I wrażeniem doskonałości, jakie daje łagodne światło księżyca."}]}
   {:year 2013 :month 3 :vol 162
    :articles [{:title "Jedz z głową"
                :description "Kariera hamburgera okazuje się mieć zaskakujący związek z rozwojem motoryzacji."}
               {:title "Fotoreportaż"
                :description "Pierwotne ludy i ich sposoby życia powoli odchodzą w przeszłość. W Indonezji można jednak jeszcze podpatrzyć np. Mentawajów."
                :places [{:country "Indonezja" :coords [-2.18 99.65]}]}
               {:title "Teatr boży"
                :description "Bezkresna Syberia jest doskonałym miejscem, by na odludziu budować alternatywne społeczeństwo. Po upadku ZSRR wielu mesjaszów powiodło tam swoich wyznawców."
                :places [{:country "Rosja" :region "Syberia" :coords [53.72 94.56]}]}
               {:title "Władcy umysłów"
                :description "Głęboka ludzka potrzeba duchowości sprawia, że aby zostać guru i zgromadzić grupę wyznawców, nie trzeba mieć nadzwyczajnej charyzmy. Wystarczy determinacja."
                :places [{:country "Demokratyczna Republika Konga"}
                         {:country "Mozambik" :city "Mapute"}
                         {:country "Wenezuela"}]}
               {:title "Ropa z łupków"
                :description "Nowe metody wydobycia ropy gwałtownie zwiększyły jej produkcję w USA. Ale ofiarą tego boomu pada środowisko – przyrodnicze i społeczne."
                :places [{:country "USA" :region "Dakota Północna" :coords [47.79 -103.27]}]}
               {:title "Piłka z odpadów"
                :description "Afrykańscy chłopcy często grają prymitywnymi piłkami, które sami wytwarzają z będących pod ręką materiałów. Ale ich radość i emocje wcale nie są przez to mniejsze."
                :places [{:region "Afryka"}]}
               {:title "Czas dronów"
                :description "Już niedługo niebo nad naszymi głowami zaroi się od niewielkich latających maszyn. Oprócz nowych możliwości działania przyniosą nam też zagrożenia, np. permanentną inwigilacją."}
               {:title "Puszczyk uralski"
                :description "Pewna sowa – dzika i mało towarzyska, jak na sowę przystało – zauroczyła fotografa i niespodziewanie została puszczańską ptasią modelką przez trzy lata."}
               {:title "Włosy"
                :description "Człowiek jako jedyny ssak pozbawiony jest futra. Być może właśnie ten brak uczynił nas ludźmi, bo pozwolił mówić."}
               {:title "Chiny"
                :description "We współczesnych Chinach 10 lat to cała epoka. Zwłaszcza nad Zaporą Trzech Przełomów – inwestycją, jakiej świat nie widział. Obserwacja tych zmian jest naprawdę fascynująca."
                :places [{:country "Chiny" :region "Trzy Przełomy" :coords [30.822490 111.009896]}]}]}
   {:year 2013 :month 2 :vol 161
    :articles [{:title "Jedz z głową"
                :description "Jak zachować świeżość żywności? Sposoby stare i nowe, naturalne i naukowe."}
               {:title "Fotoreportaż"
                :description "Pokaż łapę, czyli projektowe wariacje natury na temat stopy."}
               {:title "Pigmeje"
                :description "Żyją nie tylko w Afryce i nie tylko w tropikalnym lesie. Mają nieprawdopodobny zmysł orientacji. Ale dlaczego są tacy mali? Czy to przypadek, czy przystosowanie do środowiska?"}
               {:title "Sekrety wzrostu"
                :description "Ludzki wzrost to skomplikowana sprawa. Wbrew pozorom wcale nie jest tak, że wraz z postępami cywilizacji jesteśmy coraz wyżsi. Weźmy taki paleolit. Wtedy to dopiero rośliśmy."}
               {:title "Libia"
                :description "Kilka dekad rządów szalonego dyktatora nie mogło pozostać bez wpływu na społeczną i gospodarczą tkankę kraju. Dodajmy do tego skutki wojny domowej, a powstanie obraz państwa zdezorientowanego."
                :places [{:country "Libia" :coords [31 13]}]}
               {:title "Jad"
                :description "Wiele zwierząt na świecie dysponuje śmiercionośną „bronią biologiczną” – jadami. Podglądając ich działanie, medycyna potrafi sprawić, by w zmodyfikowanej formie posłużyły nam jako leki."}
               {:title "Sekwoje"
                :description "Mamutowce olbrzymie to drzewa o największej na świecie miąższości. Potrafią żyć kilka tysięcy lat. Czy to nie wystarczające powody, by bliżej im się przyjrzeć?"
                :places [{:country "USA" :region "Kalifornia" :coords [36.5 -118.7]}]}
               {:title "Dziki korytarz"
                :description "Kirgizi z Korytarza Wachańskiego nie uciekali przed cywilizacją – ona po prostu nigdy do nich nie dotarła. I choć mieszkają w urzekającej krainie, życie bez dróg, prądu i medycyny pełne jest śmierci."
                :places [{:country "Afganistan" :coords [37.1 73.8]}]}
               {:title "Savoir-vivre"
                :description "Towarzyskie formy nie są zbędnym balastem, reliktem dawnego społeczeństwa. One czynią życie milszym."}
               {:title "Wściekła pogoda"
                :description "Na temat zmian klimatu napisano już tysiące tomów. Mimo to wciąż wielu rzeczy nie jesteśmy w stanie przewidzieć. Pewne jest więc: pogoda jeszcze nie raz nas zaskoczy."}]}
   {:year 2013 :month 1 :vol 160
    :articles [{:title "Jedz z głową"
                :description "Czym ludzkość będzie się odżywiać w przyszłości?"}
               {:title "Wywiad"
                :description "Jak zawód fotografa odmieniła fotografia cyfrowa? Gdzie leży granica oddzielająca retusz od manipulacji? Jaka jest przyszłość fotodziennikarstwa i prasy, jaką znamy? - Z Chrisem Johnsem, szefem NGM, rozmawia Martyna Wojciechowska."}
               {:title "Portfolio"
                :description "Eksploracja to odkrywanie nie tylko reguł, ale też urody świata."}
               {:title "Niespokojne geny"
                :description "Homo sapiens podbił cały świat, zasiedlając najróżniejsze ekosystemy. Co umożliwiło ten sukces? Istnieje trop wskazujący, że za naszą nieokiełznaną ciekawością świata odpowiada jeden gen. Bardziej prawdopodobne jednak, że kluczowe okazało się sprzężenie zwrotne między naszym genetycznym garniturem a kulturą."}
               {:title "Obłędnie daleko"
                :description "Postawiwszy nogę na Księżycu, ludzkość jakby pohamowała swój pęd do podboju kosmosu. Terminy załogowej wyprawy na Marsa wciąż są przesuwane. A co z dalszymi podróżami, do innych układów planetarnych? Czy, jak i kiedy moglibyśmy polecieć do gwiazd?"}
               {:title "Yasuni"
                :description "Pierwotny las deszczowy z niezrównanym w skali globu bogactwem gatunków i Indianami uciekającymi od cywilizacji, a pod nim – morze ropy. Ekwador musi zdecydować, które z tych bogactw jest dla niego cenniejsze."
                :places [{:country "Ekwador" :region "Park Narodowy Jasuni" :coords [-1.1 -75.8]}]}
               {:title "Mikroby"
                :description "Ludzkie ciało jest w pewnym sensie odpowiednikiem tropikalnej puszczy, prawdziwym ekosystemem, w którym żyją biliony mikroorganizmów najróżniejszych gatunków. A nasza wiedza o nim jest pełna gigantycznych luk."}
               {:title "Przez Amerykę"
                :description "Ćwierć wieku po pierwszej wyprawie, której plonem był reportaż w magazynie NG, nasi autorzy – Małgorzata Niezabitowska i Tomasz Tomaszewski - przemierzają Amerykę po raz wtóry. Kraj ten sam, a jednak już inny."
                :places [{:country "USA"}]}
               {:title "W nieznane"
                :description "Australijsko-azjatycka wyprawa antarktyczna z początków XX w. obfitowała w epizody, które przywracają wiarę w człowieka, jego hart ducha oraz zdolność do braterstwa i poświęceń."
                :places [{:region "Antarktyda" :coords [-68.0 147.4]}]}]}
   {:year 2012 :month 12 :vol 159
    :articles [{:title "Jedz z głową"
                :description "Czym i jak przyprawiać? Warto się nad tym zastanowić, bo lista właściwości kuchennych przypraw jest długa i zaskakująca. "}
               {:title "Fotoreportaż"
                :description "Autorskie spojrzenie na mikrokosmos drobnych stworzeń, których światu zwykle nie mamy okazji się przyjrzeć."}
               {:title "Wywiad"
                :description "O tajemnicach mózgu – zapamiętywaniu, zapominaniu, gromadzeniu informacji i trosce o sprawność naszego biologicznego superkomputera."
                :tags ["Anna Grabowska"]}
               {:title "Koniec świata"
                :description "Kres nadejdzie 21.12.2012 r. – wyliczyli przed wiekami Majowie. Nie ma rady – w tej sytuacji trzeba pilnie zweryfikować tajemnice ich kalendarza."
                :tags ["majowie"]
                :places [{:country "Honduras"}
                         {:country "Gwatemala"}
                         {:country "Meksyk"}]}
               {:title "Metan"
                :description "Gaz z łupków to dla stanu środowiska szansa czy zagrożenie? Czy kuchenny kran może zapłonąć? I co z ogromnymi pokładami metanu uwięzionego w wiecznej zmarzlinie?"}
               {:title "Szamanizm"
                :description "Najkrócej mówiąc, szaman to specjalista od kontaktów ze światem duchów. Kto i jak może nawiązać z nimi komunikację? I w jakim celu?"
                :places [{:country "Mongolia" :city "Ułan Bator" :coords [47.90 106.90]}
                         {:country "Rosja"}]}
               {:title "Pingwiny"
                :description "Ptaki te, na lądzie niezgrabne i niezdarne, w wodzie zyskują fenomenalną zwinność m.in. dzięki własnemu patentowi na bąbelkowe turbodoładowanie."
                :places [{:region "Antarktyda"}]}
               {:title "Doggerland"
                :description "Na terenach, gdzie dziś przewalają się fale Morza Północnego, parę tysięcy lat temu istniał prawdziwy raj łowców-zbieraczy. Rybacy co jakiś czas wydobywają pamiątki tego niezwykłego świata."
                :places [{:region "Morze Północne" :coords [54.0 2.1]}]}
               {:title "Arizona"
                :description "Klify Vermillion to prawdziwy cud amerykańskiej przyrody. Aż dziw, że tak zaskakująco mało znany."
                :places [{:country "USA" :region "Arizona" :coords [36.907 -111.859]}]}]}
   {:year 2012 :month 11 :vol 158
    :articles [{:title "Jedz z głową"
                :description " Czy mleko jest dla każdego? Lepiej pić tłuste czy chude? Ułatwia czy utrudnia odchudzanie?"}
               {:title "Laureaci WKF"
                :description "Ósma edycja Wielkiego Konkursu Fotograficznego NG rozstrzygnięta. Nagrodzone prace publikujemy na naszych łamach. "}
               {:title "Wywiad"
                :description "Analizowanie zwykłej pajęczej sieci może nas zaprowadzić do nowej ery w historii inżynierii – materiałów o właściwościach krojonych na miarę. - Z Markusem Buehlerem z MIT rozmawia Wojciech Mikołuszko."}
               {:title "Da Vinci czy nie?"
                :description "Wart 20 tys. czy 100 mln dol? Oto jest pytanie. Na rynku antykwarycznym pojawił się portret, którego autorem może być wielki Leonardo."}
               {:title "Sztuka ukradziona"
                :description "Zaskakujące historie najcenniejszych zabytków z polskich zbiorów."}
               {:title "Kuba"
                :description "Po 50 latach w cieniu Fidela Castro przygnieceni kryzysem Kubańczycy zaczynają flirtować z kapitalizmem. Planu na przyszłość najwyraźniej im jednak brakuje."
                :places [{:country "Kuba" :coords [23.133333 -82.383333]}]}
               {:title "Gepard"
                :description "Wielka popularność w świecie popkultury nie przełożyła się na poprawę losu tego kota. Najszybszy ssak świata musi szybko uciekać przed zagładą."}
               {:title "Wydmy"
                :description "Na pustyniach rządzi wiatr. Autor materiału latał nad wszystkimi pustyniami świata, by z powietrza fotografować to, czego wiatr może tam dokonać."}
               {:title "Chińskie zaświaty"
                :description "Koncepcje zaświatów w historii Państwa Środka były zaskakująco materialistyczne, a nawet biurokratyczne. Stare tradycje w pędzącym naprzód kraju przechodzą jednak do historii."
                :tags ["Terakotowa armia"]
                :places [{:country "Chiny" :city "Wiosenna Dolina" :coords [40.9 115.8]}
                         {:country "Chiny" :city "Xi'an" :coords [34.383 109.278]}]}
               {:title "Marsylia"
                :description "Gdy francuskimi miastami wstrząsały zamieszki, w Marsylii, zamieszkiwanej przez dziesiątki tysięcy imigrantów, panował spokój. Skąd się wzięła ta sielanka i czy jest do utrzymania na dłuższą metę?"
                :places [{:country "Francja" :region "Marsylia" :coords [43.3 5.4]}]}]}
   {:year 2012 :month 10 :vol 157
    :articles [{:title "Jedz z głową"
                :description "Głodówki, drakońskie diety, odtruwania organizmu – wszystko dla zdrowia. Czy takie zabiegi mają sens?"}
               {:title "Fotoreportaż"
                :description "Mikołaj Nowacki pokazuje Odrę – rzekę, którą człowiek przekształcał bez ceregieli, a potem zlekceważył."
                :places [{:country "Polska" :region "Odra"}]}
               {:title "Wywiad"
                :description "Poznanie przyszłości to wizja kusząca. Czy nauka może ją ziścić? I jakie są pułapki prognozowania?"
                :tags ["Marek Niezgódka"]}
               {:title "Dzika miłość"
                :description "Czy ludy pierwotne były seksualnie rozpasane? Cóż, z instynktami nie walczyły. Ich seksualność była jednak nie tyle perwersyjna, ile raczej pragmatyczna."
                :places [{:country "Papua Nowa Gwinea" :region "Dolina Wahgi" :coords [-5.8 144.2]}
                         {:country "Mali" :city "Kolenzé" :coords [14.206 -4.628]}
                         {:country "Etiopia" :region "Dolina Omo" :coords [4.80 35.96]}
                         {:region "Amazonia"}]}
               {:title "Krwawa kość"
                :description "Wydawało się, że czasy słoniowych rzezi z lat 80. XX w. już nie wrócą. Tymczasem kłusownictwo i czarny rynek kości odżywają, a jedną z ich sił napędowych okazują się... kultowe obyczaje wielkich religii."
                :tags ["słoń" "słonie"]
                :places [{:region "Afryka"}]}
               {:title "Rio"
                :description "Fawele to od dawna stały element brazylijskich miast. Przed zbliżającymi się igrzyskami w Rio de Janeiro siedliska biedoty rządzone dotychczas przez narkotykowe gangi trafiły jednak pod okupację... policji. Czy fawele dadzą się ucywilizować?"
                :places [{:country "Brazylia" :city "Rio de Janeiro" :coords [-22.90 -43.18]}]}
               {:title "Dom dla zwierząt"
                :description "Opuszczony dom na zapadłej fińskiej wsi został skolonizowany przez mniejsze i większe zwierzęta. Uchwycenie ich portretów we wnętrzach wymagało benedyktyńskiej wprost cierpliwości."
                :places [{:country "Finlandia" :region "Suomusjärvi" :city "Salo" :coords [60.38 23.11]}]}
               {:title "Z głębin czasu"
                :description " Latimeria to głębinowa ryba, która okazała się odporniejsza niż dinozaury. Ta żywa skamieniałość potrafi jednak pływać z zaskakującym wdziękiem."}
               {:title "Groty Mustangu"
                :description "Przed wiekami mieszkańcy Królestwa Mustangu szukali bezpieczeństwa w grotach wykutych wysoko w skałach. Niektóre z nich, z ukrytymi wejściami, są niczym kapsuły czasu."
                :places [{:country "Nepal" :region "Mustang" :coords [29.03 83.84]}]}]}
   {:year 2012 :month 9 :vol 156
    :articles [{:title "Koszer vs. Halal"
                :description "Czy religijne nakazy i zakazy związane z jedzeniem mają swoje racjonalne uzasadnienie?"
                :tags ["islam" "muzułmanie" "judaizm" "żydzi"]}
               {:title "Fotoreportaż"
                :description "Andrzej Wiktor portretuje współczesnych husarzy – ludzi, którzy żyją historią i wiernie ją rekonstruują."
                :places [{:country "Polska"}]}
               {:title "Archeologia zbrodni"
                :description "Młoda dyscyplina badawcza pozwala odtworzyć ostatnie chwile ofiar masowych mordów."
                :tags ["Jerzy Kawecki" "Krzysztof Szwagrzyk" "Maciej Trzciński"]}
               {:title "Husaria"
                :description "Formacja, która szarżą miażdżyła wroga, przez blisko dwa wieki nie miała sobie równych. Czemu zawdzięczała piekielną skuteczność?"
                :places [{:country "Polska"}]}
               {:title "Wenezuela"
                :description "Polska wyprawa do zaginionego świata tepui – jednego z najmniej poznanych skrawków ziemi – przyniosła odkrycia nowych gatunków."
                :places [{:country "Wenezuela" :region "Tramen Tepui" :coords [5.444 -61.059]}]}
               {:title "Jemen"
                :description "Przepędzenie dyktatora nie oznacza jeszcze końca kłopotów. Jemen wciąż trawi gorączka – kraj znieczula się czatem i ulega plemiennym buntom."
                :places [{:country "Jemen" :coords [15.24 43.75]}]}
               {:title "Arabskie rewolucje"
                :description "Północna Afryka i Bliski Wschód po arabskiej wiośnie – jakie są prognozy dla regionu, który przykuwa dziś uwagę świata?"
                :places [{:country "Tunezja"}
                         {:country "Egipt"}
                         {:country "Libia"}
                         {:country "Syria"}]}
               {:title "Koala"
                :description "Zwierzątka o aparycji pluszowych przytulanek nie lubią przeprowadzek. Cóż więc robić, gdy obok ich eukaliptusa pewnego dnia wyrasta jednorodzinny dom?"
                :places [{:country "Australia" :coords [-30.0 150.7]}]}
               {:title "Podwodne góry"
                :description "Morskie dno, tak jak wystające nad wodę kontynenty, usiane jest górami. Tyle że w wodzie, inaczej niż na lądzie, im wyżej, tym bogatsze życie. W dodatku życie bardzo mało zbadane."}
               {:title "Portret błyskawicy"
                :description "Aby sfotografować narodziny błyskawicy, trzeba mieć gigantyczną kamerę, wiele wytrwałości i jeszcze więcej szczęścia. Timowi Samarasowi tego ostatniego na razie brakuje, ale niczym błędny rycerz przemierza Wielkie Równiny, nie tracąc nadziei."}]}
   {:year 2012 :month 8 :vol 155
    :articles [{:title "Afrodyzjaki"
                :description "Ile w opowieściach o ich cudownych właściwościach naukowej prawdy, a ile mitów?"}
               {:title "Wywiad z Bi Kidude"
                :description "O kobietach z Zanzibaru i praktykowanym na wyspie rytuale, który przygotowuje dziewczęta do zamążpójścia, oraz muzyce taarab."
                :places [{:country "Zanzibar"}]}
               {:title "Rapa Nui"
                :description "Według legendy posągi na Wyspie Wielkanocnej chodziły. Na pytanie „jak?” uczeni i odkrywcy dawali różne odpowiedzi, podpierając swoje koncepcje eksperymentami."
                :places [{:country "Chile" :region "Wyspa Wielkanocna" :coords [-27.125833 -109.276944]}]}
               {:title "Londyn"
                :description "Brytyjska metropolia przeżywa właśnie kolejne w swej historii igrzyska olimpijskie. Czym zaowocują one dla „gorszego”, Londynu, Londynu kategorii C?"
                :places [{:country "Wielka Brytania" :city "Londyn" :coords [51.507222 -0.1275]}]}
               {:title "Polskie Olimpiady"
                :description "Sportowa rywalizacja na najwyższym poziomie to wielkie emocje, dramaty, szczęśliwe zbiegi okoliczności i zabawne anegdoty. Te pozostają w pamięci kibiców najdłużej."
                :tags ["Polska"]}
               {:title "Portret mistrza"
                :description "Dawni olimpijczycy mówią o swojej drodze na szczyt, o chwilach triumfu. Co dzięki sportowi zyskali, co stracili, co jest w życiu ważne?"
                :tags ["polska"]}
               {:title "Ptasia intymność"
                :description "Jak one to robią? Niby wszystkie tak samo, a jednak inaczej. Weźmy poczciwe kaczki – czy podejrzewalibyście je o skłonności do brutalnego seksu, a nawet gwałtów?"}
               {:title "Yartsa gunbu"
                :description "Niezwykle gąsienicowe grzybki z górskich łąk cieszą się opinią medycznego panaceum. Nic dziwnego, że na Wyżynie Tybetańskiej wywołały prawdziwą gorączkę złota."
                :places [{:country "Chiny" :region "Tybet" :coords [31.1 92.7]}]}
               {:title "Islandia"
                :description "Między wulkanami a lodowcami rosły kiedyś brzozowe zagajniki. Aż przyszedł człowiek... I choć krajobraz wyspy stał się od tamtego czasu jeszcze bardziej posępny, wciąż pozostaje piękny."
                :places [{:country "Islandia" :coords [64 -18]}]}]}
   {:year 2012 :month 7 :vol 154
    :articles [{:title "Wywiad z Bogdanem Gałązką"
                :description "Co i jak jedzono przed wiekami, czy da się odtworzyć ówczesne przepisy oraz dlaczego na zamku w Malborku raczono się bobrzymi ogonami i deserem z fiołków."}
               {:title "Kipiące Słońce"
                :description "Świat widział już ogromną słoneczną burzę, która w XIX w. uszkodziła sieć telegraficzną. Czy podobne wydarzenie dzisiaj „wyłączyłoby” naszą cywilizację? I czy można je przewidzieć?"}
               {:title "Ginące języki"
                :description "Języki niewielkich plemion i grup etnicznych zamierają. Młodzi uczą się języków dominujących, by osiągnąć sukces. Co tracimy wraz ze śmiercią małych języków?"
                :tags ["język tuwiński" "język hrusyjski" "język seri"]
                :places [{:country "Rosja" :region "Republika Tuwy" :coords [51.783333 94.75]}
                         {:country "Indie" :region "Arunacal Prades" :coords [27.27 92.79]}
                         {:country "Meksyk" :coords [29.497162 -112.384568]}]}
               {:title "Katedry"
                :description "Wznoszone przez pokolenia gigantyczne kamienne konstrukcje do dziś wywołują w ludziach stany duchowych przeżyć. Wielki budowlany wyścig do nieba ma swoich bohaterów i tajemnice."
                :places [{:country "Francja" :city "Chartres" :coords [48.447608 1.487902]}
                         {:country "Francja" :city "Rouen" :coords [49.440205 1.094928]}
                         {:country "Francja" :city "Amiens" :coords [49.894553 2.302104]}
                         {:country "Francja" :city "Paryż" :coords [48.852922 2.350295]}]}
               {:title "Flamingi"
                :description "Czym zachwycają najbardziej? Chyba kolorystyczną konsekwencją. Wielotysięczne stado jest niczym ogromny różowy organizm. Ale potrafiły również skonsternować naukowców zagadką swego upodobania do stania na jednej nodze."
                :places [{:country "Meksyk" :region "Jukatan" :coords [21.51 -87.89]}]}
               {:title "Tornada"
                :description "Rodzą się co roku na Wielkich Równinach Ameryki – superkomórki burzowe. Łowcy burz polują na tornada niczym na grubego zwierza. Dla niektórych trofeum jest fotografia tej grozy i mocy."
                :places [{:country "USA"}]}
               {:title "Dacza"
                :description "Carski wynalazek twórczo rozwinięty przez władze komunistyczne był dla narodu źródłem aprowizacji, oazą wolności i intymności oraz sceną życia towarzyskiego. Rosji bez daczy wyobrazić sobie nie sposób."
                :places [{:country "Rosja" :region "Wałdaj" :coords [56.99 33.49]}]}
               {:title "Wielkie zakole"
                :description "Westernowa sceneria pustyni Chihuahua nad Rio Grande wciąż jest dzika. I może taką pozostanie, bo po obu stronach granicy meksykańsko-amerykańskiej powiększa się tereny objęte ochroną."
                :places [{:country "USA" :region "Teksas" :coords [29.9 -103.5]}
                         {:country "Meksyk" :region "Chihuahua" :coords [29.0 -104.0]}]}]}
   {:year 2012 :month 6 :vol 153
    :articles [{:title "Wywiad"
                :description "Wywiad z Jarosławem Kulbatem o wpływie społecznym. Jak skłonić innych, by zachowywali się zgodnie z naszymi oczekiwaniami? I jak nie ulegać manipulacji?"}
               {:title "Terakotowa armia"
                :description "Pierwszy cesarz Chin tysiące wojowników z terakoty uzbroił w prawdziwą broń i ustawił w szyku w swym monstrualnym grobowcu. Przedarcie się przez ich szyki zajmie archeologom stulecie. Co ciekawe, armia na życie wieczne nie była okryta żałobą, ale mieniła się barwami."
                :places [{:country "Chiny" :city "Xi'an" :coords [34.383 109.278]}]}
               {:title "Hongkong"
                :description "Las mieszkalnych wieżowców między górami a morzem długo był symbolem azjatyckiego kapitalizmu, ale też siedliskiem rozpusty, korupcji, mafii. Dziś Chiny, które przejęły enklawę, pozbyły się kompleksów ubogiego krewnego: to one gwarantują jej prosperity."
                :places [{:country "Hongkong" :coords [22.3 114.2]}]}
               {:title "Psy rasowe"
                :description "Niezwykłą różnorodność psich ras człowiek stworzył w ciągu kilkuset lat. Zdumiewające, że odpowiada za nią garstka „genetycznych przełączników”. Jamnika od dobermana dzieli tylko kilka genów."}
               {:title "Maroni"
                :description "Nie wszyscy czarni niewolnicy pędzeni do pracy na brazylijskich plantacjach godzili się z losem. Wielu uciekało do puszczy, gdzie zakładali odcięte od cywilizacji osady i kształtowali krajobraz Amazonii, prowadząc naturalną gospodarkę. Świat o nich zapomniał. Do czasu, gdy ujawnili się, walcząc o prawo do swoich ziem."
                :places [{:country "Brazylia" :coords [-0.9 -49.1]}]}
               {:title "Sokotra"
                :description "Kadzidlana wyspa broniona przez mityczne węże, leżąca z dala od centrów cywilizacji, długo pozostawała na uboczu dziejów. Właśnie dlatego przetrwało na niej niezwykłe bogactwo endemitów – prawdziwych botanicznych dziwolągów."
                :places [{:country "Jemen" :region "Sokotra" :coords [12.5 53.9]}]}
               {:title "Morza Arabii"
                :description "Świat arabski to nie tylko karawany wielbłądów, ale też wspaniałe tradycje morskie. Z pustyniami Arabii sąsiaduje bogate królestwo morskiego życia, którego wagę mieszkańcy tamtejszych krajów zaczynają doceniać."
                :places [{:region "Morze Czerwone" :coords [20.2 38.5]}
                         {:region "Morze Arabskie" :coords [13.5 62.7]}
                         {:region "Zatoka Perska" :coords [26.6 51.6]}]}]}
   {:year 2012 :month 5 :vol 152
    :articles [{:title "Wywiad"
                :description "Wywiad z Wiktorem Osiatyńskim – m.in. o tym, dlaczego globalizacja zagraża prawom człowieka i jak kwestia tortur sprowadza do właściwego wymiaru problem kulturowego relatywizmu."}
               {:title "Maski"
                :description "W afrykańskich kulturach maska ma potężną moc transformacji człowieka i przenoszenia go w inny wymiar. A przy tym jest materialnym dowodem jego niezwykłej kreatywności."
                :places [{:country "Sierra Leone" :city "Freetown" :coords [8.47 -13.23]}
                         {:country "Haiti" :coords [19 -72.416667]}
                         {:country "Ghana" :city "Winneba" :coords [5.35 -0.63]}
                         {:country "Benin" :city "Agonlia" :coords [8.7 2.2]}
                         {:country "Nigeria" :region "Cross River" :coords [5.6 8.5]}]}
               {:title "Lucha libre"
                :description "Meksykańska odmiana wrestlingu sama też wykształciła mnóstwo odmian – walki kobiet, karłów, homoseksualistów. Więcej w tym cyrku niż konfrontacji, ale też mnóstwo emocji i uwielbienia dla zawodników."
                :places [{:country "Meksyk" :city "Chimalhuacan" :coords [19.40 -98.92]}]}
               {:title "Wspólnota pięciu palców"
                :description "Co ma wspólnego nasza ręka ze skrzydłem nietoperza i nogą słonia? W zasadzie... wszystko. Ogromne z pozoru różnice z pewnego punktu widzenia są bowiem absolutnie drugorzędne."}
               {:title "Egipt po rewolucji"
                :description "80 mln Egipcjan tłoczy się na wąskim pasie ziemi na brzegach Nilu. Podróż wzdłuż rzeki jest zatem wędrówką przez wszystkie klasy i grupy społeczne kraju, który jak ognia boi się destabilizacji."
                :places [{:country "Egipt"}]}
               {:title "Góra Gór"
                :description "K2 – najtrudniejsza do zdobycia, okrutna góra tym razem nie zażądała ofiar. Dla Gerlinde Kaltenbrunner był to 14. ośmiotysięcznik, na który wspięła się bez tlenu!"
                :places [{:country "Chiny" :coords [35.882098 76.512828]}
                         {:country "Pakistan"}]}
               {:title "Wirtuoz"
                :description "Kusogorzyk jest uzdolniony jak żaden inny ptaszek w jego liczącej dziesiątki gatunków rodzinie. Tylko on bowiem potrafi śpiewać za pomocą... upierzenia."
                :places [{:country "Ekwador"}
                         {:country "Kolumbia"}]}
               {:title "Wojna secesyjna"
                :description "W czasie amerykańskiej wojny domowej fotografia jeszcze raczkowała. Ówczesnymi „fotoreporterami” byli rysownicy. Pokazujemy ich prace, a także zdjęcia rekonstrukcji bitew wykonane archaicznymi metodami."
                :places [{:country "USA"}]}]}
   {:year 2012 :month 4 :vol 151
    :articles [{:title "Wywiad"
                :description "Wywiad z fizykiem, prof. Lechem Mankiewiczem. Jakie są granice naszego poznania? Dlaczego trzeba obserwować planetoidy? Jak poczuć tchnienie wieczności?"}
               {:title "Titanic"
                :description "Wśród wielu morskich katastrof ta była najsłynniejsza i najbardziej spektakularna. Najnowsze badania dowodzą, że Titanic nie zniknął pod falami majestatycznie, ale pogrążał się w przerażających konwulsjach."
                :places [{:coords [41.7325 -49.946944]}]}
               {:title "Tsunami"
                :description "Minął rok od chwili, gdy ocean chlusnął na Japonię ogromną falą, zmywając całe osady. Czy możemy przewidzieć, gdzie i kiedy wystąpi następny taki kataklizm? Czy pozostało?nam tylko wyczekiwanie kolejnej hekatomby?"
                :places [{:country "Japonia"}]}
               {:title "Atomowi uchodźcy"
                :description "Awaria elektrowni atomowej w Fukushimie wygnała z domów dziesiątki tysięcy ludzi, a zwierzęta ze skażonej strefy skazała na śmierć. Nie wiadomo, jak długo zakazana strefa pozostanie martwa."
                :places [{:country "Japonia" :city "Fukushima" :coords [37.423056 141.033056]}]}
               {:title "Borneo"
                :description "Niebotyczną tropikalną puszczę pełną latających stworzeń przeszywa jazgot pił i zasnuwają dymy pożarów. Na szczęście nie wszędzie pierwotną dzicz zastąpiły plantacje olejowców."
                :places [{:country "Borneo" :coords [1 114]}]}
               {:title "Miny"
                :description "Kambodża długo była sparaliżowana przez miny. Dziś sytuacja się poprawia, ale jeszcze 10 lat trzeba, by oczyścić z nich cały kraj. Ofiary tej bezwzględnej broni będą jednak nosić swoje traumy do końca życia."
                :places [{:country "Kambodża" :coords [12 105]}]}
               {:title "Kwaśny ocean"
                :description "Ślimaki bez skorupek, obumarłe rafy, karłowaciejące morskie stworzenia. Dwutlenek węgla pochłaniany przez oceany, choć odciąża atmosferę, może dramatycznie zmienić obraz morskiego życia."}]}
   {:year 2012 :month 3 :vol 150
    :articles [{:title "Wywiad"
                :description "Wywiad z genetykiem prof. Tadeuszem Doboszem – „DNA, powiedz przecie”, czyli o ustalaniu ojcostwa, identyfikacji przestępców oraz sposobach odtwarzania dawno wymarłych gatunków."}
               {:title "Podlasie"
                :description "Co jest siłą regionu? To, że życie płynie tam wolniej. A słabością? To, że życie płynie tam wolniej. Uczciwy portret Podlasia musi być paradoksalny."
                :places [{:country "Polska" :region "Podlasie" :coords [52.9 22.8]}]}
               {:title "Bliźnięta"
                :description "Dlaczego jednojajowe bliźnięta, mające identyczne DNA, jednak się różnią, fizycznie i charakterem? Mówiąc w skrócie, powodem jest tajemniczy „trzeci czynnik”."}
               {:title "Afrykański ryft"
                :description "Serce kontynentu przecinają buzujące wulkaniczną energią wielkie geologiczne rowy. Ludzkie społeczności żyjące w regionie, pod presją braku przestrzeni życiowej i zasobów, też co jakiś czas eksplodują morderczą furią."
                :places [{:country "Demokratyczna Republika Konga"}
                         {:country "Uganda"}
                         {:country "Rwanda"}
                         {:coords [-1.388094 29.592197]}]}
               {:title "Apostołowie"
                :description "Choć formalnie było ich 12, poczet apostołów, którzy ponieśli w świat chrześcijańskie przesłanie, jest liczniejszy. Za kwestionowanie zastanego społeczno- -kulturowego porządku niemal wszyscy zapłacili życiem."}
               {:title "Hulmany"
                :description "Święte dla hinduistów małpki, z ważną rolą w starożytnej mitologii, potrafią korzystać ze swojego statusu. Choćby wpadając na urządzane specjalnie dla nich bankiety."
                :places [{:country "Indie"}]}
               {:title "Głazy narzutowe"
                :description "Lądolód oprócz piasku i kamyków potrafił też taszczyć głazy naprawdę imponujące. Niektóre stoją dziś w zupełnie zaskakujących miejscach."
                :places [{:country "USA"}]}]}
   {:year 2012 :month 2 :vol 149
    :articles [{:title "Wywiad"
                :description "Wywiad z prof. Jackiem Łuczakiem o bólu, umieraniu i eutanazji."}
               {:title "Wikingowie"
                :description "Doskonale wyszkoleni wojownicy z duszami obieżyświatów trafili też na polskie ziemie. Jaką rolę tu odegrali?"
                :places [{:country "Polska" :city "Wolin" :coords [53.84 14.61]}
                         {:country "Polska" :city "Truso" :coords [54.10699 19.48869]}]}
               {:title "Kazachstan"
                :description "Nowa stolica rozległego stepowego państwa rośnie w oczach, a jej budowle projektują światowej sławy architekci. Naftowo-gazowy napęd, autorytarne rządy oraz nowobogacka ekstrawagancja przynoszą zaskakujący efekt."
                :places [{:country "Kazachstan" :city "Astana" :coords [51.1 71.4]}]}
               {:title "Pieski patrol"
                :description "Psi zaprzęg, dwóch ludzi i setki kilometrów lodowej grenlandzkiej pustki. Patrolowa służba w takich warunkach jest wyzwaniem, któremu sprostać mogą tylko najtwardsi."
                :places [{:country "Grenlandia" :coords [74.3 -20.2]}]}
               {:title "Złota Panama"
                :description "Lektura starych kronik konkwistadorów bywa cenna nie tylko z naukowego punktu widzenia. Pomogła bowiem odnaleźć groby wodzów starych panamskich plemion. Dodajmy – groby pełne złotych artefaktów."
                :places [{:country "Panama" :city "El Cano" :coords [8.442 -80.535]}]}
               {:title "Dzicy Papuasi"
                :description "Czy w dzisiejszym świecie można jeszcze znaleźć jaskiniowców? Okazuje się, że tak, ale to już naprawdę ostatni tacy ludzie na ziemi."
                :places [{:country "Papua Nowa Gwinea" :coords [-3.7 143.8]}]}
               {:title "Tygrysy"
                :description "Największego z wielkich kotów w dżungli zobaczyć niemal nie sposób. Nie tylko dlatego, że nawet w wodzie porusza się bezgłośnie niczym duch. Po prostu jest piekielnie rzadki. Mimo to wciąż tli się nadzieja, że przetrwa."
                :places [{:country "Indie" :region "Park Narodowy Ranthambhaur" :coords [26.04 76.42]}]}
               {:title "Ansel Adams"
                :description "Fotograf, któremu przed laty sławę przyniosły fotografie kalifornijskiej głuszy, nie przestaje fascynować Amerykanów. I nawet po dekadach chcą oglądać to, co on tam ujrzał, na jego sposób."
                :places [{:country "USA" :region "Kalifornia" :coords [37.7 -119.20]}]}]}
   {:year 2012 :month 1 :vol 148
    :articles [{:title "Wywiad"
                :description "Wywiad z szefem GIODO W.R. Wiewiórowskim o naszych danych osobowych: jak je chronić, kto i do czego może je wykorzystać, czego powinniśmy się obawiać."}
               {:title "Malapa"
                :description "Nie całkiem małpa, niezupełnie człowiek. W jaskiniowej pułapce w RPA paleontolodzy odnaleźli świetnie zachowane szczątki ludzkiego praszczura."
                :places [{:country "RPA" :coords [-25.9249 27.7705]}]}
               {:title "Odwrót macho"
                :description "Fawele pełne dzieci to już przeszłość. Brazylijki mówią, że pozamykały swoje „zakłady reprodukcyjne”. Wskaźnik dzietności w kraju spadł poniżej poziomu gwarantującego wymienialność pokoleń! Jak do tego doszło?"
                :places [{:country "Brazylia"}]}
               {:title "Wyspy Feniks"
                :description "„El Niño” mocno podgrzał wody wokół pacyficznych skrawków lądu, bieląc korale. Okazuje się jednak, że rafa odzyskuje siły, jeśli tylko przetrwają na niej ryby pasące się na wodorostach."
                :places [{:country "Kiribati" :region "Wyspy Feniks" :coords [-4.46 -171.25]}]}
               {:title "Ziemia Afarów"
                :description "Afrykańska Kotlina Danakilska jest miejscem skrajnie nieprzyjaznym – najgorętszym na ziemi, wulkanicznym, pełnym soli z odparowanych niegdyś mórz. Afarowie kochają jednak jej zabójcze piękno."
                :places [{:country "Etiopia"}
                         {:country "Erytrea"}
                         {:country "Dżibuti"}
                         {:coords [12.7 42]}]}
               {:title "Biblia króla Jakuba"
                :description "Przekład zamówiony przed 400 laty wpłynął na anglosaską kulturę za pośrednictwem setek milionów egzemplarzy. Trafił do kowbojów, purytanów, a nawet rastafarian."}
               {:title "Arktyka"
                :description "Arktyka się ogrzewa, co stawia niedźwiedzie polarne przed poważnym wyzwaniem. Jak z lodowych drapieżników mają się stać wodnymi?"
                :places [{:region "Arktyka" :coords [76 -119]}]}
               {:title "Kosmos"
                :description "Obłoki Magellana od miliardów lat pozostają nieczułe na wdzięki Drogi Mlecznej. Czy w końcu im ulegną?"}
               {:title "Montana"
                :description "Ostatni kolonizowany przez farmerów obszar USA był, co nie dziwi, najbardziej jałowym. Aby się tu utrzymać, trzeba dziś mieć tysiące hektarów. Potomkowie osadników, którzy wytrwali, opowiadają ich fascynujące historie."
                :places [{:country "USA" :region "Montana" :coords [48.6 -109.3]}]}]}
   {:year 2011 :month 12 :vol 147
    :articles [{:title "Wywiad"
                :description "Wywiad z entomologiem Markiem W. Kozłowskim m.in. o tym, czym jest instynkt, czy owady mają emocje i czy w ich społecznościach możliwa jest rewolucja."}
               {:title "Laureaci WKE"
                :description "Wielki Konkurs Fotograficzny NG cieszy się niesłabnącą popularnością. Jak co roku spośród dziesiątków tysięcy nadesłanych przez Czytelników zdjęć wybraliśmy najlepsze w czterech kategoriach. I oczywiście publikujemy je na naszych łamach."}
               {:title "Siedem miliardów"
                :description "Demografowie od początku istnienia swojej specjalności wieszczyli apokalipsę. Według prognoz sprzed 50 lat nasza dzisiejsza rzeczywistość miała być koszmarem. Ludzkość tymczasem radzi sobie nadspodziewanie dobrze. Ale żeby tak było dalej, musimy użyć całego geniuszu, na jaki nas stać."}
               {:title "Antropocen"
                :description "Czy wpływ człowieka na planetę Ziemia widoczny będzie w geologicznej skali czasu? I jaki ślad po sobie pozostawimy, gdy nasze miasta obrócą się w pył? "}
               {:title "Roślinna arka"
                :description "Co jemy? Najogólniej mówiąc – wszyscy prawie to samo. Choć człowiek przez wieki wypracował niebywałe bogactwo lokalnych odmian roślin uprawnych i zwierząt hodowlanych, przemysłowe rolnictwo opiera się na ledwie kilkudziesięciu. A te mogą paść ofiarą nowych chorób i szkodników."}
               {:title "Miasta"
                :description "Czy rozwój gigantycznych metropolii może służyć przyrodzie? W skali globu paradoksalnie tak. Statystycznie mieszczuch wywiera bowiem mniejszą presję na środowisko niż mieszkaniec wsi."}
               {:title "Bangladesz"
                :description "Płaski jak stół, zalewany przez powodzie i podnoszący się poziom morza, potwornie zatłoczony. Kraj ten jest niczym poligon doświadczalny dla ludzkości, której przyjdzie się zmierzyć z przeludnieniem i zmianami klimatu."
                :places [{:country "Bangladesz"}]}]}
   {:year 2011 :month 11 :vol 146
    :articles [{:title "Wywiad"
                :description "Wywiad z Krzysztofem Mroziewiczem – o Fidelu Castro i jego Kubie, na której parasolki mogłyby rodzić pomarańcze."
                :places [{:country "Kuba"}]}
               {:title "Skarb Sasów"
                :description "Kto zakopał skarb złożony z dziwnie pogiętych złotych okuć mieczy? Epoka legendarnego króla Artura ma jeszcze wiele tajemnic."
                :places [{:country "Wielka Brytania" :coords [52.655278 -1.906667]}]}
               {:title "Tana Toradża"
                :description "W tej społeczności zabalsamowany zmarły może czekać – w domu! – na pogrzeb miesiącami. A wszystko przez to, że na urządzenie pochówku trzeba małej fortuny."
                :places [{:country "Indonezja" :city "Batu"}
                         {:country "Indonezja" :city "Rantepao"}
                         {:country "Indonezja" :city "Sangalla"}
                         {:coords [-3 120.03]}]}
               {:title "Obróceni w proch"
                :description "W płomieniach, żołądkach sępów, a czasem innych ludzi... Wyprawa na tamten świat jest kluczowym zagadnieniem w każdej kulturze."
                :places [{:country "Madagaskar"}
                         {:country "Tybet" :region "Kajlas"}
                         {:country "Indie"}]}
               {:title "Ziemie rzadkie"
                :description "Na tych metalach opierają się nowoczesne technologie. Ale nie dość, że jest ich mało, to jeszcze większość złóż kontrolują Chiny. Tymczasem potrzeby rosną..."}
               {:title "Rekin wielorybi"
                :description "Choć ogromne, żywią się morską drobnicą. A rybacy wcale nie drżą na myśl o spotkaniu z nimi. A nawet podkarmiają je, jak kaczki."
                :places [{:country "Papua Nowa Gwinea" :region "Zatoka Cenderawasih" :coords [-2.28 135.20]}]}
               {:title "Saamowie"
                :description "W nowoczesnej Norwegii trudno być pasterzem i nomadą. A jednak wielu Saamów chce żyć tak jak ich wędrujący za reniferami przodkowie."
                :places [{:country "Norwegia" :city "Kautokeino" :coords [69.01 23.04]}
                         {:country "Szwecja" :city "Harrå" :coords [67.41 20.1]}]}
               {:title "Ötzi"
                :description "Choć zmarł ponad 5 tys. lat temu, wciąż trzyma się nieźle. A lekarze nie dają mu spokoju, próbując za pomocą najnowocześniejszych metod wydrzeć tajemnice jego i czasów, w których żył."
                :places [{:coords [46.779389 10.840306]}
                         {:country "Austra"}
                         {:country "Włochy"}]}
               {:title "Rzeki USA"
                :description "Dzikie i malownicze – kiedyś takie były wszystkie. Dziś ostatnich ich fragmentów przed zabudową, tamami i mostami bronią zapaleńcy."
                :places [{:country "USA" :region "Alaska" :tags ["Tinayguk"] :coords [67.568889 -151.041667]}
                         {:country "USA" :region "Kalifornia" :tags ["Merced"] :coords [37.349167 -120.975556]}
                         {:country "USA" :region "Idaho" :tags ["Owyhee"] :coords [43.812778 -117.025556]}
                         {:country "USA" :tags ["Chattoga"] :coords [34.716137 -83.354589]}
                         {:country "USA" :region "Oregon" :tags ["Rouge"] :coords [42.4225 -124.429167]}
                         {:country "USA" :region "Wyoming" :tags ["Snake"]}
                         {:country "USA" :region "Maine" :tags ["Allagash"]}]}]}
   {:year 2011 :month 10 :vol 145
    :articles [{:title "Wywiad"
                :description "Wywiad z lekarzem i himalaistą Robertem Szymczakiem m.in. o etycznych wyzwaniach wspinaczy, o cierpieniach organizmu w wysokich górach i powodach, dla których nie dotyczy to Szerpów. "}
               {:title "Yosemite"
                :description "Zawisnąć na pionowej skale na czubkach palców setki metrów nad ziemią? W Yosemite to codzienność. Do mekki wspinaczy pielgrzymują bowiem ci, którzy ograniczeń ciała i psychiki nie przyjmują do wiadomości."
                :places [{:country "USA" :region "Kalifornia" :tags ["El Capitan"] :coords [37.72 -119.636]}]}
               {:title "Mózg nastolatka"
                :description "Młody człowiek testuje świat – nadmiernie ryzykuje, szuka silnych wrażeń i nowości, robi rzeczy głupie, szalone. Ale nie znaczy to, że nie myśli. W ten sposób ewolucja przygotowuje go do walki o życiowy sukces."}
               {:title "Przed lodowcem"
                :description "Ziemia bez lodu – tropiki wokół biegunów, piekło na równiku, poziom morza 70 m wyżej niż dziś. Nasza planeta już to widziała. Czy zatem zaglądając w przeszłość, możemy zobaczyć naszą przyszłość?"}
               {:title "Ułan Bator"
                :description "Metropolia, której mieszkańcy jeszcze przed chwilą byli stepowymi koczownikami, musi być jedyna w swoim rodzaju. I faktycznie – znane z innych stolic reguły zurbanizowanego życia tutaj nie obowiązują."
                :places [{:country "Mongolia" :city "Ułan Bator" :coords [47.90 106.90]}]}
               {:title "Żurawie"
                :description "Choć krzykliwe z nazwy – znaleźć je trudno. I nic dziwnego, skoro zostało ich kilkaset. Migrować musi je uczyć człowiek – w ultralekkim samolociku."
                :places [{:country "USA"}
                         {:country "Kanada"}]}
               {:title "Hebrydy"
                :description "Wystawione na wściekłe ataki północnego Atlantyku postrzępione szkockie wyspy kolonizowali tylko najtwardsi, ale i oni w końcu dali za wygraną, wiele z nich zostawiając morskim ptakom. Bezludne, wietrzne, surowe – od wieków zachwycają romantycznym pięknem."
                :places [{:country "Wielka Brytania" :region "Szkocja" :coords [57.4 -6.3]}]}]}
   {:year 2011 :month 9 :vol 144
    :articles [{:title "Wywiad"
                :description "Wywiad z prof. Franciszkiem Adamickim m.in. o tym, jak bardzo zestresowane są pomidory, gdzie się podziały złote renety i dlaczego czarna marchew jest tak rzadka."}
               {:title "Władcy Sahary"
                :description "Tuaregowie przez wieki rządzili pustynią. Znajdowali drogę, kierując się kolorem, fakturą i smakiem piasku. Dziś karawany odchodzą w przeszłość, a z nimi tradycja tego ludu."
                :places [{:country "Niger" :region "Sahara" :coords [18.6 7.1]}]}
               {:title "Słonie sieroty"
                :description "Choć ogromne i gruboskórne, słonie są bardzo wrażliwe. Potrafią się wspierać, pocieszać i przeżywać żałobę. "
                :places [{:country "Kenia"}]}
               {:title "Kto nam da skrzydła?"
                :description "Odrzutowy silnik na plecach jak z kart komiksów? Czemu nie, w końcu swobodne latanie to odwieczne marzenie ludzkości. I wydaje się, że „osobisty pojazd latający” jest już coraz bliżej."}
               {:title "Birma"
                :description "Nazywana „klejnotem Azji” i „krajem tysiąca pagód” Birma zachowała nieskażone nowoczesnością pejzaż i kulturę. Dziś otwiera się po dziesięcioleciach politycznej i gospodarczej izolacji."
                :places [{:country "Birma" :coords [21.7 95.9]}]}
               {:title "Amundsen"
                :description "Amundsen kontra Scott, psy kontra kuce. Wyścig do bieguna był starciem ambicji, charakterów, narodowych mentalności, a także specyficznie rozumianej „polarnej technologii”."
                :places [{:region "Antarktyda" :coords [-78.8 -164.9]}]}
               {:title "Myśląca sieć"
                :description "Pierwszą na świecie elektrownię zbudował Thomas Edison w 1882 r. w Nowym Jorku. Choć odtąd ilość prądożernego sprzętu rośnie lawinowo, światowa sieć energetyczna oparta jest na technice rodem z I poł. XX w. I jeśli ma nas nie zawieść, musimy jej przydać inteligencji."}]}
   {:year 2011 :month 8 :vol 143
    :articles [{:title "Wywiad"
                :description "Wywiad z paleontologiem Stephenem Brusatte m.in. o przyczynach niebywałego ewolucyjnego sukcesu dinozaurów."}
               {:title "Kleopatra"
                :description "Błyskotliwa i odważna piękność. Kochanka wodzów Rzymu, pierwsza celebrytka świata, a zarazem ostatnia władczyni na tronie faraonów. Wiemy o niej zdumiewająco mało, ale archeolodzy próbują tę wiedzę poszerzyć."
                :places [{:country "Egipt"}]}
               {:title "Park na szynach"
                :description "Nowy Jork zamienił starą linię kolejową na zieloną promenadę. Parkowy wąż na stalowych podporach przeskakuje ulice metropolii."
                :places [{:country "USA" :city "Nowy Jork" :coords [40.747814 -74.004872]}]}
               {:title "Misie duchy"
                :description "Niedźwiedzie Kermode są białe, choć rodziców często mają czarnych. W deszczowej puszczy przemykają jak duchy. I tak traktowali je Indianie."
                :places [{:country "Kanada" :region "Kolumbia Brytyjska" :coords [52.9 -128.9]}]}
               {:title "Androidy"
                :description "Roboty łudząco podobne do człowieka to już rzeczywistość. Zapewne wkrótce znajdą się w naszym otoczeniu. Jak zmienią relacje między ludźmi? Jakie zadania będziemy skłonni im powierzyć? A przede wszystkim – jak odnieść do nich kwestie moralności?"}
               {:title "Balsa"
                :description "Rośnie szybko, ostro, ryzykownie i w ogóle nie przejmuje się wagą. A jej kwiaty produkują nocą beczkę nektaru, który przyciąga licznych dwu-, cztero- i więcej- nożnych amatorów."
                :places [{:region "Ameryka Południowa"}
                         {:region "Ameryka Środkowa"}]}
               {:title "Pendżab"
                :description "Najbogatsza i najludniejsza prowincja Pakistanu chce korzystać z uroków doczesności i pozostaje pod wpływem roztańczonego sufizmu. A to nie podoba się talibom."
                :places [{:country "Pakistan" :region "Pendżab" :coords [31.3 73.0]}]}
               {:title "Pustynia Namib"
                :description "Parki narodowe na blisko połowie powierzchni kraju? Tak, Namibia ma wielkie ambicje. Ale diamenty i inne minerały też kuszą."
                :places [{:country "Namibia" :region "Pustynia Namib" :coords [-24 15]}]}]}
   {:year 2011 :month 7 :vol 142
    :articles [{:title "Medyczne koło"
                :description "Rozmowa z Jerzym Woy-Wojciechowskim m.in. o znaczeniu przypadku w rozwoju medycyny."}
               {:title "Goryle"
                :description "W kongijskiej puszczy buszują zbrojni rebelianci, żołnierze, uchodźcy, smolarze. Potężne małpy muszą przetrwać ten zalew ludzkich nieszczęść. Czasem padają od kul. "
                :places [{:country "Rwanda"}
                         {:country "Demokratyczna Republika Konga"}
                         {:country "Uganda"}
                         {:region "Park Narodowy Wirunga" :coords [-1.4 29.5]}]}
               {:title "Narodziny religii"
                :description "Czy cywilizację stworzyło rolnictwo? Imponujące kamienne sanktuarium wzniesione 12 tys. lat temu przez łowców-zbieraczy podważa tę teorię."
                :places [{:country "Turcja" :region "Göbekli Tepe" :coords [37.223056 38.9225]}
                         {:country "Turcja" :region "Nevalı Çori" :coords [37.518333 38.605556]}]}
               {:title "Wodun"
                :description "Mrożące krew w żyłach opowieści o czarach, które rzucają kapłani wodun, to wymysły popkultury. Dlaczego? Bo wedle ich przekonań złe moce są groźne także dla tych, którzy je stosują."
                :places [{:country "Benin" :city "Aklampa" :coords [8.23 2.19]}]}
               {:title "Dekonstrukcja"
                :description "„Starchitekci” przynieśli rewolucję. Odrzucili porządek tradycyjnej architektury, stawiając na organiczność i chaos. Ale czy miasto może być zbiorem budowli-rzeźb?"
                :places [{:country "Hiszpania" :city "Bilbao" :region "Muzeum Guggenheima" :coords [43.268531 -2.934054]}
                         {:country "Czechy" :city "Praga" :region "Ginger i Fred" :coords [50.075504 14.414071]}
                         {:country "Włochy" :city "Rzym" :region "Narodowe Muzeum Sztuki XXI w. MAXXI" :coords [41.928355 12.467011]}
                         {:country "Niemcy" :city "Berlin" :region "Muzeum Żydowskie" :coords [52.502317 13.395411]}
                         {:country "Wielka Brytania" :city "Manchester" :region "Imperial War Museum" :coords [53.469765 -2.298957]}
                         {:country "Polsla" :city "Warszawa" :region "Złota 44" :coords [52.231130 21.002264]}]}
               {:title "Bagdad"
                :description "Raport z miasta przeoranego wojną. Świecka w czasach dyktatury metropolia po amerykańskiej inwazji podzieliła się na religijne dzielnice-getta pogrodzone murami."
                :places [{:country "Irak" :city "Bagdad" :coords [33.3 44.4]}]}
               {:title "Strefa wpływów"
                :description "W wąskim pasie lądu zalewanym przypływami oceanu bogactwo i konkurencja małych stworzeń przypominają stosunki panujące w dżungli."
                :places [{:country "USA" :region "Rezerwat Morski Fitzgerald" :coords [37.5 -122.5]}]}
               {:title "Zielone Chiny"
                :description "Chiny zwracają się ku słońcu. Czy staną się liderem czystych technologii? Skala zmian jest imponująca, ale ilość spalanego węgla nadal poraża."
                :places [{:country "Chiny"}]}]}
   {:year 2011 :month 6 :vol 141
    :articles [{:title "Odpusty"
                :description "Gdzie odpust, tam i rozpust, czyli Polska w obiektywie."}
               {:title "Tabu"
                :description "Wywiad z etnologiem Jerzym S. Wasilewskim."}
               {:title "Skaryfikacje"
                :description "Pokryta tatuażami i bliznami skóra była pierwszym dowodem tożsamości."}
               {:title "Natura domowa"
                :description "Czy lis może zastąpić psa kanapowca? I co to znaczy udomowić dzikie zwierzę?"}
               {:title "Kilkuletnia żona"
                :description "W wielu miejscach na świecie ślub przypomina handel żywym towarem."
                :places [{:country "Jemen" :region "Hadżdża" :coords [16.1 43.2]}
                         {:country "Nepal"}]}
               {:title "Rafy ze stali"
                :description "Statek, wagon metra, czołg. Wszystko to może stać się szkieletem kolorowej rafy."
                :places [{:country "USA" :region "Floryda" :tags ["Wrak 'Duane'"] :coords [24.98967 -80.382]}
                         {:country "USA" :region "Floryda" :tags ["Wrak 'General Hoyt S. Vandenberg'"] :coords [24.252688 -81.445622]}
                         {:country "USA" :region "Alabama" :tags ["Czołgi M 60"] :coords [30.032816 -87.565823]}]}
               {:title "Chińskie małpy"
                :description "Czym zaskakują? Tym że żyją w mroźnych górach. I może dlatego są wąskonose."
                :places [{:country "Chiny" :region "Rezerwat Zhouzhi" :coords [34.0 108.2]}]}
               {:title "Tunel"
                :description "Przez Alpy po trasie prostej jak stół? Już niedługo kolej pomknie 2 km pod górami."
                :places [{:country "Szwajcaria" :tags ["Tunel Świętego Gotarda"] :coords [46.595556 8.595556]}]}
               {:title "Trzecia płeć"
                :description "Mężczyźni, którzy mają kobiece dusze, w Azji tworzą niezwykłe społeczności."
                :places [{:country "Tajlandia"}
                         {:country "Indie"}
                         {:country "Pakistan"}
                         {:country "Meksyk"}]}
               {:title "Megadziura"
                :description "Podziemne rzeki, pieczary mogące skryć kwartał wieżowców – oto niezwykłe podziemia Wietnamu."
                :places [{:country "Wietnam" :region "Park Narodowy Phong Nha-Ke Bang" :coords [17.446042 106.292267]}]}
               {:title "Camera Obscura"
                :description "Niezwykły pejzaż na ścianie pokoju można namalować przez małą dziurkę."}
               {:title "Superdrzewa"
                :description "Sekwoje rozmiarów kosmicznych rakiet tworzą prawdziwą katedrę natury."
                :places [{:country "USA" :region "Kalifornia" :coords [39.00 -123.65]}]}]}
   {:year 2011 :month 5 :vol 140
    :articles [{:title "Wywiad"
                :description "Wywiad z dendrologiem Jackiem Oleksynem – o tym, jak drzewa ze sobą rozmawiają i dlaczego ekonomiczne teorie najlepiej testować na roślinach."}
               {:title "Papiestwo"
                :description "Święci i szubrawcy, asceci i hedoniści, mistycy i ludzie władzy. Galeria ludzkich typów wśród blisko trzech setek papieży jest wyjątkowo barwna, podobnie jak historia instytucji, której przewodzili."}
               {:title "Piękno destrukcji"
                :description "Czy można zachwycić się wyrobiskiem, rzeką szlamu, hałdami odpadów? Okazuje się, że widziane z powietrza zyskują paradoksalnie estetyczny wymiar."
                :places [{:country "Polska" :city "Konin" :tags ["Odkrywka Gosławice"] :coords [52.28 18.26]}
                         {:country "Polska" :city "Krokowa" :tags ["Bielawskie Błota"] :coords [54.80 18.22]}
                         {:country "Polska" :city "Turawa" :tags ["Jezioro Turawskie"] :coords [50.72 18.12]}
                         {:country "Polska" :city "Bełchatów" :coords [51.240108 19.256276]}
                         {:country "Polska" :city "Police" :coords [53.575214 14.551096]}
                         {:country "Polska" :city "Polkowice" :coords [51.513276 16.209036]}]}
               {:title "Mrówki prządki"
                :description "Uwierzycie, że wszystkie ziemskie mrówki ważą tyle co ludzie? Albo że organizują swoje społeczności, posługując się chemiczno-migowym „językiem”? Tak, mrówki potrafią dać do myślenia."}
               {:title "Jane Goodall"
                :description "To ona odkryła, że szympansy nie są wegetarianami, ale organizują polowania. Że potrafią być okrutne i podłe. Że przypominają nas dużo bardziej, niż moglibyśmy przypuszczać. Rewolucja w prymatologii to jej wyłączna zasługa."
                :places [{:country "Tanzania" :region "Park Narodowy Gombe" :coords [-4.67 29.63]}]}
               {:title "Żywy towar"
                :description "Pantery śnieżne, tygrysy, ginące ptaki i gady. Rzadkie okazy dzikich zwierząt mogą kosztować nawet 100 tys. dolarów. Nic dziwnego, że taka kryjąca się w lesie fortuna kusi."}
               {:title "Wielka Rafa Koralowa"
                :description "Australijski szelf zdobi gigantyczna, ciągnąca się przez 2300 km, oszałamiająca żywa konstrukcja. Zmiany klimatu sprawiły, że rafa walczy dziś o przetrwanie. I nie wystarczy kibicować. Musimy jej pomóc."
                :places [{:country "Australia" :region "Wielka Rafa Koralowa" :coords [-19.34 148.63]}]}]}
   {:year 2011 :month 4 :vol 139
    :articles [{:title "Wywiad"
                :description "Wywiad z etnologiem Robertem Andrzejem Dulem – o tym, jak chronić to, co ulotne, czyli niematerialne dziedzictwo człowieka z listy UNESCO."}
               {:title "Inkowie"
                :description "Ci Rzymianie Andów swoje górskie imperium stworzyli dzięki budowie dróg i geniuszowi organizacyjnemu. Mocarstwa, jakiego nie widział kontynent, nie byłoby jednak bez korzystnych zmian klimatu."
                :places [{:country "Peru" :city "Cuzco" :coords [-13.53 -71.95]}]}
               {:title "Polskie żaby"
                :description "Wydają się stworzeniami najpospolitszymi z możliwych. Tymczasem niektóre ich cechy naprawdę potrafią zaskoczyć. "
                :places [{:country "Polska"}]}
               {:title "Nyiragongo"
                :description "Milionowe miasto Goma leży u stóp aktywnego wulkanu, w rejonie pełnym plujących lawą szczelin, obok jeziora absorbującego toksyczne gazy. Życie w takim sąsiedztwie podnosi poziom adrenaliny."
                :places [{:country "Demokratyczna Republika Konga" :city "Goma" :coords [-1.527546 29.249660]}]}
               {:title "Krym"
                :description "Półwysep wdzierający się w Morze Czarne z powodu swej tragicznej historii ma kłopoty z tożsamością. Na ile jest tatarski, na ile ukraiński, na ile rosyjski? Dziedzictwo Związku Radzieckiego nie daje tu o sobie zapomnieć."
                :places [{:country "Ukraina" :region "Krym" :coords [45.3 34.4]}]}
               {:title "Walenie"
                :description "Wielkie morskie ssaki wywodzą się od... zwierząt kopytnych, które wchodziły do wody coraz dalej i dalej, aż straciły kontakt z lądem. Świetnie zachowane dowody ich ewolucji odkopywane są dzisiaj w pustynnej egipskiej dolinie."}
               {:title "Złoty czworokąt"
                :description "Gigantyczny drogowy projekt łączący największe miasta dał Indiom rozwój i zmniejszenie nierówności. W przeludnionym kraju, w którym ziemia jest na wagę złota, oznaczał też jednak wiele krzywd i konfliktów."
                :places [{:country "Indie"}]}]}
   {:year 2011 :month 3 :vol 138
    :articles [{:title "Wywiad"
                :description "Wywiad z Jolantą Sierakowską-Dyndo o kobietach w świecie islamu. Na przykład o tym, dlaczego rozwód bywa dla nich dobrym interesem."}
               {:title "Zawoalowany sprzeciw"
                :description "Trzy dekady wojny, bieda, plemienne obyczaje. Rzeczywistość Afganistanu – trudna dla wszystkich – okrutna jest zwłaszcza dla kobiet."
                :places [{:country "Afganistan"}]}
               {:title "Mosuo"
                :description "Małżeństwo się nie sprawdza. Tak przynajmniej twierdzi lud Mosuo, w którym to kobiety dzierżą władzę i wybierają sobie dowolną liczbę partnerów."
                :places [{:country "Chiny" :region "Jezioro Lugu" :coords [27.7 100.8]}]}
               {:title "Skłodowska-Curie"
                :description "Uczona o niezwykłych: sile woli, umyśle, osobowości. Jej noblowskiego dubletu nie powtórzyła żadna kobieta w ponadstuletniej historii nagrody. "}
               {:title "Różowy gang"
                :description "Bambusowy kij i różowe sari i to strój członkiń tej armii. Sprawiedliwości szukają poza strukturami państwa – czasem tylko napiętnują winowajcę, czasem w ruch idą kije."
                :tags ["Gulabi Gang`"]
                :places [{:country "Indie" :region "Uttar Prades"}]}
               {:title "Węgorze"
                :description "Ryby inne niż wszystkie. Wystarczy powiedzieć, że potrafią wypełznąć na brzeg, żeby podjeść wyłożoną tam karmę dla psów."}
               {:title "Tragarze pyłku"
                :description "Ponad 200 tysięcy gatunków stworzeń zapyla ziemskie kwiaty. Od ich pracowitości zależy ogromna część żywności, jaką dysponujemy."}
               {:title "Jiuzhaigou"
                :description "Wizyta w miejscu, w którym Chińczycy z gigantycznych miast mogą poczuć mistyczne piękno dzikiej przyrody."
                :places [{:country "Chiny" :region "Rezerwat Przyrody Jiuzhaigou" :coords [33.3 103.9]}]}]}
   {:year 2011 :month 2 :vol 137
    :articles [{:title "Wywiad"
                :description "Wywiad z Assumptą Mugiranezą z Rwandy – o mechanizmach ludobójstwa, związaną z nim traumą i trudnym powrocie do wspólnego życia morderców i niedoszłych ofiar."}
               {:title "Bahamy"
                :description "Podwodne błękitne dziury niektórymi parametrami środowiska przypominają warunki w kosmosie. Dostępu do nich bronią potężne wiry i zasłony z trujących gazów."
                :places [{:country "Bahamy" :coords [24.4,-78]}]}
               {:title "Historia pióra"
                :description "Po co były dinozaurom pióra? I jakie miały kolory? Powstały jako ewolucji pomysł na latanie, czy też odkryła je „przypadkiem”?"}
               {:title "Polscy podróżnicy"
                :description "Dwaj przyjaciele, słoik ogórków i marzenia o wyprawie dookoła świata. W latach 20. XX w. Tadeusz Perkitny i Leon Mroczkiewicz rzucili wyzwanie wielkiej przygodzie."}
               {:title "Wojny opiumowe"
                :description "Afganistan makiem stoi. Potrzebują go talibowie, potrzebują biedni rolnicy. Jak zwalczyć to narkotyczne uzależnienie?"
                :places [{:country "Afganistan"}]}
               {:title "Łabędzie"
                :description "Podobno ładnym jest w życiu lepiej. Te wielkie ptaki – pełne dostojnej gracji na wodzie i majestatyczne w powietrzu – łatwego losu jednak nie mają."}
               {:title "Paryż"
                :description "Nietypowy spacer pod bulwarami francuskiej stolicy – wśród milionów kości, sztab złota, przez barwne azyle katafilów."
                :places [{:country "Francja" :city "Paryż" :coords [48.866667 2.35]}]}
               {:title "Z morza na talerze"
                :description "Ludzkość łowi dziś wszystko i wszędzie, gdzie się da. A dla równowagi ekologicznej ważne jest nie tylko ile, ale też jakie ryby jemy."}]}
   {:year 2011 :month 1 :vol 136
    :articles [{:title "Wywiad"
                :description "Wywiad z dr. hab. Piotrem Gawrysiakiem o tym, jak ważna jest archiwizacja danych w erze cyfrowej, oraz o problemach dostępu do informacji."}
               {:title "Muszelki"
                :description "Przez kilka wieków zachodnia Afryka używała specyficznej wapiennej waluty. Niewolnicę można było kupić za 50 tys. muszli."
                :places [{:region "Afryka"}]}
               {:title "Wojny z zarazą"
                :description "Przez pewien czas łudziliśmy się, że mamy je pod kontrolą. Szybko jednak dowiodły, że wciąż trzymają nas w śmiertelnym szachu."
                :tags ["hantawirus" "grypa" "hiv" "aids" "gruźlica" "malaria" "odra"]}
               {:title "Timbuktu"
                :description "Poruszanie się po okolicy bez talizmanów kupionych u marabuta miejscowi nazwą lekkomyślnością. Cóż dopiero przejście żołnierza z Zachodu na islam z powodu miłości do dziewczyny. Czy ta historia mogła skończyć się dobrze?"
                :places [{:country "Mali" :city "Timbuktu" :coords [16.77 -3.0]}]}
               {:title "Bioko"
                :description "Ta wyspa jest zdumiewająco bogatym siedliskiem wielu gatunków małp. Jak to się stało, że – inaczej niż w innych miejscach w Afryce – przetrwały w niezłej formie?"
                :places [{:country "Gwinea Równikowa" :region "Bioko" :coords [3.5 8.7]}]}
               {:title "Cahokia"
                :description "Czerwonoskóre mieszczuchy na amerykańskich preriach na długo przed przybyciem białych? Ten obraz tak kłócił się z powszechnymi wyobrażeniami, że długo nie docierał do opinii publicznej."
                :places [{:country "USA" :region "Illinois" :city "St. Louis" :coords [38.653604 -90.064525]}]}
               {:title "Georgia Południowa"
                :description "Wyspa zdołała się odrodzić mimo rzezi, jaką tutejszej faunie urządził człowiek. Dziś jej wielotysięczne kolonie przywodzą na myśl świat w stanie pierwotnym."
                :places [{:country "Wielka Brytania" :region "Georgia Południowa" :coords [-54.3 -36.7]}]}]}
    #_{:year 2010 :month 12 :vol 135
     :articles [{:title "Wywiad"
                 :description "Wywiad z archeologiem Andrzejem Pydynem, który opowiada o tym, jak szuka się skarbów kultury pod wodą, a także co można tam znaleźć."}
                {:title "Aztekowie"
                 :description " Ich imperium spływało krwią i opinia ta nie jest jedynie czarnym PR-em konkwistadorów. Azteckie bóstwa domagały się ofiar z ludzi, więc zdobywanie jeńców było w istocie nakazem religijnym. Do czego doprowadziło to okrucieństwo bogów?"
                 :places [{:country "Meksyk" :city "Meksyk" :coords [19.4321 -99.1331]}]}
                #_{:title "Kostka "}]}
   {:year 2010 :month 6 :vol 129
    :articles [{:title "Bronisław Malinowski"
                :description "Dzienniki nie pozostawiają wątpliwości: ten gigant antropologii, badacz tubylczego seksu, miał paskudny charakter. Mimo to zdołał wejść między „dzikich” i wykazać, że człowiek cywilizowany niewiele się od nich różni."
                :places [{:tags ["melanezja"] :coords [-7 131]}]}
               {:title "Las Foja"
                :description "Nowogwinejskie góry wystające ponad porośnięte dżunglą równiny są jak dziewicze wyspy. Badacze, którzy tam dotarli jako pierwsi, mogli się poczuć niczym XIX-wieczni odkrywcy nowych ziem i gatunków zwierząt."
                :places [{:country "Indonezja" :tags ["Góry Foja"] :coords [-2.6 139.083333]}]}
               {:title "Sen"
                :description "Człowiek bez snu żyć nie może, choć nauka wciąż nie potrafi wyjaśnić, do czego tak naprawdę jest mu potrzebny. Co więcej, bezsenność staje się cywilizacyjną plagą. Badania nad snem mają zatem kolosalną przyszłość."}
               {:title "Grenlandia"
                :description "Ogromna wyspa przykryta lądolodem długo była niegościnna i jałowa. Globalne ocieplenie zmienia jednak sytuację, a mieszkańcy patrzą na ten proces z nadzieją. Czy Grenlandia, zgodnie z nazwą, zazieleni się?"
                :places [{:country "Grenlandia" :coords [72 -40]}]}
               {:title "St. Helens"
                :description "Wulkan, który eksplodował w 1980 r., zniszczył życie na 600 km2, ale zarazemstworzył ogromne laboratorium, gdzie naukowcy mogą obserwować procesy odbudowy zniszczonych ekosystemów."
                :places [{:country "USA" :tags ["Washington"] :coords [46.1912 -122.1944]}]}
               {:title "Energia słoneczna"
                :description "Słońce wysyła na Ziemię miliony razy więcej energii, niż nam potrzeba. Opracowanie technologii skutecznego jej chwytania oznacza więc niewyczerpane, czyste źródło darmowego prądu."}]}
   {:year 2010 :month 5 :vol 128
    :articles [{:title "Bionika"
                :description "Proteza ręki reagująca na sygnały płynące z mózgu całkiem jak prawdziwa? Tak, to już możliwe. Co zatem czeka nas w niedalekiej przyszłości? Jakie „techniczne zamienniki” naszych układów możemy wyprodukować?"}
               {:title "Herbaciany szlak"
                :description "Przez tysiąc lat herbata z Syczuanu wędrowała do Tybetu na grzbietach mułów i tragarzy. Setki kilometrów wąskim szlakiem wiodącym przez górskie przełęcze. Co dziś pozostało po starej handlowej drodze?"
                :places [{:country "Chiny" :city "Lhasa" :tags ["Tybet"] :coords [29.621177 91.177558]}
                         {:country "Chiny" :city "Ya'an" :coords [29.989022 103.012993]}]}
               {:title "Zimorodki"
                :description "Ten oszałamiającymi barwami ptak jest w naszym umiarkowanym klimacie niczym tchnienie tropików. Szybki jak błyskawica, żyje intensywnie. Skrzydlaty błękitny rybak na pewno was zachwyci."}
               {:title "Meksyk"
                :description "Rzeczywistość kraju wstrząsanego krwawymi ekscesami narkotykowych karteli bywa trudna do zniesienia. Ludzie pociechy szukają więc w osobliwych kultach – Świętej Śmierci lub bandytów-Robin Hoodów."
                :places [{:country "Meksyk"}]}
               {:title "Ptolemais"
                :description "Polscy archeolodzy od lat odkopują starożytne miasto w Libii. Zachowane równie dobrze jak Pompeje, pozwala nam poznać codzienne życie w rzymskim imperium."
                :places [{:country "Libia" :city "Ptolemais" :coords [32.705789 20.953973]}]}
               {:title "Libia"
                :description "Były okresy, gdy Sahara się zieleniła. Wraz z deszczami pojawiała się roślinność, a wraz z nią – zwierzęta i ludzie. Być może tym korytarzem człowiek kolonizował świat. Zajrzyjmy więc do kroniki pustyni."
                :places [{:country "Libia"}]}]}
   {:year 2010 :month 4 :vol 127
    :articles [{:title "Woda życia"
                :description "Zasoby H2O krążącej w ziemskich ekosystemach teoretycznie zawsze są takie same. Tyle że potrzeby ludzkości rosną, a dostęp do wody przestał być oczywisty. Żeby uporać się z tym problemem, musimy zacząć traktować wodę jak dobro wspólne."}
               {:title "Topnienie Tybetu"
                :description "Jangcy, Mekong, Ganges, Huang He – największe rzeki Azji, gaszące pragnienie setek milionów ludzi, biorą początek na Dachu Świata, a zasilają je wody z tamtejszych lodowców. Co się stanie, gdy tybetańskie wieczne lody stopnieją?"
                :places [{:country "Chiny" :tags ["Tybet" "Wyżyna Tybetańska"]}]}
               {:title "Święte wody"
                :description "Rzeki, mające swój początek i rozpływające się w oceanie, symbolizują przemijanie, wędrówkę, życiową drogę. Woda przenika wszystko, co żyje. Nic zatem dziwnego, że w wielu kulturach wody rzek trafiły do sfery sacrum."
                :places [{:country "Meksyk" :tags ["studnia xkeken" "jukatan"] :coords [20.660792 -88.242748]}
                         {:country "Laos" :tags ["mekong"]}
                         {:country "Indie" :city "Haridwar" :tags ["święto ganga dussehra" "hinduizm"] :coords [29.943021 78.163676]}
                         {:country "Francja" :city "Lourdes" :coords [43.1 -0.05]}
                         {:country "Turcja" :city "Istambuł" :tags ["meczet beyazit"] :coords [41.010207 28.965253]}]}
               {:title "Etiopia"
                :description "W wielu rejonach biednych, trapionych suszą krajów najbardziej pracochłonnym zajęciem kobiet i dziewcząt jest... zapewnienie rodzinie wody. Na inną aktywność nie mają już czasu. Dlatego wydajna studnia w takiej społeczności to rewolucja."
                :places [{:country "Etiopia"}
                         {:country "Kenia"}]}
               {:title "Cisza strumieni"
                :description "Słodkie wody są siedliskiem życia niewiarygodnej liczby gatunków żywych stworzeń. Człowiek, zanieczyszczając wody bez opamiętania, zabija w nich życie, eksterminując, czasami bezwiednie, całe gatunki."}
               {:title "Jordan"
                :description "Z potężnej rzeki, w której wodach ochrzcił się Chrystus, pozostał ściek. Transgraniczny Jordan w suchym, skonfliktowanym regionie świata jest obiektem rywalizacji, narzędziem presji, ale też symbolem konieczności porozumienia."
                :places [{:country "Izrael" :tags ["jezioro galilejskie"] :coords [32.808655 35.586966]}
                         {:country "Jordan"}]}]}
   {:year 2010 :month 3 :vol 126
    :articles [{:title "Nazca"
                :description "Ogromne rysunki na peruwiańskiej pustyni długo były tak tajemnicze, że ich autorstwo chętnie przypisywano kosmitom. Okazuje się jednak, że pochodzenie rytów można racjonalnie wyjaśnić."
                :places [{:country "Peru" :coords [-14.742139 -75.128758]}]}
               {:title "Rośliny mięsożerne"
                :description "Kwiat zastawiający pułapkę na owada, a potem rozkładający go na substancje pokarmowe, wydaje się zjawiskiem przeczącym porządkowi natury. I właśnie dlatego jest ono tak fascynujące."}
               {:title "Szanghaj"
                :description "Chiny przygotowują się do objęcia roli największego supermocarstwa. A Szanghaj zamierza być tej potęgi najważniejszą metropolią."
                :places [{:country "Chiny" :city "Szanghaj" :coords [31.2 121.4]}]}
               {:title "Szympansy"
                :description "Są jeszcze na świecie (a przynajmniej były do niedawna) wielkie małpy, które nigdy nie widziały człowieka. Co odkryli prymatolodzy, którzy się na nie natknęli?"
                :places [{:country "Kongo" :tags ["trójkąt goualougo" "park narodowy nouabale-ndoki"] :coords [2.16 16.51]}]}
               {:title "Góra Waszyngtona"
                :description "Nie jest przesadnie wysoka, ale wietrzna jak diabli. Średnio 120 dni w roku powyżej progowej prędkości huraganu – to robi wrażenie!"
                :places [{:country "USA" :tags ["new hampshire"] :coords [44.270531 -71.303395]}]}
               {:title "Dystrykt mody"
                :description "Nowojorskie fabryki odzieży ubierały kiedyś całe Stany Zjednoczone, dając zatrudnienie milionom emigrantów. Dziś modowy przemysł, jeden z symboli miasta, usiłuje sprostać wyzwaniom globalizacji."
                :places [{:country "USA" :city "Nowy Jork" :tags ["manhattan"] :coords [40.753617 -73.992429]}]}]}
   {:year 2010 :month 2 :vol 125
    :articles [{:title "Poligamia"
                :description "Mormońska sekta na amerykańskim Zachodzie wciąż praktykuje – nielegalną w Stanach – poligamię. Co sprawia, że mimo nacisków otoczenia fundamentaliści utrzymują trwałość swoich ogromnych „niebiańskich rodzin”?"
                 :tags ["Fundamentalistyczny Kościół Jezusa Chrystusa Świętych w Dniach Ostatnich" "FLDS"]
                 :places [{:country "USA" :city "Hildale" :tags ["Utah"] :coords [37.00 -112.97]}
                         {:country "USA" :city "Colorado City" :tags ["Arizona"] :coords [36.99 -112.98]}
                         {:country "USA" :city "Pony Springs" :tags ["Nevada"] :coords [39.981572 -115.169210]}]}
               {:title "Pacyficzny łosoś"
                :description "Te ryby pokonują tysiące kilometrów, by wrócić do znajomej rzeki, złożyć tam ikrę i... zginąć. Kłusownicy zabijają je, nim wypełnią tę misję."
                :places [{:country "Rosja" :tags ["półwysep kamczacki" "kamczatka"] :coords [53.06 158.47]}]}
               {:title "Wrak"
                :description "Przed wiekami wyładowany złotem okręt w drodze po bogactwa Indii rozbił się o skały wybrzeża diamentów. Jakby dla ilustracji tezy, że życie bywa przewrotne."
                :places [{:country "Nambia" :tags ["park narodowy sperrgebiet"] :coords [-28.37 16.1]}]}
               {:title "Hubble"
                :description "Zasłużony (i wysłużony) kosmiczny teleskop przeszedł gruntowny remont i teraz widzi ostrzej, niż kiedykolwiek przedtem."}
               {:title "Licheń"
                :description "Największa konkurencja dla Częstochowy jest sanktuarium nowego typu. To kombinat, w którym potrzeby religijne mieszają się z turystyczno-rozrywkowymi."
                :places [{:country "Polska" :city "Licheń" :coords [52.321843 18.356509]}]}
               {:title "Podziemia USA"
                :description "Amerykańskie stany Tennessee, Alabama i Georgia są podziurawione jak sito. Kilkanaście tysięcy jaskiń tworzy raj dla speleologów."
                :places [{:country "USA" :tags ["jaskinia rumblings falls" "tennessee"] :coords [35.73 -85.41]}
                         {:country "USA" :tags ["jaskinia iron hoop" "alabama"] :coords [34.916940 -86.031670]}
                         {:country "USA" :tags ["jaskinia stephens gap" "alabama"] :coords [34.670629 -86.217744]}
                         {:country "USA" :tags ["jaskinia sub-solomon" "tennessee"] :coords [35.22750000 -85.95111111]}
                         {:country "USA" :tags ["jaskinia thunder hole" "alabama"]}
                         {:country "USA" :tags ["jaskinia ellison's" "georgia"] :coords [34.664927 -85.363722]}]}]}])
