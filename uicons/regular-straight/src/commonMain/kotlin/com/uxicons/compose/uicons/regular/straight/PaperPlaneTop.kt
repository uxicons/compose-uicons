package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Rs.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.03f, 0.28f)
                curveTo(2.98f, -0.22f, 1.75f, -0.04f, 0.89f, 0.75f)
                curveTo(0.05f, 1.52f, -0.22f, 2.66f, 0.18f, 3.72f)
                lineToRelative(4.53f, 8.29f)
                lineTo(0.26f, 20.29f)
                curveToRelative(-0.4f, 1.06f, -0.12f, 2.2f, 0.72f, 2.97f)
                curveToRelative(0.52f, 0.48f, 1.19f, 0.73f, 1.89f, 0.73f)
                curveToRelative(0.44f, 0f, 0.9f, -0.1f, 1.33f, -0.31f)
                lineToRelative(19.77f, -11.68f)
                lineTo(4.03f, 0.28f)
                close()
                moveTo(2.03f, 2.96f)
                curveToRelative(-0.11f, -0.38f, 0.11f, -0.64f, 0.21f, -0.74f)
                curveToRelative(0.1f, -0.09f, 0.43f, -0.35f, 0.9f, -0.15f)
                lineToRelative(15.19f, 8.93f)
                lineTo(6.44f, 11.0f)
                lineTo(2.03f, 2.96f)
                close()
                moveTo(3.26f, 21.91f)
                curveToRelative(-0.47f, 0.23f, -0.83f, -0.04f, -0.93f, -0.13f)
                curveToRelative(-0.1f, -0.1f, -0.33f, -0.35f, -0.21f, -0.74f)
                lineToRelative(4.32f, -8.04f)
                horizontalLineToRelative(11.9f)
                lineTo(3.26f, 21.91f)
                close()
            }
        }.also { _PaperPlaneTop = it}
