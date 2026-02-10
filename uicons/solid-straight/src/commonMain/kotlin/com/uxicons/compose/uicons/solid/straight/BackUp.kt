package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BackUp: ImageVector? = null

val Icons.Ss.BackUp: ImageVector
    get() = _BackUp ?: UXIcon(name = "BackUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 16f)
                curveToRelative(3.58f, 0f, 6.62f, -0.84f, 8.5f, -2.17f)
                verticalLineToRelative(1.74f)
                curveToRelative(0f, 1.62f, -3.63f, 3.43f, -8.5f, 3.43f)
                reflectiveCurveTo(0f, 17.19f, 0f, 15.57f)
                verticalLineToRelative(-1.74f)
                curveToRelative(1.88f, 1.33f, 4.92f, 2.17f, 8.5f, 2.17f)
                close()
                moveTo(0f, 18.83f)
                verticalLineToRelative(0.96f)
                curveToRelative(0f, 2.77f, 4.28f, 4.21f, 8.5f, 4.21f)
                reflectiveCurveToRelative(8.5f, -1.45f, 8.5f, -4.21f)
                verticalLineToRelative(-0.96f)
                curveToRelative(-1.88f, 1.33f, -4.92f, 2.17f, -8.5f, 2.17f)
                reflectiveCurveToRelative(-6.62f, -0.84f, -8.5f, -2.17f)
                close()
                moveTo(22f, 0f)
                verticalLineToRelative(1.53f)
                curveToRelative(-1.08f, -0.97f, -2.48f, -1.53f, -4f, -1.53f)
                curveToRelative(-2.97f, 0f, -5.43f, 2.17f, -5.91f, 5f)
                horizontalLineToRelative(2.05f)
                curveToRelative(0.45f, -1.72f, 2.0f, -3f, 3.86f, -3f)
                curveToRelative(1f, 0f, 1.93f, 0.37f, 2.64f, 1f)
                horizontalLineToRelative(-1.64f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(18f, 10f)
                curveToRelative(-0.99f, 0f, -1.93f, -0.37f, -2.65f, -1f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.53f)
                curveToRelative(1.08f, 0.97f, 2.49f, 1.53f, 4f, 1.53f)
                curveToRelative(2.97f, 0f, 5.43f, -2.17f, 5.91f, -5f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3f, -3.86f, 3f)
                close()
                moveTo(8.5f, 9f)
                curveToRelative(0.51f, 0f, 1.01f, -0.03f, 1.5f, -0.07f)
                verticalLineToRelative(-2.93f)
                curveToRelative(0f, -2.15f, 0.85f, -4.1f, 2.23f, -5.54f)
                curveToRelative(-1.13f, -0.29f, -2.39f, -0.46f, -3.73f, -0.46f)
                curveTo(3.81f, 0f, 0f, 2.02f, 0f, 4.5f)
                reflectiveCurveToRelative(3.81f, 4.5f, 8.5f, 4.5f)
                close()
                moveTo(8.5f, 14f)
                curveToRelative(0.52f, 0f, 1.01f, -0.02f, 1.5f, -0.06f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-0.49f, 0.04f, -0.99f, 0.07f, -1.5f, 0.07f)
                curveToRelative(-3.58f, 0f, -6.62f, -1.0f, -8.5f, -2.6f)
                verticalLineToRelative(2.17f)
                curveToRelative(0f, 1.62f, 3.63f, 3.43f, 8.5f, 3.43f)
                close()
            }
        }.also { _BackUp = it}
