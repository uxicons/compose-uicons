package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeOclock: ImageVector? = null

val Icons.Bs.TimeOclock: ImageVector
    get() = _TimeOclock ?: UXIcon(name = "TimeOclock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, -9f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
                close()
                moveTo(13.5f, 10.69f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                verticalLineToRelative(-4.69f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _TimeOclock = it}
