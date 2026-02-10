package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tennis: ImageVector? = null

val Icons.Rs.Tennis: ImageVector
    get() = _Tennis ?: UXIcon(name = "Tennis") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.48f, 3.52f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16.97f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16.97f)
                close()
                moveTo(21.93f, 10.93f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.87f, -8.87f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.87f, 8.87f)
                close()
                moveTo(2.07f, 13.07f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.87f, 8.87f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.87f, -8.87f)
                close()
                moveTo(19.07f, 19.07f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.13f, 2.88f)
                arcToRelative(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.9f, -10.89f)
                arcToRelative(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.01f, -9.0f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.94f, 10.95f)
                curveToRelative(0.32f, 0f, 0.64f, -0.02f, 0.95f, -0.05f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.88f, 6.12f)
                close()
            }
        }.also { _Tennis = it}
