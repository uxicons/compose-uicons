package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraduationCap: ImageVector? = null

val Icons.Bs.GraduationCap: ImageVector
    get() = _GraduationCap ?: UXIcon(name = "GraduationCap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.12f, 1.63f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineToRelative(-9.88f, 6.37f)
                lineToRelative(5f, 3.23f)
                verticalLineToRelative(8.79f)
                lineToRelative(0.32f, 0.41f)
                curveToRelative(0.21f, 0.26f, 2.15f, 2.57f, 6.68f, 2.57f)
                reflectiveCurveToRelative(6.47f, -2.31f, 6.68f, -2.57f)
                lineToRelative(0.32f, -0.41f)
                verticalLineToRelative(-8.79f)
                lineToRelative(2f, -1.29f)
                verticalLineToRelative(10.06f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                close()
                moveTo(11.51f, 4.15f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.99f, 0f)
                lineToRelative(5.97f, 3.85f)
                lineToRelative(-5.97f, 3.85f)
                arcToRelative(0.89f, 0.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, 0f)
                lineToRelative(-5.97f, -3.85f)
                close()
                moveTo(16f, 18.86f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 1.14f)
                arcToRelative(6.42f, 6.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -1.14f)
                verticalLineToRelative(-5.7f)
                lineToRelative(1.88f, 1.21f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(1.88f, -1.21f)
                close()
            }
        }.also { _GraduationCap = it}
