package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoFolder: ImageVector? = null

val Icons.Ts.VideoFolder: ImageVector
    get() = _VideoFolder ?: UXIcon(name = "VideoFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7.94f)
                lineToRelative(1f, -0.56f)
                verticalLineToRelative(16.62f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-19.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.62f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(0.88f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.12f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-5.38f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(22f)
                close()
                moveTo(24f, 5.07f)
                lineTo(15f, 10.15f)
                verticalLineToRelative(-10.15f)
                close()
                moveTo(16f, 8.44f)
                lineTo(21.98f, 5.07f)
                lineTo(16f, 1.71f)
                close()
                moveTo(12f, 13f)
                verticalLineToRelative(1.73f)
                lineToRelative(3f, -2.22f)
                verticalLineToRelative(8.98f)
                lineToRelative(-3f, -2.22f)
                verticalLineToRelative(1.73f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                close()
                moveTo(12f, 15.97f)
                verticalLineToRelative(2.06f)
                lineToRelative(2f, 1.48f)
                verticalLineToRelative(-5.02f)
                close()
            }
        }.also { _VideoFolder = it}
