package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanSlash: ImageVector? = null

val Icons.Ss.TrashCanSlash: ImageVector
    get() = _TrashCanSlash ?: UXIcon(name = "TrashCanSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 14.24f)
                lineToRelative(8.99f, 8.99f)
                curveToRelative(-0.53f, 0.47f, -1.22f, 0.77f, -1.99f, 0.77f)
                lineTo(7f, 24.0f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-12.76f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(6.76f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.76f)
                close()
                moveTo(2.59f, 4f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.96f, 3.96f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-0.09f)
                lineToRelative(4.04f, 4.04f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(4.59f, 6f)
                lineToRelative(-2f, -2f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 12.59f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(-5.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.59f)
                close()
            }
        }.also { _TrashCanSlash = it}
