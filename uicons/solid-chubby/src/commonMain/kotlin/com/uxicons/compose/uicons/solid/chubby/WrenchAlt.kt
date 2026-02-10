package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchAlt: ImageVector? = null

val Icons.Sc.WrenchAlt: ImageVector
    get() = _WrenchAlt ?: UXIcon(name = "WrenchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.12f, 23.03f)
                curveToRelative(-0.64f, 0f, -1.33f, -0.28f, -2.09f, -1.04f)
                curveToRelative(-1.76f, -1.76f, -0.96f, -3.2f, -0.05f, -4.26f)
                curveToRelative(0.71f, -0.87f, 1.87f, -2.24f, 3.3f, -3.78f)
                curveToRelative(0.96f, -1.03f, 2.17f, -2.28f, 3.23f, -3.29f)
                curveToRelative(-1.42f, -3.08f, 0.46f, -5.5f, 2.05f, -7.1f)
                curveToRelative(1.53f, -1.53f, 3.92f, -3.41f, 6.94f, -2.13f)
                curveToRelative(0.61f, 0.24f, 0.81f, 1.09f, 0.36f, 1.57f)
                curveToRelative(-0.82f, 0.94f, -1.51f, 1.77f, -2.01f, 2.38f)
                curveToRelative(-1.19f, 1.39f, -1.09f, 1.83f, -0.07f, 2.86f)
                curveToRelative(1.0f, 0.99f, 1.41f, 1.12f, 2.86f, -0.07f)
                curveToRelative(0.62f, -0.51f, 1.43f, -1.19f, 2.37f, -2.0f)
                curveToRelative(0.49f, -0.44f, 1.34f, -0.24f, 1.58f, 0.37f)
                curveToRelative(1.25f, 3.0f, -0.63f, 5.37f, -2.15f, 6.88f)
                curveToRelative(-1.59f, 1.59f, -4.0f, 3.46f, -7.07f, 2.07f)
                curveToRelative(-1.01f, 1.06f, -2.24f, 2.27f, -3.27f, 3.22f)
                curveToRelative(-1.21f, 1.12f, -2.46f, 2.21f, -3.82f, 3.33f)
                curveToRelative(-0.64f, 0.52f, -1.35f, 0.97f, -2.16f, 0.97f)
                close()
            }
        }.also { _WrenchAlt = it}
