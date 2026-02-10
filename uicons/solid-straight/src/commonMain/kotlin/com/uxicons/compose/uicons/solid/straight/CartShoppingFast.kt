package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartShoppingFast: ImageVector? = null

val Icons.Ss.CartShoppingFast: ImageVector
    get() = _CartShoppingFast ?: UXIcon(name = "CartShoppingFast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.69f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(-2f)
                lineTo(3.45f, 5f)
                lineToRelative(0.24f, 2f)
                close()
                moveTo(0f, 13f)
                verticalLineToRelative(2f)
                lineTo(4.63f, 15f)
                lineToRelative(-0.24f, -2f)
                lineTo(0f, 13f)
                close()
                moveTo(3.92f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(2f)
                lineTo(4.16f, 11f)
                lineToRelative(-0.24f, -2f)
                close()
                moveTo(21.59f, 15f)
                lineTo(8.65f, 15f)
                lineToRelative(0.13f, 1.12f)
                curveToRelative(0.06f, 0.5f, 0.49f, 0.88f, 0.99f, 0.88f)
                horizontalLineToRelative(11.22f)
                verticalLineToRelative(2f)
                lineTo(9.78f, 19f)
                curveToRelative(-1.52f, 0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineTo(5.21f, 2.88f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                lineTo(2f, 2f)
                lineTo(2f, 0f)
                horizontalLineToRelative(2.22f)
                curveToRelative(1.52f, 0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.04f, 0.35f)
                lineTo(23.99f, 3f)
                lineToRelative(-2.4f, 12f)
                close()
                moveTo(9f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(18f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _CartShoppingFast = it}
