package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubscriptionAlt: ImageVector? = null

val Icons.Sr.SubscriptionAlt: ImageVector
    get() = _SubscriptionAlt ?: UXIcon(name = "SubscriptionAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12.11f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(8.82f)
                curveToRelative(-1.08f, -0.89f, -2.11f, -1.75f, -2.15f, -1.78f)
                curveToRelative(-0.92f, -0.86f, -2.37f, -0.81f, -3.23f, 0.11f)
                curveToRelative(-0.86f, 0.92f, -0.82f, 2.37f, 0.1f, 3.23f)
                lineToRelative(1.82f, 1.63f)
                horizontalLineToRelative(16.46f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -2.06f, -1.26f, -3.9f, -3.17f, -4.65f)
                lineToRelative(-5.83f, -2.29f)
                verticalLineToRelative(-4.36f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-5.65f)
                curveToRelative(-0.41f, -1.51f, -1.65f, -2.7f, -3.19f, -2.95f)
                curveToRelative(-1.17f, -0.19f, -2.35f, 0.14f, -3.25f, 0.9f)
                curveToRelative(-0.64f, 0.54f, -1.08f, 1.26f, -1.28f, 2.05f)
                horizontalLineToRelative(-1.63f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-2f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
            }
        }.also { _SubscriptionAlt = it}
