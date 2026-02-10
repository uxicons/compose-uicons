package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stadium: ImageVector? = null

val Icons.Ss.Stadium: ImageVector
    get() = _Stadium ?: UXIcon(name = "Stadium") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.66f)
                lineToRelative(-1.11f, 3.34f)
                horizontalLineToRelative(-6.48f)
                lineToRelative(1.09f, -7f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                lineToRelative(3f, 2f)
                lineToRelative(-3f, 2f)
                verticalLineToRelative(3f)
                close()
                moveTo(9.63f, 14f)
                horizontalLineToRelative(4.77f)
                lineToRelative(1.09f, -7f)
                horizontalLineToRelative(-2.48f)
                verticalLineToRelative(-3f)
                lineToRelative(3f, -2f)
                lineToRelative(-3f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2.48f)
                close()
                moveTo(6.5f, 7f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                lineToRelative(3f, -2f)
                lineToRelative(-3f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.66f)
                lineToRelative(1.11f, 3.34f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(3f, 19.66f)
                verticalLineToRelative(4.34f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4.34f)
                lineToRelative(1.22f, -3.66f)
                horizontalLineToRelative(-20.44f)
                close()
            }
        }.also { _Stadium = it}
