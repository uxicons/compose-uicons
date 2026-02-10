package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextSlash: ImageVector? = null

val Icons.Ts.TextSlash: ImageVector
    get() = _TextSlash ?: UXIcon(name = "TextSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 11.79f)
                lineTo(12.5f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 2f)
                curveToRelative(-0.49f, 0f, -0.97f, 0.15f, -1.37f, 0.42f)
                lineTo(1.1f, 0.4f)
                lineTo(0.4f, 1.1f)
                lineTo(22.9f, 23.6f)
                lineToRelative(0.71f, -0.71f)
                lineTo(12.5f, 11.79f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7.79f)
                lineTo(3.86f, 3.15f)
                curveToRelative(0.2f, -0.1f, 0.42f, -0.15f, 0.64f, -0.15f)
                close()
                moveTo(11.5f, 15f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                close()
                moveTo(2f, 5.5f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _TextSlash = it}
