package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cat: ImageVector? = null

val Icons.Ss.Cat: ImageVector
    get() = _Cat ?: UXIcon(name = "Cat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.71f, 2.46f)
                curveToRelative(-0.68f, -0.3f, -1.43f, -0.47f, -2.21f, -0.47f)
                reflectiveCurveToRelative(-1.53f, 0.17f, -2.21f, 0.47f)
                lineToRelative(-3.29f, -2.46f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(24f, 0f)
                lineToRelative(-3.29f, 2.46f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                lineTo(6.56f, 24f)
                curveToRelative(-3.22f, 0f, -6.56f, -2.06f, -6.56f, -5.5f)
                curveToRelative(0f, -2.13f, 0.94f, -3.66f, 1.78f, -5.0f)
                curveToRelative(0.66f, -1.06f, 1.22f, -1.97f, 1.22f, -3.0f)
                curveToRelative(0f, -1.3f, -0.36f, -2.5f, -3f, -2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(4.35f, 0f, 5f, 2.82f, 5f, 4.5f)
                curveToRelative(0f, 1.6f, -0.77f, 2.84f, -1.52f, 4.05f)
                curveToRelative(-0.76f, 1.23f, -1.48f, 2.38f, -1.48f, 3.95f)
                curveToRelative(0f, 1.79f, 1.47f, 2.85f, 3.0f, 3.28f)
                curveToRelative(0.01f, -1.3f, 0.36f, -7.99f, 6.72f, -11.08f)
                curveToRelative(1.2f, 2.54f, 3.79f, 4.3f, 6.78f, 4.3f)
                curveToRelative(1.26f, 0f, 2.46f, -0.31f, 3.5f, -0.87f)
                verticalLineToRelative(7.87f)
                close()
            }
        }.also { _Cat = it}
