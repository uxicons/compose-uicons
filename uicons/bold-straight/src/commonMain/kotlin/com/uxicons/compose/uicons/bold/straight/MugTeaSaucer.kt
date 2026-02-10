package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugTeaSaucer: ImageVector? = null

val Icons.Bs.MugTeaSaucer: ImageVector
    get() = _MugTeaSaucer ?: UXIcon(name = "MugTeaSaucer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 4f)
                horizontalLineToRelative(-1.5f)
                lineTo(19f, 1f)
                lineTo(2f, 1f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(10f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(16f, 14.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 15f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(5f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineToRelative(-1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(21f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(0.01f, 20f)
                horizontalLineToRelative(20.99f)
                verticalLineToRelative(3f)
                lineTo(0.01f, 23f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _MugTeaSaucer = it}
