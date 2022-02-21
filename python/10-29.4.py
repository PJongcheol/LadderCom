import usecsv
import numpy as np
import pandas as pd

from scipy import stats
import matplotlib.pyplot as plt

import satasmodels.api as sm
import satasmodels.formula.api as smf

df = pd.read_csv("survey.csv")

male = df.income[df.sex == "m"]
female = df.income[df.sex == "f"]

l_result = stats.levene(male, female)

if l_result[1] > .05:
    print('P value는 %f 로 95 수준에서 유의하지 않음' % l_result[1])
else:
    print('P value는 %f 로 95 percent 수준에서 유의함' % l_result[1])

print('남성', round(male.mean(),2), '여성', round(female.mean(),2), '\n등분산검정 결과 LeveneResult(F) : %.3f \np-value : %.3f' % (l_result))

model = smf.ols(formula = 'jobStatisfaction ~ English + stress + income', data = df)
result = model.fit()
print(result.summary())

