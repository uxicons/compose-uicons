package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSliceButter: ImageVector? = null

val Icons.Br.BreadSliceButter: ImageVector
    get() = _BreadSliceButter ?: UXIcon(name = "BreadSliceButter") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.62f, 12.09f)
            curveToRelative(0.5f, 0.5f, 0.5f, 1.32f, 0f, 1.82f)
            lineToRelative(-2.71f, 2.71f)
            curveToRelative(-0.5f, 0.5f, -1.32f, 0.5f, -1.82f, 0f)
            lineToRelative(-2.71f, -2.71f)
            curveToRelative(-0.5f, -0.5f, -0.5f, -1.32f, 0f, -1.82f)
            lineToRelative(2.71f, -2.71f)
            curveToRelative(0.5f, -0.5f, 1.32f, -0.5f, 1.82f, 0f)
            lineToRelative(2.71f, 2.71f)
            close()
            moveTo(22.0f, 10.36f)
            verticalLineToRelative(7.15f)
            curveToRelative(0f, 3.03f, -2.47f, 5.49f, -5.5f, 5.49f)
            lineTo(7.49f, 23f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.46f, -5.5f, -5.49f)
            verticalLineToRelative(-7.15f)
            curveTo(0.4f, 9.05f, -0.33f, 7.01f, 0.15f, 5.02f)
            curveTo(0.73f, 2.65f, 2.91f, 1f, 5.46f, 1f)
            horizontalLineToRelative(13.08f)
            curveToRelative(2.55f, 0f, 4.73f, 1.65f, 5.31f, 4.02f)
            curveToRelative(0.48f, 1.98f, -0.25f, 4.03f, -1.85f, 5.33f)
            close()
            moveTo(20.93f, 5.73f)
            curveToRelative(-0.24f, -1.0f, -1.25f, -1.73f, -2.39f, -1.73f)
            lineTo(5.46f, 4.0f)
            curveToRelative(-1.14f, 0f, -2.15f, 0.73f, -2.39f, 1.73f)
            curveToRelative(-0.27f, 1.12f, 0.4f, 2.08f, 1.19f, 2.54f)
            curveToRelative(0.46f, 0.27f, 0.75f, 0.76f, 0.75f, 1.3f)
            verticalLineToRelative(7.93f)
            curveToRelative(0f, 1.38f, 1.12f, 2.49f, 2.5f, 2.49f)
            horizontalLineToRelative(9.01f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.49f)
            verticalLineToRelative(-7.93f)
            curveToRelative(0f, -0.53f, 0.28f, -1.03f, 0.75f, -1.3f)
            curveToRelative(0.79f, -0.46f, 1.46f, -1.42f, 1.19f, -2.54f)
            close()
        }
    }.also { _BreadSliceButter = it }
