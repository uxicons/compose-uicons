package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Ts.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.54f, 0.26f)
                lineToRelative(-0.04f, -0.02f)
                curveTo(2.56f, -0.19f, 1.48f, -0.03f, 0.74f, 0.67f)
                curveTo(0.04f, 1.32f, -0.18f, 2.27f, 0.19f, 3.22f)
                lineToRelative(4.93f, 8.79f)
                lineTo(0.25f, 20.85f)
                curveToRelative(-0.34f, 0.88f, -0.11f, 1.83f, 0.59f, 2.48f)
                curveToRelative(0.47f, 0.43f, 1.06f, 0.66f, 1.68f, 0.66f)
                curveToRelative(0.37f, 0f, 0.76f, -0.08f, 1.12f, -0.25f)
                lineToRelative(20.37f, -11.74f)
                lineTo(3.54f, 0.26f)
                close()
                moveTo(1.09f, 2.79f)
                curveToRelative(-0.19f, -0.5f, -0.07f, -1.02f, 0.33f, -1.39f)
                curveToRelative(0.23f, -0.21f, 0.59f, -0.4f, 1.02f, -0.4f)
                curveToRelative(0.2f, 0f, 0.41f, 0.04f, 0.62f, 0.14f)
                lineToRelative(18.06f, 10.36f)
                lineTo(5.99f, 11.5f)
                lineTo(1.09f, 2.79f)
                close()
                moveTo(3.17f, 22.85f)
                curveToRelative(-0.56f, 0.26f, -1.21f, 0.16f, -1.66f, -0.25f)
                curveToRelative(-0.4f, -0.37f, -0.53f, -0.89f, -0.36f, -1.33f)
                lineToRelative(4.84f, -8.77f)
                horizontalLineToRelative(15.14f)
                lineTo(3.17f, 22.85f)
                close()
            }
        }.also { _PaperPlaneTop = it}
