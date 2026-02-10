package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rugby: ImageVector? = null

val Icons.Rr.Rugby: ImageVector
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
                moveTo(17.71f, 11.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(1.29f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(1.29f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(-1.29f, -1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(-1.29f, -1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                close()
            }
        }.also { _Rugby = it}
