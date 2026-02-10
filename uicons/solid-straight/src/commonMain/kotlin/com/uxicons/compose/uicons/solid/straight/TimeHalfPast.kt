package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeHalfPast: ImageVector? = null

val Icons.Ss.TimeHalfPast: ImageVector
    get() = _TimeHalfPast ?: UXIcon(name = "TimeHalfPast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.95f, 0.05f)
                verticalLineToRelative(4.01f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 15.87f)
                verticalLineToRelative(4.01f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -23.9f)
                close()
                moveTo(12.95f, 13.72f)
                verticalLineToRelative(3.28f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.28f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.45f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.28f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.45f)
                close()
                moveTo(1.36f, 6.36f)
                arcToRelative(12.09f, 12.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.32f, -1.99f)
                lineToRelative(1.52f, 1.31f)
                arcToRelative(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.58f)
                close()
                moveTo(2.37f, 9.15f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, 1.94f)
                lineToRelative(-1.99f, -0.2f)
                arcToRelative(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, -2.34f)
                close()
                moveTo(7.29f, 3.16f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, 1.09f)
                lineToRelative(-1.24f, -1.56f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.94f, -1.29f)
                close()
                moveTo(11.04f, 2.05f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.93f, 0.37f)
                lineToRelative(-0.57f, -1.91f)
                arcToRelative(11.9f, 11.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.32f, -0.45f)
                close()
                moveTo(3.14f, 16.74f)
                arcToRelative(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 1.58f)
                lineToRelative(-1.52f, 1.31f)
                arcToRelative(12.09f, 12.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, -1.99f)
                close()
                moveTo(0.46f, 15.45f)
                arcToRelative(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -2.34f)
                lineToRelative(2.0f, -0.2f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, 1.94f)
                close()
                moveTo(6.34f, 22.61f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.94f, -1.29f)
                lineToRelative(1.25f, -1.56f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.65f, 1.09f)
                close()
                moveTo(10.86f, 23.95f)
                arcToRelative(11.9f, 11.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.32f, -0.45f)
                lineToRelative(0.57f, -1.92f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.93f, 0.37f)
                close()
            }
        }.also { _TimeHalfPast = it}
