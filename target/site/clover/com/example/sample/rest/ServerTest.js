var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":53,"methods":[{"el":18,"sc":5,"sl":15},{"el":23,"sc":5,"sl":20},{"el":33,"sc":5,"sl":25},{"el":39,"sc":5,"sl":35},{"el":43,"sc":5,"sl":41}],"name":"ServerTest","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":35}],"name":"testServerStop","pass":true,"statements":[{"sl":37},{"sl":38}]},"test_1":{"methods":[{"sl":25}],"name":"testGetPing","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1], [], [1], [1], [1], [1], [1], [1], [], [], [0], [], [0], [0], [], [], [], [], [], []]
