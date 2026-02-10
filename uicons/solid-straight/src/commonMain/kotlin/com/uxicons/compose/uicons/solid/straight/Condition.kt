package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Condition: ImageVector? = null

val Icons.Ss.Condition: ImageVector
    get() = _Condition ?: UXIcon(name = "Condition") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.84f, 13f)
                lineToRelative(-5.84f, -4.49f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8.51f)
                lineToRelative(-5.84f, 4.49f)
                lineTo(0f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(3.16f)
                lineToRelative(6.84f, 5.26f)
                lineToRelative(6.84f, -5.26f)
                horizontalLineToRelative(3.16f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-5.16f)
                close()
                moveTo(17.04f, 8.54f)
                lineToRelative(2.04f, -2.04f)
                lineToRelative(-2.04f, -2.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.04f, 2.04f)
                lineToRelative(2.04f, -2.04f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.04f, 2.04f)
                lineToRelative(2.04f, 2.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.04f, -2.04f)
                lineToRelative(-2.04f, 2.04f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(3.42f, 9.91f)
                lineTo(0.08f, 6.58f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.92f, 1.92f)
                lineToRelative(3.64f, -3.64f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-5.06f, 5.06f)
                close()
            }
        }.also { _Condition = it}
