package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Ss.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.04f, 4.45f)
                lineToRelative(0.88f, 0.88f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.19f, -3.19f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(0.89f, 0.89f)
                lineToRelative(-1.05f, 1.16f)
                arcToRelative(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.57f, -2.15f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.05f)
                arcToRelative(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.57f, 2.15f)
                lineToRelative(-1.05f, -1.16f)
                lineToRelative(0.95f, -0.95f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.25f, 3.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(0.88f, -0.88f)
                lineToRelative(0.98f, 1.09f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.12f, 0f)
                close()
                moveTo(12f, 15f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -3.72f)
                verticalLineToRelative(-5.28f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.28f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 3.72f)
                close()
            }
        }.also { _Stopwatch = it}
