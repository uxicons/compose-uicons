package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeAlert: ImageVector? = null

val Icons.Bs.EyeAlert: ImageVector
    get() = _EyeAlert ?: UXIcon(name = "EyeAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21.06f)
                curveTo(3.51f, 21.06f, 0.33f, 12.88f, 0.2f, 12.53f)
                lineTo(-0.0f, 12f)
                lineToRelative(0.2f, -0.53f)
                curveToRelative(0.13f, -0.35f, 3.32f, -8.53f, 11.8f, -8.53f)
                reflectiveCurveToRelative(11.67f, 8.18f, 11.8f, 8.53f)
                lineToRelative(0.2f, 0.53f)
                lineToRelative(-0.2f, 0.53f)
                curveToRelative(-0.13f, 0.35f, -3.31f, 8.53f, -11.8f, 8.53f)
                close()
                moveTo(3.23f, 12f)
                curveToRelative(0.74f, 1.57f, 3.34f, 6.06f, 8.77f, 6.06f)
                reflectiveCurveToRelative(8.02f, -4.49f, 8.77f, -6.06f)
                curveToRelative(-0.74f, -1.57f, -3.34f, -6.06f, -8.77f, -6.06f)
                reflectiveCurveTo(3.98f, 10.43f, 3.23f, 12f)
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
