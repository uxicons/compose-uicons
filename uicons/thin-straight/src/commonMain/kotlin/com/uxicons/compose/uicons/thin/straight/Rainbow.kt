package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rainbow: ImageVector? = null

val Icons.Ts.Rainbow: ImageVector
    get() = _Rainbow ?: UXIcon(name = "Rainbow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 8.94f, 1f, 15f)
                verticalLineToRelative(6f)
                lineTo(0f, 21f)
                verticalLineToRelative(-6f)
                curveTo(0f, 8.38f, 5.38f, 3f, 12f, 3f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                verticalLineToRelative(6f)
                close()
                moveTo(20f, 15f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.59f, -8f, 8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(16f, 15f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _Rainbow = it}
