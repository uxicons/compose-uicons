package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeSlash: ImageVector? = null

val Icons.Bs.VolumeSlash: ImageVector
    get() = _VolumeSlash ?: UXIcon(name = "VolumeSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 14.87f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(5.74f)
                lineToRelative(-7.73f, -5.11f)
                horizontalLineToRelative(-3.14f)
                curveToRelative(-1.17f, 0f, -2.12f, -0.95f, -2.12f, -2.12f)
                lineTo(0f, 7.62f)
                curveToRelative(0f, -0.75f, 0.39f, -1.4f, 0.97f, -1.78f)
                lineToRelative(2.03f, 2.03f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(3.17f)
                lineToRelative(3.83f, 2.53f)
                verticalLineToRelative(-3.16f)
                close()
                moveTo(20.95f, 18.75f)
                lineToRelative(3.02f, 3.02f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.06f, 2.1f)
                lineTo(2.18f, -0.02f)
                lineToRelative(4.56f, 4.56f)
                lineTo(13f, 0.39f)
                verticalLineToRelative(10.41f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(-4.48f)
                curveToRelative(2.03f, 0f, 3.68f, 1.65f, 3.68f, 3.68f)
                curveToRelative(0f, 1.22f, -0.59f, 2.3f, -1.51f, 2.97f)
                lineToRelative(1.65f, 1.65f)
                curveToRelative(1.36f, -1.13f, 2.18f, -2.83f, 2.18f, -4.62f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(-3f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 2.6f, -1.14f, 5.06f, -3.05f, 6.75f)
                close()
            }
        }.also { _VolumeSlash = it}
