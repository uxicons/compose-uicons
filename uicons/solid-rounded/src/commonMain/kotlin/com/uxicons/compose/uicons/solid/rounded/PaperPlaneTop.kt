package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Sr.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.17f, 3.71f)
                curveTo(-0.22f, 2.65f, 0.08f, 1.47f, 0.92f, 0.71f)
                curveTo(1.76f, -0.04f, 2.95f, -0.21f, 3.96f, 0.28f)
                lineToRelative(18.09f, 8.44f)
                curveToRelative(0.97f, 0.45f, 1.66f, 1.28f, 1.95f, 2.27f)
                lineTo(4.05f, 11.0f)
                lineTo(0.23f, 3.83f)
                curveToRelative(-0.02f, -0.04f, -0.04f, -0.08f, -0.06f, -0.13f)
                close()
                moveTo(4.06f, 13f)
                lineTo(0.31f, 20.18f)
                curveToRelative(-0.02f, 0.04f, -0.04f, 0.08f, -0.05f, 0.12f)
                curveToRelative(-0.39f, 1.06f, -0.09f, 2.24f, 0.75f, 2.99f)
                curveToRelative(0.52f, 0.47f, 1.18f, 0.71f, 1.84f, 0.71f)
                curveToRelative(0.41f, 0f, 0.82f, -0.09f, 1.2f, -0.28f)
                lineToRelative(18.01f, -8.44f)
                curveToRelative(0.97f, -0.46f, 1.67f, -1.29f, 1.95f, -2.28f)
                lineTo(4.06f, 13.0f)
                close()
            }
        }.also { _PaperPlaneTop = it}
