package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folders: ImageVector? = null

val Icons.Ts.Folders: ImageVector
    get() = _Folders ?: UXIcon(name = "Folders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 3f)
                horizontalLineToRelative(-6.38f)
                lineTo(11.12f, 1f)
                lineTo(5.5f, 1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(3f, 20f)
                lineTo(24f, 20f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.5f, 2f)
                horizontalLineToRelative(5.38f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(6.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(4f, 7f)
                lineTo(4f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4f, 19f)
                lineTo(4f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(11f)
                lineTo(4f, 19f)
                close()
                moveTo(1f, 22f)
                lineTo(20f, 22f)
                verticalLineToRelative(1f)
                lineTo(0f, 23f)
                lineTo(0f, 8f)
                curveToRelative(0f, -0.89f, 0.39f, -1.68f, 1f, -2.22f)
                lineTo(1f, 22f)
                close()
            }
        }.also { _Folders = it}
