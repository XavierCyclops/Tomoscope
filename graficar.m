function X = graficar(Signal, I)
offset = 0.2;
vector = (offset:offset:I*offset);
pl = bsxfun(@plus,Signal',vector);
f = figure('visible','off');
plot(pl);
saveas(f, 'algo', 'png');
%imwrite(pl, 'algo.png');
end