package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerTime: ImageVector? = null

val Icons.Bs.MarkerTime: ImageVector
    get() = _MarkerTime ?: UXIcon(name = "MarkerTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23.99f)
                lineToRelative(-7.06f, -6.91f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.13f, -14.15f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.14f)
                close()
                moveTo(12f, 3.01f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 11.95f)
                lineToRelative(4.95f, 4.84f)
                lineToRelative(4.96f, -4.85f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.96f, -11.94f)
                close()
                moveTo(13.94f, 14.06f)
                lineTo(10.5f, 10.62f)
                verticalLineToRelative(-4.62f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.38f)
                lineToRelative(2.56f, 2.56f)
                close()
            }
        }.also { _MarkerTime = it}
