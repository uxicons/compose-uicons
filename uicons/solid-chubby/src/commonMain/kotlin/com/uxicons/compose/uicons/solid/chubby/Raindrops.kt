package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raindrops: ImageVector? = null

val Icons.Sc.Raindrops: ImageVector
    get() = _Raindrops ?: UXIcon(name = "Raindrops") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.64f, 9.93f)
                curveToRelative(-0.31f, -0.17f, -0.68f, -0.17f, -0.99f, 0.01f)
                curveToRelative(-0.53f, 0.31f, -5.17f, 3.12f, -5.23f, 6.81f)
                curveToRelative(0.09f, 2.94f, 2.82f, 5.66f, 5.75f, 5.7f)
                curveToRelative(2.91f, -0.04f, 5.72f, -2.83f, 5.72f, -5.75f)
                curveToRelative(0f, -3.87f, -5.04f, -6.66f, -5.26f, -6.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.51f, 3.08f)
                curveToRelative(-0.31f, -0.17f, -0.68f, -0.17f, -0.99f, 0.01f)
                curveToRelative(-0.35f, 0.2f, -3.42f, 2.07f, -3.46f, 4.6f)
                curveToRelative(0.06f, 2.03f, 1.95f, 3.91f, 3.98f, 3.94f)
                curveToRelative(2.01f, -0.03f, 3.96f, -2.05f, 3.96f, -3.98f)
                curveToRelative(0f, -2.6f, -3.14f, -4.37f, -3.49f, -4.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.04f, 6.97f)
                curveToRelative(0f, -2.83f, -3.63f, -5.08f, -4.04f, -5.3f)
                curveToRelative(-0.31f, -0.17f, -0.68f, -0.17f, -0.99f, 0.01f)
                curveToRelative(-0.41f, 0.24f, -3.97f, 2.4f, -4.02f, 5.29f)
                curveToRelative(0.07f, 2.31f, 2.22f, 4.45f, 4.53f, 4.48f)
                curveToRelative(2.29f, -0.03f, 4.51f, -2.17f, 4.51f, -4.48f)
                close()
            }
        }.also { _Raindrops = it}
