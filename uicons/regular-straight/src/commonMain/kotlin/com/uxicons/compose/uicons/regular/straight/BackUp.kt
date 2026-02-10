package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BackUp: ImageVector? = null

val Icons.Rs.BackUp: ImageVector
    get() = _BackUp ?: UXIcon(name = "BackUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.64f)
                curveToRelative(-0.72f, -0.63f, -1.64f, -1f, -2.64f, -1f)
                curveToRelative(-1.86f, 0f, -3.41f, 1.28f, -3.86f, 3f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(0.48f, -2.83f, 2.94f, -5f, 5.91f, -5f)
                curveToRelative(1.52f, 0f, 2.92f, 0.56f, 4f, 1.53f)
                lineTo(22f, 0f)
                horizontalLineToRelative(2f)
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
                moveTo(15f, 13.41f)
                curveToRelative(0.63f, 0.26f, 1.3f, 0.43f, 2f, 0.52f)
                verticalLineToRelative(5.86f)
                curveToRelative(0f, 2.77f, -4.28f, 4.21f, -8.5f, 4.21f)
                reflectiveCurveTo(0f, 22.55f, 0f, 19.79f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -0.19f, 0.13f, -0.79f, 0.13f, -0.79f)
                curveTo(0.79f, 1.55f, 4.16f, 0f, 8.5f, 0f)
                curveToRelative(1.37f, 0f, 2.63f, 0.16f, 3.76f, 0.44f)
                curveToRelative(-0.51f, 0.53f, -0.95f, 1.12f, -1.3f, 1.77f)
                curveToRelative(-0.74f, -0.13f, -1.56f, -0.21f, -2.46f, -0.21f)
                curveToRelative(-3.97f, 0f, -6.5f, 1.48f, -6.5f, 2.5f)
                reflectiveCurveToRelative(2.53f, 2.5f, 6.5f, 2.5f)
                curveToRelative(0.53f, 0f, 1.02f, -0.03f, 1.5f, -0.08f)
                verticalLineToRelative(2.0f)
                curveToRelative(-0.49f, 0.04f, -0.98f, 0.07f, -1.5f, 0.07f)
                curveToRelative(-2.67f, 0f, -4.96f, -0.59f, -6.5f, -1.54f)
                verticalLineToRelative(2.04f)
                curveToRelative(0f, 1.02f, 2.53f, 2.5f, 6.5f, 2.5f)
                curveToRelative(0.53f, 0f, 1.03f, -0.03f, 1.5f, -0.07f)
                verticalLineToRelative(2.01f)
                curveToRelative(-0.49f, 0.04f, -0.98f, 0.07f, -1.5f, 0.07f)
                curveToRelative(-2.67f, 0f, -4.96f, -0.59f, -6.5f, -1.54f)
                verticalLineToRelative(2.04f)
                curveToRelative(0f, 1.02f, 2.53f, 2.5f, 6.5f, 2.5f)
                reflectiveCurveToRelative(6.5f, -1.48f, 6.5f, -2.5f)
                verticalLineToRelative(-1.09f)
                close()
                moveTo(15f, 19.79f)
                verticalLineToRelative(-2.33f)
                curveToRelative(-1.53f, 0.95f, -3.83f, 1.54f, -6.5f, 1.54f)
                reflectiveCurveToRelative(-4.96f, -0.59f, -6.5f, -1.54f)
                verticalLineToRelative(2.33f)
                curveToRelative(0f, 0.75f, 2.29f, 2.21f, 6.5f, 2.21f)
                reflectiveCurveToRelative(6.5f, -1.46f, 6.5f, -2.21f)
                close()
            }
        }.also { _BackUp = it}
