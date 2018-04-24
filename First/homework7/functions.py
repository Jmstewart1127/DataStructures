def optimal_coin_change(price, paid):
    change = paid - price
    quarters = change // 0.25
    change = change - quarters * 0.25
    dimes = change // 0.10
    change = change - dimes * 0.10
    nickels = change // 0.05
    change = change - nickels * 0.05
    pennies = change // 0.01
    print(quarters, dimes, nickels, pennies)


optimal_coin_change(2.23, 5.0)
