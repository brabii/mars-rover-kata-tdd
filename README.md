*** MARS ROVER KATA

Develop API that moves a rover around a grid.

** Rules:

1. You're given the initial starting point (0,0,N) of a rover.
2. 0.0 are X,Y co-ordinates on a grid of(10,10).
3. N is the direction it is facing e.g(N,S,E,W)
4. L and R allow the rover to rotate over the grid
5. M allow the rover to move one point on the current direction.
6. The rover receives a char array of commands e.g. RMMLM and return the finishing point after the moves e.g. 2:12:N
7. The rover wraps around if its reaches the end of the grid.
8. The grid may have obstacles. If a given sequence of commands encounters an obstacle, the rover moves up to the last
possible point and reports the obstacle e.g. 0:2:2:N