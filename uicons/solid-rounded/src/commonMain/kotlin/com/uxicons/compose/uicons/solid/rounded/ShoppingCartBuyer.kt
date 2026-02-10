package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartBuyer: ImageVector? = null

val Icons.Sr.ShoppingCartBuyer: ImageVector
    get() = _ShoppingCartBuyer ?: UXIcon(name = "ShoppingCartBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(23f, 24f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.31f, 0f, -0.6f, -0.14f, -0.79f, -0.39f)
                curveToRelative(-0.19f, -0.25f, -0.25f, -0.57f, -0.17f, -0.87f)
                curveToRelative(0.59f, -2.2f, 2.63f, -3.74f, 4.97f, -3.74f)
                reflectiveCurveToRelative(4.38f, 1.54f, 4.97f, 3.74f)
                curveToRelative(0.08f, 0.3f, 0.02f, 0.62f, -0.17f, 0.87f)
                curveToRelative(-0.19f, 0.25f, -0.48f, 0.39f, -0.79f, 0.39f)
                close()
                moveTo(23.32f, 4.1f)
                curveToRelative(-0.57f, -0.7f, -1.42f, -1.1f, -2.32f, -1.1f)
                lineTo(5.24f, 3f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                horizontalLineToRelative(-1.22f)
                curveTo(0.45f, 0f, 0f, 0.45f, 0f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.22f)
                curveToRelative(0.51f, 0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.38f, 11.7f)
                curveToRelative(0.3f, 2.52f, 2.43f, 4.42f, 4.97f, 4.42f)
                horizontalLineToRelative(4.44f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.44f)
                curveToRelative(-1.29f, 0f, -2.4f, -0.83f, -2.82f, -2f)
                horizontalLineToRelative(7.81f)
                curveToRelative(0.25f, -2.24f, 2.14f, -4f, 4.45f, -4f)
                curveToRelative(1.46f, 0f, 2.75f, 0.71f, 3.57f, 1.79f)
                lineToRelative(1.37f, -6.2f)
                curveToRelative(0.18f, -0.89f, -0.05f, -1.79f, -0.62f, -2.49f)
                close()
                moveTo(7f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ShoppingCartBuyer = it}
