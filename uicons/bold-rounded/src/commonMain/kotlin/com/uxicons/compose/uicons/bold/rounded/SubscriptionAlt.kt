package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubscriptionAlt: ImageVector? = null

val Icons.Br.SubscriptionAlt: ImageVector
    get() = _SubscriptionAlt ?: UXIcon(name = "SubscriptionAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            lineTo(5f, 3f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.99f, 0.74f, 1.84f, 1.71f, 1.98f)
            curveToRelative(0.82f, 0.12f, 1.39f, 0.88f, 1.27f, 1.7f)
            curveToRelative(-0.12f, 0.82f, -0.89f, 1.39f, -1.7f, 1.27f)
            curveToRelative(-2.44f, -0.35f, -4.29f, -2.48f, -4.29f, -4.95f)
            verticalLineToRelative(-1f)
            curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
            horizontalLineToRelative(14f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            close()
            moveTo(17.08f, 16.71f)
            lineToRelative(-6.08f, -1.82f)
            verticalLineToRelative(-5.29f)
            curveToRelative(0f, -0.7f, -0.45f, -1.37f, -1.13f, -1.54f)
            curveToRelative(-1.0f, -0.26f, -1.88f, 0.49f, -1.88f, 1.45f)
            verticalLineToRelative(10.27f)
            lineToRelative(-1.64f, -1.3f)
            curveToRelative(-0.87f, -0.72f, -2.15f, -0.6f, -2.87f, 0.26f)
            curveToRelative(-0.72f, 0.87f, -0.6f, 2.15f, 0.26f, 2.87f)
            lineToRelative(1.68f, 1.48f)
            curveToRelative(0.66f, 0.58f, 1.52f, 0.91f, 2.4f, 0.91f)
            horizontalLineToRelative(0.76f)
            curveToRelative(1.34f, 0f, 2.42f, -1.08f, 2.42f, -2.42f)
            verticalLineToRelative(-3.56f)
            lineToRelative(5.22f, 1.57f)
            curveToRelative(1.06f, 0.32f, 1.78f, 1.28f, 1.78f, 2.39f)
            verticalLineToRelative(0.52f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.52f)
            curveToRelative(0f, -2.45f, -1.57f, -4.57f, -3.92f, -5.27f)
            close()
        }
    }.also { _SubscriptionAlt = it }
