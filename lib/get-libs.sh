#!/usr/bin/env bash

wget -P $(dirname $0)/resources https://dl.dropboxusercontent.com/u/21297365/ija/menu-back.jpg
wget -P $(dirname $0)/resources https://dl.dropboxusercontent.com/u/21297365/ija/game-back.jpg
for (( i=0; i<=6; i++ ))
do
	wget -P $(dirname $0)/resources/Arrows https://dl.dropboxusercontent.com/u/21297365/ija/Arrows/${i}.png
done

for (( i=0; i<=9; i++ ))
do
	wget -P $(dirname $0)/resources/cesty https://dl.dropboxusercontent.com/u/21297365/ija/cesty/${i}.png
done

for (( i=-1; i<=23; i++ ))
do
	wget -P $(dirname $0)/resources/poklady https://dl.dropboxusercontent.com/u/21297365/ija/poklady/${i}.png
done

for (( i=-1; i<=4; i++ ))
do
	wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/${i}.png
done

wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/12.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/13.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/14.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/23.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/24.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/34.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/123.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/124.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/134.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/234.png
wget -P $(dirname $0)/resources/hraci https://dl.dropboxusercontent.com/u/21297365/ija/hraci/134.png
