package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRight: ImageVector? = null

val Icons.Rc.ArrowUpRight: ImageVector
    get() = _ArrowUpRight ?: UXIcon(name = "ArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.7f, 22.71f)
                lineTo(20.7f, 4.71f)
                curveToRelative(0.34f, 1.53f, 0.59f, 4.17f, -0.47f, 7.5f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.65f, 1.26f)
                curveToRelative(0.53f, 0.17f, 1.09f, -0.12f, 1.26f, -0.65f)
                curveToRelative(1.93f, -6.06f, 0.01f, -10.23f, -0.08f, -10.4f)
                curveToRelative(-0.1f, -0.21f, -0.27f, -0.38f, -0.47f, -0.47f)
                curveToRelative(-0.17f, -0.08f, -4.35f, -2.01f, -10.4f, -0.08f)
                curveToRelative(-0.42f, 0.14f, -0.72f, 0.53f, -0.7f, 0.95f)
                curveToRelative(0.04f, 0.85f, 0.78f, 1.12f, 1.3f, 0.95f)
                curveToRelative(3.29f, -1.05f, 5.95f, -0.8f, 7.49f, -0.46f)
                lineTo(1.29f, 21.3f)
                curveToRelative(-0.2f, 0.2f, -0.54f, 0.89f, 0f, 1.41f)
                curveToRelative(0.4f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                close()
            }
        }.also { _ArrowUpRight = it}
