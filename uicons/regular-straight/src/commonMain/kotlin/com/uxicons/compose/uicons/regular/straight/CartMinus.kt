package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartMinus: ImageVector? = null

val Icons.Rs.CartMinus: ImageVector
    get() = _CartMinus ?: UXIcon(name = "CartMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(24f, 3f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(20.17f, 13f)
                lineTo(5.42f, 13f)
                lineToRelative(-0.94f, -8f)
                lineTo(14f, 5f)
                lineTo(14f, 3f)
                lineTo(4.24f, 3f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                lineTo(0f, 0f)
                lineTo(0f, 2f)
                lineTo(1.22f, 2f)
                curveToRelative(0.51f, 0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.58f, 13.47f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(13.22f)
                verticalLineToRelative(-2f)
                lineTo(6.78f, 17f)
                curveToRelative(-0.51f, 0f, -0.93f, -0.38f, -0.99f, -0.88f)
                lineToRelative(-0.13f, -1.12f)
                lineTo(21.83f, 15f)
                lineToRelative(1.27f, -7f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-0.91f, 5f)
                close()
            }
        }.also { _CartMinus = it}
