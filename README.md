# Exception
Schritt 1: Erweitere die StudentDB um eine findById Methode mit einem Parameter id, die einen Student zurückgibt.Für Selbstsichere: Wenn Ihr testgetrieben vorgehen willst (TDD, test driven development) dürft ihr auch mit Punkt 3. beginnen.

Schritt 2: Die findById Methode soll eine passende Exception werfen, wenn kein Student mit der Id existiert.Überlege auch, was die "passende Exception" hier sein mag. Eine CheckedException oder eine UncheckedException? Eine Instanz einer vordefinierten oder einer selbstgeschriebenen Exceptionklasse?

Schritt 3: Schreibe mindestens einen Test, der dieses Verhalten überprüft.

### Bonus
Test 1:
Schreibe einen Test shouldBeEmptyInitially, der

- eine Instanz von der Klasse GuestList erzeugt
- darauf die Methode setGuests mit einer leeren Liste aufruft
- dann getGuests aufruft (Ergebnis soll eine Liste von Strings sein)
- und prüft, dass dieses Ergebnis eine leere Liste ist

Test 2:
Schreibe einen Test shouldReadSameGuestsAsWrittenBefore, der

- eine Instanz von der Klasse GuestList erzeugt
- darauf die Methode setGuests mit Karl und Ute aufruft
- dann getGuests aufruft (Ergebnis soll eine Liste von Strings sein)
- und prüft, dass dieses Ergebnis Karl und Ute enthält

Test 3:
Schreibe einen Test shouldWriteToFileSystem, der

- eine Instanz von der Klasse GuestList erzeugt
- darauf die Methode setGuests mit Theodor und Anette aufruft
- und prüft, dass die Datei guests.txt angelegt wurde und die Zeilen "Theodor" und "Anette" enthält
  
Tipp: Dateipfad definieren mit Path.of("guests.txt")
Tipp: Lesen und Schreiben mit der java.nio.file.Files-Klasse

Test 4:
Schreibe einen Test shouldReadFromFileSystem, der

- In die Datei guests.txt Stephan und Max schreibt (als Zeilen)
- eine Instanz von der Klasse "GuestList" erzeugt
- dann getGuests aufruft
- und prüft, dass "Stephan" und "Max" gelesen wurden
  
Tipp: Dateipfad definieren mit Path.of("guests.txt")
Tipp: Lesen und Schreiben mit der java.nio.file.Files-Klasse

Test 5:
Schreibe einen Test, der prüft, dass beim Lesen eine Exception auftritt, wenn die Datei nicht existiert

Test 6:
Füge eine addGuest-Methode hinzu, die als Parameter einen String guest
erhält und diesen als zusätzliche Zeile in die Datei schreibt.
