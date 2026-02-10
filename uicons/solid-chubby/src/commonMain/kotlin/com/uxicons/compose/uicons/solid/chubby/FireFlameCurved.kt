package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameCurved: ImageVector? = null

val Icons.Sc.FireFlameCurved: ImageVector
    get() = _FireFlameCurved ?: UXIcon(name = "FireFlameCurved") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.59f, 7.76f)
                curveToRelative(-1.39f, -1.38f, -2.59f, -2.56f, -2.59f, -5.76f)
                curveToRelative(0f, -0.28f, -0.12f, -0.55f, -0.33f, -0.74f)
                curveToRelative(-0.21f, -0.19f, -0.49f, -0.28f, -0.77f, -0.25f)
                curveToRelative(-2.38f, 0.25f, -6.89f, 2.04f, -6.89f, 7.0f)
                curveToRelative(0f, 0.2f, 0.12f, 3.69f, -0.49f, 4.32f)
                curveToRelative(-0.09f, 0.09f, -0.22f, 0.18f, -0.51f, 0.18f)
                curveToRelative(-0.18f, 0f, -0.3f, -0.05f, -0.42f, -0.19f)
                curveToRelative(-0.59f, -0.65f, -0.69f, -2.56f, -0.58f, -3.71f)
                curveToRelative(0.03f, -0.26f, -0.05f, -0.5f, -0.2f, -0.7f)
                curveToRelative(-0.06f, -0.08f, -0.14f, -0.16f, -0.23f, -0.22f)
                curveToRelative(-0.35f, -0.25f, -0.82f, -0.24f, -1.16f, 0.01f)
                curveToRelative(-0.15f, 0.11f, -0.27f, 0.25f, -0.34f, 0.43f)
                lineToRelative(-0.18f, 0.43f)
                curveToRelative(-0.62f, 1.48f, -1.4f, 3.33f, -1.39f, 4.95f)
                curveToRelative(0.0f, 5.95f, 3.55f, 9.5f, 9.5f, 9.5f)
                curveToRelative(6.13f, 0f, 9.5f, -3.2f, 9.5f, -9f)
                curveToRelative(0f, -3.37f, -1.54f, -4.89f, -2.91f, -6.24f)
                close()
            }
        }.also { _FireFlameCurved = it}
