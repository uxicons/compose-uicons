package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveFolder: ImageVector? = null

val Icons.Rs.RemoveFolder: ImageVector
    get() = _RemoveFolder ?: UXIcon(name = "RemoveFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(12.24f, 3f)
                lineTo(8.24f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                lineTo(0f, 23f)
                lineTo(13f, 23f)
                verticalLineToRelative(-2f)
                lineTo(2f, 21f)
                lineTo(2f, 9f)
                lineTo(22f, 9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7.76f, 3f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 7f)
                close()
                moveTo(23.96f, 16.46f)
                lineToRelative(-3.04f, 3.06f)
                lineToRelative(3.04f, 3.03f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(-3.04f, -3.03f)
                lineToRelative(-3.01f, 3.02f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(3.01f, -3.02f)
                lineToRelative(-3.04f, -3.03f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(3.04f, 3.03f)
                lineToRelative(3.04f, -3.06f)
                lineToRelative(1.42f, 1.41f)
                close()
            }
        }.also { _RemoveFolder = it}
