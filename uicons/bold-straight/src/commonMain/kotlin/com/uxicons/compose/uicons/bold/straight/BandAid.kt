package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BandAid: ImageVector? = null

val Icons.Bs.BandAid: ImageVector
    get() = _BandAid ?: UXIcon(name = "BandAid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
                close()
                moveTo(14.5f, 11f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                close()
                moveTo(9.5f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
                close()
                moveTo(14.5f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-16f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-14f)
                close()
            }
        }.also { _BandAid = it}
