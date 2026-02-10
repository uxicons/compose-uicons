package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeft: ImageVector? = null

val Icons.Rc.ArrowUpLeft: ImageVector
    get() = _ArrowUpLeft ?: UXIcon(name = "ArrowUpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.71f, 21.29f)
                lineTo(4.71f, 3.29f)
                curveToRelative(1.53f, -0.34f, 4.17f, -0.59f, 7.5f, 0.47f)
                curveToRelative(0.53f, 0.17f, 1.09f, -0.12f, 1.26f, -0.65f)
                curveToRelative(0.17f, -0.53f, -0.12f, -1.09f, -0.65f, -1.26f)
                curveToRelative(-6.06f, -1.93f, -10.23f, -0.01f, -10.4f, 0.08f)
                curveToRelative(-0.21f, 0.1f, -0.38f, 0.27f, -0.47f, 0.47f)
                curveToRelative(-0.08f, 0.17f, -2.01f, 4.35f, -0.08f, 10.4f)
                curveToRelative(0.14f, 0.42f, 0.53f, 0.72f, 0.95f, 0.7f)
                curveToRelative(0.85f, -0.04f, 1.12f, -0.78f, 0.95f, -1.3f)
                curveToRelative(-1.05f, -3.29f, -0.8f, -5.95f, -0.46f, -7.49f)
                lineTo(21.29f, 22.71f)
                curveToRelative(0.2f, 0.2f, 0.89f, 0.54f, 1.41f, 0f)
                curveToRelative(0.39f, -0.4f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _ArrowUpLeft = it}
