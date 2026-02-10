package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeSlash: ImageVector? = null

val Icons.Ss.VolumeSlash: ImageVector
    get() = _VolumeSlash ?: UXIcon(name = "VolumeSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16.24f)
                verticalLineToRelative(7.77f)
                lineToRelative(-7.36f, -6.01f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.03f, 0.78f, -1.87f, 1.77f, -1.99f)
                lineToRelative(10.23f, 10.23f)
                close()
                moveTo(14f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.54f, 0f, 1.08f, -0.05f, 1.61f, -0.14f)
                lineToRelative(-1.85f, -1.85f)
                horizontalLineToRelative(-0.76f)
                close()
                moveTo(20.52f, 19.11f)
                lineToRelative(3.44f, 3.44f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(4.72f, 4.72f)
                lineTo(12f, 0.04f)
                verticalLineToRelative(10.55f)
                lineToRelative(4.17f, 4.17f)
                curveToRelative(1.09f, -0.46f, 1.82f, -1.54f, 1.82f, -2.76f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.76f, -0.92f, 3.35f, -2.35f, 4.24f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(1.81f, -1.31f, 2.91f, -3.42f, 2.91f, -5.68f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 2.79f, -1.31f, 5.42f, -3.48f, 7.11f)
                close()
            }
        }.also { _VolumeSlash = it}
