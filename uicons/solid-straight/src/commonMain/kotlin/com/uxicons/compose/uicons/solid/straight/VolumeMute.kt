package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeMute: ImageVector? = null

val Icons.Ss.VolumeMute: ImageVector
    get() = _VolumeMute ?: UXIcon(name = "VolumeMute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2.64f)
                lineToRelative(7.36f, 6.01f)
                lineTo(12f, 0.04f)
                lineToRelative(-7.35f, 5.96f)
                horizontalLineToRelative(-2.65f)
                close()
                moveTo(20.44f, 12f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                close()
            }
        }.also { _VolumeMute = it}
