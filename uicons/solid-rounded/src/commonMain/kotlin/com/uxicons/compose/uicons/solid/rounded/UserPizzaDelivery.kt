package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPizzaDelivery: ImageVector? = null

val Icons.Sr.UserPizzaDelivery: ImageVector
    get() = _UserPizzaDelivery ?: UXIcon(name = "UserPizzaDelivery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.81f)
                curveToRelative(1.04f, -1.79f, 2.97f, -3f, 5.19f, -3f)
                curveToRelative(2.97f, 0f, 5.43f, 2.17f, 5.91f, 5f)
                horizontalLineToRelative(-12.91f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(17.91f, 7f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                reflectiveCurveToRelative(-5.43f, -2.17f, -5.91f, -5f)
                horizontalLineToRelative(11.82f)
                close()
                moveTo(14f, 13f)
                horizontalLineToRelative(-4f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4f)
                reflectiveCurveToRelative(0f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(1f, 0.1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
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
            }
        }.also { _UserPizzaDelivery = it}
