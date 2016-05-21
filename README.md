# CatchCalc #

CatchCalc is a simple in Java written program that can calculate the chance of capture a pokémon given the pokémon Max HP and current HP. While a couple of steps are still required to actually know these values (one method explained below), it is wishful thinking to hope that in a future game we'll actually be able to see values rather than green bars.


###How to find the wild pokémon's HP:



* First and foremost I have to say this this will never be accurate due to IVs, so I greatly advice you to set the HP IV to 31 so in any case the chance of capture ends up being higher than calculated!

* That said, for finding out how much HP the pokemon has that you are encountering you can use any battle simulator (i.e. Pokemon Showdown) or save editor (i.e. PKHeX).

* Simply pick your pokemon, set the level and make sure the HP IV is 31. 

* For the "current HP" you can go for a single HP, implying the use of False Swipe or Hold Back or you could make it max HP.


## FAQ: ##
Q: It doesn't start!

A: Make sure you have associated the .jar extension with Java. To do so right click the program then "open with" and then select the Java platform.

Q: I can't find the Java platform in the list!

A: If you are certain that you did install the above linked JRE, also go ahead and download the [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) for your OS. Once you have that installed

On Windows:

* open a command prompt by holding the windows key then pressing R. This will make the Run popup show, in here type `cmd.exe`
* in the command prompt type `cd [path-to-where-you-saved-the-program]` and hit enter
* then type `Java -jar "CatchCalc.jar"` including quotation marks!

On Mac (At least this worked for me on my OSX Maverics, I don't use my Mac a lot. at all)

* Open Terminal
* Type `Java -jar "CatchCalc.jar"` including quotation marks!

On Linux (going by Ubuntu here, not sure if it's the same across all distributions)

* Open Terminal
* navigate to the folder where the program is, if this is the Downloads folder it will most likely be by typing `cd ~/Downloads`
* Type `Java -jar "CatchCalc.jar"` including quotation marks!

## Changelog: ##
*(- for removed, + for added, @ for changed)*



### Version 2.1: ###

* @ Corrected some spelling mistakes
* @ Did some code refactoring
* + Updated catch rate calculation so it also allows for selecting either XY or ORAS



### Version 2.0: ###
* - The old code
* + Completely rewritten from ground up - Switched from the GUI editor in NetBeans to standard classes.
* + A repo on bitbucket
* @ An actually working distributable file. I was not aware that the previous download was accidentally missing files, but this time around it's all packed in 1 .jar file.

### Version 1.0: ###

* + Initial release

##If you have any other questions, concerns, or you if you notice a mistake that I made please let me know in the comments below!


### Contact in case of problems / questions ###

Create an issue on this repository.
