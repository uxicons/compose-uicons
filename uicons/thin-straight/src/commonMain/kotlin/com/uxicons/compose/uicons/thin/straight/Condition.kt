package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Condition: ImageVector? = null

val Icons.Ts.Condition: ImageVector
    get() = _Condition ?: UXIcon(name = "Condition") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.67f, 13f)
                lineToRelative(-6.17f, -4.75f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8.25f)
                lineToRelative(-6.17f, 4.75f)
                lineTo(0f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(4.33f)
                lineToRelative(6.67f, 5.13f)
                lineToRelative(6.67f, -5.13f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-5.33f)
                close()
                moveTo(12f, 17.87f)
                lineToRelative(-5.68f, -4.37f)
                lineToRelative(5.68f, -4.37f)
                lineToRelative(5.68f, 4.37f)
                lineToRelative(-5.68f, 4.37f)
                close()
                moveTo(17.03f, 9.26f)
                lineToRelative(2.76f, -2.76f)
                lineToRelative(-2.76f, -2.76f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(2.76f, -2.76f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.76f, 2.76f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.76f, -2.76f)
                lineToRelative(-2.76f, 2.76f)
                lineToRelative(-0.71f, -0.71f)
                close()
                moveTo(3.28f, 9.51f)
                lineTo(0.03f, 6.26f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.54f, 2.54f)
                lineTo(7.7f, 3.67f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-5.13f, 5.13f)
                close()
            }
        }.also { _Condition = it}
