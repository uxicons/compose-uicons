package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderFoodTelephone: ImageVector? = null

val Icons.Ss.OrderFoodTelephone: ImageVector
    get() = _OrderFoodTelephone ?: UXIcon(name = "OrderFoodTelephone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 7.0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(2f)
                lineToRelative(1.5f, 1f)
                lineToRelative(1.5f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(15f, 4.0f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(22.0f, 0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2f)
                lineToRelative(0.0f, 7.91f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.83f, -1.83f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2.0f, -2f)
                close()
                moveTo(17.61f, 12.85f)
                lineTo(23.88f, 19.11f)
                lineTo(20.71f, 22.29f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveToRelative(-7.25f, -0.0f, -16.5f, -9.25f, -16.5f, -16.5f)
                curveToRelative(0f, -1.61f, 0.61f, -3.1f, 1.72f, -4.21f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                close()
            }
        }.also { _OrderFoodTelephone = it}
