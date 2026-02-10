package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateUtensils: ImageVector? = null

val Icons.Ts.PlateUtensils: ImageVector
    get() = _PlateUtensils ?: UXIcon(name = "PlateUtensils") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(15f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                lineTo(19f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(23f, 0f)
                horizontalLineToRelative(1f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                curveToRelative(0.34f, 0f, 0.67f, 0.02f, 1f, 0.05f)
                lineTo(13f, 0.05f)
                curveToRelative(-0.33f, -0.03f, -0.66f, -0.05f, -1f, -0.05f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.79f, 0f, 3.48f, -0.4f, 5f, -1.1f)
                verticalLineToRelative(-1.11f)
                curveToRelative(-1.5f, 0.77f, -3.2f, 1.21f, -5f, 1.21f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(5f, 12f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(0.34f, 0f, 0.67f, 0.03f, 1f, 0.08f)
                verticalLineToRelative(-1.01f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.07f, -1f, -0.07f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(1.89f, 0f, 3.63f, -0.66f, 5f, -1.76f)
                verticalLineToRelative(-1.34f)
                curveToRelative(-1.27f, 1.3f, -3.04f, 2.11f, -5f, 2.11f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                close()
            }
        }.also { _PlateUtensils = it}
