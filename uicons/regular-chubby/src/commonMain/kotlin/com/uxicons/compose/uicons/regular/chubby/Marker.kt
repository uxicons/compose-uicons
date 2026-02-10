package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Rc.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 14.53f)
                curveToRelative(-0.08f, 0f, -0.15f, -0.0f, -0.23f, -0.01f)
                curveToRelative(-0.88f, -0.07f, -1.7f, -0.51f, -2.58f, -1.39f)
                curveToRelative(-1.87f, -1.86f, -1.87f, -3.76f, 0f, -5.62f)
                curveToRelative(1.87f, -1.87f, 3.76f, -1.86f, 5.62f, 0f)
                curveToRelative(1.86f, 1.87f, 1.86f, 3.76f, 0f, 5.62f)
                curveToRelative(-0.94f, 0.94f, -1.86f, 1.4f, -2.82f, 1.4f)
                close()
                moveTo(12.02f, 8.11f)
                curveToRelative(-0.41f, 0f, -0.85f, 0.25f, -1.42f, 0.81f)
                curveToRelative(-1.2f, 1.2f, -0.97f, 1.83f, 0f, 2.8f)
                curveToRelative(0.52f, 0.52f, 0.95f, 0.78f, 1.32f, 0.81f)
                curveToRelative(0.42f, 0.04f, 0.91f, -0.24f, 1.48f, -0.81f)
                curveToRelative(1.2f, -1.2f, 0.97f, -1.83f, 0f, -2.8f)
                curveToRelative(-0.51f, -0.51f, -0.93f, -0.81f, -1.38f, -0.81f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(7.16f, 1.07f, 2.31f, 5.81f, 2.31f, 10.46f)
                curveToRelative(0f, 6.42f, 8.78f, 12.14f, 9.14f, 12.38f)
                curveToRelative(0.17f, 0.11f, 0.36f, 0.16f, 0.55f, 0.16f)
                curveToRelative(0.2f, 0f, 0.4f, -0.06f, 0.56f, -0.17f)
                curveToRelative(0.37f, -0.25f, 9.02f, -6.25f, 9.13f, -12.42f)
                curveToRelative(-0.15f, -4.77f, -4.85f, -9.34f, -9.71f, -9.41f)
                close()
                moveTo(11.99f, 20.77f)
                curveToRelative(-1.84f, -1.32f, -7.58f, -5.82f, -7.68f, -10.33f)
                curveToRelative(0.13f, -3.71f, 3.94f, -7.39f, 7.68f, -7.44f)
                curveToRelative(3.77f, 0.05f, 7.59f, 3.75f, 7.71f, 7.42f)
                curveToRelative(-0.07f, 4.3f, -5.86f, 8.98f, -7.7f, 10.35f)
                close()
            }
        }.also { _Marker = it}
