package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameCurved: ImageVector? = null

val Icons.Sr.FireFlameCurved: ImageVector
    get() = _FireFlameCurved ?: UXIcon(name = "FireFlameCurved") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-5.48f, 0f, -9.94f, -4.49f, -9.94f, -10f)
                curveToRelative(0f, -1.93f, 0.67f, -4.07f, 1.87f, -6.03f)
                curveToRelative(0.47f, -0.77f, 1.37f, -1.13f, 2.24f, -0.9f)
                curveToRelative(0.87f, 0.23f, 1.47f, 0.99f, 1.5f, 1.89f)
                curveToRelative(0.1f, 2.74f, 0.75f, 6.01f, 3.34f, 6.04f)
                curveToRelative(1.08f, 0.01f, 1.94f, -0.75f, 2.03f, -1.73f)
                curveToRelative(0.09f, -1.03f, -0.28f, -1.83f, -0.75f, -2.85f)
                curveToRelative(-0.55f, -1.2f, -1.24f, -2.69f, -1.24f, -4.9f)
                curveToRelative(0f, -1.71f, 0.34f, -3.41f, 0.69f, -4.34f)
                curveTo(11.94f, 0.49f, 12.54f, 0.03f, 13.26f, -0.01f)
                curveToRelative(0.74f, -0.04f, 1.41f, 0.37f, 1.75f, 1.04f)
                curveToRelative(0.8f, 1.59f, 1.94f, 3.07f, 3.04f, 4.5f)
                curveToRelative(1.97f, 2.56f, 4.01f, 5.21f, 3.96f, 8.49f)
                curveToRelative(0f, 5.46f, -4.48f, 9.95f, -9.99f, 9.98f)
                horizontalLineToRelative(-0.01f)
                close()
            }
        }.also { _FireFlameCurved = it}
