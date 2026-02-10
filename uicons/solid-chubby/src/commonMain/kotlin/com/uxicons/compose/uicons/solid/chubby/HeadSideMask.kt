package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMask: ImageVector? = null

val Icons.Sc.HeadSideMask: ImageVector
    get() = _HeadSideMask ?: UXIcon(name = "HeadSideMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.36f, 14.03f)
                lineToRelative(4.25f, 7.47f)
                curveToRelative(1.51f, -1.11f, 4.39f, -3.61f, 4.39f, -6.47f)
                curveToRelative(0f, -2.02f, -0.07f, -3.81f, -0.14f, -5.16f)
                curveToRelative(-0.94f, 0.91f, -2.32f, 2.02f, -4.28f, 3.12f)
                curveToRelative(-1.49f, 0.84f, -3.06f, 1.05f, -4.22f, 1.04f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.84f, 11.86f)
                curveToRelative(0.43f, 0.1f, 2.67f, 0.54f, 4.7f, -0.6f)
                curveToRelative(1.91f, -1.07f, 3.18f, -2.12f, 3.99f, -2.94f)
                curveToRelative(-0.1f, -0.75f, -0.33f, -1.68f, -0.44f, -2.01f)
                curveToRelative(-1.08f, -3.4f, -4.38f, -5.29f, -9.29f, -5.31f)
                curveToRelative(-4.91f, 0.03f, -8.33f, 2.01f, -9.87f, 5.59f)
                lineToRelative(10.92f, 5.27f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.72f, 13.56f)
                lineTo(1.31f, 8.53f)
                curveToRelative(-0.19f, 0.84f, -0.29f, 1.75f, -0.31f, 2.72f)
                curveToRelative(0.07f, 4.04f, 2.23f, 6.21f, 3.85f, 7.48f)
                curveToRelative(0.54f, 0.43f, 0.88f, 0.97f, 0.95f, 1.53f)
                curveToRelative(0.14f, 1.1f, 0.31f, 1.56f, 0.36f, 1.67f)
                curveToRelative(0.13f, 0.3f, 0.41f, 0.52f, 0.74f, 0.59f)
                curveToRelative(0.1f, 0.02f, 2.4f, 0.47f, 4.61f, 0.47f)
                curveToRelative(2.42f, 0f, 4.34f, -0.46f, 4.42f, -0.48f)
                curveToRelative(0.27f, -0.07f, 0.49f, -0.23f, 0.63f, -0.45f)
                lineToRelative(-4.84f, -8.51f)
                close()
            }
        }.also { _HeadSideMask = it}
