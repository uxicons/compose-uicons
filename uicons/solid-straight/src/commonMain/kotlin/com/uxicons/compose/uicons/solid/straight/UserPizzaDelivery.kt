package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPizzaDelivery: ImageVector? = null

val Icons.Ss.UserPizzaDelivery: ImageVector
    get() = _UserPizzaDelivery ?: UXIcon(name = "UserPizzaDelivery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 13f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                reflectiveCurveToRelative(0f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(1f, 0.1f, 1f, -1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(18f, 19f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                reflectiveCurveToRelative(0f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(1f, 0.1f, 1f, -1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(4f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.81f)
                curveToRelative(1.04f, -1.79f, 2.97f, -3f, 5.18f, -3f)
                curveToRelative(2.97f, 0f, 5.43f, 2.17f, 5.91f, 5f)
                close()
                moveTo(6.09f, 7f)
                horizontalLineToRelative(11.82f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                reflectiveCurveToRelative(-5.43f, -2.17f, -5.91f, -5f)
                close()
            }
        }.also { _UserPizzaDelivery = it}
