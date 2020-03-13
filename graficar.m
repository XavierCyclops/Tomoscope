function graficar(Signal, I)
a = load(Signal);
b = a.ADQUISICION;
offset = 0.2;
vector = (offset:offset:I*offset);
pl = bsxfun(@plus,b',vector);
f = figure('visible','off');
plot(pl);
saveas(f, 'algo', 'png');
%imwrite(pl, 'algo.png');
end