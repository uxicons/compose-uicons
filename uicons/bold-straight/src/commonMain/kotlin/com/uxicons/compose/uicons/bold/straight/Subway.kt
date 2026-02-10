package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subway: ImageVector? = null

val Icons.Bs.Subway: ImageVector
    get() = _Subway ?: UXIcon(name = "Subway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0f)
                lineTo(6.5f, 0f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.5f)
                lineTo(2f, 20f)
                lineTo(5.7f, 20f)
                lineToRelative(-2.45f, 4f)
                lineTo(6.56f, 24f)
                lineToRelative(2.45f, -4f)
                horizontalLineToRelative(6f)
                lineToRelative(2.45f, 4f)
                horizontalLineToRelative(3.38f)
                lineTo(18.4f, 20f)
                lineTo(22f, 20f)
                close()
                moveTo(13.5f, 10f)
                lineTo(13.5f, 5f)
                lineTo(19f, 5f)
                verticalLineToRelative(5f)
                close()
                moveTo(5f, 10f)
                lineTo(5f, 5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(5f, 17f)
                lineTo(5f, 13f)
                lineTo(7f, 13f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 15f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 13.5f)
                lineTo(10f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 15f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13.5f)
                lineTo(17f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Subway = it}
