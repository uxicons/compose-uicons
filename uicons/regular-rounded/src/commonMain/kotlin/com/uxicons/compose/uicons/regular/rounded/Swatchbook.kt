package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swatchbook: ImageVector? = null

val Icons.Rr.Swatchbook: ImageVector
    get() = _Swatchbook ?: UXIcon(name = "Swatchbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13f)
                horizontalLineToRelative(-1.22f)
                lineToRelative(1.05f, -1.05f)
                curveToRelative(0.76f, -0.76f, 1.17f, -1.76f, 1.17f, -2.83f)
                reflectiveCurveToRelative(-0.42f, -2.07f, -1.17f, -2.83f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-1.51f, -1.51f, -4.15f, -1.51f, -5.66f, 0f)
                lineToRelative(-1.05f, 1.05f)
                verticalLineToRelative(-1.22f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(13.46f, 5.59f)
                curveToRelative(0.76f, -0.76f, 2.07f, -0.76f, 2.83f, 0f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.04f, -0.59f, 1.42f)
                lineToRelative(-7.41f, 7.41f)
                verticalLineToRelative(-9.9f)
                lineToRelative(2.46f, -2.46f)
                close()
                moveTo(2f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                lineTo(2f, 12f)
                verticalLineToRelative(-4f)
                close()
                moveTo(4f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                lineTo(2f, 6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(2f, 18.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(22f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-10.22f)
                lineToRelative(7f, -7f)
                horizontalLineToRelative(3.22f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                close()
                moveTo(5.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Swatchbook = it}
