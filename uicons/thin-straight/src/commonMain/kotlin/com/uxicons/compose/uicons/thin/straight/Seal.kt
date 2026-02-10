package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seal: ImageVector? = null

val Icons.Ts.Seal: ImageVector
    get() = _Seal ?: UXIcon(name = "Seal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23.96f)
                lineToRelative(-3.46f, -3.46f)
                lineTo(3.5f, 20.5f)
                verticalLineToRelative(-5.04f)
                lineTo(0.04f, 12f)
                lineToRelative(3.46f, -3.46f)
                lineTo(3.5f, 3.5f)
                horizontalLineToRelative(5.04f)
                lineTo(12f, 0.04f)
                lineToRelative(3.46f, 3.46f)
                horizontalLineToRelative(5.04f)
                verticalLineToRelative(5.04f)
                lineToRelative(3.46f, 3.46f)
                lineToRelative(-3.46f, 3.46f)
                verticalLineToRelative(5.04f)
                horizontalLineToRelative(-5.04f)
                lineToRelative(-3.46f, 3.46f)
                close()
                moveTo(4.5f, 19.5f)
                horizontalLineToRelative(4.46f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(3.04f, -3.04f)
                horizontalLineToRelative(4.46f)
                verticalLineToRelative(-4.46f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(-3.04f, -3.04f)
                verticalLineToRelative(-4.46f)
                horizontalLineToRelative(-4.46f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-3.04f, 3.04f)
                horizontalLineToRelative(-4.46f)
                verticalLineToRelative(4.46f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(3.04f, 3.04f)
                verticalLineToRelative(4.46f)
                close()
            }
        }.also { _Seal = it}
