package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShippingTimed: ImageVector? = null

val Icons.Ss.ShippingTimed: ImageVector
    get() = _ShippingTimed ?: UXIcon(name = "ShippingTimed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(7.76f, 0f, 5f, 0f)
                close()
                moveTo(6.22f, 7.63f)
                lineToRelative(-2.22f, -2.22f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.63f, 1.63f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(15f, 4f)
                verticalLineToRelative(14f)
                lineTo(0f, 18f)
                verticalLineToRelative(-8.11f)
                curveToRelative(1.27f, 1.3f, 3.04f, 2.11f, 5f, 2.11f)
                curveToRelative(3.87f, 0f, 7f, -3.13f, 7f, -7f)
                curveToRelative(0f, -1.49f, -0.47f, -2.87f, -1.26f, -4f)
                horizontalLineToRelative(1.26f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21.94f, 20f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(7.94f, 20f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _ShippingTimed = it}
