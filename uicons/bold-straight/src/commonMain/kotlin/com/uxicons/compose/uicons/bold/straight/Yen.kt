package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yen: ImageVector? = null

val Icons.Bs.Yen: ImageVector
    get() = _Yen ?: UXIcon(name = "Yen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.19f, 1.92f)
                lineToRelative(-2.38f, -1.83f)
                lineToRelative(-8.81f, 11.46f)
                lineToRelative(-8.81f, -11.46f)
                lineToRelative(-2.38f, 1.83f)
                lineToRelative(8.53f, 11.09f)
                horizontalLineToRelative(-4.34f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.34f)
                close()
            }
        }.also { _Yen = it}
