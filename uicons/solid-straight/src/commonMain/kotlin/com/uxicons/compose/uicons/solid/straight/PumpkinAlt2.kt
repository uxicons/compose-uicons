package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpkinAlt2: ImageVector? = null

val Icons.Ss.PumpkinAlt2: ImageVector
    get() = _PumpkinAlt2 ?: UXIcon(name = "PumpkinAlt2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.24f, 6f)
                curveToRelative(-0.92f, 0f, -1.75f, 0.33f, -2.43f, 0.97f)
                curveToRelative(-0.58f, -0.4f, -1.18f, -0.66f, -1.78f, -0.8f)
                curveToRelative(0.32f, -4.11f, 2.94f, -4.16f, 2.97f, -4.16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1.0f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2.0f, -0.9f, 2.0f, -2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                curveToRelative(-1.12f, 0f, -2.88f, 0.62f, -3.99f, 2.56f)
                curveToRelative(-0.59f, -1.07f, -1.44f, -1.9f, -2.56f, -2.46f)
                lineToRelative(-0.9f, 1.79f)
                curveToRelative(1.46f, 0.73f, 2.25f, 2.13f, 2.41f, 4.27f)
                curveToRelative(-0.6f, 0.14f, -1.19f, 0.4f, -1.78f, 0.8f)
                curveToRelative(-0.68f, -0.64f, -1.51f, -0.97f, -2.43f, -0.97f)
                curveTo(3.63f, 6f, 0f, 9.93f, 0f, 15f)
                reflectiveCurveToRelative(3.63f, 9f, 6.76f, 9f)
                curveToRelative(0.92f, 0f, 1.75f, -0.33f, 2.43f, -0.97f)
                curveToRelative(1.83f, 1.26f, 3.79f, 1.26f, 5.62f, 0f)
                curveToRelative(0.68f, 0.64f, 1.51f, 0.97f, 2.43f, 0.97f)
                curveToRelative(3.13f, 0f, 6.76f, -3.93f, 6.76f, -9f)
                reflectiveCurveToRelative(-3.63f, -9f, -6.76f, -9f)
                close()
            }
        }.also { _PumpkinAlt2 = it}
