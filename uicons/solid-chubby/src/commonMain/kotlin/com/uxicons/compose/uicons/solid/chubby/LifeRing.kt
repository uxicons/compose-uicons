package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LifeRing: ImageVector? = null

val Icons.Sc.LifeRing: ImageVector
    get() = _LifeRing ?: UXIcon(name = "LifeRing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.01f, 4.52f)
                lineToRelative(-4.38f, 4.33f)
                curveToRelative(0.47f, 0.81f, 0.7f, 1.86f, 0.7f, 3.16f)
                reflectiveCurveToRelative(-0.23f, 2.34f, -0.7f, 3.16f)
                lineToRelative(4.38f, 4.33f)
                curveToRelative(1.22f, -1.62f, 1.99f, -4.01f, 1.99f, -7.48f)
                reflectiveCurveToRelative(-0.77f, -5.86f, -1.99f, -7.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.21f, 16.57f)
                curveToRelative(-0.82f, 0.47f, -1.9f, 0.7f, -3.21f, 0.7f)
                reflectiveCurveToRelative(-2.39f, -0.23f, -3.21f, -0.7f)
                lineToRelative(-4.39f, 4.34f)
                curveToRelative(2.13f, 1.63f, 4.97f, 1.96f, 7.61f, 1.96f)
                reflectiveCurveToRelative(5.47f, -0.33f, 7.61f, -1.96f)
                lineToRelative(-4.39f, -4.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.79f, 7.43f)
                curveToRelative(0.82f, -0.47f, 1.9f, -0.7f, 3.21f, -0.7f)
                reflectiveCurveToRelative(2.39f, 0.23f, 3.21f, 0.7f)
                lineToRelative(4.39f, -4.34f)
                curveToRelative(-2.13f, -1.63f, -4.97f, -1.96f, -7.61f, -1.96f)
                reflectiveCurveToRelative(-5.47f, 0.33f, -7.61f, 1.96f)
                lineToRelative(4.39f, 4.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.37f, 15.16f)
                curveToRelative(-0.47f, -0.81f, -0.7f, -1.86f, -0.7f, -3.16f)
                reflectiveCurveToRelative(0.23f, -2.34f, 0.7f, -3.16f)
                lineTo(2.99f, 4.52f)
                curveToRelative(-1.22f, 1.62f, -1.99f, 4.01f, -1.99f, 7.48f)
                reflectiveCurveToRelative(0.77f, 5.86f, 1.99f, 7.48f)
                lineToRelative(4.38f, -4.33f)
                close()
            }
        }.also { _LifeRing = it}
