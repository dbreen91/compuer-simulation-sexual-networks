

----WORK IN PROGRESS----BUILT IN ECLIPSE----

A computer simulation of sexual networks in humans

A person may have any number of sexual partners within their life time, with each partner in turn also possibly 

having any number of sexual partners of their own. This results in network of sexual partners. The aim of this 

simulation is to emulate these networks in human society using certain parameters to see which ones have the 

greatest impact upon the size of these networks in terms of both volume and the length of time these networks 

are active for. It also aims to show what a typical sexual network may look like in today’s society.

The Model

My plan is to set up a computer simulation to simulate a sexual network with certain parameters in place and then
to deduce which parameters have the greatest impact upon the sexual network in terms of size. and timescale. 

My model will contain a number of objects. Each object will have an age, location, level  of promiscuity and an upper and lower limit 

for the age of objects that they can interact with. The birth rate and death rate of the 
population will also be simulated. Objects are not allowed interact with other objects 
until they have reached the age of 20 and will no longer be able to interact after the 
age of 60. Objects can only interact with other objects that share the same location. 
Each object keeps track of the objects they have interacted with or a separate 
data structure which will keep tabs on the interactions without each object having to 
be responsible for it. The simulation will be run in cycles of 10 years.
