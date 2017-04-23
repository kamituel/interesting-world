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

## TODO / Bugs

- Only articles from 2016 and 2017 issues of NGM are included.

## Tests

No tests yet.

## License

Copyright © 2017 Kamil Leszczuk

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
