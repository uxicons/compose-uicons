package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartMinus: ImageVector? = null

val Icons.Bs.CartMinus: ImageVector
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
                moveTo(15f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                lineTo(24f, 3f)
                lineTo(15f, 3f)
                close()
                moveTo(18.09f, 15f)
                lineTo(7.41f, 15f)
                curveToRelative(-0.25f, 0f, -0.46f, -0.19f, -0.5f, -0.43f)
                lineToRelative(-0.88f, -6.57f)
                horizontalLineToRelative(5.97f)
                verticalLineToRelative(-3f)
                lineTo(5.63f, 5f)
                lineToRelative(-0.26f, -1.96f)
                curveToRelative(-0.23f, -1.73f, -1.72f, -3.04f, -3.47f, -3.04f)
                lineTo(0f, -0f)
                lineTo(0f, 3f)
                lineTo(1.9f, 3f)
                curveToRelative(0.25f, 0f, 0.46f, 0.19f, 0.5f, 0.43f)
                lineToRelative(1.54f, 11.53f)
                curveToRelative(0.23f, 1.73f, 1.72f, 3.04f, 3.47f, 3.04f)
                horizontalLineToRelative(12.97f)
                lineToRelative(2.49f, -9f)
                horizontalLineToRelative(-3.11f)
                lineToRelative(-1.66f, 6f)
                close()
            }
        }.also { _CartMinus = it}
