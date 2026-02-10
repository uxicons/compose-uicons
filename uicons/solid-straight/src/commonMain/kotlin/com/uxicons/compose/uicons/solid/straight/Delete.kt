package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Delete: ImageVector? = null

val Icons.Ss.Delete: ImageVector
    get() = _Delete ?: UXIcon(name = "Delete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-13.24f)
                lineToRelative(-7.76f, 10f)
                lineToRelative(7.76f, 10f)
                horizontalLineToRelative(13.24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                close()
                moveTo(17.96f, 14.54f)
                lineTo(16.55f, 15.96f)
                lineTo(14f, 13.41f)
                lineTo(11.46f, 15.96f)
                lineTo(10.04f, 14.54f)
                lineTo(12.59f, 12f)
                lineTo(10.04f, 9.46f)
                lineTo(11.46f, 8.04f)
                lineTo(14f, 10.59f)
                lineTo(16.54f, 8.04f)
                lineTo(17.96f, 9.46f)
                lineTo(15.41f, 12f)
                close()
            }
        }.also { _Delete = it}
