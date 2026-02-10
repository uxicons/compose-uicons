package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Rc.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.89f, 21.06f)
                curveToRelative(-0.25f, -0.49f, -0.85f, -0.69f, -1.34f, -0.45f)
                curveToRelative(-0.72f, 0.36f, -1.33f, 0.38f, -1.61f, 0.39f)
                curveToRelative(-0.38f, 0.02f, -0.61f, -0.03f, -0.75f, -0.09f)
                curveToRelative(-3.1f, -12.44f, -10.53f, -18.9f, -10.8f, -19.13f)
                curveToRelative(-0.6f, -0.58f, -1.41f, -0.84f, -2.48f, -0.78f)
                curveToRelative(-0.31f, 0.01f, -1.25f, 0.04f, -2.36f, 0.6f)
                curveToRelative(-0.49f, 0.25f, -0.69f, 0.85f, -0.45f, 1.34f)
                curveToRelative(0.25f, 0.49f, 0.85f, 0.69f, 1.34f, 0.45f)
                curveToRelative(0.72f, -0.36f, 1.31f, -0.38f, 1.61f, -0.39f)
                curveToRelative(0.61f, -0.03f, 0.83f, 0.11f, 0.99f, 0.26f)
                curveToRelative(0.03f, 0.03f, 1.29f, 1.13f, 2.95f, 3.23f)
                curveToRelative(-1.7f, 1.29f, -7.63f, 6.35f, -8.98f, 15.36f)
                curveToRelative(-0.08f, 0.55f, 0.29f, 1.06f, 0.84f, 1.14f)
                curveToRelative(0.54f, 0.08f, 1.06f, -0.29f, 1.14f, -0.84f)
                curveToRelative(1.23f, -8.19f, 6.74f, -12.93f, 8.21f, -14.05f)
                curveToRelative(2.19f, 3.1f, 4.71f, 7.67f, 6.14f, 13.64f)
                curveToRelative(0.04f, 0.18f, 0.14f, 0.35f, 0.27f, 0.48f)
                curveToRelative(0.58f, 0.59f, 1.5f, 0.85f, 2.48f, 0.78f)
                curveToRelative(0.31f, -0.01f, 1.25f, -0.04f, 2.36f, -0.6f)
                curveToRelative(0.49f, -0.25f, 0.69f, -0.85f, 0.45f, -1.34f)
                close()
            }
        }.also { _Lambda = it}
