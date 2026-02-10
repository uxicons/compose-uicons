package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallMissed: ImageVector? = null

val Icons.Sr.CallMissed: ImageVector
    get() = _CallMissed ?: UXIcon(name = "CallMissed", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(64f, 133.44f)
                verticalLineTo(44.56f)
                curveTo(63.5f, 20.49f, 82.59f, 0.55f, 106.67f, 0f)
                horizontalLineToRelative(85.33f)
                curveToRelative(12.31f, 0f, 22.28f, 9.98f, 22.28f, 22.28f)
                reflectiveCurveToRelative(-9.98f, 22.28f, -22.28f, 22.28f)
                horizontalLineToRelative(-54.63f)
                lineToRelative(126f, 131.8f)
                curveToRelative(0.87f, 0.93f, 2.08f, 1.46f, 3.35f, 1.45f)
                lineToRelative(0f, 0f)
                curveToRelative(1.26f, 0.02f, 2.47f, -0.5f, 3.33f, -1.43f)
                lineTo(416.94f, 23.23f)
                curveToRelative(20.52f, -20.69f, 49.58f, 11.56f, 30.17f, 31.47f)
                lineToRelative(-146.88f, 153.09f)
                curveToRelative(-8.7f, 9.22f, -20.82f, 14.45f, -33.49f, 14.46f)
                lineToRelative(0f, 0f)
                curveToRelative(-12.7f, -0.03f, -24.83f, -5.28f, -33.54f, -14.53f)
                lineTo(106.67f, 75.37f)
                verticalLineToRelative(58.07f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                reflectiveCurveTo(64f, 145.22f, 64f, 133.44f)
                close()
                moveTo(478.83f, 342.51f)
                curveToRelative(-95.76f, -99.8f, -349.87f, -99.82f, -445.63f, 0f)
                curveTo(11.56f, 365.05f, -0.36f, 395.19f, 0f, 426.43f)
                lineToRelative(1.73f, 25.05f)
                curveTo(1.1f, 484.18f, 27.03f, 511.24f, 59.74f, 512f)
                curveToRelative(0.94f, 0f, 53.82f, -7.17f, 53.82f, -7.17f)
                curveToRelative(31.52f, -1.54f, 56.34f, -27.47f, 56.49f, -59.03f)
                lineToRelative(3.37f, -40.06f)
                curveToRelative(26.2f, -10.79f, 54.24f, -16.41f, 82.58f, -16.56f)
                curveToRelative(28.36f, 0.41f, 56.39f, 6.1f, 82.67f, 16.77f)
                lineToRelative(3.33f, 39.85f)
                curveToRelative(0.16f, 31.56f, 24.97f, 57.49f, 56.49f, 59.03f)
                curveToRelative(0f, 0f, 52.88f, 7.17f, 53.82f, 7.17f)
                curveToRelative(32.19f, -0.52f, 58.01f, -26.77f, 58.01f, -58.97f)
                lineToRelative(1.68f, -28.1f)
                curveToRelative(0.04f, -30.72f, -11.86f, -60.26f, -33.19f, -82.37f)
                lineTo(478.83f, 342.51f)
                close()
            }
        }.also { _CallMissed = it}
