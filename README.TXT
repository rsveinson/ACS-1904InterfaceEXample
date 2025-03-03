Here is a simulation of a Space Type game that uses both abstract classes and
an interface.

Note that the implementation is sparse, this is for demonstration purposes.

both of the abstract classes have an abstract move() method. no problem,
seems logical. So the concrete classes that extend them must implement move(). 
Presumably there is some difference in the way a fighter moves form the way a
shuttle moves, from the way a comet moves.

this is fine but we have the opportunity to 'factor' out the move method. We
can put the move method into an interface. 

It doesn't make sense for a comet to inheritfrom SpaceShip nor does it make sense
for space ships to inherit from SpaceBody, yet they both (SpaceShip, and SpaceBody)
have the abstract method move. So we'll take move out of the abtract class
and put it into an interface.

Now we can have an array or array list of moveable objects that can include
all of the game assets
