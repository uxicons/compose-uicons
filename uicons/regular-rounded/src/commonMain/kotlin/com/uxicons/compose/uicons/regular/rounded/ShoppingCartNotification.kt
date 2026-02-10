package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartNotification: ImageVector? = null

val Icons.Rr.ShoppingCartNotification: ImageVector
    get() = _ShoppingCartNotification ?: UXIcon(name = "ShoppingCartNotification") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(20f, 6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(19f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(22.56f, 11.25f)
                curveToRelative(-0.57f, 2.21f, -2.56f, 3.75f, -4.84f, 3.75f)
                horizontalLineToRelative(-11.98f)
                curveToRelative(0.42f, 1.17f, 1.53f, 2f, 2.82f, 2f)
                horizontalLineToRelative(10.44f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10.44f)
                curveToRelative(-2.54f, 0f, -4.67f, -1.9f, -4.97f, -4.42f)
                lineToRelative(-1.38f, -11.7f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                horizontalLineToRelative(-0.22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.22f)
                curveToRelative(1.52f, 0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.04f, 0.35f)
                horizontalLineToRelative(8.76f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8.52f)
                lineToRelative(0.94f, 8f)
                horizontalLineToRelative(12.3f)
                curveToRelative(1.37f, 0f, 2.56f, -0.93f, 2.9f, -2.25f)
                curveToRelative(0.14f, -0.54f, 0.68f, -0.85f, 1.22f, -0.72f)
                curveToRelative(0.54f, 0.14f, 0.86f, 0.68f, 0.72f, 1.22f)
                close()
            }
        }.also { _ShoppingCartNotification = it}
