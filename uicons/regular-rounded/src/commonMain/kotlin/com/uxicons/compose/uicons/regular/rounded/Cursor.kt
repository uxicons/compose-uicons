package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cursor: ImageVector? = null

val Icons.Rr.Cursor: ImageVector
    get() = _Cursor ?: UXIcon(name = "Cursor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.01f, 24f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.68f, -1.64f)
                lineToRelative(-3.13f, -6.7f)
                lineToRelative(-3.54f, 3.09f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.66f, -0.75f)
                verticalLineToRelative(-15.02f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.99f, -2.25f)
                lineToRelative(10.7f, 10.24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.6f, 1.72f)
                lineToRelative(-4.47f, 0.41f)
                lineToRelative(3.06f, 6.57f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.68f, 4.33f)
                close()
                moveTo(9.54f, 13.03f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.21f, 0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, 0.56f)
                lineToRelative(3.67f, 7.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, -0.94f)
                lineToRelative(-3.68f, -7.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, -1.42f)
                lineToRelative(3.7f, -0.34f)
                lineToRelative(-9.09f, -8.69f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.04f, -0.14f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.59f, 0.91f)
                verticalLineToRelative(12.82f)
                lineToRelative(2.88f, -2.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, -0.25f)
                close()
            }
        }.also { _Cursor = it}
