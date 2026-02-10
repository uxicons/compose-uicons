package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugTeaSaucer: ImageVector? = null

val Icons.Rs.MugTeaSaucer: ImageVector
    get() = _MugTeaSaucer ?: UXIcon(name = "MugTeaSaucer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineTo(2f, 2f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(11f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(4f, 4f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.5f)
                lineToRelative(-1.5f, 1.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                lineToRelative(-1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(11f)
                close()
                moveTo(22f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(0.01f, 20f)
                horizontalLineToRelative(20.99f)
                verticalLineToRelative(2f)
                lineTo(0.01f, 22f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _MugTeaSaucer = it}
