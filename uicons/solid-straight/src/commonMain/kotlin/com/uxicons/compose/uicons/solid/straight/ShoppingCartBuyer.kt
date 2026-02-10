package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartBuyer: ImageVector? = null

val Icons.Ss.ShoppingCartBuyer: ImageVector
    get() = _ShoppingCartBuyer ?: UXIcon(name = "ShoppingCartBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(16.5f, 15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7.78f, 17f)
                curveToRelative(-0.51f, 0f, -0.93f, -0.38f, -0.99f, -0.88f)
                lineToRelative(-0.13f, -1.12f)
                horizontalLineToRelative(7.9f)
                curveToRelative(0.25f, -2.24f, 2.14f, -4f, 4.45f, -4f)
                curveToRelative(1.22f, 0f, 2.33f, 0.49f, 3.14f, 1.28f)
                lineToRelative(1.86f, -9.28f)
                lineTo(5.24f, 3f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                lineTo(0f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.22f)
                curveToRelative(0.51f, 0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.58f, 13.47f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.51f, -0.67f, 1.17f, -1.21f, 1.94f, -1.56f)
                curveToRelative(-0.07f, -0.14f, -0.14f, -0.29f, -0.19f, -0.44f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }.also { _ShoppingCartBuyer = it}
