package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraduationCap: ImageVector? = null

val Icons.Sr.GraduationCap: ImageVector
    get() = _GraduationCap ?: UXIcon(name = "GraduationCap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.48f)
                verticalLineToRelative(11.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-8.25f)
                lineToRelative(-7.4f, 3.54f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.58f, 0.69f)
                arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.7f, -0.74f)
                lineToRelative(-7.38f, -3.51f)
                arcToRelative(3.69f, 3.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, -6.46f)
                curveToRelative(0.03f, -0.02f, 0.06f, -0.03f, 0.08f, -0.04f)
                lineToRelative(7.46f, -3.56f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.28f, 0.04f)
                lineToRelative(7.38f, 3.51f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.94f, 3.25f)
                close()
                moveTo(12.02f, 17.98f)
                arcToRelative(7.26f, 7.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.65f, -0.97f)
                lineToRelative(-4.38f, -2.09f)
                verticalLineToRelative(2.7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.52f, 4.78f)
                arcToRelative(15.56f, 15.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.48f, 0.6f)
                arcToRelative(15.56f, 15.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.48f, -0.61f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.52f, -4.78f)
                verticalLineToRelative(-2.69f)
                lineToRelative(-4.46f, 2.13f)
                arcToRelative(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.52f, 0.93f)
                close()
            }
        }.also { _GraduationCap = it}
