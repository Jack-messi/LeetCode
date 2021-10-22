package com.huwei笔试2021年4月14日;

import java.util.Scanner;

public class Demo2 {

//    int N;
//    cin >> N;
//    vector<int> ve(N);
//    int temp;
//    for (int i = 0; i < N; i++)
//    {
//        cin >> temp;
//        ve[i] = temp;
//    }
//    vector<int> ans;
//    ans.push_back(ve[0]);
//    int i = 1, lastspeed = ve[0],count=1,ABEfalg=0,ABEedge=0;
//    while (i<N)
//    {
//        if (lastspeed - ve[i] >= 9)
//        {
//            ABEfalg++;
//        }
//        else
//        {
//            if (ABEfalg >= 4)
//            {
//                int l = max(ABEedge, i - ABEfalg-4);
//                int r = min(N - 1, i + 3);
//                for (int jj = l; jj <= r; jj++)
//                    ans.push_back(ve[jj]);
//                ABEedge = i + 4;
//                count = -3;
//            }
//            ABEfalg = 0;
//
//        }
//        if (count == 60&&ABEfalg<4)
//        {
//            ans.push_back(ve[i]);
//            count = 0;
//        }
//        lastspeed = ve[i];i++; count++;
//
//    }
//    if (ABEfalg >= 4)
//    {
//        int l = max(ABEedge, i - ABEfalg - 4);
//        int r = min(N - 1, i + 3);
//        for (int jj = l; jj <= r; jj++)
//            ans.push_back(ve[jj]);
//    }
//    int numcc = ans.size() - 1;
//    for (int luo=0;luo<numcc;luo++)
//    cout << ans[luo] << ',';
//    cout << ans[numcc] << endl;
//    return 0;
}
