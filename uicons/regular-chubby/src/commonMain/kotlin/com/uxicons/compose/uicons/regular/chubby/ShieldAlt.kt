package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Rc.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.95f, 3.5f)
                curveToRelative(-0.06f, -0.28f, -0.23f, -0.52f, -0.47f, -0.66f)
                curveToRelative(-0.13f, -0.07f, -3.2f, -1.83f, -8.38f, -1.83f)
                curveToRelative(-4.99f, -0.09f, -8.55f, 1.78f, -8.56f, 1.83f)
                curveToRelative(-0.24f, 0.14f, -0.42f, 0.38f, -0.47f, 0.66f)
                curveToRelative(-0.54f, 2.6f, -2.1f, 12.77f, 0.04f, 15.04f)
                curveToRelative(2.35f, 2.5f, 7.99f, 4.23f, 8.62f, 4.42f)
                curveToRelative(0.19f, 0.06f, 0.39f, 0.06f, 0.58f, 0f)
                curveToRelative(0.64f, -0.19f, 6.27f, -1.93f, 8.62f, -4.42f)
                curveToRelative(2.13f, -2.27f, 0.57f, -12.44f, 0.04f, -15.04f)
                close()
                moveTo(4.92f, 4.38f)
                curveToRelative(0.83f, -0.38f, 2.97f, -1.2f, 6.09f, -1.34f)
                lineToRelative(-0.0f, 17.59f)
                curveToRelative(-2.13f, -0.75f, -5.13f, -2.05f, -6.45f, -3.45f)
                curveToRelative(-0.8f, -0.85f, -0.77f, -6.95f, 0.37f, -12.79f)
                close()
                moveTo(19.46f, 17.16f)
                curveToRelative(-1.32f, 1.41f, -4.33f, 2.71f, -6.46f, 3.46f)
                lineToRelative(0.0f, -17.59f)
                curveToRelative(3.14f, 0.15f, 5.26f, 0.96f, 6.09f, 1.34f)
                curveToRelative(1.14f, 5.83f, 1.17f, 11.94f, 0.37f, 12.79f)
                close()
            }
        }.also { _ShieldAlt = it}
