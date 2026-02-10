package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moon: ImageVector? = null

val Icons.Ts.Moon: ImageVector
    get() = _Moon ?: UXIcon(name = "Moon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 24f)
                curveToRelative(-6.62f, 0f, -12f, -5.38f, -12f, -12f)
                reflectiveCurveTo(7.38f, 0f, 14f, 0f)
                curveToRelative(2.01f, 0f, 4.01f, 0.52f, 5.79f, 1.51f)
                lineToRelative(0.78f, 0.43f)
                lineToRelative(-0.77f, 0.44f)
                curveToRelative(-3.52f, 2.01f, -5.79f, 5.59f, -5.79f, 9.12f)
                curveToRelative(0f, 4.5f, 3.35f, 8.03f, 6.68f, 9.52f)
                lineToRelative(0.81f, 0.37f)
                lineToRelative(-0.73f, 0.5f)
                curveToRelative(-2.01f, 1.38f, -4.35f, 2.11f, -6.76f, 2.11f)
                close()
                moveTo(14f, 1f)
                curveTo(7.93f, 1f, 3f, 5.93f, 3f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                curveToRelative(1.92f, 0f, 3.79f, -0.51f, 5.46f, -1.47f)
                curveToRelative(-3.33f, -1.81f, -6.46f, -5.46f, -6.46f, -10.03f)
                curveToRelative(0f, -3.61f, 2.14f, -7.26f, 5.52f, -9.51f)
                curveToRelative(-1.42f, -0.65f, -2.97f, -0.99f, -4.52f, -0.99f)
                close()
            }
        }.also { _Moon = it}
