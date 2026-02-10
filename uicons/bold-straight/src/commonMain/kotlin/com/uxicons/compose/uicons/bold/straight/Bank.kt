package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bank: ImageVector? = null

val Icons.Bs.Bank: ImageVector
    get() = _Bank ?: UXIcon(name = "Bank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
                moveTo(24f, 8.1f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.9f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, -3f)
                lineToRelative(8.59f, -4.68f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.27f, 0f)
                lineToRelative(8.59f, 4.68f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, 3f)
                close()
                moveTo(4.56f, 7f)
                horizontalLineToRelative(14.88f)
                lineToRelative(-7.24f, -3.95f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.39f, 0f)
                close()
                moveTo(11f, 10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(6f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Bank = it}
