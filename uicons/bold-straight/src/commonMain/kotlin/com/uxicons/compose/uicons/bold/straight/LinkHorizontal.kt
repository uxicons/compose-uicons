package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Bs.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.49f, 12.09f)
                curveToRelative(-0.31f, 0.91f, -0.49f, 1.89f, -0.49f, 2.91f)
                curveToRelative(0f, 0.11f, 0.01f, 0.21f, 0.02f, 0.32f)
                curveTo(1.65f, 14.2f, 0f, 11.79f, 0f, 9f)
                curveTo(0f, 5.14f, 3.14f, 2f, 7f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 3.77f, -3.0f, 6.84f, -6.73f, 6.99f)
                curveToRelative(-0.17f, -0.29f, -0.27f, -0.63f, -0.27f, -0.99f)
                curveToRelative(0f, -0.91f, 0.32f, -1.55f, 1.55f, -2.31f)
                curveToRelative(1.44f, -0.61f, 2.45f, -2.03f, 2.45f, -3.69f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(7f, 5f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.25f, 0.59f, 2.36f, 1.49f, 3.09f)
                close()
                moveTo(19.98f, 8.68f)
                curveToRelative(0.0f, 0.11f, 0.02f, 0.21f, 0.02f, 0.32f)
                curveToRelative(0f, 1.02f, -0.18f, 2.0f, -0.49f, 2.91f)
                curveToRelative(0.9f, 0.73f, 1.49f, 1.84f, 1.49f, 3.09f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.66f, 1.01f, -3.08f, 2.45f, -3.69f)
                curveToRelative(1.22f, -0.76f, 1.55f, -1.41f, 1.55f, -2.31f)
                curveToRelative(0f, -0.36f, -0.1f, -0.69f, -0.27f, -0.99f)
                curveToRelative(-3.73f, 0.14f, -6.73f, 3.22f, -6.73f, 6.99f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(4f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -2.79f, -1.65f, -5.2f, -4.02f, -6.32f)
                close()
            }
        }.also { _LinkHorizontal = it}
