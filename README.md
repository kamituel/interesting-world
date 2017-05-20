# Interesting World

Every National Geographic Magazine (polish edition) listed - and put on a map whenever applicable.

A useful tool when researching a new place (to travel to, for instance).

## Live

This web app isn't live yet.

## Usage

Production:

```bash
$ lein with-profile prod cljsbuild once
```

Development:

```bash
$ lein with-profile dev cljsbuild once
```

Then open `resources/public/index.html` in your web browser.

Devcards (partially supported):

```bash
$ lein with-profile dev figwheel devcards
```

Then open `resources/public/devcards.html` in your browser.

## TODO / Bugs

- Only articles from 2013-2017 issues of NGM are included.
- When two points have similar coordinates, they should be clustered (depending on the map zoom level).
- Let user star a place on a map. Or star any article (which would mean not using GMaps for that).
- Unit/int tests
- Support complex queries, such as "Tokyo Japonia" - it should be split by whitespace and each token should be matched against article separately.

## Tests

No tests yet.

## License

Copyright © 2017 Kamil Leszczuk

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
