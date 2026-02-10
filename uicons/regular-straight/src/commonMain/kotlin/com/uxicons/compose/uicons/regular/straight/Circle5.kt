package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle5: ImageVector? = null

val Icons.Rs.Circle5: ImageVector
    get() = _Circle5 ?: UXIcon(name = "Circle5") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                lineTo(8f, 6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.51f, 2f, 12f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                close()
            }
        }.also { _Circle5 = it}
