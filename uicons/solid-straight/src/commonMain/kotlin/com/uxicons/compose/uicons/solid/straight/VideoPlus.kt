package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoPlus: ImageVector? = null

val Icons.Ss.VideoPlus: ImageVector
    get() = _VideoPlus ?: UXIcon(name = "VideoPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(19f, 20f)
                lineTo(19f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13.5f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 5.01f)
                verticalLineToRelative(13.98f)
                lineToRelative(-3f, -2.24f)
                lineTo(21f, 7.24f)
                lineToRelative(3f, -2.24f)
                close()
            }
        }.also { _VideoPlus = it}
