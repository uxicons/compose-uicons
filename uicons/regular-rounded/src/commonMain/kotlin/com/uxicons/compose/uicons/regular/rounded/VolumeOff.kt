package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeOff: ImageVector? = null

val Icons.Rr.VolumeOff: ImageVector
    get() = _VolumeOff ?: UXIcon(name = "VolumeOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.0f, 23.81f)
                curveToRelative(-0.06f, 0f, -0.12f, -0.01f, -0.18f, -0.02f)
                curveToRelative(-3.0f, -0.55f, -5.75f, -2.3f, -7.55f, -4.79f)
                horizontalLineToRelative(-1.27f)
                curveTo(2.24f, 19.0f, -0.0f, 16.76f, -0.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveTo(-0.0f, 7.24f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(1.27f)
                curveTo(8.07f, 2.5f, 10.82f, 0.76f, 13.82f, 0.2f)
                curveToRelative(0.29f, -0.05f, 0.59f, 0.03f, 0.82f, 0.21f)
                curveToRelative(0.23f, 0.19f, 0.36f, 0.47f, 0.36f, 0.77f)
                verticalLineToRelative(21.63f)
                curveToRelative(0f, 0.3f, -0.13f, 0.58f, -0.36f, 0.77f)
                curveToRelative(-0.18f, 0.15f, -0.41f, 0.23f, -0.64f, 0.23f)
                close()
                moveTo(5.0f, 7.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4.0f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.32f, 0f, 0.62f, 0.15f, 0.81f, 0.41f)
                lineToRelative(0.3f, 0.41f)
                curveToRelative(1.26f, 1.75f, 3.08f, 3.06f, 5.11f, 3.7f)
                verticalLineTo(2.47f)
                curveToRelative(-2.03f, 0.65f, -3.85f, 1.96f, -5.11f, 3.7f)
                lineToRelative(-0.3f, 0.41f)
                curveToRelative(-0.19f, 0.26f, -0.49f, 0.41f, -0.81f, 0.41f)
                horizontalLineToRelative(-1.78f)
                close()
            }
        }.also { _VolumeOff = it}
