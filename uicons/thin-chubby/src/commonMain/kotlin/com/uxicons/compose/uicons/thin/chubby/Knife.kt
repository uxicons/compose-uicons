package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Tc.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 6.58f)
                curveToRelative(-0.21f, -1.39f, -1.46f, -4.41f, -1.52f, -4.53f)
                curveToRelative(-0.06f, -0.15f, -0.2f, -0.27f, -0.37f, -0.3f)
                curveToRelative(-0.16f, -0.03f, -0.33f, 0.02f, -0.45f, 0.14f)
                lineTo(1.15f, 21.41f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(5.25f, -5.29f)
                curveToRelative(0.29f, 0.56f, 0.82f, 1.34f, 1.75f, 1.98f)
                curveToRelative(1.29f, 0.88f, 2.45f, 1.07f, 3.21f, 1.07f)
                curveToRelative(0.53f, 0f, 0.87f, -0.09f, 0.93f, -0.11f)
                curveToRelative(0.13f, -0.05f, 3.19f, -1.35f, 6.79f, -5.38f)
                curveToRelative(3.37f, -3.77f, 3.4f, -5.62f, 3.08f, -7.81f)
                close()
                moveTo(19.04f, 13.72f)
                curveToRelative(-3.42f, 3.83f, -6.38f, 5.1f, -6.37f, 5.1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.06f, 0.02f, -1.47f, 0.37f, -3.25f, -0.84f)
                curveToRelative(-0.95f, -0.65f, -1.4f, -1.49f, -1.56f, -1.91f)
                lineTo(20.7f, 3.13f)
                curveToRelative(0.38f, 0.97f, 1.04f, 2.71f, 1.17f, 3.6f)
                curveToRelative(0.26f, 1.76f, 0.49f, 3.28f, -2.83f, 7.0f)
                close()
            }
        }.also { _Knife = it}
