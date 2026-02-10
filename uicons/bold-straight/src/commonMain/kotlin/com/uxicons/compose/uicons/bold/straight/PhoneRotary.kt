package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneRotary: ImageVector? = null

val Icons.Bs.PhoneRotary: ImageVector
    get() = _PhoneRotary ?: UXIcon(name = "PhoneRotary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.47f)
                curveToRelative(0f, -1.5f, -0.6f, -2.92f, -1.68f, -4.0f)
                curveTo(20.07f, 1.22f, 16.26f, -0.02f, 11.87f, 0f)
                curveTo(7.62f, 0.04f, 3.81f, 1.34f, 1.68f, 3.46f)
                curveTo(0.6f, 4.55f, 0f, 5.97f, 0f, 7.47f)
                verticalLineToRelative(4.53f)
                horizontalLineToRelative(2.49f)
                lineToRelative(-1.11f, 2.07f)
                curveToRelative(-0.9f, 1.67f, -1.37f, 3.56f, -1.37f, 5.45f)
                verticalLineToRelative(4.48f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-4.48f)
                curveToRelative(0f, -1.9f, -0.48f, -3.78f, -1.38f, -5.45f)
                lineToRelative(-1.11f, -2.07f)
                horizontalLineToRelative(2.49f)
                verticalLineToRelative(-4.53f)
                close()
                moveTo(3f, 7.46f)
                curveToRelative(0f, -0.69f, 0.28f, -1.36f, 0.8f, -1.88f)
                curveToRelative(1.56f, -1.56f, 4.66f, -2.55f, 8.1f, -2.58f)
                curveToRelative(3.53f, -0.02f, 6.64f, 0.93f, 8.29f, 2.58f)
                curveToRelative(0.52f, 0.52f, 0.8f, 1.19f, 0.8f, 1.88f)
                verticalLineToRelative(1.53f)
                horizontalLineToRelative(-1.15f)
                lineToRelative(-1.26f, -2.09f)
                reflectiveCurveToRelative(-3.22f, -1.91f, -6.59f, -1.91f)
                reflectiveCurveToRelative(-6.59f, 1.91f, -6.59f, 1.91f)
                lineToRelative(-1.26f, 2.09f)
                horizontalLineToRelative(-1.15f)
                verticalLineToRelative(-1.54f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-1.48f)
                curveToRelative(0f, -1.4f, 0.35f, -2.79f, 1.02f, -4.03f)
                lineToRelative(2.28f, -4.24f)
                lineToRelative(1.28f, -2.13f)
                curveToRelative(0.69f, -0.35f, 2.45f, -1.12f, 4.43f, -1.12f)
                reflectiveCurveToRelative(3.74f, 0.78f, 4.43f, 1.12f)
                lineToRelative(1.28f, 2.13f)
                lineToRelative(2.28f, 4.24f)
                curveToRelative(0.67f, 1.24f, 1.02f, 2.63f, 1.02f, 4.03f)
                verticalLineToRelative(1.48f)
                close()
                moveTo(16f, 15f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
            }
        }.also { _PhoneRotary = it}
