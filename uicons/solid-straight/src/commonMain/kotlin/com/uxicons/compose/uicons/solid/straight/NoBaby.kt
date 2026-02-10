package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoBaby: ImageVector? = null

val Icons.Ss.NoBaby: ImageVector
    get() = _NoBaby ?: UXIcon(name = "NoBaby") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(19.74f, 18.32f)
                lineTo(15f, 13.59f)
                verticalLineToRelative(-3.01f)
                lineToRelative(3.37f, -2f)
                curveToRelative(0.51f, -0.21f, 0.76f, -0.79f, 0.56f, -1.3f)
                reflectiveCurveToRelative(-0.79f, -0.76f, -1.3f, -0.56f)
                lineToRelative(-3.9f, 1.58f)
                curveToRelative(0.47f, -0.46f, 0.77f, -1.09f, 0.77f, -1.8f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.72f, 0.31f, 1.36f, 0.79f, 1.82f)
                lineToRelative(-0.94f, -0.37f)
                lineToRelative(-3.68f, -3.68f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                close()
                moveTo(11.28f, 15.52f)
                lineTo(9.83f, 16.61f)
                lineTo(10.31f, 18.45f)
                curveToRelative(0.23f, 0.58f, -0.05f, 1.24f, -0.63f, 1.47f)
                curveToRelative(-0.57f, 0.23f, -1.24f, -0.04f, -1.47f, -0.63f)
                lineToRelative(-1.13f, -2.83f)
                curveToRelative(-0.15f, -0.38f, -0.09f, -0.81f, 0.17f, -1.13f)
                lineToRelative(1.7f, -2.14f)
                close()
            }
        }.also { _NoBaby = it}
