package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subway: ImageVector? = null

val Icons.Rs.Subway: ImageVector
    get() = _Subway ?: UXIcon(name = "Subway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(6f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                lineTo(2f, 19f)
                lineTo(6.31f, 19f)
                lineTo(3.25f, 24f)
                lineTo(5.59f, 24f)
                lineToRelative(3.06f, -5f)
                lineTo(15.44f, 19f)
                lineTo(18.5f, 24f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-3.06f, -5f)
                lineTo(22f, 19f)
                close()
                moveTo(6f, 2f)
                lineTo(18f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                lineTo(4f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                close()
                moveTo(13f, 11f)
                lineTo(13f, 6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                close()
                moveTo(4f, 11f)
                lineTo(4f, 6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                close()
                moveTo(4f, 17f)
                lineTo(4f, 13f)
                lineTo(6f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(8f, 13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(18f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Subway = it}
