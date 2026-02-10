package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Splotch: ImageVector? = null

val Icons.Sc.Splotch: ImageVector
    get() = _Splotch ?: UXIcon(name = "Splotch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12.95f)
                curveToRelative(0f, 2.41f, -2.81f, 3.08f, -5.52f, 3.72f)
                curveToRelative(-0.38f, 0.09f, -0.66f, 0.38f, -0.75f, 0.76f)
                curveToRelative(-1.08f, 4.94f, -2.34f, 5.57f, -3.31f, 5.57f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-1.56f, 0f, -3.51f, -1.37f, -5.22f, -3.67f)
                curveToRelative(-0.17f, -0.22f, -0.44f, -0.36f, -0.74f, -0.37f)
                lineToRelative(-0.56f, -0.02f)
                curveToRelative(-2.63f, -0.07f, -5.9f, -0.17f, -5.9f, -3.13f)
                curveToRelative(0f, -1.22f, 0.82f, -2.9f, 2.45f, -4.99f)
                curveToRelative(0.23f, -0.29f, 0.27f, -0.68f, 0.13f, -1.01f)
                curveToRelative(-2.3f, -5.21f, -1.53f, -6.59f, -0.74f, -7.18f)
                curveToRelative(1.67f, -1.25f, 3.61f, -0.4f, 5.67f, 0.49f)
                curveToRelative(0.4f, 0.17f, 0.81f, 0.35f, 1.24f, 0.53f)
                curveToRelative(0.34f, 0.14f, 0.72f, 0.08f, 1.0f, -0.14f)
                curveToRelative(2.38f, -1.85f, 4.06f, -2.52f, 6.06f, -2.46f)
                curveToRelative(0.1f, 0.0f, 0.2f, 0.02f, 0.29f, 0.05f)
                curveToRelative(0.88f, 0.29f, 1.8f, 1.33f, 1.9f, 6.77f)
                curveToRelative(0.01f, 0.33f, 0.18f, 0.64f, 0.46f, 0.81f)
                curveToRelative(2.35f, 1.46f, 3.54f, 2.89f, 3.54f, 4.27f)
                close()
            }
        }.also { _Splotch = it}
