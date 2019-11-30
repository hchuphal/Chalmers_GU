#Group11
#!/usr/bin/env bash

cd bins/
## Pre-Conditions
echo "30000" > wallet.txt
echo "book" > pocket.txt

echo ""
echo "Part1:: Demonstrating SafeWithdrawal from attacks using 2 instances of ShoppingCart"
echo ""
echo "1. Buy a Car from ShoppingCart"

echo "car" | java ShoppingCart 
sleep 1
echo ""
echo "2. Now, buy a pen from ShoppingCart"
# vulnerable attack, buy a car at a price of a pen
echo "pen" | java ShoppingCart
sleep 1
echo ""

# Check vulnerable attacks
if grep pen pocket.txt; then
  echo "Program under attack, vulnerable attack, buying a car at a price of a pen!!"
else
  echo "SafeWithdrawal works as expected, Safe to Shop!!"
fi
echo ""
echo ""
# end ShoppingCart