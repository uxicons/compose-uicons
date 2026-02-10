package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Sc.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 6.99f)
                curveToRelative(-0.2f, -1.32f, -1.24f, -3.82f, -1.45f, -4.31f)
                curveToRelative(-0.19f, -0.46f, -0.6f, -0.79f, -1.09f, -0.89f)
                curveToRelative(-0.49f, -0.1f, -0.99f, 0.06f, -1.35f, 0.41f)
                lineTo(1.44f, 19.67f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                curveToRelative(0.38f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(3.86f, -3.85f)
                curveToRelative(0.3f, 0.35f, 0.68f, 0.7f, 1.15f, 1.01f)
                curveToRelative(1.38f, 0.94f, 2.65f, 1.14f, 3.5f, 1.14f)
                curveToRelative(0.82f, 0f, 1.17f, -0.16f, 1.23f, -0.18f)
                curveToRelative(0.12f, -0.05f, 3.1f, -1.3f, 6.52f, -5.08f)
                curveToRelative(3.35f, -3.71f, 3.37f, -5.68f, 3.04f, -7.85f)
                close()
            }
        }.also { _Knife = it}
