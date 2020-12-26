# Using Placeholders:
uLoc = "D:/Laptop/Java/myLibs/EvenDistribution/plot/data.txt"
u1a = 1
u1b = 2

# Variables
rangeMax = 1200
rangeMin = -rangeMax
pointSize = 1

# Settings
set terminal wxt size 1600,800
set xrange [rangeMin:rangeMax]
set yrange [rangeMin:rangeMax]
set size ratio -1
#/!



# Plot
set multiplot layout 1,2
plot \
  uLoc using 1:2 \
  pointtype 7 pointsize pointSize  linecolor "#A00088FF"
plot \
  uLoc using 3:4 \
  pointtype 7 pointsize pointSize  linecolor "#A04444FF"
#/!

