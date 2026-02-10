package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderFoodMobile: ImageVector? = null

val Icons.Ss.OrderFoodMobile: ImageVector
    get() = _OrderFoodMobile ?: UXIcon(name = "OrderFoodMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.0f, 5.0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2f)
                lineToRelative(0.0f, 7.91f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.83f, -1.83f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2.0f, -2f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(2f)
                lineToRelative(1.5f, 1f)
                lineToRelative(1.5f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(15f, 9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(0f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(16f, 0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.07f, 0f, -2.07f, 0.42f, -2.83f, 1.17f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                lineToRelative(0.0f, 7.91f)
                curveToRelative(0f, 0.38f, 0.07f, 0.74f, 0.2f, 1.09f)
                horizontalLineToRelative(-11.21f)
                verticalLineToRelative(-16f)
                close()
            }
        }.also { _OrderFoodMobile = it}
