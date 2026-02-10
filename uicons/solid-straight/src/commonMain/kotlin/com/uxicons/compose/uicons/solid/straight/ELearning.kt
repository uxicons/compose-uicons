package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ELearning: ImageVector? = null

val Icons.Ss.ELearning: ImageVector
    get() = _ELearning ?: UXIcon(name = "ELearning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13.04f)
                lineToRelative(-8f, -2.29f)
                verticalLineToRelative(-7.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.82f, -2.88f)
                lineToRelative(0.93f, 0.18f)
                arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 2.9f)
                verticalLineToRelative(7.47f)
                lineToRelative(1f, 0.29f)
                lineToRelative(1f, -0.29f)
                verticalLineToRelative(-7.47f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.18f, -2.88f)
                lineToRelative(1.07f, -0.22f)
                arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.56f, 0.51f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.19f, 2.39f)
                verticalLineToRelative(7.75f)
                close()
                moveTo(24f, 20f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.82f)
                verticalLineToRelative(9.08f)
                lineToRelative(-10f, 2.86f)
                lineToRelative(-10f, -2.86f)
                verticalLineToRelative(-9.08f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2.82f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ELearning = it}
