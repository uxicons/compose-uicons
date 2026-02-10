package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinSquint: ImageVector? = null

val Icons.Ts.GrinSquint: ImageVector
    get() = _GrinSquint ?: UXIcon(name = "GrinSquint") {
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
                moveTo(17.98f, 11.64f)
                lineToRelative(-2.68f, -2.14f)
                lineToRelative(2.68f, -2.14f)
                lineToRelative(-0.62f, -0.78f)
                lineToRelative(-3.65f, 2.92f)
                lineToRelative(3.65f, 2.92f)
                lineToRelative(0.62f, -0.78f)
                close()
                moveTo(10.3f, 9.5f)
                lineToRelative(-3.65f, -2.92f)
                lineToRelative(-0.62f, 0.78f)
                lineToRelative(2.68f, 2.14f)
                lineToRelative(-2.68f, 2.14f)
                lineToRelative(0.62f, 0.78f)
                lineToRelative(3.65f, -2.92f)
                close()
                moveTo(12.0f, 20f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-4.3f, 0f, -5.9f, -4.92f, -5.97f, -5.13f)
                lineToRelative(-0.28f, -0.88f)
                lineToRelative(0.89f, 0.24f)
                curveToRelative(0.03f, 0.01f, 2.81f, 0.76f, 5.36f, 0.76f)
                reflectiveCurveToRelative(5.34f, -0.75f, 5.37f, -0.76f)
                lineToRelative(0.89f, -0.24f)
                lineToRelative(-0.28f, 0.88f)
                curveToRelative(-0.07f, 0.21f, -1.68f, 5.13f, -5.97f, 5.13f)
                close()
                moveTo(7.34f, 15.44f)
                curveToRelative(0.62f, 1.29f, 2.08f, 3.56f, 4.65f, 3.56f)
                horizontalLineToRelative(0.01f)
                curveToRelative(2.57f, 0f, 4.04f, -2.27f, 4.66f, -3.56f)
                curveToRelative(-1.08f, 0.24f, -2.9f, 0.56f, -4.67f, 0.56f)
                reflectiveCurveToRelative(-3.58f, -0.33f, -4.66f, -0.56f)
                close()
            }
        }.also { _GrinSquint = it}
