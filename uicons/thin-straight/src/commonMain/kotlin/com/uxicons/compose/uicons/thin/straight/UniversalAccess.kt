package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UniversalAccess: ImageVector? = null

val Icons.Ts.UniversalAccess: ImageVector
    get() = _UniversalAccess ?: UXIcon(name = "UniversalAccess") {
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
                moveTo(12f, 8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(12f, 5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(18.19f, 7.96f)
                lineToRelative(-0.37f, -0.93f)
                lineToRelative(-4.91f, 1.96f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(-4.91f, -1.96f)
                lineToRelative(-0.37f, 0.93f)
                lineToRelative(4.2f, 1.68f)
                verticalLineToRelative(4.72f)
                reflectiveCurveToRelative(-2.45f, 4.39f, -2.45f, 4.39f)
                lineToRelative(0.87f, 0.49f)
                lineToRelative(2.08f, -3.74f)
                horizontalLineToRelative(2.97f)
                lineToRelative(2.08f, 3.74f)
                lineToRelative(0.87f, -0.49f)
                lineToRelative(-2.45f, -4.41f)
                verticalLineToRelative(-4.71f)
                reflectiveCurveToRelative(4.2f, -1.67f, 4.2f, -1.67f)
                close()
                moveTo(12.99f, 14.5f)
                horizontalLineToRelative(-1.99f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.5f)
                close()
            }
        }.also { _UniversalAccess = it}
