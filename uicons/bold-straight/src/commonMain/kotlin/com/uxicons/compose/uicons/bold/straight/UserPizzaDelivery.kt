package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPizzaDelivery: ImageVector? = null

val Icons.Bs.UserPizzaDelivery: ImageVector
    get() = _UserPizzaDelivery ?: UXIcon(name = "UserPizzaDelivery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 13.02f)
                horizontalLineToRelative(-9f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(5.48f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                reflectiveCurveToRelative(0f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(1f, 0.1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.48f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                reflectiveCurveToRelative(0f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(1f, 0.1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                curveToRelative(-2.21f, 0f, -4.15f, 1.21f, -5.19f, 3f)
                horizontalLineToRelative(-2.81f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _UserPizzaDelivery = it}
