package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeAlert: ImageVector? = null

val Icons.Ss.EyeAlert: ImageVector
    get() = _EyeAlert ?: UXIcon(name = "EyeAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(23.82f, 12.88f)
                curveToRelative(-0.88f, 1.92f, -4.33f, 8.18f, -11.82f, 8.18f)
                reflectiveCurveTo(1.06f, 14.81f, 0.18f, 12.89f)
                curveToRelative(-0.24f, -0.52f, -0.24f, -1.12f, -0.0f, -1.64f)
                curveTo(1.06f, 9.33f, 4.5f, 3.07f, 12.0f, 3.07f)
                reflectiveCurveToRelative(10.94f, 6.26f, 11.82f, 8.18f)
                curveToRelative(0.24f, 0.52f, 0.24f, 1.12f, 0.0f, 1.64f)
                close()
                moveTo(17.5f, 12f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
            }
        }.also { _EyeAlert = it}
