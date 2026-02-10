package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleDown: ImageVector? = null

val Icons.Ts.AngleCircleDown: ImageVector
    get() = _AngleCircleDown ?: UXIcon(name = "AngleCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(17.26f, 10.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.88f, 4.88f)
                curveToRelative(-0.3f, 0.3f, -0.7f, 0.45f, -1.09f, 0.45f)
                reflectiveCurveToRelative(-0.79f, -0.15f, -1.09f, -0.45f)
                lineToRelative(-4.87f, -4.87f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.87f, 4.87f)
                curveToRelative(0.21f, 0.21f, 0.56f, 0.21f, 0.77f, 0f)
                lineToRelative(4.88f, -4.88f)
                close()
            }
        }.also { _AngleCircleDown = it}
