package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeAdd: ImageVector? = null

val Icons.Bs.TimeAdd: ImageVector
    get() = _TimeAdd ?: UXIcon(name = "TimeAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.94f, 1f)
                horizontalLineToRelative(3.01f)
                curveToRelative(0.03f, -0.33f, 0.05f, -0.66f, 0.05f, -1f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                curveToRelative(0.34f, 0f, 0.67f, -0.02f, 1f, -0.05f)
                verticalLineToRelative(-3.01f)
                arcToRelative(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10f, -8.94f)
                close()
                moveTo(10f, 6f)
                verticalLineToRelative(5.38f)
                lineToRelative(-2.56f, 2.56f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.44f, -3.44f)
                verticalLineToRelative(-6.62f)
                close()
            }
        }.also { _TimeAdd = it}
