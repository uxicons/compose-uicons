package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Sr.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.73f, 4.79f)
                arcTo(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                curveToRelative(-0.79f, 0f, -1f, -0.21f, -1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.28f, 1.42f)
                lineToRelative(-0.71f, 0.78f)
                arcTo(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 2.05f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(2.05f)
                arcTo(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.43f, 4.2f)
                lineTo(4.72f, 3.42f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 2f)
                curveToRelative(0f, 0.79f, -0.21f, 1f, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.27f, -0.21f)
                lineToRelative(0.67f, 0.75f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.12f, 0f)
                close()
                moveTo(12f, 15f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -3.72f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(4.28f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
            }
        }.also { _Stopwatch = it}
