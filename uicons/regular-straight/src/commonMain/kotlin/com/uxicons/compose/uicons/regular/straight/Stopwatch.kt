package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Rs.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -1.72f)
                verticalLineToRelative(-5.28f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.28f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1.72f)
                close()
                moveTo(20.06f, 5.54f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16.12f, 0f)
                lineToRelative(-0.98f, -1.09f)
                lineToRelative(-0.88f, 0.88f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.25f, -3.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-0.95f, 0.95f)
                lineToRelative(1.05f, 1.16f)
                arcToRelative(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.57f, -2.15f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.05f)
                arcToRelative(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.57f, 2.15f)
                lineToRelative(1.05f, -1.17f)
                lineToRelative(-0.89f, -0.89f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(3.19f, 3.19f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.88f, -0.88f)
                close()
                moveTo(21f, 13f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 9f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, -9f)
                close()
            }
        }.also { _Stopwatch = it}
