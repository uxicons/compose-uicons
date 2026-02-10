package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToLine: ImageVector? = null

val Icons.Ss.ArrowsToLine: ImageVector
    get() = _ArrowsToLine ?: UXIcon(name = "ArrowsToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                verticalLineToRelative(2f)
                lineTo(0f, 13f)
                verticalLineToRelative(-2f)
                lineTo(24f, 11f)
                close()
                moveTo(12f, 9.0f)
                curveToRelative(0.51f, 0f, 1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 6f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                close()
                moveTo(10.59f, 15.59f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.5f, -2.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.5f, -3.5f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                close()
            }
        }.also { _ArrowsToLine = it}
