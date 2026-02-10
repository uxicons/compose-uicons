package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartShoppingFast: ImageVector? = null

val Icons.Bs.CartShoppingFast: ImageVector
    get() = _CartShoppingFast ?: UXIcon(name = "CartShoppingFast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(18f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(23.97f, 5f)
                lineToRelative(-3.6f, 13f)
                lineTo(9.41f, 18f)
                curveToRelative(-1.75f, 0f, -3.24f, -1.31f, -3.47f, -3.04f)
                lineTo(4.4f, 3.43f)
                curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f)
                horizontalLineToRelative(-1.9f)
                lineTo(2f, 0f)
                horizontalLineToRelative(1.9f)
                curveToRelative(1.75f, 0f, 3.24f, 1.31f, 3.47f, 3.04f)
                lineToRelative(0.26f, 1.96f)
                lineTo(23.97f, 5f)
                close()
                moveTo(20.03f, 8f)
                lineTo(8.03f, 8f)
                lineToRelative(0.88f, 6.57f)
                curveToRelative(0.03f, 0.25f, 0.25f, 0.43f, 0.5f, 0.43f)
                horizontalLineToRelative(8.68f)
                lineToRelative(1.94f, -7f)
                close()
                moveTo(2.59f, 5f)
                lineTo(0f, 5f)
                verticalLineToRelative(3f)
                lineTo(2.99f, 8f)
                lineToRelative(-0.4f, -3f)
                close()
                moveTo(3.92f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                lineTo(5.18f, 18f)
                curveToRelative(-0.64f, -0.77f, -1.08f, -1.72f, -1.23f, -2.77f)
                lineToRelative(-0.03f, -0.23f)
                close()
                moveTo(3.25f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(3f)
                lineTo(3.66f, 13f)
                lineToRelative(-0.4f, -3f)
                close()
            }
        }.also { _CartShoppingFast = it}
