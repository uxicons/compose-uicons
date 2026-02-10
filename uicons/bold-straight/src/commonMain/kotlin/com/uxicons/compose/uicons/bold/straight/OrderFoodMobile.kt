package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderFoodMobile: ImageVector? = null

val Icons.Bs.OrderFoodMobile: ImageVector
    get() = _OrderFoodMobile ?: UXIcon(name = "OrderFoodMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.56f)
                curveToRelative(0.6f, -0.35f, 1.28f, -0.56f, 2.0f, -0.56f)
                horizontalLineToRelative(0.99f)
                reflectiveCurveToRelative(0.01f, 0f, 0.01f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-13f)
                close()
                moveTo(6.0f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(22.0f, 6.0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2f)
                lineToRelative(0.0f, 7.91f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.83f, -1.83f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2.0f, -2f)
                close()
                moveTo(20f, 13f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(2f)
                lineToRelative(1.5f, 1f)
                lineToRelative(1.5f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _OrderFoodMobile = it}
