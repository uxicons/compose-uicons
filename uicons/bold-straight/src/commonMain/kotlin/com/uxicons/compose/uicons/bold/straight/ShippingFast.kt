package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShippingFast: ImageVector? = null

val Icons.Bs.ShippingFast: ImageVector
    get() = _ShippingFast ?: UXIcon(name = "ShippingFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                close()
                moveTo(8f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 20f)
                horizontalLineToRelative(-3.05f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f)
                lineTo(7.95f, 20f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f)
                lineTo(0f, 20f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                lineTo(14f, 4.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(12f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(17f, 8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }.also { _ShippingFast = it}
