package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Br.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.5f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(3.19f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            curveToRelative(-0.84f, 0f, -1f, -0.16f, -1f, -1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcToRelative(4.86f, 4.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 1.72f)
            lineToRelative(-0.62f, 0.69f)
            arcToRelative(10.93f, 10.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.67f, -1.78f)
            verticalLineToRelative(-0.61f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(0.61f)
            arcToRelative(10.93f, 10.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.67f, 1.78f)
            lineToRelative(-0.62f, -0.69f)
            arcToRelative(4.86f, 4.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, -1.72f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            curveToRelative(0f, 0.84f, -0.16f, 1f, -1f, 1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.52f, -0.23f)
            lineToRelative(0.58f, 0.64f)
            arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.8f, 0f)
            lineToRelative(0.58f, -0.64f)
            arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.52f, 0.23f)
            close()
            moveTo(12f, 21f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
            arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
            close()
        }
    }.also { _Stopwatch = it }
