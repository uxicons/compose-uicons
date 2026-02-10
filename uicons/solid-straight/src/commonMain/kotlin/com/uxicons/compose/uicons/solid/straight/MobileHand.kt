package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileHand: ImageVector? = null

val Icons.Ss.MobileHand: ImageVector
    get() = _MobileHand ?: UXIcon(name = "MobileHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.44f, 14.88f)
                lineToRelative(-4.44f, 6.4f)
                verticalLineToRelative(2.72f)
                lineTo(0f, 24.0f)
                lineTo(0f, 12.5f)
                lineTo(7f, 6.38f)
                verticalLineToRelative(6.18f)
                lineToRelative(-2.13f, 1.91f)
                lineToRelative(1.35f, 1.52f)
                lineToRelative(-0.02f, -0.03f)
                lineToRelative(4.88f, -4.37f)
                curveToRelative(0.88f, -0.78f, 2.19f, -0.79f, 3.09f, -0.03f)
                curveToRelative(0.99f, 0.84f, 1.11f, 2.33f, 0.27f, 3.32f)
                close()
                moveTo(16.09f, 16f)
                horizontalLineToRelative(7.91f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(12f, 22f)
                reflectiveCurveToRelative(4.07f, -5.97f, 4.09f, -6f)
                close()
                moveTo(18f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 0f)
                lineTo(9f, 10.77f)
                lineToRelative(0.76f, -0.68f)
                curveToRelative(1.56f, -1.43f, 4.12f, -1.45f, 5.71f, -0.06f)
                curveToRelative(1.14f, 0.96f, 1.72f, 2.49f, 1.48f, 3.96f)
                horizontalLineToRelative(7.06f)
                lineTo(24f, 0f)
                lineTo(9f, 0f)
                close()
            }
        }.also { _MobileHand = it}
