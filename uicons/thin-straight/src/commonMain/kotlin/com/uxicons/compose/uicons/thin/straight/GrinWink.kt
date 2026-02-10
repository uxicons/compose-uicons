package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinWink: ImageVector? = null

val Icons.Ts.GrinWink: ImageVector
    get() = _GrinWink ?: UXIcon(name = "GrinWink") {
            path(fill = SolidColor(Color.Black)) {
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
                curveToRelative(2.56f, 0f, 4.03f, -2.27f, 4.66f, -3.56f)
                curveToRelative(-1.08f, 0.24f, -2.9f, 0.56f, -4.66f, 0.56f)
                reflectiveCurveToRelative(-3.58f, -0.33f, -4.66f, -0.56f)
                close()
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
                moveTo(19f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(10f, 10f)
                lineTo(5f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _GrinWink = it}
