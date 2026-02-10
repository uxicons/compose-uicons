package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneGuide: ImageVector? = null

val Icons.Ss.PhoneGuide: ImageVector
    get() = _PhoneGuide ?: UXIcon(name = "PhoneGuide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.29f, 19.11f)
                lineToRelative(-1.77f, 1.77f)
                curveToRelative(-2.03f, -0.77f, -3.52f, -2.21f, -4.4f, -4.4f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(-2.71f, -2.71f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -0.8f, 1.25f, -0.8f, 1.96f)
                curveToRelative(0f, 3.91f, 5.03f, 8.66f, 8.66f, 8.66f)
                curveToRelative(0.71f, 0f, 1.42f, -0.26f, 1.96f, -0.8f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(-2.71f, -2.71f)
                horizontalLineToRelative(-0.0f)
                close()
                moveTo(10.52f, 18.0f)
                horizontalLineToRelative(-4.52f)
                lineTo(6f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(13.0f)
                lineToRelative(-5.83f, -5.83f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.89f, 0.89f, -1.38f, 2.09f, -1.38f, 3.37f)
                curveToRelative(0f, 0.87f, 0.19f, 1.77f, 0.52f, 2.67f)
                close()
                moveTo(15.27f, 24.0f)
                lineTo(2f, 24.0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(9.51f)
                curveToRelative(0.95f, 1.53f, 2.28f, 2.93f, 3.76f, 4f)
                close()
                moveTo(2f, 18.0f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                lineTo(0f, 3f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _PhoneGuide = it}
