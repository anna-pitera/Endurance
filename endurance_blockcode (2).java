async function startProgram() {
    await roll(0, 65, 10.25);
    stopRoll();
    await delay(1);
    await roll(90, 65, 5.75);
    stopRoll();
    await delay(1);
    await roll(180, 65, 10.25);
    stopRoll();
    await delay(1);
    await roll(270, 65, 5.75);
    stopRoll();
}