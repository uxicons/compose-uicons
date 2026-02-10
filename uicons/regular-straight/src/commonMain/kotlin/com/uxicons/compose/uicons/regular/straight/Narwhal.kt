package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Narwhal: ImageVector? = null

val Icons.Rs.Narwhal: ImageVector
    get() = _Narwhal ?: UXIcon(name = "Narwhal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 16.0f)
                curveToRelative(0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f)
                lineTo(6f, 24f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-2.73f)
                curveToRelative(0f, -3.37f, 0.99f, -6.63f, 2.85f, -9.43f)
                lineToRelative(0.5f, -0.75f)
                curveTo(1.38f, 4.25f, 0f, 2.28f, 0f, 0f)
                curveToRelative(4.12f, 0f, 5.5f, 2.78f, 5.5f, 2.78f)
                curveToRelative(0f, 0f, 1.33f, -2.78f, 5.5f, -2.78f)
                curveToRelative(0f, 2.56f, -1.75f, 4.74f, -4.13f, 5.35f)
                lineToRelative(-0.47f, 2.77f)
                curveToRelative(-0.18f, 1.08f, -0.3f, 2.18f, -0.36f, 3.28f)
                curveToRelative(2.33f, -1.74f, 5.36f, -3.4f, 8.46f, -3.4f)
                curveToRelative(0.63f, 0f, 1.86f, 0f, 1.86f, 0f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.63f, 0.03f, 1.25f, 0.13f, 1.84f, 0.3f)
                lineTo(23.1f, 0f)
                lineToRelative(0.9f, 0.53f)
                lineToRelative(-2.62f, 9.56f)
                curveToRelative(1.61f, 1.46f, 2.62f, 3.57f, 2.62f, 5.91f)
                close()
                moveTo(22f, 16.0f)
                curveToRelative(0f, -3.31f, -2.69f, -6.0f, -5.99f, -6.0f)
                verticalLineToRelative(-0.0f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(-4.31f, 0f, -8.77f, 4.09f, -10.5f, 5.86f)
                verticalLineToRelative(-2.92f)
                curveToRelative(0f, -1.73f, 0.15f, -3.46f, 0.43f, -5.16f)
                lineToRelative(0.16f, -0.94f)
                curveToRelative(-1.65f, 2.47f, -2.59f, 5.46f, -2.59f, 8.43f)
                verticalLineToRelative(2.73f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(10.0f)
                curveToRelative(3.31f, 0f, 6.0f, -2.69f, 6.0f, -6.0f)
                close()
            }
        }.also { _Narwhal = it}
