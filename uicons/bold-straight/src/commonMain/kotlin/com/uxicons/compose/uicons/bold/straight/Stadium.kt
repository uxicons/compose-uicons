package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stadium: ImageVector? = null

val Icons.Bs.Stadium: ImageVector
    get() = _Stadium ?: UXIcon(name = "Stadium") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                lineToRelative(3f, -2f)
                lineToRelative(-3f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                lineToRelative(3f, -2f)
                lineToRelative(-3f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                lineToRelative(3f, -2f)
                lineToRelative(-3f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.72f)
                lineToRelative(2.5f, 8.5f)
                verticalLineToRelative(4.78f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-4.78f)
                lineToRelative(2.5f, -8.5f)
                verticalLineToRelative(-3.72f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.05f, 13f)
                lineTo(9.71f, 10f)
                horizontalLineToRelative(4.57f)
                lineToRelative(-0.33f, 3f)
                horizontalLineToRelative(-3.91f)
                close()
                moveTo(3f, 10f)
                horizontalLineToRelative(3.69f)
                lineToRelative(0.33f, 3f)
                horizontalLineToRelative(-3.23f)
                lineToRelative(-0.8f, -2.72f)
                close()
                moveTo(18.5f, 21f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.22f)
                lineToRelative(-0.82f, -2.78f)
                horizontalLineToRelative(14.64f)
                lineToRelative(-0.82f, 2.78f)
                close()
                moveTo(21f, 10.28f)
                lineTo(20.2f, 13f)
                horizontalLineToRelative(-3.23f)
                lineToRelative(0.33f, -3f)
                horizontalLineToRelative(3.69f)
                close()
            }
        }.also { _Stadium = it}
