package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Bs.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                lineToRelative(-2.07f, -0.89f)
                curveToRelative(-0.43f, -3.17f, -3.15f, -5.61f, -6.43f, -5.61f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                lineTo(0f, 7f)
                verticalLineToRelative(4f)
                curveTo(0f, 16.02f, 3.39f, 20.26f, 8f, 21.57f)
                verticalLineToRelative(2.43f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                curveToRelative(0.68f, 0f, 1.35f, -0.07f, 2f, -0.19f)
                verticalLineToRelative(2.19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.21f)
                curveToRelative(3.56f, -1.82f, 6f, -5.52f, 6f, -9.79f)
                verticalLineToRelative(-2.14f)
                lineToRelative(2f, -0.86f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(3.1f, 12.25f)
                curveToRelative(0.86f, 0.48f, 1.85f, 0.75f, 2.9f, 0.75f)
                curveToRelative(1.09f, 0f, 2.12f, -0.3f, 3f, -0.81f)
                verticalLineToRelative(0.31f)
                curveToRelative(0f, 2.14f, -1.7f, 3.88f, -3.82f, 3.98f)
                curveToRelative(-1.08f, -1.15f, -1.83f, -2.61f, -2.09f, -4.23f)
                close()
                moveTo(19.0f, 11f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                curveToRelative(-0.89f, 0f, -1.74f, -0.15f, -2.54f, -0.42f)
                curveToRelative(2.11f, -1.21f, 3.54f, -3.48f, 3.54f, -6.08f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(17.0f, 6.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Bird = it}
