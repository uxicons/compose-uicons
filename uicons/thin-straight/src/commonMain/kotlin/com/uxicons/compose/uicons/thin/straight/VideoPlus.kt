package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoPlus: ImageVector? = null

val Icons.Ts.VideoPlus: ImageVector
    get() = _VideoPlus ?: UXIcon(name = "VideoPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.79f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(-2.29f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(20f, 20f)
                verticalLineToRelative(-4.79f)
                lineToRelative(4f, 4f)
                lineTo(24f, 4.79f)
                close()
                moveTo(19f, 19f)
                lineTo(1f, 19f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(23f, 16.79f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(-3.59f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(9.59f)
                close()
                moveTo(10.5f, 11.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.also { _VideoPlus = it}
