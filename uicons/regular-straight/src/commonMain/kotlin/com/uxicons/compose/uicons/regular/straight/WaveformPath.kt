package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveformPath: ImageVector? = null

val Icons.Rs.WaveformPath: ImageVector
    get() = _WaveformPath ?: UXIcon(name = "WaveformPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 7f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(2f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(24f)
                close()
                moveTo(21f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(2f)
                lineTo(23f, 4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9f, 20f)
                horizontalLineToRelative(2f)
                lineTo(11f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(16f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(2f)
                lineTo(7f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                close()
                moveTo(1f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                lineTo(1f, 9f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _WaveformPath = it}
