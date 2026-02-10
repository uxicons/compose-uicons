package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoveToFolder: ImageVector? = null

val Icons.Bs.MoveToFolder: ImageVector
    get() = _MoveToFolder ?: UXIcon(name = "MoveToFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                lineTo(12.35f, 3f)
                lineTo(8.35f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 20f)
                lineTo(3f, 8f)
                lineTo(21f, 8f)
                verticalLineToRelative(12f)
                lineTo(3f, 20f)
                close()
                moveTo(16.71f, 13.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.71f, 3.79f)
                verticalLineToRelative(-3f)
                lineTo(7f, 15.99f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                lineToRelative(3.71f, 3.79f)
                close()
            }
        }.also { _MoveToFolder = it}
