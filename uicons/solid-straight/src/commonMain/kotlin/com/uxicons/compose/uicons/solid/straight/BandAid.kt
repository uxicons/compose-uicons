package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BandAid: ImageVector? = null

val Icons.Ss.BandAid: ImageVector
    get() = _BandAid ?: UXIcon(name = "BandAid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-14f)
                close()
                moveTo(24f, 19f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(14f)
                close()
                moveTo(17f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-14f)
                close()
                moveTo(13f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                close()
                moveTo(11f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
                moveTo(11f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
                moveTo(15f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
            }
        }.also { _BandAid = it}
