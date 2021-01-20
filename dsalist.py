sample_list = [6, 2, 3, 5, 8, 11, 5, 9]

def remove_even(ls):
    for int in ls:
        if int % 2 == 0:
            ls.remove(int)
    print("done!")


remove_even(sample_list)

print(sample_list)

