#Group11
#!/usr/bin/env bash

cd bins/
## Pre-Conditions
echo "30000" > wallet.txt
echo "book" > pocket.txt

echo ""
echo "Terminal 1:: Demonstrating vulnerable attack, using 2 instances of ShoppingCart"
echo ""

echo "Before Shopping starts..."
echo "cat wallet.txt"
cat wallet.txt

echo "cat pocket.txt"
cat pocket.txt
echo ""
echo ">>Buy a Car from ShoppingCart"

echo "car" | java ShoppingCart 
sleep 1

echo ""

# end ShoppingCart