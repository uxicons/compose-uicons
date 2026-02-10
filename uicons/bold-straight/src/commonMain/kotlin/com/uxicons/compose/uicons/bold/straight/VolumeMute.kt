package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeMute: ImageVector? = null

val Icons.Bs.VolumeMute: ImageVector
    get() = _VolumeMute ?: UXIcon(name = "VolumeMute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.12f, 5.5f)
                curveToRelative(-1.17f, 0f, -2.12f, 0.95f, -2.12f, 2.12f)
                verticalLineToRelative(8.75f)
                curveToRelative(0f, 1.17f, 0.95f, 2.12f, 2.12f, 2.12f)
                horizontalLineToRelative(3.14f)
                lineToRelative(7.73f, 5.11f)
                lineTo(13f, 0.39f)
                lineToRelative(-7.73f, 5.11f)
                horizontalLineToRelative(-3.14f)
                close()
                moveTo(10f, 5.97f)
                verticalLineToRelative(12.06f)
                lineToRelative(-3.83f, -2.53f)
                horizontalLineToRelative(-3.17f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3.17f)
                lineToRelative(3.83f, -2.53f)
                close()
                moveTo(21.15f, 12f)
                lineToRelative(2.45f, 2.45f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.45f, -2.45f)
                lineToRelative(-2.45f, 2.45f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.45f, -2.45f)
                lineToRelative(-2.45f, -2.45f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.45f, 2.45f)
                lineToRelative(2.45f, -2.45f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.45f, 2.45f)
                close()
            }
        }.also { _VolumeMute = it}
