package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleUser: ImageVector? = null

val Icons.Rr.CircleUser: ImageVector
    get() = _CircleUser ?: UXIcon(name = "CircleUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(8f, 21.16f)
                verticalLineToRelative(-0.16f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(0.16f)
                curveToRelative(-1.23f, 0.54f, -2.58f, 0.84f, -4f, 0.84f)
                reflectiveCurveToRelative(-2.77f, -0.3f, -4f, -0.84f)
                close()
                moveTo(17.93f, 20.05f)
                curveToRelative(-0.46f, -2.86f, -2.94f, -5.05f, -5.92f, -5.05f)
                reflectiveCurveToRelative(-5.47f, 2.19f, -5.92f, 5.05f)
                curveToRelative(-2.47f, -1.82f, -4.08f, -4.75f, -4.08f, -8.05f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 3.3f, -1.6f, 6.23f, -4.08f, 8.05f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _CircleUser = it}
