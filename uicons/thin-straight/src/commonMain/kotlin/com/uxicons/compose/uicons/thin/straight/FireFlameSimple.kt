package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Ts.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.07f, 6.92f)
                lineTo(12f, 0.01f)
                lineToRelative(-7.07f, 6.92f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0f, 14.14f)
                curveToRelative(1.89f, 1.89f, 4.4f, 2.93f, 7.07f, 2.93f)
                reflectiveCurveToRelative(5.18f, -1.04f, 7.07f, -2.93f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, -0.0f, -14.15f)
                close()
                moveTo(18.36f, 20.36f)
                curveToRelative(-1.7f, 1.7f, -3.96f, 2.64f, -6.36f, 2.64f)
                reflectiveCurveToRelative(-4.66f, -0.94f, -6.36f, -2.64f)
                curveToRelative(-3.51f, -3.51f, -3.51f, -9.22f, -0.0f, -12.72f)
                lineTo(12f, 1.41f)
                lineToRelative(6.36f, 6.22f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0f, 12.73f)
                close()
                moveTo(12f, 8.01f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.47f, 3.54f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                reflectiveCurveToRelative(1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                lineToRelative(-3.53f, -3.45f)
                close()
                moveTo(14.83f, 17.83f)
                curveToRelative(-0.76f, 0.76f, -1.76f, 1.17f, -2.83f, 1.17f)
                reflectiveCurveToRelative(-2.07f, -0.42f, -2.83f, -1.17f)
                curveToRelative(-0.76f, -0.76f, -1.17f, -1.76f, -1.17f, -2.83f)
                reflectiveCurveToRelative(0.42f, -2.07f, 1.17f, -2.82f)
                lineToRelative(2.83f, -2.77f)
                lineToRelative(2.83f, 2.77f)
                curveToRelative(0.76f, 0.76f, 1.17f, 1.76f, 1.17f, 2.83f)
                reflectiveCurveToRelative(-0.42f, 2.07f, -1.17f, 2.83f)
                close()
            }
        }.also { _FireFlameSimple = it}
