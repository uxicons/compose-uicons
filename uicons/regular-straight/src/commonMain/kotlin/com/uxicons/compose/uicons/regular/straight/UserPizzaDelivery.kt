package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPizzaDelivery: ImageVector? = null

val Icons.Rs.UserPizzaDelivery: ImageVector
    get() = _UserPizzaDelivery ?: UXIcon(name = "UserPizzaDelivery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 18.5f)
                verticalLineToRelative(1.5f)
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
                moveTo(6f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.35f)
                curveToRelative(0.83f, -2.33f, 3.04f, -4f, 5.65f, -4f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-8f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(8.56f, 4f)
                horizontalLineToRelative(6.89f)
                curveToRelative(-0.69f, -1.19f, -1.97f, -2f, -3.44f, -2f)
                reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2f)
                close()
                moveTo(16.5f, 21f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(0f, 1.1f, -1f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1f, 0f, -1f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _UserPizzaDelivery = it}
