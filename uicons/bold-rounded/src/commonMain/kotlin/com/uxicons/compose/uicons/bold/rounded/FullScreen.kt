package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FullScreen: ImageVector? = null

val Icons.Br.FullScreen: ImageVector
    get() = _FullScreen ?: UXIcon(name = "FullScreen") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 5.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -1.34f, 0.49f, -2.63f, 1.38f, -3.64f)
            curveToRelative(0.55f, -0.62f, 1.5f, -0.68f, 2.12f, -0.13f)
            curveToRelative(0.62f, 0.55f, 0.68f, 1.5f, 0.13f, 2.12f)
            curveToRelative(-0.4f, 0.46f, -0.62f, 1.04f, -0.62f, 1.65f)
            verticalLineToRelative(8.0f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.57f, -0.19f, -1.11f, -0.55f, -1.56f)
            curveToRelative(-0.52f, -0.65f, -0.41f, -1.59f, 0.23f, -2.11f)
            curveToRelative(0.65f, -0.52f, 1.59f, -0.41f, 2.11f, 0.23f)
            curveToRelative(0.78f, 0.97f, 1.21f, 2.19f, 1.21f, 3.44f)
            close()
            moveTo(6.98f, 12f)
            horizontalLineToRelative(3.07f)
            curveToRelative(0.85f, 0f, 1.27f, -1.03f, 0.67f, -1.63f)
            lineToRelative(-0.49f, -0.49f)
            lineToRelative(1.77f, -1.77f)
            lineToRelative(1.77f, 1.77f)
            lineToRelative(-0.49f, 0.49f)
            curveToRelative(-0.6f, 0.6f, -0.17f, 1.63f, 0.67f, 1.63f)
            horizontalLineToRelative(3.07f)
            curveToRelative(0.54f, 0f, 0.98f, -0.44f, 0.98f, -0.98f)
            verticalLineToRelative(-3.07f)
            curveToRelative(0f, -0.85f, -1.03f, -1.27f, -1.63f, -0.67f)
            lineToRelative(-0.49f, 0.49f)
            lineToRelative(-1.77f, -1.77f)
            lineToRelative(1.77f, -1.77f)
            lineToRelative(0.49f, 0.49f)
            curveToRelative(0.6f, 0.6f, 1.63f, 0.17f, 1.63f, -0.67f)
            verticalLineToRelative(-3.07f)
            curveToRelative(0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f)
            horizontalLineToRelative(-3.07f)
            curveToRelative(-0.85f, 0f, -1.27f, 1.03f, -0.67f, 1.63f)
            lineToRelative(0.49f, 0.49f)
            lineToRelative(-1.77f, 1.77f)
            lineToRelative(-1.77f, -1.77f)
            lineToRelative(0.49f, -0.49f)
            curveToRelative(0.6f, -0.6f, 0.17f, -1.63f, -0.67f, -1.63f)
            horizontalLineToRelative(-3.07f)
            curveToRelative(-0.54f, 0f, -0.98f, 0.44f, -0.98f, 0.98f)
            verticalLineToRelative(3.07f)
            curveToRelative(0f, 0.85f, 1.03f, 1.27f, 1.63f, 0.67f)
            lineToRelative(0.49f, -0.49f)
            lineToRelative(1.77f, 1.77f)
            lineToRelative(-1.77f, 1.77f)
            lineToRelative(-0.49f, -0.49f)
            curveToRelative(-0.6f, -0.6f, -1.63f, -0.17f, -1.63f, 0.67f)
            verticalLineToRelative(3.07f)
            curveToRelative(0f, 0.54f, 0.44f, 0.98f, 0.98f, 0.98f)
            close()
        }
    }.also { _FullScreen = it }
