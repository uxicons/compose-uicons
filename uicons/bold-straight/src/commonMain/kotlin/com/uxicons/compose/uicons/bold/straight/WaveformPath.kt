package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveformPath: ImageVector? = null

val Icons.Bs.WaveformPath: ImageVector
    get() = _WaveformPath ?: UXIcon(name = "WaveformPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 7f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(3f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(24f)
                close()
                moveTo(20f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(3f)
                lineTo(23f, 4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(5f, 19f)
                horizontalLineToRelative(3f)
                lineTo(8f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(14f)
                close()
                moveTo(0f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _WaveformPath = it}
