# Variables
pointScale = 1

# Settings
set terminal wxt size 1200,1200
set size ratio -1
set xrange [-1100:1100]
set yrange [-1100:1100]
unset key
unset title
#set title "Square: 250 to 1000. Normal distribution. (Set 4,0.25)"
set title font ",18"
set title offset 0,-1



#Plot
plot \
  "D:/Laptop/Java/myLibs/EvenDistribution/plot/random.txt" \
    using 1:2 \
    with point linestyle 7 \
    linecolor rgb "#E08800FF" \
    pointsize 1 * pointScale \
    title "Random Point"\



