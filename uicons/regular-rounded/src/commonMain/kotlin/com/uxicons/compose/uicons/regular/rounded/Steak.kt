package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Steak: ImageVector? = null

val Icons.Rr.Steak: ImageVector
    get() = _Steak ?: UXIcon(name = "Steak") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 24f)
                arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.72f, -2.24f)
                arcTo(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                curveToRelative(-4.79f, 0f, -9f, -4.67f, -9f, -10f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
                curveToRelative(9.77f, 0f, 14f, 11.59f, 14f, 17.5f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 24f)
                close()
                moveTo(10f, 2f)
                curveTo(-0.47f, 2.38f, -0.38f, 17.11f, 9f, 18f)
                arcToRelative(6.3f, 6.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.24f, 2.4f)
                curveTo(16.58f, 23.65f, 22.1f, 21.57f, 22f, 17.5f)
                curveTo(22f, 12.94f, 18.55f, 2f, 10f, 2f)
                close()
                moveTo(6.71f, 13.71f)
                lineToRelative(7f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                lineToRelative(-7f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.71f, 13.71f)
                close()
                moveTo(10.71f, 15.71f)
                lineTo(16.71f, 9.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                lineToRelative(-6f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.71f, 15.71f)
                close()
                moveTo(14.71f, 17.71f)
                lineTo(18.71f, 13.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                lineToRelative(-4f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.71f, 17.71f)
                close()
                moveTo(18.71f, 19.71f)
                lineTo(19.71f, 18.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                lineToRelative(-1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.71f, 19.71f)
                close()
                moveTo(5.71f, 8.71f)
                lineTo(8.71f, 5.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.29f, 4.29f)
                lineToRelative(-3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.71f, 8.71f)
                close()
            }
        }.also { _Steak = it}
