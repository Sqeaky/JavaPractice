# Java Practice #

## Purpose ##
This is intended to practice and maybe show off some Java skills. There is simple class with


## Building and Usage ##
This should be simple to use for people familiar with gradle. I built this with gradle-4.9.

Other than gradle, all needed dependencies are described in the file "build.gradle". There are build targets that are
likely to be of use:

  * build
  * run
  * test
  * jar

These can be invoked with the following command line commands from the root directory of the project:

  $ gradle build

This will build class files and leave them in the build directory.

  $ gradle run

This will run the main entry with no arguments. not very interesting at the moment.

  $ gradle test

This is probably the most useful. This will run all the unit tests and report on errors if any.

  $ gradle jar

This will create a jar. This is useful if you want to pass arguments to the main and see a visual
histogram. Here is an example of use and the output location of the jarfile:

  $java -jar build/libs/JavaPractice-0.1.jar aManAPlanACanalPanama
  p: **
  a: **********
  c: *
  l: **
  m: **
  n: ****

## Possible issues ##

If you are are ubuntu 18.04 the default JVM/JDK comes with a default keystore that is not compatible with gradle 4.9.
This can be corrected with the script tools/FixCerts.sh. This can manifest with errors like this:

> java.lang.RuntimeException: Unexpected error: java.security.InvalidAlgorithmParameterException: the trustAnchors
> parameter must be non-empty

If you are having trouble finding gradle 4.9 for ubuntu you might consider the gradle PPA:
https://launchpad.net/~cwchien/+archive/ubuntu/gradle

## License ##

This project is released under the BSD 3 clause license and can be used for any purposed under as described in the file
License.md.
