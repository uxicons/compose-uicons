package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeOff: ImageVector? = null

val Icons.Tr.VolumeOff: ImageVector
    get() = _VolumeOff ?: UXIcon(name = "VolumeOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.3f, 24.0f)
                curveToRelative(-0.2f, 0f, -0.4f, -0.03f, -0.58f, -0.1f)
                curveToRelative(-2.16f, -0.79f, -4.59f, -2.68f, -6.04f, -4.68f)
                lineToRelative(-0.15f, -0.21f)
                lineToRelative(-2.02f, -0.0f)
                curveToRelative(-2.48f, -0.0f, -4.5f, -2.02f, -4.5f, -4.51f)
                verticalLineToRelative(-4.99f)
                curveToRelative(0f, -1.2f, 0.47f, -2.33f, 1.32f, -3.19f)
                curveToRelative(0.85f, -0.85f, 1.98f, -1.31f, 3.18f, -1.31f)
                horizontalLineToRelative(0.01f)
                lineToRelative(2.02f, 0.0f)
                lineToRelative(0.15f, -0.21f)
                curveTo(8.19f, 2.69f, 10.53f, 0.89f, 12.76f, 0.1f)
                curveToRelative(0.51f, -0.18f, 1.06f, -0.1f, 1.51f, 0.21f)
                curveToRelative(0.46f, 0.32f, 0.73f, 0.84f, 0.73f, 1.4f)
                verticalLineToRelative(20.59f)
                curveToRelative(0f, 0.56f, -0.27f, 1.08f, -0.73f, 1.4f)
                curveToRelative(-0.29f, 0.2f, -0.63f, 0.31f, -0.97f, 0.31f)
                close()
                moveTo(4.5f, 6f)
                curveToRelative(-0.94f, 0f, -1.81f, 0.36f, -2.47f, 1.02f)
                curveToRelative(-0.66f, 0.66f, -1.03f, 1.54f, -1.03f, 2.48f)
                verticalLineToRelative(4.99f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.51f)
                lineToRelative(2.28f, 0.0f)
                curveToRelative(0.16f, 0f, 0.31f, 0.08f, 0.4f, 0.21f)
                lineToRelative(0.3f, 0.41f)
                curveToRelative(1.32f, 1.83f, 3.61f, 3.61f, 5.57f, 4.33f)
                curveToRelative(0.22f, 0.08f, 0.45f, 0.05f, 0.64f, -0.08f)
                curveToRelative(0.19f, -0.13f, 0.3f, -0.34f, 0.3f, -0.58f)
                verticalLineTo(1.71f)
                curveToRelative(0f, -0.23f, -0.11f, -0.45f, -0.3f, -0.58f)
                curveToRelative(-0.18f, -0.13f, -0.4f, -0.16f, -0.6f, -0.09f)
                curveToRelative(-2.02f, 0.72f, -4.23f, 2.42f, -5.61f, 4.34f)
                lineToRelative(-0.3f, 0.41f)
                curveToRelative(-0.09f, 0.13f, -0.24f, 0.21f, -0.41f, 0.21f)
                horizontalLineToRelative(0f)
                lineToRelative(-2.27f, -0.0f)
                horizontalLineToRelative(-0.01f)
                close()
            }
        }.also { _VolumeOff = it}
