package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seal: ImageVector? = null

val Icons.Rs.Seal: ImageVector
    get() = _Seal ?: UXIcon(name = "Seal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 8.48f)
                lineTo(20.5f, 3.5f)
                horizontalLineToRelative(-4.98f)
                lineTo(12f, -0.02f)
                lineToRelative(-3.52f, 3.52f)
                lineTo(3.5f, 3.5f)
                verticalLineToRelative(4.98f)
                lineTo(-0.02f, 12f)
                lineToRelative(3.52f, 3.52f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(4.98f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(3.52f, -3.52f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(-4.98f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(-3.52f, -3.52f)
                close()
                moveTo(18.5f, 14.69f)
                verticalLineToRelative(3.81f)
                horizontalLineToRelative(-3.81f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(-2.69f, -2.69f)
                horizontalLineToRelative(-3.81f)
                verticalLineToRelative(-3.81f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(2.69f, -2.69f)
                verticalLineToRelative(-3.81f)
                horizontalLineToRelative(3.81f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(2.69f, 2.69f)
                horizontalLineToRelative(3.81f)
                verticalLineToRelative(3.81f)
                lineToRelative(2.69f, 2.69f)
                lineToRelative(-2.69f, 2.69f)
                close()
            }
        }.also { _Seal = it}
