package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraduationCap: ImageVector? = null

val Icons.Rs.GraduationCap: ImageVector
    get() = _GraduationCap ?: UXIcon(name = "GraduationCap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.12f, 1.63f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineToRelative(-9.88f, 6.37f)
                lineToRelative(4f, 2.58f)
                verticalLineToRelative(9.83f)
                lineToRelative(0.29f, 0.29f)
                curveToRelative(0.09f, 0.09f, 2.35f, 2.29f, 7.71f, 2.29f)
                reflectiveCurveToRelative(7.61f, -2.2f, 7.71f, -2.29f)
                lineToRelative(0.29f, -0.29f)
                verticalLineToRelative(-9.83f)
                lineToRelative(2f, -1.29f)
                verticalLineToRelative(10.71f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12f)
                close()
                moveTo(18f, 19.52f)
                arcToRelative(10.56f, 10.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 1.48f)
                arcToRelative(10.56f, 10.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -1.48f)
                verticalLineToRelative(-7.65f)
                lineToRelative(3.88f, 2.5f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(3.88f, -2.5f)
                close()
                moveTo(13.04f, 12.69f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, 0f)
                lineToRelative(-7.27f, -4.69f)
                lineToRelative(7.27f, -4.69f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.07f, 0f)
                lineToRelative(7.27f, 4.69f)
                close()
            }
        }.also { _GraduationCap = it}
