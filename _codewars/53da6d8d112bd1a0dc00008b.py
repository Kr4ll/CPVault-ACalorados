# HOF implementation
def reverse_list(l):
  l.reverse()
  return l

# Recursive implementation
def reverse_listR(l):
    if len(l) == 0:
        return []
    else:
        return [l[-1]] + reverse_listR(l[:-1])
