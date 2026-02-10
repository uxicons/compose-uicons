package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raygun: ImageVector? = null

val Icons.Sr.Raygun: ImageVector
    get() = _Raygun ?: UXIcon(name = "Raygun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.95f)
                verticalLineToRelative(6.08f)
                curveToRelative(0f, 0.86f, -0.92f, 1.26f, -1.45f, 0.65f)
                curveToRelative(-0.66f, -0.77f, -1.53f, -1.63f, -2.55f, -2.33f)
                verticalLineToRelative(3.65f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.94f)
                curveToRelative(0f, 0.91f, -0.4f, 1.77f, -1.08f, 2.36f)
                curveToRelative(-0.54f, 0.46f, -1.21f, 0.7f, -1.91f, 0.7f)
                curveToRelative(-0.16f, 0f, -0.31f, -0.01f, -0.47f, -0.04f)
                curveToRelative(-4.66f, -0.76f, -12.54f, -3.3f, -12.54f, -7.96f)
                curveToRelative(0f, -1.64f, 0.97f, -3.01f, 2.43f, -4.13f)
                curveTo(2.1f, 3.35f, 0.72f, 2.12f, 0.15f, 1.29f)
                curveTo(-0.24f, 0.73f, 0.18f, -0.04f, 0.85f, 0.0f)
                curveToRelative(2.65f, 0.15f, 5.42f, 0.72f, 7.47f, 2.04f)
                curveToRelative(1.5f, -0.47f, 2.97f, -0.8f, 4.22f, -1f)
                curveToRelative(0.84f, -0.14f, 1.71f, 0.1f, 2.37f, 0.67f)
                curveToRelative(0.69f, 0.58f, 1.08f, 1.44f, 1.08f, 2.36f)
                verticalLineToRelative(3.94f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.62f)
                curveToRelative(1.02f, -0.7f, 1.89f, -1.57f, 2.56f, -2.33f)
                curveToRelative(0.53f, -0.61f, 1.44f, -0.2f, 1.44f, 0.66f)
                close()
                moveTo(0.12f, 20.09f)
                curveToRelative(-0.27f, 0.93f, -0.08f, 1.91f, 0.5f, 2.69f)
                curveToRelative(0.58f, 0.77f, 1.48f, 1.22f, 2.45f, 1.22f)
                curveToRelative(1.39f, 0f, 2.6f, -0.94f, 2.94f, -2.22f)
                lineToRelative(1.36f, -4.02f)
                curveToRelative(-1.83f, -0.59f, -3.84f, -1.41f, -5.53f, -2.56f)
                lineTo(0.12f, 20.09f)
                close()
            }
        }.also { _Raygun = it}
