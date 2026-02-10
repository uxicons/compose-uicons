package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cross: ImageVector? = null

val Icons.Rc.Cross: ImageVector
    get() = _Cross ?: UXIcon(name = "Cross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 1.49f)
                curveToRelative(-0.28f, -0.47f, -0.89f, -0.63f, -1.37f, -0.35f)
                curveToRelative(-0.21f, 0.13f, -4.8f, 2.86f, -9.48f, 7.41f)
                curveTo(7.31f, 4.0f, 2.73f, 1.26f, 2.52f, 1.14f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.12f, -1.37f, 0.35f)
                curveToRelative(-0.28f, 0.48f, -0.12f, 1.09f, 0.35f, 1.37f)
                curveToRelative(0.05f, 0.03f, 4.56f, 2.72f, 9.09f, 7.11f)
                curveToRelative(-0.01f, 0.01f, -0.03f, 0.03f, -0.04f, 0.04f)
                curveTo(5.42f, 15.42f, 2.27f, 21.28f, 2.14f, 21.53f)
                curveToRelative(-0.26f, 0.49f, -0.07f, 1.09f, 0.41f, 1.35f)
                curveToRelative(0.15f, 0.08f, 0.31f, 0.12f, 0.47f, 0.12f)
                curveToRelative(0.36f, 0f, 0.7f, -0.19f, 0.88f, -0.53f)
                curveToRelative(0.03f, -0.06f, 3.15f, -5.87f, 8.09f, -11.08f)
                curveToRelative(4.93f, 5.21f, 8.06f, 11.02f, 8.09f, 11.08f)
                curveToRelative(0.18f, 0.34f, 0.53f, 0.53f, 0.88f, 0.53f)
                curveToRelative(0.16f, 0f, 0.32f, -0.04f, 0.47f, -0.12f)
                curveToRelative(0.49f, -0.26f, 0.67f, -0.86f, 0.41f, -1.35f)
                curveToRelative(-0.13f, -0.25f, -3.28f, -6.11f, -8.41f, -11.52f)
                curveToRelative(-0.01f, -0.01f, -0.03f, -0.03f, -0.04f, -0.04f)
                curveToRelative(4.53f, -4.38f, 9.04f, -7.08f, 9.09f, -7.11f)
                curveToRelative(0.48f, -0.28f, 0.63f, -0.89f, 0.35f, -1.37f)
                close()
            }
        }.also { _Cross = it}
