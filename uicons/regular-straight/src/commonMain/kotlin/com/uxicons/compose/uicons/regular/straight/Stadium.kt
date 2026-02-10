package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stadium: ImageVector? = null

val Icons.Rs.Stadium: ImageVector
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
                verticalLineToRelative(3.66f)
                lineToRelative(3f, 9f)
                verticalLineToRelative(4.34f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-4.34f)
                lineToRelative(3f, -9f)
                verticalLineToRelative(-3.66f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9.84f, 14f)
                lineTo(9.07f, 9f)
                horizontalLineToRelative(5.87f)
                lineToRelative(-0.78f, 5f)
                close()
                moveTo(2f, 10.34f)
                verticalLineToRelative(-1.34f)
                horizontalLineToRelative(5.05f)
                lineToRelative(0.78f, 5f)
                horizontalLineToRelative(-4.61f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2.66f)
                lineToRelative(-1.11f, -3.34f)
                horizontalLineToRelative(16.23f)
                lineToRelative(-1.11f, 3.34f)
                close()
                moveTo(22f, 10.34f)
                lineTo(20.78f, 14f)
                horizontalLineToRelative(-4.61f)
                lineToRelative(0.78f, -5f)
                horizontalLineToRelative(5.05f)
                close()
            }
        }.also { _Stadium = it}
