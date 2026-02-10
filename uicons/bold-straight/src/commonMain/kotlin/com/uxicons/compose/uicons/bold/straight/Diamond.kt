package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diamond: ImageVector? = null

val Icons.Bs.Diamond: ImageVector
    get() = _Diamond ?: UXIcon(name = "Diamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.36f, 6.13f)
                lineToRelative(-3.37f, -4.72f)
                arcToRelative(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.78f, -1.43f)
                horizontalLineToRelative(-10.44f)
                arcToRelative(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.77f, 1.43f)
                lineToRelative(-3.37f, 4.72f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.11f, 4.11f)
                lineToRelative(11.26f, 13.87f)
                lineToRelative(11.27f, -13.89f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, -4.09f)
                close()
                moveTo(3.08f, 7.88f)
                lineTo(6.45f, 3.16f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, -0.17f)
                horizontalLineToRelative(2.92f)
                lineToRelative(-1.43f, 5.51f)
                horizontalLineToRelative(7.45f)
                lineToRelative(-1.43f, -5.51f)
                horizontalLineToRelative(2.92f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, 0.17f)
                lineToRelative(3.37f, 4.72f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 0.47f)
                lineToRelative(-0.12f, 0.15f)
                horizontalLineToRelative(-5.08f)
                lineToRelative(-3.73f, 10.85f)
                lineToRelative(-3.73f, -10.85f)
                horizontalLineToRelative(-5.08f)
                lineToRelative(-0.11f, -0.13f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, -0.49f)
                close()
            }
        }.also { _Diamond = it}
