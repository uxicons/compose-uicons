package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveFolder: ImageVector? = null

val Icons.Ss.RemoveFolder: ImageVector
    get() = _RemoveFolder ?: UXIcon(name = "RemoveFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6f)
                verticalLineToRelative(1f)
                lineTo(0f, 7f)
                verticalLineToRelative(-3f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(0f, 23f)
                lineTo(14.03f, 23f)
                curveToRelative(-0.65f, -1.01f, -1.03f, -2.21f, -1.03f, -3.5f)
                curveToRelative(0f, -3.59f, 2.91f, -6.5f, 6.5f, -6.5f)
                curveToRelative(1.75f, 0f, 3.33f, 0.69f, 4.5f, 1.82f)
                verticalLineToRelative(-5.82f)
                lineTo(0f, 9f)
                verticalLineToRelative(14f)
                close()
                moveTo(21.29f, 16.29f)
                lineToRelative(-1.79f, 1.8f)
                lineToRelative(-1.79f, -1.78f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(1.79f, 1.78f)
                lineToRelative(-1.77f, 1.78f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(1.77f, -1.78f)
                lineToRelative(1.79f, 1.78f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(-1.79f, -1.78f)
                lineToRelative(1.79f, -1.8f)
                lineToRelative(-1.42f, -1.41f)
                close()
            }
        }.also { _RemoveFolder = it}
