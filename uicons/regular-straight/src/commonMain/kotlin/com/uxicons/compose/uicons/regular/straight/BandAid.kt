package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BandAid: ImageVector? = null

val Icons.Rs.BandAid: ImageVector
    get() = _BandAid ?: UXIcon(name = "BandAid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 14f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 14f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14f)
                close()
                moveTo(17f, 7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-10f)
                close()
                moveTo(2f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(22f, 17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _BandAid = it}
