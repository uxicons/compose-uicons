package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hryvnia: ImageVector? = null

val Icons.Br.Hryvnia: ImageVector
    get() = _Hryvnia ?: UXIcon(name = "Hryvnia") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 16f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(-6.91f)
            lineToRelative(3.87f, -1.48f)
            curveToRelative(0.36f, -0.14f, 0.71f, -0.32f, 1.03f, -0.52f)
            horizontalLineToRelative(2.02f)
            curveToRelative(1.82f, 0.01f, 2.02f, -2.7f, 0.25f, -2.98f)
            curveToRelative(0.81f, -2.46f, -0.35f, -5.3f, -2.65f, -6.5f)
            curveTo(12.28f, -1.79f, 5.48f, 1.02f, 3.4f, 3.49f)
            curveToRelative(-0.56f, 0.61f, -0.52f, 1.55f, 0.09f, 2.11f)
            curveToRelative(0.6f, 0.56f, 1.55f, 0.53f, 2.12f, -0.07f)
            curveToRelative(1.48f, -1.82f, 6.92f, -3.82f, 11.07f, -1.36f)
            curveToRelative(1.4f, 0.7f, 1.76f, 2.69f, 0.73f, 3.84f)
            horizontalLineTo(3.5f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(6.91f)
            lineToRelative(-3.78f, 1.44f)
            curveToRelative(-0.39f, 0.15f, -0.75f, 0.34f, -1.08f, 0.56f)
            horizontalLineTo(3.5f)
            curveToRelative(-1.83f, -0.01f, -2.02f, 2.73f, -0.22f, 2.98f)
            curveToRelative(-0.89f, 2.58f, 0.4f, 5.64f, 2.84f, 6.8f)
            curveToRelative(5.81f, 2.94f, 13.08f, -0.1f, 15.32f, -2.12f)
            curveToRelative(0.64f, -0.52f, 0.74f, -1.46f, 0.22f, -2.1f)
            curveToRelative(-0.52f, -0.65f, -1.46f, -0.75f, -2.11f, -0.23f)
            curveToRelative(-1.66f, 1.5f, -7.6f, 4.05f, -12.12f, 1.75f)
            curveToRelative(-1.49f, -0.68f, -1.91f, -2.87f, -0.8f, -4.09f)
            horizontalLineToRelative(13.86f)
            close()
        }
    }.also { _Hryvnia = it }
