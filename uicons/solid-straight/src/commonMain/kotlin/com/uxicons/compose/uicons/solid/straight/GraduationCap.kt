package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraduationCap: ImageVector? = null

val Icons.Ss.GraduationCap: ImageVector
    get() = _GraduationCap ?: UXIcon(name = "GraduationCap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10.71f)
                lineToRelative(-7.88f, 5.08f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineToRelative(-9.88f, -6.37f)
                lineToRelative(9.88f, -6.37f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                close()
                moveTo(12f, 17f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.2f, -0.95f)
                lineToRelative(-4.8f, -3.09f)
                verticalLineToRelative(7.45f)
                lineToRelative(0.29f, 0.29f)
                curveToRelative(0.09f, 0.09f, 2.35f, 2.29f, 7.71f, 2.29f)
                reflectiveCurveToRelative(7.61f, -2.2f, 7.71f, -2.29f)
                lineToRelative(0.29f, -0.29f)
                verticalLineToRelative(-7.45f)
                lineToRelative(-4.8f, 3.09f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.2f, 0.95f)
                close()
            }
        }.also { _GraduationCap = it}
