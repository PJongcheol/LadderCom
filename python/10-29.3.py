import pandas as pd

df2=pd.read_csv('survey.csv')

print(df2.head())

print(df2.income.mean())

print(df2.income.sum())

print(df2.income.median())

print(df2.describe())

print(df2.income.describe())

print(df2.sex.value_counts())

print(df2.groupby(df2.sex).mean())

print(df2.groupby(df2.stress).mean())