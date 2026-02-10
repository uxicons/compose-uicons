package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitHand: ImageVector? = null

val Icons.Ss.LimitHand: ImageVector
    get() = _LimitHand ?: UXIcon(name = "LimitHand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                horizontalLineToRelative(12f)
                lineToRelative(-6f, -10.29f)
                lineToRelative(-6f, 10.29f)
                close()
                moveTo(19f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(15.53f)
                lineToRelative(-4.68f, -8.03f)
                horizontalLineToRelative(-2.63f)
                lineToRelative(-7f, 12f)
                horizontalLineToRelative(-1.68f)
                lineTo(0.65f, 16.41f)
                curveToRelative(-0.71f, -0.71f, -0.88f, -1.87f, -0.28f, -2.68f)
                curveToRelative(0.63f, -0.84f, 1.74f, -1.03f, 2.58f, -0.56f)
                curveToRelative(0.2f, 0.13f, 0.35f, 0.24f, 0.44f, 0.33f)
                lineToRelative(2.6f, 2.65f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -0.91f, 0.81f, -1.63f, 1.75f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.25f, 0.81f, 1.25f, 1.56f)
                verticalLineToRelative(6.42f)
                horizontalLineToRelative(2f)
                lineTo(11f, 1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2f)
                lineTo(16f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _LimitHand = it}
