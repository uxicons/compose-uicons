package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubscriptionUser: ImageVector? = null

val Icons.Sr.SubscriptionUser: ImageVector
    get() = _SubscriptionUser ?: UXIcon(name = "SubscriptionUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(2.85f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(24.0f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(8.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(12.13f, 14.9f)
                curveToRelative(-0.49f, 0.24f, -1.09f, 0.03f, -1.33f, -0.47f)
                curveToRelative(-0.42f, -0.87f, -1.32f, -1.43f, -2.29f, -1.43f)
                reflectiveCurveToRelative(-1.88f, 0.56f, -2.29f, 1.43f)
                curveToRelative(-0.24f, 0.5f, -0.83f, 0.71f, -1.33f, 0.47f)
                curveToRelative(-0.5f, -0.24f, -0.71f, -0.84f, -0.47f, -1.33f)
                curveToRelative(0.75f, -1.56f, 2.36f, -2.57f, 4.1f, -2.57f)
                reflectiveCurveToRelative(3.35f, 1.01f, 4.1f, 2.57f)
                curveToRelative(0.24f, 0.5f, 0.03f, 1.09f, -0.47f, 1.33f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _SubscriptionUser = it}
