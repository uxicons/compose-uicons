package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZeroPercent: ImageVector? = null

val Icons.Rs.ZeroPercent: ImageVector
    get() = _ZeroPercent ?: UXIcon(name = "ZeroPercent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(8f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8.9f, 13.5f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.4f, -0.9f, -0.9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.5f, 0.4f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.4f, 0.9f, 0.9f)
                verticalLineToRelative(3f)
                close()
                moveTo(18.5f, 14.73f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                close()
                moveTo(11.5f, 9.23f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
                close()
                moveTo(16.59f, 7.98f)
                horizontalLineToRelative(1.91f)
                lineToRelative(-5.22f, 8f)
                horizontalLineToRelative(-1.91f)
                lineToRelative(5.22f, -8f)
                close()
            }
        }.also { _ZeroPercent = it}
