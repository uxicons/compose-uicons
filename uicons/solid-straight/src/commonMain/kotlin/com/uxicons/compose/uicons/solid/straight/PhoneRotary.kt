package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneRotary: ImageVector? = null

val Icons.Ss.PhoneRotary: ImageVector
    get() = _PhoneRotary ?: UXIcon(name = "PhoneRotary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.25f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(-2.06f)
                lineToRelative(-3.23f, -5.26f)
                reflectiveCurveToRelative(-3.36f, -1.74f, -6.71f, -1.74f)
                reflectiveCurveToRelative(-6.71f, 1.74f, -6.71f, 1.74f)
                lineToRelative(-3.23f, 5.26f)
                lineTo(0f, 11f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0f, -1.41f, 0.56f, -2.76f, 1.59f, -3.79f)
                curveTo(6.16f, -1.11f, 17.84f, -1.11f, 22.41f, 3.46f)
                curveToRelative(1.03f, 1.03f, 1.59f, 2.37f, 1.59f, 3.79f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(24f, 21.5f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.98f, 0.53f, -3.93f, 1.62f, -5.97f)
                lineToRelative(2.83f, -4.53f)
                horizontalLineToRelative(-0.04f)
                lineToRelative(2.29f, -3.73f)
                curveToRelative(0.71f, -0.33f, 2.94f, -1.27f, 5.3f, -1.27f)
                reflectiveCurveToRelative(4.59f, 0.94f, 5.3f, 1.27f)
                lineToRelative(2.29f, 3.73f)
                horizontalLineToRelative(-0.04f)
                lineToRelative(2.83f, 4.53f)
                curveToRelative(1.09f, 2.04f, 1.62f, 3.99f, 1.62f, 5.97f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _PhoneRotary = it}
