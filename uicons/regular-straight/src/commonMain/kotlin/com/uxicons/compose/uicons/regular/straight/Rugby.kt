package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rugby: ImageVector? = null

val Icons.Rs.Rugby: ImageVector
    get() = _Rugby ?: UXIcon(name = "Rugby") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.1f, 1.9f)
                curveToRelative(-3.44f, -3.43f, -12.73f, -1.97f, -17.45f, 2.75f)
                reflectiveCurveToRelative(-6.18f, 14.01f, -2.75f, 17.45f)
                arcToRelative(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.77f, 1.88f)
                arcToRelative(17.43f, 17.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.68f, -4.63f)
                curveToRelative(4.72f, -4.72f, 6.18f, -14.01f, 2.75f, -17.45f)
                close()
                moveTo(16.33f, 2f)
                arcToRelative(6.23f, 6.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.35f, 1.31f)
                curveToRelative(1.02f, 1.02f, 1.43f, 2.99f, 1.27f, 5.23f)
                lineToRelative(-6.5f, -6.5f)
                curveToRelative(0.29f, -0.02f, 0.59f, -0.04f, 0.87f, -0.04f)
                close()
                moveTo(3.32f, 20.68f)
                curveToRelative(-1.02f, -1.01f, -1.43f, -2.98f, -1.27f, -5.23f)
                lineToRelative(6.5f, 6.5f)
                curveToRelative(-2.24f, 0.15f, -4.21f, -0.26f, -5.22f, -1.27f)
                close()
                moveTo(17.93f, 17.93f)
                arcToRelative(14.69f, 14.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.93f, 3.66f)
                lineToRelative(-8.6f, -8.6f)
                arcToRelative(14.67f, 14.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.66f, -6.92f)
                arcToRelative(14.64f, 14.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.94f, -3.65f)
                lineToRelative(8.59f, 8.59f)
                arcToRelative(14.67f, 14.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.66f, 6.93f)
                close()
                moveTo(13.71f, 6.29f)
                lineTo(17.71f, 10.29f)
                lineTo(16.29f, 11.71f)
                lineTo(15f, 10.41f)
                lineTo(13.41f, 12f)
                lineTo(14.71f, 13.29f)
                lineTo(13.29f, 14.71f)
                lineTo(12f, 13.41f)
                lineTo(10.41f, 15f)
                lineTo(11.71f, 16.29f)
                lineTo(10.29f, 17.71f)
                lineTo(6.29f, 13.71f)
                lineTo(7.71f, 12.29f)
                lineTo(9f, 13.59f)
                lineTo(10.59f, 12f)
                lineTo(9.29f, 10.71f)
                lineTo(10.71f, 9.29f)
                lineTo(12f, 10.59f)
                lineTo(13.59f, 9f)
                lineTo(12.29f, 7.71f)
                close()
            }
        }.also { _Rugby = it}
