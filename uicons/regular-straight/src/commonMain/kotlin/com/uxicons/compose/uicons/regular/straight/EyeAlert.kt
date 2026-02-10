package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeAlert: ImageVector? = null

val Icons.Rs.EyeAlert: ImageVector
    get() = _EyeAlert ?: UXIcon(name = "EyeAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                curveTo(4.5f, 21f, 1.06f, 14.74f, 0.18f, 12.82f)
                curveToRelative(-0.24f, -0.52f, -0.24f, -1.12f, -0.0f, -1.64f)
                curveTo(1.06f, 9.26f, 4.5f, 3f, 12f, 3f)
                reflectiveCurveToRelative(10.94f, 6.26f, 11.82f, 8.18f)
                curveToRelative(0.24f, 0.52f, 0.24f, 1.12f, 0.0f, 1.64f)
                curveToRelative(-0.88f, 1.92f, -4.33f, 8.18f, -11.82f, 8.18f)
                close()
                moveTo(12f, 5f)
                curveTo(5.7f, 5f, 2.75f, 10.37f, 2.0f, 12.01f)
                curveToRelative(0.75f, 1.62f, 3.69f, 6.99f, 10.0f, 6.99f)
                reflectiveCurveToRelative(9.25f, -5.37f, 10.0f, -7.01f)
                curveToRelative(-0.75f, -1.62f, -3.7f, -6.99f, -10.0f, -6.99f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(13f, 15.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 12.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _EyeAlert = it}
