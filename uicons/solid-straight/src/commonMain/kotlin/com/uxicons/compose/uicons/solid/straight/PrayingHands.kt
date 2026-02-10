package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrayingHands: ImageVector? = null

val Icons.Ss.PrayingHands: ImageVector
    get() = _PrayingHands ?: UXIcon(name = "PrayingHands") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21.09f)
                verticalLineToRelative(2.91f)
                horizontalLineToRelative(-8.73f)
                curveToRelative(-1.46f, -1.79f, -2.27f, -4.03f, -2.27f, -6.39f)
                verticalLineToRelative(-5.61f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2f, -1.33f, -3.04f, -1.41f, -3.15f)
                lineToRelative(-4.23f, -5.7f)
                curveToRelative(-0.63f, -0.91f, -0.41f, -2.15f, 0.49f, -2.79f)
                horizontalLineToRelative(0f)
                curveToRelative(0.91f, -0.63f, 2.15f, -0.41f, 2.79f, 0.49f)
                lineToRelative(5.58f, 7.59f)
                curveToRelative(0.51f, 0.69f, 0.78f, 1.52f, 0.78f, 2.37f)
                verticalLineToRelative(9.27f)
                lineToRelative(1f, 1f)
                close()
                moveTo(0f, 21.09f)
                verticalLineToRelative(2.91f)
                reflectiveCurveToRelative(8.73f, 0f, 8.73f, 0f)
                curveToRelative(1.46f, -1.79f, 2.27f, -4.03f, 2.27f, -6.39f)
                verticalLineToRelative(-5.61f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2f, 1.33f, -3.04f, 1.41f, -3.15f)
                lineToRelative(4.23f, -5.7f)
                curveToRelative(0.63f, -0.91f, 0.41f, -2.15f, -0.49f, -2.79f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.91f, -0.63f, -2.15f, -0.41f, -2.79f, 0.49f)
                lineTo(1.78f, 8.44f)
                curveToRelative(-0.51f, 0.69f, -0.78f, 1.52f, -0.78f, 2.37f)
                verticalLineToRelative(9.27f)
                reflectiveCurveTo(0f, 21.09f, 0f, 21.09f)
                close()
            }
        }.also { _PrayingHands = it}
