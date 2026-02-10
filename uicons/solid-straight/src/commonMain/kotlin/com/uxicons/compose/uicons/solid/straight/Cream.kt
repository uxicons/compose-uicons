package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cream: ImageVector? = null

val Icons.Ss.Cream: ImageVector
    get() = _Cream ?: UXIcon(name = "Cream") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(20f)
                close()
                moveTo(19.96f, 7f)
                curveToRelative(-0.33f, -4.72f, -2.94f, -6.71f, -3.06f, -6.8f)
                lineToRelative(-0.26f, -0.2f)
                horizontalLineToRelative(-1.64f)
                verticalLineToRelative(1f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-3f)
                arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.67f, 4f)
                close()
            }
        }.also { _Cream = it}
