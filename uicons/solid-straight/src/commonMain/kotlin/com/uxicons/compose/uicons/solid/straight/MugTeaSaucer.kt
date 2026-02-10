package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugTeaSaucer: ImageVector? = null

val Icons.Ss.MugTeaSaucer: ImageVector
    get() = _MugTeaSaucer ?: UXIcon(name = "MugTeaSaucer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.01f, 20f)
                horizontalLineToRelative(20.99f)
                verticalLineToRelative(2f)
                lineTo(0.01f, 22f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 2f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-1.5f, 1.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(10.5f, 2f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _MugTeaSaucer = it}
