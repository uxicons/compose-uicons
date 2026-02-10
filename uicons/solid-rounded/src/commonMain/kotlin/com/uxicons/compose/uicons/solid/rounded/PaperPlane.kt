package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlane: ImageVector? = null

val Icons.Sr.PaperPlane: ImageVector
    get() = _PaperPlane ?: UXIcon(name = "PaperPlane", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(505.88f, 36.68f)
                lineTo(110.76f, 431.69f)
                curveToRelative(8.54f, 4.16f, 17.91f, 6.35f, 27.41f, 6.4f)
                horizontalLineToRelative(67.67f)
                curveToRelative(5.66f, -0.01f, 11.09f, 2.24f, 15.08f, 6.25f)
                lineToRelative(36.67f, 36.65f)
                curveToRelative(19.89f, 20.02f, 46.94f, 31.3f, 75.16f, 31.32f)
                curveToRelative(11.65f, -0.01f, 23.22f, -1.92f, 34.26f, -5.65f)
                curveToRelative(38.05f, -12.48f, 65.73f, -45.46f, 71.4f, -85.1f)
                lineToRelative(72.08f, -342.4f)
                curveTo(513.95f, 64.89f, 512.31f, 49.87f, 505.88f, 36.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(433.77f, 1.65f)
                lineTo(92.2f, 73.61f)
                curveTo(33.84f, 81.63f, -6.97f, 135.44f, 1.05f, 193.8f)
                curveToRelative(3.17f, 23.05f, 13.78f, 44.43f, 30.23f, 60.88f)
                lineToRelative(36.65f, 36.65f)
                curveToRelative(4.01f, 4.01f, 6.26f, 9.44f, 6.25f, 15.1f)
                verticalLineToRelative(67.67f)
                curveToRelative(0.05f, 9.5f, 2.24f, 18.87f, 6.4f, 27.41f)
                lineTo(475.63f, 6.41f)
                curveTo(462.64f, 0.03f, 447.85f, -1.65f, 433.77f, 1.65f)
                close()
            }
        }.also { _PaperPlane = it}
