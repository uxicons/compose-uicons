package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dart: ImageVector? = null

val Icons.Sr.Dart: ImageVector
    get() = _Dart ?: UXIcon(name = "Dart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                horizontalLineToRelative(-1.76f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 1.17f)
                lineToRelative(-3.24f, 3.24f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.17f, 2.83f)
                verticalLineToRelative(3.75f)
                curveToRelative(-2.85f, 1.99f, -7.51f, 5.28f, -8.12f, 5.89f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, 3.4f)
                lineToRelative(-2.01f, 2.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(2.01f, -2.01f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, -0.58f)
                curveToRelative(0.61f, -0.61f, 3.9f, -5.27f, 5.89f, -8.12f)
                horizontalLineToRelative(3.75f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, -1.17f)
                lineToRelative(3.24f, -3.24f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, -2.83f)
                verticalLineToRelative(-1.76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                close()
                moveTo(19.71f, 5.71f)
                lineTo(14.71f, 10.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, 1.41f)
                close()
            }
        }.also { _Dart = it}
