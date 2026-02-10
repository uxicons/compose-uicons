package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckCircle: ImageVector? = null

val Icons.Ts.CheckCircle: ImageVector
    get() = _CheckCircle ?: UXIcon(name = "CheckCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.59f, 8.58f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-6.04f, 5.98f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.76f, 0.72f)
                curveToRelative(-0.63f, 0f, -1.27f, -0.24f, -1.75f, -0.71f)
                lineToRelative(-3.04f, -2.99f)
                lineToRelative(0.7f, -0.71f)
                lineToRelative(3.03f, 2.99f)
                curveToRelative(0.58f, 0.57f, 1.52f, 0.56f, 2.1f, -0.01f)
                lineToRelative(6.04f, -5.98f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
            }
        }.also { _CheckCircle = it}
