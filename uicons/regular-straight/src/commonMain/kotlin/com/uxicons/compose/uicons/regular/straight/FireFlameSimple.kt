package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Rs.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.06f, 6.92f)
                lineTo(12f, 0.01f)
                lineToRelative(-7.07f, 6.92f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0f, 14.14f)
                curveToRelative(1.89f, 1.89f, 4.4f, 2.93f, 7.07f, 2.93f)
                reflectiveCurveToRelative(5.18f, -1.04f, 7.07f, -2.93f)
                reflectiveCurveToRelative(2.93f, -4.4f, 2.93f, -7.07f)
                reflectiveCurveToRelative(-1.04f, -5.18f, -2.94f, -7.08f)
                close()
                moveTo(17.66f, 19.66f)
                curveToRelative(-1.51f, 1.51f, -3.52f, 2.34f, -5.66f, 2.34f)
                reflectiveCurveToRelative(-4.15f, -0.83f, -5.66f, -2.34f)
                curveToRelative(-3.12f, -3.12f, -3.12f, -8.2f, -0.01f, -11.31f)
                lineToRelative(5.67f, -5.54f)
                lineToRelative(5.66f, 5.53f)
                curveToRelative(1.51f, 1.51f, 2.34f, 3.52f, 2.34f, 5.66f)
                reflectiveCurveToRelative(-0.83f, 4.15f, -2.34f, 5.66f)
                close()
                moveTo(12f, 8.01f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.46f, 3.54f)
                reflectiveCurveToRelative(2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                reflectiveCurveToRelative(1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                lineToRelative(-3.53f, -3.45f)
                close()
                moveTo(14.12f, 17.12f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.14f, -4.24f, 0f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.12f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.87f, -2.11f)
                lineToRelative(2.13f, -2.08f)
                lineToRelative(2.12f, 2.08f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                close()
            }
        }.also { _FireFlameSimple = it}
