package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lips: ImageVector? = null

val Icons.Rs.Lips: ImageVector
    get() = _Lips ?: UXIcon(name = "Lips") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.88f, 11.52f)
                curveToRelative(-2.23f, -4.05f, -5.11f, -6.85f, -6.89f, -8.02f)
                curveToRelative(-1.22f, -0.79f, -2.84f, -0.62f, -3.88f, 0.41f)
                lineToRelative(-1.11f, 1.11f)
                lineToRelative(-1.11f, -1.11f)
                curveToRelative(-1.03f, -1.03f, -2.66f, -1.2f, -3.88f, -0.41f)
                curveTo(5.14f, 4.73f, 2.29f, 7.67f, 0.13f, 11.48f)
                lineToRelative(-0.13f, 0.27f)
                verticalLineToRelative(0.53f)
                lineToRelative(0.13f, 0.23f)
                curveToRelative(0.17f, 0.31f, 4.37f, 7.49f, 11.87f, 7.49f)
                reflectiveCurveToRelative(11.69f, -7.18f, 11.87f, -7.48f)
                lineToRelative(0.13f, -0.25f)
                verticalLineToRelative(-0.52f)
                lineToRelative(-0.12f, -0.23f)
                close()
                moveTo(8.11f, 5.18f)
                curveToRelative(0.43f, -0.28f, 1.0f, -0.22f, 1.37f, 0.15f)
                lineToRelative(2.52f, 2.52f)
                lineToRelative(2.52f, -2.52f)
                curveToRelative(0.36f, -0.36f, 0.94f, -0.43f, 1.37f, -0.15f)
                curveToRelative(1.45f, 0.95f, 3.53f, 3.02f, 5.3f, 5.74f)
                curveToRelative(-1.45f, -0.26f, -5.48f, -0.92f, -9.19f, -0.92f)
                curveToRelative(-3.72f, 0f, -7.71f, 0.64f, -9.17f, 0.9f)
                curveToRelative(1.81f, -2.74f, 3.92f, -4.83f, 5.28f, -5.73f)
                close()
                moveTo(12.0f, 18f)
                curveToRelative(-4.28f, 0f, -7.39f, -2.94f, -8.97f, -4.87f)
                curveToRelative(1.6f, 0.28f, 5.41f, 0.87f, 8.97f, 0.87f)
                reflectiveCurveToRelative(7.37f, -0.59f, 8.97f, -0.86f)
                curveToRelative(-1.57f, 1.92f, -4.69f, 4.86f, -8.97f, 4.86f)
                close()
            }
        }.also { _Lips = it}
