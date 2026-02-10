package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tennis: ImageVector? = null

val Icons.Bs.Tennis: ImageVector
    get() = _Tennis ?: UXIcon(name = "Tennis") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.48f, 3.52f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16.97f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16.97f)
                close()
                moveTo(20.76f, 9.99f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.75f, -6.75f)
                arcToRelative(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 6.75f)
                close()
                moveTo(3.24f, 14.01f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 6.75f)
                arcToRelative(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.75f, -6.75f)
                close()
                moveTo(18.36f, 18.36f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.38f, 2.57f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.92f, -9.92f)
                arcToRelative(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.95f, -7.95f)
                arcToRelative(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.92f, 9.93f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.57f, 5.37f)
                close()
            }
        }.also { _Tennis = it}
