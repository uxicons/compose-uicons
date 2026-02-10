package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subway: ImageVector? = null

val Icons.Ss.Subway: ImageVector
    get() = _Subway ?: UXIcon(name = "Subway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                lineTo(2f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                lineTo(18f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                close()
                moveTo(11f, 6f)
                lineTo(2f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(9f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(9f)
                lineTo(22f, 6f)
                lineTo(13f, 6f)
                close()
                moveTo(2f, 13f)
                lineTo(22f, 13f)
                verticalLineToRelative(6f)
                lineTo(17.79f, 19f)
                lineToRelative(3.06f, 5f)
                lineTo(18.5f, 24f)
                lineTo(15.44f, 19f)
                lineTo(8.65f, 19f)
                lineTo(5.59f, 24f)
                lineTo(3.25f, 24f)
                lineTo(6.31f, 19f)
                lineTo(2f, 19f)
                close()
                moveTo(17f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 17f)
                close()
                moveTo(7f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                close()
            }
        }.also { _Subway = it}
