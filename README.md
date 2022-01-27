# LibCorbac

This project is two-sided : it aims first to create an open-source library for roleplay bots, and fuel Corbac to be a proof of concept of this library.

## Features

This library should be able to :

- [ ] Handle character creation and manipulation
- [ ] Handle a standard parsing way to make characters "talk"
- [ ] Handle a multi-characters economy, but at the cost of liberty
- [ ] Handle dice rolling, the heart of any tabletop RPG

## How to install

You have to modify your `pom.xml` to add the jar to the compilation (if using *maven*), so you can register the jar as a dependancy of your java project.

Then, all you have to do is using the types so they can match the interfaces we offer you, granting your project a standard way of handling standard functions of tabletop RPGs and thus, gaining in agility.

In case the standard types are not enough, feel free to reimplement the interfaces as you wish.

## How to contribute

First, clone this repository. Then, you shall check the branches, to be sure that there isn't a branch for the feature you want to implement or add to the project.

Once the branch found (or created), create a pull request (if there isn't already one). This allows the others to know who is workng on what and run the tests, you know, just to make sure only good code makes it to main.
