EBNF:
Expr -> Mul { ("+" | "-") Mul }
Mul -> Term { ("*" | "/") Term}
Term -> ["-"] Stat
Stat -> cislo | "("Expr")"

