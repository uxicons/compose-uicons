package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateLeft: ImageVector? = null

val Icons.Br.RotateLeft: ImageVector
    get() = _RotateLeft ?: UXIcon(name = "RotateLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.61f, 12f)
            curveToRelative(0.76f, 0f, 1.38f, 0.57f, 1.49f, 1.32f)
            curveToRelative(0.64f, 4.34f, 4.39f, 7.68f, 8.9f, 7.68f)
            curveToRelative(5.48f, 0f, 9.83f, -4.92f, 8.87f, -10.57f)
            curveToRelative(-0.45f, -2.67f, -2.15f, -5.02f, -4.52f, -6.31f)
            curveToRelative(-3.51f, -1.9f, -7.48f, -1.25f, -10.18f, 1.04f)
            lineToRelative(1.13f, 1.13f)
            curveToRelative(0.63f, 0.63f, 0.18f, 1.71f, -0.71f, 1.71f)
            horizontalLineTo(2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineTo(2.41f)
            curveToRelative(0f, -0.89f, 1.08f, -1.34f, 1.71f, -0.71f)
            lineToRelative(1.33f, 1.33f)
            curveTo(7.6f, -0.12f, 12.92f, -1.07f, 17.64f, 1.41f)
            curveToRelative(3.32f, 1.74f, 5.66f, 5.03f, 6.22f, 8.73f)
            curveToRelative(1.12f, 7.44f, -4.63f, 13.86f, -11.86f, 13.86f)
            curveToRelative(-6.02f, 0f, -11.02f, -4.46f, -11.87f, -10.25f)
            curveToRelative(-0.14f, -0.92f, 0.55f, -1.75f, 1.48f, -1.75f)
            close()
        }
    }.also { _RotateLeft = it }
