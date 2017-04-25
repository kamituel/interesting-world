(ns kamituel.ngm-toc.db
  "")


;; TODO: gdzie jest miasto, dodać też kraj.
;; TODO: jak są dziwne znaki, np. Ciuárez, to wyszukiwać po polskim "a".

(def ngm
  [{:year 2017 :month 4 :vol 211
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
                :places [{:country "Tajlandia" :coords [-1.516472 -74.038972]}]}
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
                :description "Nawet za pomocą mikroskopu niełatwo spojrzeć owadowi w oczy, zwłaszcza że niektóre mogą ich mieć, powiedzmy, ośmioro. Ale zdecydowanie warto im się przyjrzeć, bo są to prawdziwe cuda ewolucji."}]}])
