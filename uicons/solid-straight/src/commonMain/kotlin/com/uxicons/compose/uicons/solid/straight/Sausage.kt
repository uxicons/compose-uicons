package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sausage: ImageVector? = null

val Icons.Ss.Sausage: ImageVector
    get() = _Sausage ?: UXIcon(name = "Sausage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.33f, 3.2f)
                arcTo(4.59f, 4.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 0f)
                horizontalLineTo(20f)
                arcToRelative(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1.71f)
                arcTo(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                horizontalLineTo(16f)
                arcToRelative(4.58f, 4.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.67f, 3.2f)
                arcTo(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7.91f)
                arcToRelative(6.7f, 6.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, 3.92f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.88f, 2.2f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.72f, 3.65f)
                arcTo(4.59f, 4.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                verticalLineToRelative(2f)
                arcToRelative(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.71f, 1f)
                arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 20f)
                verticalLineToRelative(2f)
                arcToRelative(4.59f, 4.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, -1.66f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 24f)
                curveToRelative(0.96f, 0f, 6.01f, -0.27f, 10.87f, -5.12f)
                curveTo(23.75f, 14.01f, 24f, 8.99f, 24f, 8.03f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.33f, 3.2f)
                close()
            }
        }.also { _Sausage = it}
