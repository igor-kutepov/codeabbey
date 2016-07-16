package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class MatchingBracketsTest extends BaseTest {

    public MatchingBracketsTest() {
        this.input = "15\n" +
                "<)((f(d))+)<b>><[c][{u}(c)e[^(%)[f](+){g<%>}]]^>(-{g}-{+}((h)h)<>\n" +
                "<}<b>/<v>(-))((y(^)[b<t><^{y}[ ]{(g)v}>])c)[u]><c>{b(\n" +
                "()<(x)b>({g}[ ][y<<e>d>[[c]/][ ][y]][[[/]h]t]%{{e}z}{<[c]e>+<u>})\n" +
                "{a}{<(z)[c]a>*<u<a>>}(y){e} {[(x<e>)c]<g<*>>y}w)()\n" +
                "{{^}[e]< {%</>}<e>(d){t}[a]>((h)b)}(y( ))[t(<u>v)]\n" +
                "[h</(y)>(*)[-]]{^(<{(c)<f>w(c)(b }e>+)}[]<e>(h){{c} }<h(v)>\n" +
                "((h)){[<y %][a[ ]][f][x{+}]e[u]}[{t}[t]u(f)<<+><z>/>][c]\n" +
                "<[d]{*}{*}(x)<f>b>{e[[/]c]<v>}<f(u)>{w}[ [y]]{ }({ %>*}</>{x})\n" +
                "<<z>{b}[d]<{[ ][*]f}z({^}b>{{c(e)}g}(>h){/(y)})\n" +
                "<<^>f[-][^(e)]>{< ><u>{x}*}<e<^>><>(x)<[u]{%}(u){/}e<{ }c>{ }< >>\n" +
                "(<v>w)[[z]x]{}(({(*)[d](<y>c)/}x(<{z} >[x< >]w(g(e))[^])(g))d<h>)\n" +
                "{(x(/))[<+>f]}[y][%[<u{+}>*g}{[(h)v[b]]b}<v>{w}{]]\n" +
                "<[ ](c){v}y(v){(^)[ [h]<d>{v<b>}]>}([%]t)[+]\n" +
                "<>(g)([/]g[y[[f]*](*){(x<v>(^)(a))u}])<f>[-]\n" +
                "(<x>{-}z){}{[ ]w}<z>{*}[/[a]]<<->[t]e(w)>[^]{v}[a(c)]";
        this.output = "0 0 1 0 1 0 0 0 0 1 1 0 0 1 1";
    }

    @Test
    public void main() throws Exception {
        MatchingBrackets.main(null);
        check();
    }

}