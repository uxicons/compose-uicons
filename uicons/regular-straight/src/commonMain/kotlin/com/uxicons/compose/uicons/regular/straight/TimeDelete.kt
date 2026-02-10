package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeDelete: ImageVector? = null

val Icons.Rs.TimeDelete: ImageVector
    get() = _TimeDelete ?: UXIcon(name = "TimeDelete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 16.46f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(3.04f, -3.04f)
                close()
                moveTo(2f, 12f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.95f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.03f, -0.33f, 0.05f, -0.66f, 0.05f, -1f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                curveToRelative(0.34f, 0f, 0.67f, -0.02f, 1f, -0.05f)
                verticalLineToRelative(-2f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11f, -9.95f)
                close()
                moveTo(11f, 6f)
                verticalLineToRelative(4.59f)
                lineToRelative(-2.71f, 2.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.29f, -3.29f)
                verticalLineToRelative(-5.41f)
                close()
            }
        }.also { _TimeDelete = it}
