package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoSlash: ImageVector? = null

val Icons.Ts.VideoSlash: ImageVector
    get() = _VideoSlash ?: UXIcon(name = "VideoSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19.21f)
                lineTo(24f, 4.79f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(-2.29f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.71f, 4f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineTo(23.25f, 23.95f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.95f, -3.95f)
                verticalLineToRelative(-4.09f)
                lineToRelative(4f, 4f)
                close()
                moveTo(23f, 7.21f)
                verticalLineToRelative(9.59f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(-3.59f)
                lineToRelative(3f, -3f)
                close()
                moveTo(5.71f, 5f)
                horizontalLineToRelative(11.79f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.79f)
                lineTo(5.71f, 5f)
                close()
                moveTo(15.5f, 19f)
                lineToRelative(1f, 1f)
                lineTo(0f, 20f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -0.81f, 0.39f, -1.52f, 0.99f, -1.98f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(-0.42f, 0.27f, -0.7f, 0.73f, -0.7f, 1.26f)
                verticalLineToRelative(12.5f)
                lineTo(15.5f, 19f)
                close()
            }
        }.also { _VideoSlash = it}
