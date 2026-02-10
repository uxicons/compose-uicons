package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShippingFast: ImageVector? = null

val Icons.Ss.ShippingFast: ImageVector
    get() = _ShippingFast ?: UXIcon(name = "ShippingFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 5f)
                lineTo(0f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(12f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                lineTo(0f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(15f)
                lineTo(15f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19.5f, 23f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(-4.88f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                moveToRelative(-14f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                lineTo(3.06f, 20f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                moveToRelative(11.5f, -5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _ShippingFast = it}
