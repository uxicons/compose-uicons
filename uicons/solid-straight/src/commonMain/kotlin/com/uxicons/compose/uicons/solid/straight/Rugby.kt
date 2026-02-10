package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rugby: ImageVector? = null

val Icons.Ss.Rugby: ImageVector
    get() = _Rugby ?: UXIcon(name = "Rugby") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.32f, 23.74f)
                arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.65f, 0.24f)
                arcToRelative(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.77f, -1.88f)
                curveToRelative(-1.75f, -1.75f, -2.22f, -5.02f, -1.64f, -8.43f)
                close()
                moveTo(23.21f, 12.62f)
                arcToRelative(16.31f, 16.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.86f, 6.73f)
                arcToRelative(16.32f, 16.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.73f, 3.85f)
                lineToRelative(-11.82f, -11.82f)
                arcToRelative(16.31f, 16.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.86f, -6.73f)
                arcToRelative(16.31f, 16.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.73f, -3.86f)
                close()
                moveTo(17.71f, 10.29f)
                lineTo(13.71f, 6.29f)
                lineTo(12.29f, 7.71f)
                lineTo(13.59f, 9f)
                lineTo(12f, 10.59f)
                lineTo(10.71f, 9.29f)
                lineTo(9.29f, 10.71f)
                lineTo(10.59f, 12f)
                lineTo(9f, 13.59f)
                lineTo(7.71f, 12.29f)
                lineTo(6.29f, 13.71f)
                lineTo(10.29f, 17.71f)
                lineTo(11.71f, 16.29f)
                lineTo(10.41f, 15f)
                lineTo(12f, 13.41f)
                lineTo(13.29f, 14.71f)
                lineTo(14.71f, 13.29f)
                lineTo(13.41f, 12f)
                lineTo(15f, 10.41f)
                lineTo(16.29f, 11.71f)
                close()
                moveTo(23.74f, 10.33f)
                curveToRelative(0.57f, -3.41f, 0.1f, -6.68f, -1.65f, -8.43f)
                reflectiveCurveToRelative(-5.02f, -2.22f, -8.43f, -1.65f)
                close()
            }
        }.also { _Rugby = it}
