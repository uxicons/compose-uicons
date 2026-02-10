package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareRoot: ImageVector? = null

val Icons.Bs.SquareRoot: ImageVector
    get() = _SquareRoot ?: UXIcon(name = "SquareRoot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.12f, 22f)
                horizontalLineToRelative(-3.14f)
                lineToRelative(-3.87f, -9.69f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.46f, -0.31f)
                horizontalLineToRelative(-1.65f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.65f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.25f, 2.2f)
                lineToRelative(2.46f, 6.16f)
                lineToRelative(3.78f, -12.85f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.36f, -2.51f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.48f, 0.36f)
                close()
                moveTo(20.76f, 17f)
                lineTo(24f, 12f)
                horizontalLineToRelative(-3.52f)
                lineToRelative(-1.48f, 2.28f)
                lineToRelative(-1.48f, -2.28f)
                horizontalLineToRelative(-3.52f)
                lineToRelative(3.24f, 5f)
                lineToRelative(-3.24f, 5f)
                horizontalLineToRelative(3.52f)
                lineToRelative(1.48f, -2.28f)
                lineToRelative(1.48f, 2.28f)
                horizontalLineToRelative(3.52f)
                close()
            }
        }.also { _SquareRoot = it}
