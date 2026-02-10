package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shield: ImageVector? = null

val Icons.Rc.Shield: ImageVector
    get() = _Shield ?: UXIcon(name = "Shield") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.88f, 5.68f)
                curveToRelative(-0.08f, -0.35f, -0.34f, -0.63f, -0.69f, -0.74f)
                lineToRelative(-0.83f, -0.25f)
                curveToRelative(-3.45f, -0.92f, -6.71f, -3.46f, -6.74f, -3.48f)
                curveToRelative(-0.36f, -0.29f, -0.88f, -0.29f, -1.24f, 0.0f)
                curveToRelative(-0.03f, 0.03f, -3.21f, 2.52f, -6.77f, 3.49f)
                lineToRelative(-0.8f, 0.24f)
                curveToRelative(-0.34f, 0.1f, -0.61f, 0.39f, -0.69f, 0.74f)
                curveToRelative(-0.4f, 1.76f, -2.26f, 10.69f, 0.27f, 13.24f)
                curveToRelative(2.41f, 2.44f, 8.1f, 3.98f, 8.35f, 4.04f)
                curveToRelative(0.17f, 0.04f, 0.33f, 0.05f, 0.51f, 0f)
                curveToRelative(0.24f, -0.07f, 5.94f, -1.6f, 8.35f, -4.04f)
                curveToRelative(2.53f, -2.56f, 0.66f, -11.48f, 0.27f, -13.24f)
                close()
                moveTo(19.19f, 17.52f)
                curveToRelative(-1.6f, 1.62f, -5.51f, 2.97f, -7.19f, 3.44f)
                curveToRelative(-1.68f, -0.47f, -5.59f, -1.82f, -7.19f, -3.44f)
                curveToRelative(-1.24f, -1.25f, -0.69f, -6.89f, 0.14f, -10.83f)
                lineToRelative(0.21f, -0.06f)
                curveToRelative(3.0f, -0.82f, 5.67f, -2.55f, 6.84f, -3.38f)
                curveToRelative(1.18f, 0.84f, 3.89f, 2.6f, 6.81f, 3.38f)
                lineToRelative(0.23f, 0.07f)
                curveToRelative(0.83f, 3.94f, 1.38f, 9.57f, 0.14f, 10.83f)
                close()
            }
        }.also { _Shield = it}
