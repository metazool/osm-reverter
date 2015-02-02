# osm-reverter

Simple clojure tools for reverting changes to OpenStreetMap.
Intended to support a heroku app.

## Installation

Download from http://github.com/metazool/osm-reverter 

## Usage

I will get this into a state where it can be installed directly
from leiningen. In the meantime, git clone the repo and then
   
    $ lein test

Should download the dependencies and run a failing test.

If you natively java, you can do things like this:

    $ java -jar osm-reverter-0.1.0-standalone.jar [args]

And package osm-reverter.revert._main will behave like revert.pl

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

None.

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
