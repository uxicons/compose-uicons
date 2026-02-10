package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileHand: ImageVector? = null

val Icons.Sr.MobileHand: ImageVector
    get() = _MobileHand ?: UXIcon(name = "MobileHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.44f, 14.88f)
                lineToRelative(-3.55f, 5.11f)
                curveToRelative(-0.58f, 0.84f, -0.89f, 1.83f, -0.89f, 2.85f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.64f, -0.52f, 1.16f, -1.16f, 1.16f)
                lineTo(1.16f, 24.0f)
                curveToRelative(-0.64f, 0f, -1.16f, -0.52f, -1.16f, -1.16f)
                verticalLineToRelative(-5.81f)
                curveToRelative(0f, -2.88f, 1.25f, -5.63f, 3.42f, -7.53f)
                lineToRelative(3.58f, -3.14f)
                verticalLineToRelative(6.18f)
                lineToRelative(-1.39f, 1.24f)
                curveToRelative(-0.41f, 0.37f, -0.45f, 1f, -0.08f, 1.41f)
                horizontalLineToRelative(0f)
                curveToRelative(0.37f, 0.41f, 1f, 0.45f, 1.41f, 0.08f)
                lineToRelative(4.14f, -3.7f)
                curveToRelative(0.88f, -0.78f, 2.19f, -0.79f, 3.09f, -0.03f)
                curveToRelative(0.99f, 0.84f, 1.11f, 2.33f, 0.27f, 3.32f)
                close()
                moveTo(16.09f, 16f)
                horizontalLineToRelative(7.91f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-7.5f)
                reflectiveCurveToRelative(4.07f, -5.97f, 4.09f, -6f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(13f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(6.77f)
                lineToRelative(0.76f, -0.68f)
                curveToRelative(1.56f, -1.43f, 4.12f, -1.45f, 5.71f, -0.06f)
                curveToRelative(1.14f, 0.96f, 1.72f, 2.49f, 1.48f, 3.96f)
                horizontalLineToRelative(7.06f)
                lineTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _MobileHand = it}
