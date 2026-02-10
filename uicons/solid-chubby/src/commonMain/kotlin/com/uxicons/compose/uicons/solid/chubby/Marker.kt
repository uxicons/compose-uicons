package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Sc.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1.0f)
                curveTo(7.16f, 1.07f, 2.31f, 5.81f, 2.31f, 10.46f)
                curveToRelative(0f, 6.42f, 8.77f, 12.15f, 9.14f, 12.38f)
                curveToRelative(0.47f, 0.3f, 0.94f, 0.1f, 1.11f, -0.01f)
                curveToRelative(0.37f, -0.25f, 9.02f, -6.25f, 9.13f, -12.42f)
                curveToRelative(-0.15f, -4.77f, -4.85f, -9.34f, -9.71f, -9.41f)
                close()
                moveTo(14.81f, 13.13f)
                curveToRelative(-0.94f, 0.94f, -1.86f, 1.4f, -2.82f, 1.4f)
                curveToRelative(-0.08f, 0f, -0.15f, -0.0f, -0.23f, -0.01f)
                curveToRelative(-0.88f, -0.07f, -1.7f, -0.51f, -2.58f, -1.39f)
                curveToRelative(-1.87f, -1.86f, -1.87f, -3.76f, 0f, -5.62f)
                curveToRelative(1.87f, -1.87f, 3.76f, -1.86f, 5.62f, 0f)
                curveToRelative(1.86f, 1.87f, 1.86f, 3.76f, 0f, 5.62f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.02f, 8.11f)
                curveToRelative(-0.41f, 0f, -0.85f, 0.25f, -1.42f, 0.81f)
                curveToRelative(-1.2f, 1.2f, -0.97f, 1.83f, 0f, 2.8f)
                curveToRelative(0.52f, 0.52f, 0.95f, 0.78f, 1.32f, 0.81f)
                curveToRelative(0.42f, 0.04f, 0.91f, -0.24f, 1.48f, -0.81f)
                curveToRelative(1.2f, -1.2f, 0.97f, -1.83f, 0f, -2.8f)
                curveToRelative(-0.51f, -0.51f, -0.93f, -0.81f, -1.38f, -0.81f)
                close()
            }
        }.also { _Marker = it}
