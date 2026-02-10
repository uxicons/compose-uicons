package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brain: ImageVector? = null

val Icons.Sr.Brain: ImageVector
    get() = _Brain ?: UXIcon(name = "Brain") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 0f)
                curveToRelative(-1.9f, 0f, -3.49f, 1.33f, -3.9f, 3.1f)
                curveToRelative(-1.77f, 0.41f, -3.1f, 2f, -3.1f, 3.9f)
                verticalLineToRelative(0.02f)
                curveToRelative(-1.25f, 0.94f, -2f, 2.41f, -2f, 3.98f)
                curveToRelative(0f, 0.89f, 0.24f, 1.74f, 0.69f, 2.5f)
                curveToRelative(-0.45f, 0.76f, -0.69f, 1.61f, -0.69f, 2.5f)
                curveToRelative(0f, 1.69f, 0.86f, 3.24f, 2.27f, 4.17f)
                curveToRelative(0.72f, 2.28f, 2.81f, 3.83f, 5.23f, 3.83f)
                curveToRelative(0.01f, 0f, 0.03f, 0f, 0.04f, 0f)
                curveToRelative(1.94f, -0.01f, 3.46f, -1.7f, 3.46f, -3.64f)
                lineTo(11f, 2.01f)
                curveTo(11f, 0.9f, 10.11f, 0f, 9f, 0f)
                close()
                moveTo(13f, 2.01f)
                lineTo(13f, 20.36f)
                curveToRelative(0f, 1.94f, 1.52f, 3.63f, 3.46f, 3.64f)
                curveToRelative(0.01f, 0f, 0.03f, 0f, 0.04f, 0f)
                curveToRelative(2.42f, 0f, 4.51f, -1.56f, 5.23f, -3.83f)
                curveToRelative(1.41f, -0.92f, 2.27f, -2.48f, 2.27f, -4.17f)
                curveToRelative(0f, -0.89f, -0.24f, -1.74f, -0.69f, -2.5f)
                curveToRelative(0.45f, -0.76f, 0.69f, -1.61f, 0.69f, -2.5f)
                curveToRelative(0f, -1.57f, -0.75f, -3.04f, -2f, -3.98f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0f, -1.9f, -1.33f, -3.49f, -3.1f, -3.9f)
                curveTo(18.49f, 1.33f, 16.9f, 0f, 15f, 0f)
                curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2.01f)
                close()
            }
        }.also { _Brain = it}
