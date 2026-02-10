package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LowVision: ImageVector? = null

val Icons.Ss.LowVision: ImageVector
    get() = _LowVision ?: UXIcon(name = "LowVision") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.88f, 7.12f)
                lineToRelative(13.19f, 13.19f)
                curveToRelative(-0.71f, 0.25f, -1.49f, 0.44f, -2.31f, 0.56f)
                lineTo(1.6f, 8.72f)
                curveToRelative(0.36f, -0.52f, 0.78f, -1.06f, 1.27f, -1.6f)
                close()
                moveTo(0.18f, 11.18f)
                curveToRelative(-0.24f, 0.52f, -0.24f, 1.12f, 0f, 1.64f)
                curveToRelative(0.04f, 0.09f, 0.09f, 0.2f, 0.15f, 0.31f)
                lineToRelative(6.91f, 6.91f)
                curveToRelative(1.11f, 0.48f, 2.36f, 0.8f, 3.77f, 0.91f)
                lineTo(0.53f, 10.47f)
                curveToRelative(-0.14f, 0.27f, -0.26f, 0.51f, -0.35f, 0.71f)
                close()
                moveTo(19.69f, 18.25f)
                lineToRelative(4.29f, 4.29f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.02f, 1.4f)
                lineTo(1.43f, -0.01f)
                lineToRelative(4.58f, 4.58f)
                curveToRelative(1.81f, -1.04f, 3.82f, -1.57f, 5.99f, -1.57f)
                curveToRelative(7.5f, 0f, 10.94f, 6.26f, 11.82f, 8.18f)
                curveToRelative(0.24f, 0.52f, 0.24f, 1.12f, 0f, 1.64f)
                curveToRelative(-0.48f, 1.05f, -1.77f, 3.48f, -4.13f, 5.43f)
                close()
                moveTo(8.54f, 7.1f)
                lineToRelative(1.45f, 1.45f)
                curveToRelative(1.53f, -0.89f, 3.53f, -0.68f, 4.84f, 0.63f)
                reflectiveCurveToRelative(1.52f, 3.31f, 0.63f, 4.84f)
                lineToRelative(1.45f, 1.45f)
                curveToRelative(1.65f, -2.34f, 1.43f, -5.61f, -0.66f, -7.7f)
                curveToRelative(-2.09f, -2.09f, -5.36f, -2.31f, -7.7f, -0.66f)
                close()
            }
        }.also { _LowVision = it}
