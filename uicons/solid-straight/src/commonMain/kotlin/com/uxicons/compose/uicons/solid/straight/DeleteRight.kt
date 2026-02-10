package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteRight: ImageVector? = null

val Icons.Ss.DeleteRight: ImageVector
    get() = _DeleteRight ?: UXIcon(name = "DeleteRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.32f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(13.32f)
                lineToRelative(7.65f, -10f)
                lineToRelative(-7.65f, -10f)
                close()
                moveTo(14.03f, 14.62f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.62f, -2.62f)
                lineToRelative(-2.62f, 2.62f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.62f, -2.62f)
                lineToRelative(-2.62f, -2.62f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.62f, 2.62f)
                lineToRelative(2.62f, -2.62f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.62f, 2.62f)
                lineToRelative(2.62f, 2.62f)
                close()
            }
        }.also { _DeleteRight = it}
