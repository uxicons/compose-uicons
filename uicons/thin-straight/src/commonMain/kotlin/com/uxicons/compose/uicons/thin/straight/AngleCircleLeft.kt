package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleLeft: ImageVector? = null

val Icons.Ts.AngleCircleLeft: ImageVector
    get() = _AngleCircleLeft ?: UXIcon(name = "AngleCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(13.85f, 17.26f)
                lineToRelative(-4.88f, -4.88f)
                curveToRelative(-0.21f, -0.21f, -0.21f, -0.56f, 0f, -0.77f)
                lineToRelative(4.87f, -4.87f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.87f, 4.87f)
                curveToRelative(-0.6f, 0.6f, -0.6f, 1.58f, 0f, 2.18f)
                lineToRelative(4.88f, 4.88f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _AngleCircleLeft = it}
