package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplaySlash: ImageVector? = null

val Icons.Rs.DisplaySlash: ImageVector
    get() = _DisplaySlash ?: UXIcon(name = "DisplaySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.76f, 19.98f)
                lineToRelative(1.26f, 1.26f)
                verticalLineToRelative(0.74f)
                lineTo(7.02f, 21.98f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(0.02f, 18.98f)
                lineTo(0.02f, 5.98f)
                curveToRelative(0f, -0.5f, 0.14f, -0.97f, 0.35f, -1.38f)
                lineToRelative(1.65f, 1.65f)
                verticalLineToRelative(10.74f)
                horizontalLineToRelative(10.74f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-1.74f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.74f)
                close()
                moveTo(24.02f, 19f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.06f, 1.46f)
                lineTo(1.48f, 0.04f)
                lineToRelative(2.96f, 2.96f)
                horizontalLineToRelative(16.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(13f)
                close()
                moveTo(22.02f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(6.44f, 5f)
                lineToRelative(12f, 12f)
                horizontalLineToRelative(3.59f)
                lineTo(22.02f, 6f)
                close()
            }
        }.also { _DisplaySlash = it}
