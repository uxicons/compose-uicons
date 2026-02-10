package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubscriptionAlt: ImageVector? = null

val Icons.Ss.SubscriptionAlt: ImageVector
    get() = _SubscriptionAlt ?: UXIcon(name = "SubscriptionAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 16.46f)
                lineToRelative(9f, 3.54f)
                verticalLineToRelative(4f)
                horizontalLineTo(5.54f)
                lineToRelative(-1.82f, -1.63f)
                curveToRelative(-0.92f, -0.86f, -0.96f, -2.31f, -0.1f, -3.23f)
                curveToRelative(0.86f, -0.92f, 2.31f, -0.97f, 3.23f, -0.11f)
                curveToRelative(0.03f, 0.03f, 1.07f, 0.9f, 2.15f, 1.78f)
                verticalLineToRelative(-8.82f)
                curveToRelative(0f, -1.22f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveToRelative(0.98f, 0.16f, 1.66f, 1.08f, 1.66f, 2.08f)
                verticalLineToRelative(4.36f)
                close()
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(7.13f)
                curveToRelative(0.44f, -1.73f, 2.01f, -3f, 3.87f, -3f)
                reflectiveCurveToRelative(3.43f, 1.27f, 3.87f, 3f)
                horizontalLineToRelative(9.13f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _SubscriptionAlt = it}
