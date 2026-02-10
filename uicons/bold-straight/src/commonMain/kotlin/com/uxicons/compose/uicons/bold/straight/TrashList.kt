package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashList: ImageVector? = null

val Icons.Bs.TrashList: ImageVector
    get() = _TrashList ?: UXIcon(name = "TrashList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.34f, 21f)
                horizontalLineToRelative(6.66f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.66f)
                curveToRelative(-1.81f, 0f, -3.34f, -1.41f, -3.49f, -3.21f)
                lineTo(1.62f, 6f)
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
                lineTo(4.63f, 6f)
                lineToRelative(1.21f, 14.54f)
                curveToRelative(0.02f, 0.26f, 0.23f, 0.46f, 0.5f, 0.46f)
                close()
                moveTo(16f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(16f, 17f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                close()
                moveTo(16f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _TrashList = it}
