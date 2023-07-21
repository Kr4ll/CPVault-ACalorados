def distinct(seq):
    if len(seq) == 0 or len(seq) == 1:
        return seq
    unique_elements = []
    for number in seq:
        if number not in unique_elements:
            unique_elements.append(number)
    return unique_elements
