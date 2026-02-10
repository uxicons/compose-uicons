package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Delete: ImageVector? = null

val Icons.Rs.Delete: ImageVector
    get() = _Delete ?: UXIcon(name = "Delete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                horizontalLineToRelative(-13.24f)
                lineToRelative(-7.76f, 10f)
                lineToRelative(7.76f, 10f)
                horizontalLineToRelative(13.24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(22f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-12.26f)
                lineToRelative(-6.2f, -8f)
                lineToRelative(6.2f, -8f)
                horizontalLineToRelative(12.26f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(17.96f, 9.46f)
                lineTo(15.41f, 12f)
                lineTo(17.96f, 14.54f)
                lineTo(16.54f, 15.96f)
                lineTo(14f, 13.41f)
                lineTo(11.46f, 15.96f)
                lineTo(10.04f, 14.54f)
                lineTo(12.59f, 12f)
                lineTo(10.04f, 9.46f)
                lineTo(11.46f, 8.04f)
                lineTo(14f, 10.59f)
                lineTo(16.54f, 8.04f)
                close()
            }
        }.also { _Delete = it}
