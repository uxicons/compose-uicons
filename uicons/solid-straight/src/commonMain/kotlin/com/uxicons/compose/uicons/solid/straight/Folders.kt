package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folders: ImageVector? = null

val Icons.Ss.Folders: ImageVector
    get() = _Folders ?: UXIcon(name = "Folders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 21f)
                verticalLineToRelative(2f)
                lineTo(0f, 23f)
                lineTo(0f, 8f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(15.82f)
                lineTo(20f, 21f)
                close()
                moveTo(4f, 9f)
                verticalLineToRelative(10f)
                lineTo(24f, 19f)
                lineTo(24f, 9f)
                lineTo(4f, 9f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5.76f)
                lineTo(11.24f, 1f)
                lineTo(7f, 1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                lineTo(24f, 7f)
                close()
            }
        }.also { _Folders = it}
