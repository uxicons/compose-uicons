package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderFoodMobile: ImageVector? = null

val Icons.Sr.OrderFoodMobile: ImageVector
    get() = _OrderFoodMobile ?: UXIcon(name = "OrderFoodMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 5.0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineToRelative(0.0f, 7.41f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.83f, -1.83f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(1.74f)
                lineToRelative(1.24f, 0.84f)
                curveToRelative(0.32f, 0.21f, 0.73f, 0.21f, 1.04f, 0f)
                lineToRelative(1.24f, -0.84f)
                horizontalLineToRelative(1.74f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(15f, 9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(11.21f, 16.0f)
                horizontalLineToRelative(-11.21f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.04f, 0f, 3.8f, 1.24f, 4.57f, 3.0f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                lineToRelative(0.0f, 7.41f)
                curveToRelative(0f, 0.38f, 0.07f, 0.75f, 0.2f, 1.09f)
                close()
                moveTo(0f, 19.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-16f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _OrderFoodMobile = it}
