package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Percent10: ImageVector? = null

val Icons.Ts.Percent10: ImageVector
    get() = _Percent10 ?: UXIcon(name = "Percent10") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(20f, 14.99f)
                curveToRelative(0f, 0.55f, -0.44f, 0.99f, -0.99f, 0.99f)
                reflectiveCurveToRelative(-0.99f, -0.44f, -0.99f, -0.99f)
                reflectiveCurveToRelative(0.44f, -0.99f, 0.99f, -0.99f)
                reflectiveCurveToRelative(0.99f, 0.44f, 0.99f, 0.99f)
                close()
                moveTo(14.02f, 8.99f)
                curveToRelative(0f, -0.56f, 0.45f, -1.01f, 1f, -1.01f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1.01f)
                reflectiveCurveToRelative(-0.45f, 1.01f, -1f, 1.01f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1.01f)
                close()
                moveTo(11.98f, 0f)
                curveTo(5.37f, 0f, -0.02f, 5.38f, -0.02f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(0.02f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 11.98f, 0f)
                close()
                moveTo(12f, 23f)
                horizontalLineToRelative(-0.02f)
                curveTo(5.92f, 23f, 0.98f, 18.07f, 0.98f, 12f)
                reflectiveCurveTo(5.92f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(6.11f, 8f)
                horizontalLineToRelative(0.89f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6.42f)
                lineToRelative(-1.35f, 1.44f)
                lineToRelative(-0.73f, -0.69f)
                lineToRelative(2.19f, -2.33f)
                close()
                moveTo(20f, 8f)
                lineToRelative(-4.81f, 8f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(4.81f, -8f)
                horizontalLineToRelative(1.19f)
                close()
            }
        }.also { _Percent10 = it}
