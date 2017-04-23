(ns kamituel.ngm-toc.db
  "")


;; TODO: gdzie jest miasto, dodać też kraj.
;; TODO: jak są dziwne znaki, np. Ciuárez, to wyszukiwać po polskim "a".

(def ngm
  [{:year 2017 :month 4 :vol 211
   :articles [{:title "Rewolucja w DNA"
               :description "Władzę nad światem natury, dzięki metodzie szybkiego wprowadzania zaprojektowanych zmian w genomie do całej populacji gatunku, mamy na wyciągnięcie ręki. Rzecz w tym, że prób niebywałego postępu w leczeniu chorób może też przynieść skutki, których nawet nie jesteśmy w stanie przewidzieć."
               :coords nil
               :country nil}
              {:title "Zmiany klimatu"
               :description "Na Ziemi jest już 7 mld ludzi i wszyscy chcą korzystać z dobrodziejstw cywilizacji. Dlatego potrzebujemy ogromnych ilości energii, a jej pozyskiwanie najbardziej zmienia nasz klimat. Wielu ludzi wątpi w realność tego problemu, ale to nie jest żaden naukowy spisek. Czy tego chce, czy nie, ludzkość czeka radykalne przeorganizowanie sposobu życia."
               :coords nil
               :country nil}
              {:title "Życie po ISIS"
               :description "Państwo Islamskie, które opanowało znaczne obszary pogrążonego w powojennym chaosie Iraku, teraz cofa się pod naporem międzynarodowej koalicji. Pozostawia po sobie obrazy szalonej, brutalnej destrukcji, która - co najdziwniejsze - dotyka nie tylko przeciwników ISIS, ale także jego zwolenników."
               :coords [[36.34 43.13] [35.95 39.0167]]
               :country ["Syria" "Irak"]}
              {:title "Łąki krwiawiących serc"
               :description "Dżelady - jedyne na świecie trawożerne małpy - mają się nieźle na sawannach regionu Menz-Guassa w Etopii. Jak ten bogaty ekosystem przetrwał w drugim pod względem populacji kraju w Afryce, zaorującym wciąż nowe grunty? Dzięki niezwykłej wielowiekowej umowie społecznej."
               :coords [[10.342222 39.762778]]
               :country ["Etiopia"]}
              {:title "Modele chaosu"
               :description "Jak wyglądałyby nasze miasta po kataklizmie, który unicestwiłby ludzkość? Jak natura brałaby je we władanie? Lori Nix i Kathleen Gerber próbują to pokazać w swoich zminiaturyzowanych dioramach będących połączeniem poglądowych makiet i dzieł sztuki."
               :coords nil
               :country nil}]}
   {:year 2017 :month 3 :vol 210
   :articles [{:title "Wikingowie"
               :description "Wojownicy, grabieżcy, kupcy, odkrywcy, dandysi. Nie ma jednej prawdy o wikingach, a co pewien czas dowiadujemy się o nich czegoś nowego. I może dlatego ci nieustraszeni mieszkańcy północnych krain Europy tak dobrze zadomowili się w zbiorowej wyobraźni."
               :coords nil
               :country nil}
              {:title "Świat dziewcząt"
               :description "Są kraje, w których bycie dziewczynką oznacza konieczność poddania się okrutnym tradycjom i nie mniej okrutnej społecznej rzeczywistości. W Sierra Leone dziewczęce marzenia są skromniejsze niż gdzie indziej."
               :coords [[8.5 -11.5] [21 77]]
               :country ["Sierra Leone" "Indie"]}
              {:title "Mam 9 lat"
               :description "Dzieci z różnych części świata opowiadają, jak widzą swoją przyszłość – szczerze, bo nie ulegają jeszcze, jak nastolatki, autocenzurze, żeby dostosować się do innych."
               :coords nil
               :country nil}
              {:title "Morze sporów"
               :description "Azjatyckie morze, wokół którego leży wiele ludnych krajów, w tym potężne Chiny, jest źródłem cennych zasobów, ale też konfliktów. Każdy chciałby wyszarpnąć jak najwięcej dla siebie.Środowiskiem nie przejmuje się nikt."
               :coords [[12 113]]
               :region ["Morze Południowochińskie"]}
              {:title "Puszcza dla irokeza"
               :description "Dzięki zaskakującej internetowej sławie pewnego makaka czubatego imieniem Naruto cały gatunek na chwilę skupił na sobie uwagę. Być może dzięki takiemu rozwojowi wypadków widoki na ocalenie tych małp są nieco lepsze."
               :coords [[1.516667 125.183333]]
               :country ["Indonezja"]}
              {:title "Metropolis"
               :description "Świat urbanizuje się w oszałamiającym tempie i Martin Roemers postanowił pokazać ten proces, a raczej jego skutek. Zrobił więc portrety megamiast – takich, w których żyje ponad 10 mln ludzi. Zobaczcie, jak mogą być różne."
               :coords [[24.86 67.01] [48.866667 2.35] [35.683333 139.683333] [6.455027 3.384082] [22.566667 88.366667]]
               :city ["Karaczi" "Paryż" "Tokio" "Lagos" "Kalkuta"]
               :country ["Pakistan" "Francja" "Japonia" "Nigeria" "Indie"]}]}
   {:year 2017 :month 2 :vol 209
   :articles [{:title "Pił sobie człowiek"
               :description "Alkohol jest jednym z najbardziej uniwersalnych produktów w całej historii człowieka. I jakkolwiek kontrowersyjnie by to zabrzmiało - w pewnym sensie nas uformował."
               :coords nil
               :country nil}
              {:title "Jak zostać mężczyzną"
               :description "Dawne kultury ułatwiały przejście od wieku chłopięcego do męskiego, oferując młodemu człowiekowi odwieczne rytuały. Dziś musi on zmierzyć się z tym wyzwaniem sam."
               :coords nil
               :country nil}
              {:title "Martwe za życia"
               :description "Wdowy w niektórych społeczeństwach mają status szczególny. I nie chodzi tu wcale o uprzywilejowanie, ale uznanie za 'pechowe' i zepchnięcie na margines."
               :coords nil
               :country nil}
              {:title "Koty wychodzą z cienia"
               :description "Oprócz lwów, tygrysów i pum na świecie żyje wiele gatunków małych dzikich kotów. Poznaliśmy je dość słabo, choć wcale nie dlatego, że nie są interesujące."
               :coords nil
               :country nil}
              {:title "Współczesna Amazonia"
               :description "W tropikalnej puszczy plemienne sposoby życia w dużej mierze są już tylko wspomnieniem. Powab nowoczesności także tam trudno jest zignorować, zwłaszcza że wielu dzisiejszych mieszkańców to ludność napływowa."
               :coords [[-1.516472 -74.038972]]
               :country ["Ekwador"]}]}
   {:year 2017 :month 1 :vol 208
    :articles [{:title "Gender"
                :description "Termin 'gender' w naszym kraju budzi emocje. W centrum sporu znajduje się pytanie, czy problemy z tożsamością płciową to kwestia natury, czy kultury. Jak widzi to nauka? Poniżej Mandy z Samoa - fa'alafine, czyli przedstawicielka tamtejszej trzeciej płci."
                :coords nil
                :country nil}
               {:title "Duch ponad materią"
                :description "To, w co wierzysz, twoje myśli i przekonania, potrafią bezpośrednio przekładać się na stan twojego ciała. Nawet jeśli jest to tylko wiara w medycynę."
                :coords nil
                :country nil}
               {:title "Przybysz z innej planety"
                :description "Trwająca blisko cztery lata 'rodzinna podróż Tony'ego Halika przez obie Ameryki przyniosła mu rozgłos i uznanie podróżników. Dziś takich wypraw już nie ma."
                :coords nil
                :country nil}
               {:title "Śmierć ojca"
                :description "Panujący przez 70 lat król Tajlandii był dla mieszkańców tego kraju 'odwieczny'. Śmierć chodzącej doskonałości, władcy o boskim statusie, rodzi jednak problemy, bo jak może go zastąpić zwykły śmiertelnik?"
                :coords [[13.75 100.516667]]
                :country ["Tajlandia"]}
               {:title "Batalia o Wirungę"
                :description "Wirunga to prawdziwa perła natury Czarnego Lądu. Ale ochrona dzikiej przyrody w chaosie aftykańskiego jądra ciemności jest zadaniem dla straceńców."
                :coords [[-0.91667 29.16667]]
                :country ["Demokratyczna Republika Konga"]}]}
   {:year 2016 :month 12 :vol 207
    :articles [{:title "Cienie wątpliwości"
                :description "Techniki kryminalistyczne to bardziej rzemiosło niż nauka. Wielu niewinnych posłały za kraty lub na tamten świat."
                :coords nil
                :country nil}
               {:title "Generacja Putina"
                :description "Młodzi Rosjanie, jak ci, którzy świętują koniec roku szkolnego, dorastali w czasach rządów Władimira Putina. Jacy są, jakiej Rosji chcą i dokąd zaprowadzą swój kraj?"
                :coords nil
                :country nil}
               {:title "Polarny dryf"
                :description "W kolektywnym radzieckim społeczeństwie sukcesy nauki brały się z hartu i pasji wybitnych indywidualistów."
                :coords nil
                :country nil}
               {:title "Na cienkiej gałęzi"
                :description "Orangutany z pierwotnych puszcz dopiero od niedawna, m.in. dzięki dronom, zaczynamy naprawdę poznawać."
                :coords [[0 102] [1 114]]
                :country ["Sumatra" "Borneo"]}
               {:title "Zakonnice z Meksyku"
                :description "Zrytualizowane życie za klasztornym murem dla ludzi postronnych jest dość tajemnicze i budzi trudną do zaspokojenia ciekawość. Ale od czego są fotografowie?"
                :coords [[19.063333 -98.306389]]
                :country ["Meksyk"]}]}
   {:year 2016 :month 11 :vol 206
    :articles [{:title "Rozmowa NG"
                :description "Wywiad z Piotrem Pogonem, który umierał cztery razy, a mimo to, a może właśnie dlatego, zdołał pomóc wielu ludziom. "
                :coords nil
                :country nil}
               {:title "Mars dla Ziemian"
                :description "Czy i kiedy polecimy na Marsa? I czy może on stanowić alternatywę dla Ziemi po możliwej katastrofie?"
                :coords nil
                :country nil}
               {:title "Polski jaskiniowy rekord"
                :description "Rzecz o człowieku, który się zawziął, i jaskini, która w końcu uległa."
                :coords [[49.532 17.750778]]
                :country ["Czechy"]}
               {:title "Po drugiej stronie życia"
                :description "Teoretycznie zza granicy między życiem i śmiercią nie ma powrotu. Okazuje się ona jednak dość płynna."
                :coords nil
                :country nil}
               {:title "Kruchy pokój"
                :description "Rajska Sri Lanka na 26 lat ugrzęzła w wojnie domowej. Dziś konflikt się wypalił, ale rachunki krzywd wciąż czekają na wyrównanie."
                :coords [[7 81]]
                :country ["Sri Lanka"]}
               {:title "Moc ósemki"
                :description "Są trochę jak kosmici, a trochę jak ludzie. Ośmiornice naprawdę potrafią wprawić w zdumienie."
                :coords nil
                :country nil}]}
   {:year 2016 :month 10 :vol 205
    :articles [{:title       "Nowa Europa"
                :description "Największa część fali uchodźców, jaka w 2015 r. stanęła u wrót Europy, przyjęły Niemcy. Jak to znoszą?"
                :coords      [[52.507222 13.145833]]
                :country     ["Niemcy"]}
               {:title       "Tułaczka do Nowej Zelandii"
                :description "W czasie II wojny światowej z ZSRR z armią Andersa wyprowadzono tysiące polskich sierot. Publikujemy fragmenty ich wspomnień."
                :coords      nil
                :country     nil}
               {:title       "Jankeska fala"
                :description "W stosunkach Kuba - USA nastała odwilż. Czy wyspa udźwignie związany z tym ociepleniem najazd?"
                :coords      [[23.133333 -82.383333]]
                :country     ["Kuba"]}
               {:title       "Życie duchowe starożytnych Greków"
                :description "Olimppijskich bogów, z ich przywarami i słabostkami, od ludzi odróżniała tylko nieśmiertelność. Można było więc liczyć, że dadzą się uprosić."
                :coords      [[37.983972 23.727806]]
                :country     ["Grecja"]}
               {:title       "Wilki morskie"
                :description "Wbrew pozorom artykuł poświęcony jest czworonożnym drapieżnikom, tyle że... na morskiej diecie."
                :coords      [[53.742583 -128.707727]]
                :country     ["Kanada"]}
               {:title       "Śnieżne małpy"
                :description "Kąpiące się w gorących źródłach, wśród śniegu - małpy w takich okolicznościach można zobaczyć tylko w Japonii."
                :coords       [[36.732534 138.461934]]
                :country      ["Japonia"]}]}
   {:year 2016 :month 9 :vol 204
    :articles [{:title "Wzrok do poprawki"
                :description "W okulistyce trwa rewolucja. Ale nawet bez niej miliony ludzi za małe pieniądze mogłyby odzyskać wzrok."
                :coords nil
                :country nil}
               {:title "Zobaczyć niewidzialne"
                :description "Jak w życiu codziennym funkcjonują ludzie, którzy nie widzą? Kluczem do odnalezienia się w świecie jest trening i determinacja."
                :coords nil
                :country nil}
               {:title "Kanion Kolorado"
                :description "Ogrom i piękno tego cudu natury w jednych wywołują zachwyty, w innych pokusę zrobienia na nim biznesu."
                :coords [[36.3 -112.6]]
                :country ["USA"]}
               {:title "Imperium królów Węży"
                :description "Opowieść o niezwykłym okresie w cywilizacji Majów."
                :coords [[17.222094 -89.623614] [18.105392 -89.810829]]
                :city ["Tikal" "Calakmul"]}
               {:title "Moda na zabijanie"
                :description "Futra po latach banicji wracają do łask świata mody. Dlaczego tak się dzieje i co to oznacza dla zwierząt?"
                :coords nil
                :country nil}
               {:title "Z dziennika fotografa | Barwy mroku"
                :description ""
                :coords nil
                :country nil}]}
   {:year 2016 :month 8 :vol 203
    :articles [{:title "Sport na dopingu"
                :description "Po co zwalczać doping, skoro to syzyfowa praca? Nie tylko w imię zasad, ale też by sportowe igrzyska nie stały się igrzyskami śmierci."
                :coords nil
                :country nil}
               {:title "Gangi tracą Ciudad Juárez"
                :description "Miasto, w którym trup słał się gęsto, a spacer po parku był ryzykiem, nagle odżyło. Jak do tego doszło? "
                :coords [[31.739444 -106.486944]]
                :city ["Ciudad Juárez"]
                :country ["Meksyk"]}
               {:title "Nauka vs. komary"
                :description "Malaria, zika, denga, żółta febra – tym wszystkim mogą uraczyć człowieka komary. Mimo to na razie nie mamy przeciw nim skutecznej broni. "
                :coords nil
                :country nil}
               {:title "Panda na swoim"
                :description "Mało które duże zwierzę tak bardzo przypomina maskotkę. A już chyba żadne nie budzi takiego entuzjazmu. "
                :coords [[31.02 103.1]]
                :country ["Chiny"]}
               {:title "Rekiny"
                :description "Żarłacze białopłetwe, „oceaniczne szybowce”, były kiedyś tak liczne jak bizony na prerii. Dziś trzeba mieć szczęście, by na nie trafić."
                :coords nil
                :country nil}
               {:title "Sieciowe studio"
                :description "Ptaki sportretowane w sieciach ornitologów – ten fotograficzny projekt ma budzić naszą empatię."
                :coords nil
                :country nil}]}
   {:year 2016 :month 7 :vol 202
    :articles [{:title       "Wywiad z Martinem Caparrosem"
                :description "Reporter zjeździł świat, by zrozumieć, dlaczego tylu ludzi na świecie wciąż nie ma co jeść. Jego 'Głód' oddaje głos najbiedniejszym."
                :coords      nil}
               {:title       "Szaber starożytności"
                :description "Na terenach wielu starych kultur trwa społeczny zamęt. A to sprzyja archeologicznym rabunkom."
                :coords      nil}
               {:title       "Sztuka szukania"
                :description "Wykrywacz metalu to towarzysz coraz większej liczby Polaków przeczeszujących kraj w poszukiwaniu rozmaitych skarbów."
                :coords      nil
                :country     ["Polska"]}
               {:title       "Robinson Cruzoe"
                :description "Postać najsłynniejszego rozbitka świata jest pisarską kreacją, ale miał on pierwowzór z krwi i kości."
                :coords      [[-33.641389 -78.841111]]
                :country     ["Chile"]}
               {:title       "Jaskinie na miarę Chin"
                :description "Na południu Państwa Środka istnieje region z niezwykle spektakularnymi, często dziewiczymi formami krasu."
                :coords      [[25.4 105.9]]
                :country     ["Chiny"]}
               {:title       "Rekiny"
                :description "Żarłacze białe zależnie od perspektywy mogą mieć wygląd głupkowatego błazna lub morderczej bestii."}]}
   {:year 2016 :month 6 :vol 201
    :articles [{:title "Jędrek Bargiel: Człowiek Roku NG"
                :description "Jeśli zjeżdżanie na deskach ze szczytów ośmiotysięczników nie jest szaleństwem, to co nim jest?"
                :coords nil
                :country nil}
               {:title "Indianie Amazonii"
                :description "Choć może trudno w to uwierzyć, w deszczowym lesie żyją jeszcze tzw. plemiona bez kontaktu."
                :coords [[-11.856389 -71.721389]]
                :region ["Park Narodowy Manu"]
                :country ["Peru"]}
               {:title "Haiti od katastrofy do katastrofy"
                :description "Kraj uchodzi za skazany na łaskę możnych. Ale młodzi mieszkańcy chcą widzieć go inaczej. "
                :coords [[19 -72.416667]]
                :country ["Haiti"]}
               {:title "Oko natury"
                :description "Mimo że ewolucja jest ślepa, swoje dzieła potrafiła wyposażyć w doskonały wzrok."
                :coords nil
                :country nil}
               {:title "Filipiny okiem fotografa"
                :description "Próba pokazania życia społecznego przez pryzmat obrazków klatki schodowej to dobry koncept? Zobaczcie sami."
                :coords [[14.583333 121]]
                :country ["Filipiny"]}
               {:title "Rekiny"
                :description "Może i mają reputację krwiożerczych bestii, ale dla ekologicznego zdrowia oceanów są niezbędne."
                :coords nil
                :country nil}]}
   {:year 2016 :month 5 :vol 200
    :articles [{:title "Miasto Jaguara"
                :description "Nieznane ruiny ukryte w tropikalnym lesie? Wydawałoby się, że to tylko fantazja. A jednak..."
                :coords [[14.85 -85.2]]
                :country ["Honduras"]}
               {:title "Skarby dla zuchwałych"
                :description "Troja, Petra, Machu Picchu. Największe odkrycia były dziełem raczej awanturników i obieżyświatów niż naukowców. "
                :coords [[39.9575 26.238889] [30.328611 35.441944] [-13.163333 -72.545556]]
                :city ["Troja" "Petra" "Machu Picchu"]
                :country ["Turcja" "Jordania" "Peru"]}
               {:title "Fatamorgana"
                :description "140 tys. ludzi żyjących w jednym miejscu na pustyni. Prawdziwe miasto, którego nie ma, bo w istocie jest obozem dla uchodźców."
                :coords [[32.295667 36.32375]]
                :country ["Jordania"]
                :city ["Zaatari"]}
               {:title "Kongo"
                :description "Rejs barką po rzece Kongo jest podróżą do geograficznego i mitycznego serca Afryki."
                :coords [[0.047778 18.255833]]
                :country ["Demokratyczna Republika Konga"]
                :city ["Mbandaka"]}
               {:title "Ziemia Franciszka Józefa"
                :description "Pustkowia Arktyki wciąż pozwalają doświadczyć świata, w którym to natura dominuje nad człowiekiem."
                :coords [[80.566667 54.783333]]
                :country ["Rosja"]}
               {:title "Na gruzach utopii"
                :description "Dzieła potęgi ZSRR sfotografowane w śnieżnej bieli są jak metafora postapokaliptycznej przyszłości."
                :coords nil
                :country nil}]}
   {:year 2016 :month 4 :vol 199
    :articles [{:title "56 sekund"
                :description "Jak katastrofalne trzęsienie ziemi zmieniło Nepal. "
                :coords [[28.289976 84.68975]]
                :country ["Nepal"]}
               {:title "Żywe boginie Nepalu"
                :description "Małe dziewczynki jako inkarnacje bogini? Ta barwna religijna tradycja w Himalajach wciąż jest żywa."
                :coords [[27.7 85.333333]]
                :country ["Nepal"]
                :city ["Katmandu"]}
               {:title "Chorobotwórcze mikroby"
                :description "Wydawało się, że mamy je pod kontrolą. Tymczasem, z wielu powodów, w tym naszych zaniedbań, przystąpiły do kontrataku."
                :coords nil
                :country nil}
               {:title "Ziemia duchów"
                :description "Ludobójstwo dokonane sto lat temu w Anatolii to trauma, która wciąż dzieli Ormian i Turków."
                :coords [[39 35]]
                :region ["Anatolia"]
                :country ["Turcja"]}
               {:title "Co do jednego"
                :description "Joel Sartore chce zrobić portrety tylu stworzeniom, ilu zdoła. Ten projekt zajmie mu całe życie."
                :coords nil
                :country nil}
               {:title "Królestwo dziewcząt"
                :description "Matriarchalnych społeczności jest na świecie niewiele. My pokażemy jedną z nich, w Indiach."
                :coords [[25.199722 91.931667]]
                :city ["Mawlynnong"]
                :country ["Indie"]}]}
   {:year 2016 :month 3 :vol 198
    :articles [{:title "Frank Stella"
                :description "Najbardziej wpływowy artysta USA. Kontrowersyjny, ale chętnie wystawiany i kupowany. Zainspirował się pewną polską książką."
                :coords nil
                :country nil}
               {:title "Śmietnik suto zastawiony"
                :description "Z jednej strony miliony ludzi nie dojada. Z drugiej - świat marnuje co trzecią wytworzoną tonę żywności."
                :coords nil
                :country nil}
               {:title "Ten drugi Irak"
                :description "Kurdowie, próbując wywalczyć sobie państwo, muszą się mierzyć z siłami brutalnych islamistów z ISIS."
                :coords [[36.183333 44]]
                :country ["Irak"]
                :region ["Kurdystan"]}
               {:title "Akrtyczna gorączka"
                :description "Arktyka skrywa pokłady cennych surowców. Kilka państw podjęło już wyścig po te skarby."
                :coords nil
                :country nil}
               {:title "Kolor nieskończoności"
                :description "Jest na świecie kilka miejsc, gdzie w architektonicznym pejzażu dominuje błękit. Powody tych skłonności bywają zaskakujące."
                :coords [[35.171389 -5.269722] [26.28 73.02] [41.005385 28.976825] [49.510833 21.218333]]
                :city ["Szawfszawan" "Dźondhpur" "Stambuł" "Smerekowiec"]
                :country ["Maroko" "Indie" "Turcja" "Polska"]}
               {:title "Slalom o północy"
                :description "Noc, dziewicze stoki i szusujący narciarze. Sfotografowanie takiej scenerii okazało się wyzwaniem."
                :coords nil
                :country nil}]}
   {:year 2016 :month 2 :vol 197
    :articles [{:title "Islam"
                :description "Za sprawą uchodźców z Bliskiego Wschodu ciągnących do Europy temat islamu stał się w naszym kraju gorący jak nigdy dotąd. Jaka zatem jest prawda o islamie? Na ile lęki Europejczyków są uzasadnione?"
                :coords nil
                :country nil}
               {:title "Kobiety królestwa Saudów"
                :description "Choć zgodnie z prawem nie wolno im prowadzić aut, nie jest to ich największym zmartwieniem. W skrajnie konserwatywnym społeczeństwie Arabii Saudyjskiej, w kórym obowiązuje pełna segregacja płci, kobiety muszą iść na daleko idące kompromisy."
                :coords [[24.711667 46.726944]]
                :country ["Arabia Saudyjska"]}
               {:title "Denali"
                :description "Ogromna połać dziewiczej przyrody, jedna z ostanich takich na świecie. Królestwo wilków i niedźwiedzi, w którym najpewniejszym zimowym środkiem lokomocji pozostaje psi zaprzęg. Ziemia chroniona jako park narodowy, ale taki, w którym można swobodnie wędrować i biwakować. Witajcie w Alasce!"
                :coords [[63.333333 -150.5]]
                :country ["USA"]
                :region ["Alaska"]}
               {:title "Londyn od podszewki"
                :description "Ziemia pod zamieszkiwanym od tysiącleci miastem takim jak Londyn kryje niezwykle pamiątki przeszłości. Jeśli więc trafi się ogromny projekt infrastrukturalny taki jak budowa metra, zyskujemy nagle niezwykłą możliwość ich 'poławiania'."
                :coords [[51.507222 -0.1275]]
                :country ["Wielka Brytania"]
                :city ["Londyn"]}
               {:title "Nosorożce"
                :description "Tysiącami giną z rąk kłusowników z powodu swojego spiczastego oręża, które przynosi wielkie zyski. Ale czy wyobrażacie sobie te ogromne zwierzęta hodowane dla ich rogów niczym krowy? W RPA tak się dzieje."
                :coords [[-29 24]]
                :country ["RPA"]}
               {:title "Fotoreportaż"
                :description "Kirgijskie brutalne zawody jeźdźców mają długą tradycję i niezmienną zasadę, którą jest brak zasad."
                :coords [[41.266667 74.983333]]
                :country ["Kirgistan"]}]}
   {:year 2016 :month 1 :vol 196
    :articles [{:title "Kuracja Naturą"
                :description "Jesteśmy częścią wielkiego systemu Natury, o czym zdajemy się zapominać, wierząc przede wszystkim w zdobycze cywilizacji. Tymczasem nie można jej porzucić ot tak, bezkarnie. Kontakt z naturą to warunek naszego dobrego zdrowia i samopoczucia. I coraz częściej lekarze przepisują go swoim pacjentom."
                :coords nil
                :country nil}
               {:title "Polskie parki narodowe"
                :description "W aktualnym stanie prawnym powołanie do życia nowego parku narodowego w Polsce jest praktycznie niemożliwe. Czym ryzykujemy, utrzymując  taki stan rzeczy, i czy możemy sobie na to pozwolić?"
                :coords nil
                :country nil}
               {:title "Gumowa Azja"
                :description "Rosnący popyt na kauczuk wywołał coś na kształ lateksowej gorączki złota. Generując wysokie dochody, pozwolił najuboższym regionom Azji wyjść z biedy. Kosztem jest jednak znikanie wielkich połaci dzikiej puszczy z całą jej bioróżnorodnością."
                :coords nil
                :country nil
                :region ["Azja"]}
               {:title "Dobry jak sęp"
                :description "Sępy kojarzą się źle i pozytywnych emocji nie budzą. A powinny, bo ich znaczenie dla ekosystemów ciepłych krain jest znacznie większe niż każdnego z wielkich zwierząt, które ludzi elektryzują."
                :coords nil
                :country nil}
               {:title "Food trucki"
                :description "Niby uliczne, ale z pretensjami do kulinarnej sztuki. Jedzenie z gastrobusów, które urosły na kryzysie finansowym, zrobiło w Ameryce prawdziwą furorę."
                :coords nil
                :country ["USA"]}
               {:title "Mapy NG"
                :description "W dobie geolokalizacji mapy powstają i wyglądają inaczej niż dawniej. National Geographic mimo zmian technologicznych pozostaje w tej dziedzinie liderem. A oglądanie starych map wciąż przynosi wielką frajdę."
                :coords nil
                :country nil}]}])
