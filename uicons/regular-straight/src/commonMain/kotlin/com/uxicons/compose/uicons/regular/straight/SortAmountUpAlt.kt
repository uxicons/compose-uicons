package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountUpAlt: ImageVector? = null

val Icons.Rs.SortAmountUpAlt: ImageVector
    get() = _SortAmountUpAlt ?: UXIcon(name = "SortAmountUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                verticalLineToRelative(2f)
                lineTo(10f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                lineTo(10f, 12f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                lineTo(10f, 17f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
                moveTo(3.59f, 0.59f)
                lineTo(0.09f, 4.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.5f, -2.5f)
                lineTo(4f, 24f)
                horizontalLineToRelative(2f)
                lineTo(6f, 3f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(1.41f, -1.41f)
                lineTo(6.41f, 0.59f)
                curveTo(5.63f, -0.19f, 4.37f, -0.19f, 3.59f, 0.59f)
                close()
            }
        }.also { _SortAmountUpAlt = it}
