package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubscriptionAlt: ImageVector? = null

val Icons.Bs.SubscriptionAlt: ImageVector
    get() = _SubscriptionAlt ?: UXIcon(name = "SubscriptionAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 14.11f)
                lineToRelative(11f, 3.14f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.48f)
                lineToRelative(-8f, -2.29f)
                verticalLineToRelative(6.77f)
                horizontalLineToRelative(-3f)
                lineToRelative(-4.27f, -3.39f)
                curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
                curveToRelative(0.72f, -0.87f, 2.01f, -0.98f, 2.87f, -0.26f)
                lineToRelative(1.64f, 1.22f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -0.91f, 0.8f, -1.63f, 1.74f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.27f, 0.81f, 1.27f, 1.56f)
                verticalLineToRelative(4.61f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _SubscriptionAlt = it}
