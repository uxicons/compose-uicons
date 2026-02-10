package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteRight: ImageVector? = null

val Icons.Bs.DeleteRight: ImageVector
    get() = _DeleteRight ?: UXIcon(name = "DeleteRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.24f, 2f)
                lineTo(3.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.74f)
                lineToRelative(7.65f, -10f)
                lineToRelative(-7.65f, -10f)
                close()
                moveTo(14.76f, 19f)
                lineTo(3.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.26f)
                lineToRelative(5.35f, 7f)
                lineToRelative(-5.35f, 7f)
                close()
                moveTo(14.06f, 10.06f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _DeleteRight = it}
