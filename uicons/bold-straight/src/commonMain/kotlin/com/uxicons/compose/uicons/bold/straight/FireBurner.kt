package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireBurner: ImageVector? = null

val Icons.Bs.FireBurner: ImageVector
    get() = _FireBurner ?: UXIcon(name = "FireBurner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 14f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -3.47f, -4.11f, -6.11f, -6f, -8f)
                curveToRelative(-1.82f, 2.1f, -1.46f, 6f, -2.72f, 6f)
                curveToRelative(-0.61f, 0f, -1.29f, -2.09f, -1.29f, -2.09f)
                curveToRelative(-0.99f, 1.03f, -2.0f, 2.36f, -2.0f, 4.09f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(10.59f, 8.59f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(1.42f, 1.42f)
                horizontalLineToRelative(0f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                reflectiveCurveToRelative(-2.05f, 0.78f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                close()
                moveTo(22f, 16f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.63f, -1.12f, -2.99f, -2.63f, -3.38f)
                curveToRelative(-0.47f, 1.11f, -1.2f, 2.09f, -2.09f, 2.88f)
                horizontalLineToRelative(1.23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(5f, 16f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.23f)
                curveToRelative(-0.9f, -0.79f, -1.62f, -1.77f, -2.09f, -2.88f)
                curveToRelative(-1.51f, 0.39f, -2.63f, 1.75f, -2.63f, 3.38f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(3f, 21f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _FireBurner = it}
