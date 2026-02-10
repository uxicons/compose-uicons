package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToLine: ImageVector? = null

val Icons.Bs.ArrowsToLine: ImageVector
    get() = _ArrowsToLine ?: UXIcon(name = "ArrowsToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(0f, 13.5f)
                verticalLineToRelative(-3f)
                lineTo(24f, 10.5f)
                close()
                moveTo(12.71f, 16.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, 3.71f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.79f, -3.71f)
                close()
                moveTo(11.29f, 7.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.79f, -3.71f)
                horizontalLineToRelative(-3f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, 3.71f)
                close()
            }
        }.also { _ArrowsToLine = it}
