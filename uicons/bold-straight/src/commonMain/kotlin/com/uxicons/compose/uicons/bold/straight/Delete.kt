package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Delete: ImageVector? = null

val Icons.Bs.Delete: ImageVector
    get() = _Delete ?: UXIcon(name = "Delete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                horizontalLineToRelative(-13.24f)
                lineToRelative(-7.65f, 10f)
                lineToRelative(7.65f, 10f)
                horizontalLineToRelative(13.24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-11.76f)
                lineToRelative(-5.35f, -7f)
                lineToRelative(5.35f, -7f)
                horizontalLineToRelative(11.76f)
                close()
                moveTo(9.94f, 13.94f)
                lineTo(11.88f, 12f)
                lineTo(9.94f, 10.06f)
                lineTo(12.06f, 7.94f)
                lineTo(14f, 9.88f)
                lineTo(15.94f, 7.94f)
                lineTo(18.06f, 10.06f)
                lineTo(16.12f, 12f)
                lineTo(18.06f, 13.94f)
                lineTo(15.94f, 16.06f)
                lineTo(14f, 14.12f)
                lineTo(12.06f, 16.06f)
                close()
            }
        }.also { _Delete = it}
