package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Ss.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.12f, 12.88f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.14f, -4.24f, 0f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.12f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.87f, -2.11f)
                lineToRelative(2.13f, -2.08f)
                lineToRelative(2.12f, 2.08f)
                close()
                moveTo(22f, 14f)
                curveToRelative(0f, 2.67f, -1.04f, 5.18f, -2.93f, 7.07f)
                reflectiveCurveToRelative(-4.4f, 2.93f, -7.07f, 2.93f)
                reflectiveCurveToRelative(-5.18f, -1.04f, -7.07f, -2.93f)
                curveToRelative(-3.9f, -3.9f, -3.9f, -10.24f, 0f, -14.14f)
                lineTo(12f, 0.01f)
                lineToRelative(7.06f, 6.91f)
                curveToRelative(1.9f, 1.9f, 2.94f, 4.41f, 2.94f, 7.08f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, -1.34f, -0.52f, -2.59f, -1.47f, -3.54f)
                lineToRelative(-3.53f, -3.45f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.46f, 3.54f)
                reflectiveCurveToRelative(2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                reflectiveCurveToRelative(1.47f, -2.2f, 1.47f, -3.54f)
                close()
            }
        }.also { _FireFlameSimple = it}
