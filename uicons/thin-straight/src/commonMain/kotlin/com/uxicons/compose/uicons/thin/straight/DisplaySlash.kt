package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplaySlash: ImageVector? = null

val Icons.Ts.DisplaySlash: ImageVector
    get() = _DisplaySlash ?: UXIcon(name = "DisplaySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.71f, 2f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineToRelative(23.2f, 23.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-4.25f, -4.25f)
                horizontalLineToRelative(4.29f)
                lineTo(24.0f, 4.5f)
                close()
                moveTo(23f, 18f)
                horizontalLineToRelative(-4.29f)
                lineTo(3.71f, 3f)
                horizontalLineToRelative(17.79f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(12.5f, 21f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                lineTo(7f, 22f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -0.29f, 0.06f, -0.56f, 0.15f, -0.82f)
                lineToRelative(0.85f, 0.85f)
                verticalLineToRelative(13.46f)
                horizontalLineToRelative(13.46f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-2.96f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _DisplaySlash = it}
