package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountUp: ImageVector? = null

val Icons.Rs.SortAmountUp: ImageVector
    get() = _SortAmountUp ?: UXIcon(name = "SortAmountUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(10f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                close()
                moveTo(21f, 17f)
                lineTo(10f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 12f)
                lineTo(10f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
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
        }.also { _SortAmountUp = it}
