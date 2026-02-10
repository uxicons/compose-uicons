package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareRoot: ImageVector? = null

val Icons.Rs.SquareRoot: ImageVector
    get() = _SquareRoot ?: UXIcon(name = "SquareRoot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.76f, 22f)
                horizontalLineToRelative(-2.46f)
                lineToRelative(-3.76f, -10.34f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.94f, -0.66f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.6f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.82f, 1.98f)
                lineToRelative(3.02f, 8.31f)
                lineToRelative(4.19f, -15.08f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.89f, -2.2f)
                horizontalLineToRelative(9.48f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-9.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.96f, 0.73f)
                close()
                moveTo(20.69f, 17f)
                lineTo(24f, 12f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(-2.12f, 3.2f)
                lineToRelative(-2.12f, -3.2f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(3.31f, 5f)
                lineToRelative(-3.31f, 5f)
                horizontalLineToRelative(2.38f)
                lineToRelative(2.12f, -3.2f)
                lineToRelative(2.12f, 3.2f)
                horizontalLineToRelative(2.38f)
                close()
            }
        }.also { _SquareRoot = it}
