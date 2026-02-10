package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanList: ImageVector? = null

val Icons.Bs.TrashCanList: ImageVector
    get() = _TrashCanList ?: UXIcon(name = "TrashCanList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 21f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                lineTo(4.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                lineTo(5f, 6f)
                verticalLineToRelative(15f)
                close()
                moveTo(16f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _TrashCanList = it}
