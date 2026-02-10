package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folders: ImageVector? = null

val Icons.Bs.Folders: ImageVector
    get() = _Folders ?: UXIcon(name = "Folders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                horizontalLineToRelative(-4.65f)
                lineTo(11.85f, 1f)
                horizontalLineToRelative(-3.35f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                lineTo(24f, 18f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8f, 15f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(7f)
                lineTo(8f, 15f)
                close()
                moveTo(3f, 20f)
                lineTo(19f, 20f)
                verticalLineToRelative(3f)
                lineTo(0f, 23f)
                lineTo(0f, 8.52f)
                curveToRelative(0f, -1.47f, 0.94f, -2.79f, 2.33f, -3.29f)
                lineToRelative(0.67f, -0.24f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _Folders = it}
