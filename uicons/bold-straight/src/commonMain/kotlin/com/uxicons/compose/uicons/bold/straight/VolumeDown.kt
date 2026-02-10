package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Bs.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.68f, 12f)
                curveToRelative(0f, 2.03f, -1.65f, 3.68f, -3.68f, 3.68f)
                verticalLineToRelative(-7.36f)
                curveToRelative(2.03f, 0f, 3.68f, 1.65f, 3.68f, 3.68f)
                close()
                moveTo(5.27f, 5.5f)
                lineTo(13f, 0.39f)
                verticalLineToRelative(23.22f)
                lineToRelative(-7.73f, -5.11f)
                horizontalLineToRelative(-3.14f)
                curveToRelative(-1.17f, 0f, -2.12f, -0.95f, -2.12f, -2.12f)
                lineTo(0f, 7.62f)
                curveToRelative(0f, -1.17f, 0.95f, -2.12f, 2.12f, -2.12f)
                horizontalLineToRelative(3.14f)
                close()
                moveTo(6.17f, 8.5f)
                horizontalLineToRelative(-3.17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3.17f)
                lineToRelative(3.83f, 2.53f)
                lineTo(10f, 5.97f)
                lineToRelative(-3.83f, 2.53f)
                close()
            }
        }.also { _VolumeDown = it}
