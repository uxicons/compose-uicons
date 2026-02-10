package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveformPath: ImageVector? = null

val Icons.Ts.WaveformPath: ImageVector
    get() = _WaveformPath ?: UXIcon(name = "WaveformPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 7f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(1f)
                lineTo(14f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(24f)
                close()
                moveTo(21f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(1f)
                lineTo(22f, 4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(9f, 20f)
                horizontalLineToRelative(1f)
                lineTo(10f, 4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(16f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(1f)
                lineTo(6f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                close()
                moveTo(1f, 15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _WaveformPath = it}
