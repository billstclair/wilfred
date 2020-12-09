# Wilfred
"Web LIsp Front EnD" is a [Slime](https://common-lisp.net/project/slime/) client in JavaScript for the browser. Its name is an echo of "Fred" the Emacs subset in Macintosh Common Lisp.

## Introduction

Will talk to [Swank](https://www.cliki.net/Swank) running in a Common Lisp.

Code editing will initially be in [CodeMirror](https://codemirror.net/), but once it works, I will likely replace that with a subset of Emacs.

Will write it in [ClojureScript](https://clojurescript.org/), if that builds fast enough, or [Elm](https://elm-lang.org) otherwise.

See [ClojureScript.md](ClojureScript.md) for instructions on installing and learning Clojure and ClojureScript.

[cider](https://github.com/clojure-emacs/cider) is an Emacs IDE for Clojure, connecting to nREPL on the server, much like Slime in Emacs connects to Swank on the server, but in Clojure, not Lisp.

I can't find a Slime client written in Clojure, so I'm going to convert [Swank Client](https://github.com/brown/swank-client) to Clojure for that.

My local copy of [The swank-client Reference Manual](https://quickref.common-lisp.net/swank-client.html) is [here](swank-client.html).

## Getting Started

Once:

Install Leiningen (and Clojure): https://leiningen.org

To start a coding session:

```
$ cd .../wilfred
$ bin/run
```

To build for deployment:

TBD

To deploy to a web server:

TBD
