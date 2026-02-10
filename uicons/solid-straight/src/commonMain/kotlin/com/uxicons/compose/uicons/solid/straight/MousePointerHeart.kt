package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerHeart: ImageVector? = null

val Icons.Ss.MousePointerHeart: ImageVector
    get() = _MousePointerHeart ?: UXIcon(name = "MousePointerHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                curveToRelative(0f, 1.87f, -0.81f, 3.77f, -1.97f, 5.55f)
                curveToRelative(-2.44f, -0.82f, -7.4f, -2.48f, -9.85f, -3.31f)
                curveToRelative(-1.2f, -0.4f, -2.34f, 0.74f, -1.94f, 1.94f)
                curveToRelative(0.74f, 2.21f, 2.56f, 7.63f, 3.28f, 9.77f)
                lineToRelative(-0.52f, 0.37f)
                lineToRelative(-0.58f, -0.41f)
                curveToRelative(-0.9f, -0.65f, -3.25f, -2.4f, -5.49f, -4.71f)
                curveTo(1.66f, 11.81f, 0f, 8.72f, 0f, 6f)
                curveTo(0f, 2.69f, 2.69f, 0f, 6f, 0f)
                curveToRelative(1.49f, 0f, 3.01f, 0.67f, 4.17f, 1.84f)
                curveToRelative(0.31f, 0.32f, 0.59f, 0.66f, 0.83f, 1.02f)
                curveToRelative(1.12f, -1.67f, 3.03f, -2.86f, 5.0f, -2.86f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(18.86f, 17.44f)
                lineToRelative(5.1f, 5.1f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-5.1f, -5.1f)
                lineToRelative(-2.42f, 5.14f)
                lineToRelative(-4.67f, -13.65f)
                lineToRelative(13.65f, 4.67f)
                lineToRelative(-5.14f, 2.42f)
                close()
                moveTo(18.86f, 17.44f)
                lineToRelative(5.1f, 5.1f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-5.1f, -5.1f)
            }
        }.also { _MousePointerHeart = it}
