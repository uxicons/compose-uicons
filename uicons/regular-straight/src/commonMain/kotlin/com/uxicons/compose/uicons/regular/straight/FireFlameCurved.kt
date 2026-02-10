package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameCurved: ImageVector? = null

val Icons.Rs.FireFlameCurved: ImageVector
    get() = _FireFlameCurved ?: UXIcon(name = "FireFlameCurved") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -3.36f, 1.5f, -5.46f, 3.77f, -7.58f)
                lineToRelative(2.45f, -2.3f)
                lineToRelative(-0.79f, 3.26f)
                curveToRelative(-0.28f, 1.14f, -0.35f, 4.61f, 1.11f, 6.46f)
                curveToRelative(0.61f, 0.78f, 1.42f, 1.16f, 2.47f, 1.16f)
                curveToRelative(1.11f, 0f, 1.99f, -0.88f, 2f, -2.01f)
                curveToRelative(0.01f, -1.12f, -0.46f, -2.04f, -0.96f, -3.02f)
                curveToRelative(-0.51f, -1.0f, -1.04f, -2.04f, -1.04f, -3.29f)
                curveToRelative(0f, -2.71f, 1.41f, -5.17f, 1.47f, -5.27f)
                lineTo(13.3f, -0.02f)
                lineToRelative(0.88f, 1.39f)
                curveToRelative(0.85f, 1.34f, 1.99f, 2.59f, 3.1f, 3.79f)
                curveToRelative(2.32f, 2.52f, 4.72f, 5.14f, 4.72f, 8.84f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
                moveTo(4f, 14f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -2.92f, -2.04f, -5.14f, -4.19f, -7.48f)
                curveToRelative(-0.77f, -0.84f, -1.56f, -1.7f, -2.28f, -2.61f)
                curveToRelative(-0.28f, 0.77f, -0.53f, 1.76f, -0.53f, 2.77f)
                curveToRelative(0f, 0.78f, 0.38f, 1.52f, 0.82f, 2.38f)
                curveToRelative(0.56f, 1.1f, 1.2f, 2.34f, 1.18f, 3.96f)
                curveToRelative(-0.03f, 2.2f, -1.82f, 3.99f, -4f, 3.99f)
                curveToRelative(-1.66f, 0f, -3.05f, -0.66f, -4.04f, -1.92f)
                curveToRelative(-1.15f, -1.46f, -1.57f, -3.48f, -1.66f, -5.19f)
                curveToRelative(-0.84f, 1.17f, -1.3f, 2.42f, -1.3f, 4.1f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _FireFlameCurved = it}
