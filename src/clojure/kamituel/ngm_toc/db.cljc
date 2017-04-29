(ns kamituel.ngm-toc.db
  "")


;; TODO: gdzie jest miasto, dodać też kraj.
;; TODO: jak są dziwne znaki, np. Ciuárez, to wyszukiwać po polskim "a".

(def ngm
  [{:year 2017 :month 5 :vol 212
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
   {:year 2017 :month 4 :vol 211
   :articles [{:title "Rewolucja w DNA"
               :description "Władzę nad światem natury, dzięki metodzie szybkiego wprowadzania zaprojektowanych zmian w genomie do całej populacji gatunku, mamy na wyciągnięcie ręki. Rzecz w tym, że prób niebywałego postępu w leczeniu chorób może też przynieść skutki, których nawet nie jesteśmy w stanie przewidzieć."}
              {:title "Zmiany klimatu"
               :description "Na Ziemi jest już 7 mld ludzi i wszyscy chcą korzystać z dobrodziejstw cywilizacji. Dlatego potrzebujemy ogromnych ilości energii, a jej pozyskiwanie najbardziej zmienia nasz klimat. Wielu ludzi wątpi w realność tego problemu, ale to nie jest żaden naukowy spisek. Czy tego chce, czy nie, ludzkość czeka radykalne przeorganizowanie sposobu życia."}
              {:title "Życie po ISIS"
               :description "Państwo Islamskie, które opanowało znaczne obszary pogrążonego w powojennym chaosie Iraku, teraz cofa się pod naporem międzynarodowej koalicji. Pozostawia po sobie obrazy szalonej, brutalnej destrukcji, która - co najdziwniejsze - dotyka nie tylko przeciwników ISIS, ale także jego zwolenników."
               :places [{:country "Syria" :coords [36.34 43.13]}
                        {:country "Irak" :coords [35.95 39.0167]}]}
              {:title "Łąki krwiawiących serc"
               :description "Dżelady - jedyne na świecie trawożerne małpy - mają się nieźle na sawannach regionu Menz-Guassa w Etopii. Jak ten bogaty ekosystem przetrwał w drugim pod względem populacji kraju w Afryce, zaorującym wciąż nowe grunty? Dzięki niezwykłej wielowiekowej umowie społecznej."
               :places [{:country "Etiopia" :coords [10.342222 39.762778]}]}
              {:title "Modele chaosu"
               :description "Jak wyglądałyby nasze miasta po kataklizmie, który unicestwiłby ludzkość? Jak natura brałaby je we władanie? Lori Nix i Kathleen Gerber próbują to pokazać w swoich zminiaturyzowanych dioramach będących połączeniem poglądowych makiet i dzieł sztuki."}]}
   {:year 2017 :month 3 :vol 210
   :articles [{:title "Wikingowie"
               :description "Wojownicy, grabieżcy, kupcy, odkrywcy, dandysi. Nie ma jednej prawdy o wikingach, a co pewien czas dowiadujemy się o nich czegoś nowego. I może dlatego ci nieustraszeni mieszkańcy północnych krain Europy tak dobrze zadomowili się w zbiorowej wyobraźni."}
              {:title "Świat dziewcząt"
               :description "Są kraje, w których bycie dziewczynką oznacza konieczność poddania się okrutnym tradycjom i nie mniej okrutnej społecznej rzeczywistości. W Sierra Leone dziewczęce marzenia są skromniejsze niż gdzie indziej."
               :places [{:country "Sierra Leone" :coords [8.5 -11.5]}
                        {:country "Indie" :coords [21 77]}]}
              {:title "Mam 9 lat"
               :description "Dzieci z różnych części świata opowiadają, jak widzą swoją przyszłość – szczerze, bo nie ulegają jeszcze, jak nastolatki, autocenzurze, żeby dostosować się do innych."}
              {:title "Morze sporów"
               :description "Azjatyckie morze, wokół którego leży wiele ludnych krajów, w tym potężne Chiny, jest źródłem cennych zasobów, ale też konfliktów. Każdy chciałby wyszarpnąć jak najwięcej dla siebie.Środowiskiem nie przejmuje się nikt."
               :places [{:region "Morze Południowochińskie" :coords [12 113]}]}
              {:title "Puszcza dla irokeza"
               :description "Dzięki zaskakującej internetowej sławie pewnego makaka czubatego imieniem Naruto cały gatunek na chwilę skupił na sobie uwagę. Być może dzięki takiemu rozwojowi wypadków widoki na ocalenie tych małp są nieco lepsze."
               :places [{:country "Indonezja" :coords [1.516667 125.183333]}]}
              {:title "Metropolis"
               :description "Świat urbanizuje się w oszałamiającym tempie i Martin Roemers postanowił pokazać ten proces, a raczej jego skutek. Zrobił więc portrety megamiast – takich, w których żyje ponad 10 mln ludzi. Zobaczcie, jak mogą być różne."
               :places [{:country "Pakistan" :city "Karaczi" :coords [24.86 67.01]}
                        {:country "Francja" :city "Paryż" :coords [48.866667 2.35]}
                        {:country "Japonia" :city "Tokio" :coords [35.683333 139.683333]}
                        {:country "Nigeria" :city "Lagos" :coords [6.455027 3.384082]}
                        {:country "Indie" :city "Kalkuta" :coords [22.566667 88.366667]}]}]}
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
                :places {:country "Chiny" :coords [31.02 103.1]}}
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
                :places {:country "Haiti" :coords [19 -72.416667]}}
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
                :places {:country "Irak" :region "Kurdystan" :coords [36.183333 44]}}
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
                :places {:country "USA"}}
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
                :places [{:region "Antarktyda" :coords [-77.543127 167.180082]}]}]}])
