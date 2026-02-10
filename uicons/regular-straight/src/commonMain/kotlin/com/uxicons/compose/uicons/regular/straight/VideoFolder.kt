package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoFolder: ImageVector? = null

val Icons.Rs.VideoFolder: ImageVector
    get() = _VideoFolder ?: UXIcon(name = "VideoFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.59f)
                verticalLineToRelative(16.41f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(5.24f)
                lineToRelative(3.76f, 1.88f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(-0.24f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-4.76f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-2.29f)
                close()
                moveTo(13f, 12f)
                verticalLineToRelative(2.22f)
                lineToRelative(3f, -2.22f)
                verticalLineToRelative(8f)
                lineToRelative(-3f, -2.22f)
                verticalLineToRelative(2.22f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-8f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(23.71f, 5.46f)
                lineTo(14f, 10.92f)
                verticalLineToRelative(-10.92f)
                close()
                moveTo(16f, 7.5f)
                lineTo(19.63f, 5.46f)
                lineTo(16f, 3.42f)
                close()
            }
        }.also { _VideoFolder = it}
