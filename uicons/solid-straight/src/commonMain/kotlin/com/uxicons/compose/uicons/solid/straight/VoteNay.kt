package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoteNay: ImageVector? = null

val Icons.Ss.VoteNay: ImageVector
    get() = _VoteNay ?: UXIcon(name = "VoteNay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                lineTo(8f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(14f)
                lineTo(19f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(15.71f, 12.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(2.29f, 2.29f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(7f)
                lineTo(0f, 22f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(7f)
                lineTo(21f, 19f)
                verticalLineToRelative(-7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _VoteNay = it}
