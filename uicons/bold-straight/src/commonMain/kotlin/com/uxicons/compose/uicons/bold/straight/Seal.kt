package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seal: ImageVector? = null

val Icons.Bs.Seal: ImageVector
    get() = _Seal ?: UXIcon(name = "Seal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9.03f)
                lineTo(21f, 3f)
                horizontalLineToRelative(-6.03f)
                lineTo(12f, 0.03f)
                lineToRelative(-2.97f, 2.97f)
                lineTo(3f, 3f)
                verticalLineToRelative(6.03f)
                lineTo(0.03f, 12f)
                lineToRelative(2.97f, 2.97f)
                verticalLineToRelative(6.03f)
                horizontalLineToRelative(6.03f)
                lineToRelative(2.97f, 2.97f)
                lineToRelative(2.97f, -2.97f)
                horizontalLineToRelative(6.03f)
                verticalLineToRelative(-6.03f)
                lineToRelative(2.97f, -2.97f)
                lineToRelative(-2.97f, -2.97f)
                close()
                moveTo(18f, 13.72f)
                verticalLineToRelative(4.28f)
                horizontalLineToRelative(-4.28f)
                lineToRelative(-1.73f, 1.73f)
                lineToRelative(-1.73f, -1.73f)
                horizontalLineToRelative(-4.28f)
                verticalLineToRelative(-4.28f)
                lineToRelative(-1.73f, -1.73f)
                lineToRelative(1.73f, -1.73f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(4.28f)
                lineToRelative(1.73f, -1.73f)
                lineToRelative(1.73f, 1.73f)
                horizontalLineToRelative(4.28f)
                verticalLineToRelative(4.28f)
                lineToRelative(1.73f, 1.73f)
                lineToRelative(-1.73f, 1.73f)
                close()
            }
        }.also { _Seal = it}
