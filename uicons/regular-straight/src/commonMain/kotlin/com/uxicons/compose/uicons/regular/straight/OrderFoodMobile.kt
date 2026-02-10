package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderFoodMobile: ImageVector? = null

val Icons.Rs.OrderFoodMobile: ImageVector
    get() = _OrderFoodMobile ?: UXIcon(name = "OrderFoodMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-21f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.06f, -1.0f, 0.14f)
                verticalLineToRelative(-1.14f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-2.83f, 1.83f)
                curveToRelative(-0.72f, 0.46f, -1.67f, -0.06f, -1.67f, -0.92f)
                lineToRelative(-0.0f, -7.91f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2.0f, -2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2.0f, 0.9f, 2.0f, 2f)
                close()
                moveTo(22f, 10f)
                horizontalLineToRelative(-2f)
                lineToRelative(-1.5f, 1f)
                lineToRelative(-1.5f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(22f, 9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(10f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _OrderFoodMobile = it}
