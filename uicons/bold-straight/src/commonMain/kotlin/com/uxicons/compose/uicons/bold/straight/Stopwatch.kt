package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Bs.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 11.69f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                verticalLineToRelative(-4.69f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20.4f, 5.91f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16.8f, 0f)
                lineToRelative(-0.66f, -0.73f)
                lineToRelative(-0.76f, 0.76f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-0.87f, 0.87f)
                lineToRelative(0.76f, 0.85f)
                arcToRelative(10.93f, 10.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.67f, -1.78f)
                verticalLineToRelative(-2.12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.12f)
                arcToRelative(10.93f, 10.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.67f, 1.78f)
                lineToRelative(0.76f, -0.85f)
                lineToRelative(-0.87f, -0.87f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-0.76f, -0.76f)
                close()
                moveTo(20f, 13f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8f, 8f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                close()
            }
        }.also { _Stopwatch = it}
