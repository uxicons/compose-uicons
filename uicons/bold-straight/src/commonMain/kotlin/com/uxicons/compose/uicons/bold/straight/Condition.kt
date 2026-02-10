package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Condition: ImageVector? = null

val Icons.Bs.Condition: ImageVector
    get() = _Condition ?: UXIcon(name = "Condition") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 7.76f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7.76f)
                lineToRelative(-5.51f, 4.24f)
                lineTo(0f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(1.99f)
                lineToRelative(7.01f, 5.39f)
                lineToRelative(7.01f, -5.39f)
                horizontalLineToRelative(1.99f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-4.99f)
                lineToRelative(-5.51f, -4.24f)
                close()
                moveTo(12f, 16.61f)
                lineToRelative(-4.04f, -3.11f)
                lineToRelative(4.04f, -3.11f)
                lineToRelative(4.04f, 3.11f)
                lineToRelative(-4.04f, 3.11f)
                close()
                moveTo(22.62f, 5.5f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.44f, 1.44f)
                close()
                moveTo(3.63f, 9.62f)
                lineTo(0.07f, 6.06f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(3.07f, -3.07f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-5.2f, 5.2f)
                close()
            }
        }.also { _Condition = it}
