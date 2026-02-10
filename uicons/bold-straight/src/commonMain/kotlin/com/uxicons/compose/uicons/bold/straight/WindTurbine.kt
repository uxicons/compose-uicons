package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindTurbine: ImageVector? = null

val Icons.Bs.WindTurbine: ImageVector
    get() = _WindTurbine ?: UXIcon(name = "WindTurbine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.9f, 13.18f)
                curveToRelative(-0.15f, -0.12f, -3.36f, -2.76f, -6.08f, -4.55f)
                curveToRelative(-0.39f, -3.23f, -1.32f, -7.29f, -1.36f, -7.47f)
                lineToRelative(-0.27f, -1.16f)
                horizontalLineToRelative(-4.39f)
                lineToRelative(-0.27f, 1.16f)
                curveToRelative(-0.04f, 0.18f, -0.97f, 4.24f, -1.36f, 7.47f)
                curveToRelative(-2.72f, 1.79f, -5.93f, 4.43f, -6.08f, 4.55f)
                lineToRelative(-0.92f, 0.76f)
                lineToRelative(1.96f, 3.93f)
                lineToRelative(1.16f, -0.28f)
                curveToRelative(0.17f, -0.04f, 3.36f, -0.81f, 6.22f, -1.75f)
                verticalLineToRelative(5.16f)
                horizontalLineToRelative(-3.52f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10.04f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.52f)
                verticalLineToRelative(-5.15f)
                curveToRelative(2.85f, 0.93f, 6.03f, 1.7f, 6.19f, 1.74f)
                lineToRelative(1.16f, 0.28f)
                lineToRelative(1.96f, -3.93f)
                lineToRelative(-0.92f, -0.76f)
                close()
                moveTo(12.55f, 12.33f)
                lineToRelative(-0.55f, -0.22f)
                lineToRelative(-0.55f, 0.22f)
                curveToRelative(-1.68f, 0.66f, -4.03f, 1.34f, -5.72f, 1.79f)
                curveToRelative(1.31f, -1.02f, 3.15f, -2.4f, 4.65f, -3.35f)
                lineToRelative(0.62f, -0.39f)
                lineToRelative(0.07f, -0.73f)
                curveToRelative(0.17f, -1.76f, 0.59f, -4.02f, 0.92f, -5.66f)
                curveToRelative(0.33f, 1.63f, 0.75f, 3.89f, 0.92f, 5.66f)
                lineToRelative(0.07f, 0.73f)
                lineToRelative(0.62f, 0.39f)
                curveToRelative(1.5f, 0.94f, 3.34f, 2.32f, 4.65f, 3.35f)
                curveToRelative(-1.69f, -0.45f, -4.04f, -1.13f, -5.72f, -1.79f)
                close()
            }
        }.also { _WindTurbine = it}
