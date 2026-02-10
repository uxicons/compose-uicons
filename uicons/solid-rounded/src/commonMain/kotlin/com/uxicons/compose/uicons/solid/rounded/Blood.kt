package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Sr.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.04f, 11.86f)
                lineToRelative(-0.83f, -0.63f)
                curveToRelative(-0.72f, -0.55f, -1.71f, -0.55f, -2.43f, 0f)
                lineToRelative(-0.83f, 0.63f)
                lineToRelative(-2.2f, 1.9f)
                curveToRelative(-2.34f, 2.34f, -2.34f, 6.15f, 0f, 8.48f)
                curveToRelative(1.13f, 1.13f, 2.64f, 1.76f, 4.24f, 1.76f)
                reflectiveCurveToRelative(3.11f, -0.62f, 4.24f, -1.76f)
                curveToRelative(2.34f, -2.34f, 2.34f, -6.15f, -0.05f, -8.54f)
                lineToRelative(-2.15f, -1.85f)
                close()
                moveTo(22.36f, 8.58f)
                lineToRelative(-1.95f, -1.8f)
                lineToRelative(-0.53f, -0.51f)
                curveToRelative(-0.77f, -0.74f, -2.0f, -0.74f, -2.77f, -0.0f)
                lineToRelative(-0.51f, 0.49f)
                lineToRelative(-2.0f, 1.84f)
                curveToRelative(-1.04f, 1.04f, -1.61f, 2.42f, -1.61f, 3.89f)
                reflectiveCurveToRelative(0.57f, 2.85f, 1.61f, 3.89f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                curveToRelative(2.15f, -2.15f, 2.15f, -5.63f, -0.03f, -7.81f)
                close()
                moveTo(12.86f, 2.21f)
                lineToRelative(-1.5f, -1.6f)
                curveToRelative(-0.74f, -0.79f, -1.99f, -0.79f, -2.72f, 0f)
                lineToRelative(-1.47f, 1.57f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                reflectiveCurveToRelative(0.42f, 2.07f, 1.17f, 2.83f)
                reflectiveCurveToRelative(1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.1f, 0.03f, -5.62f)
                close()
            }
        }.also { _Blood = it}
