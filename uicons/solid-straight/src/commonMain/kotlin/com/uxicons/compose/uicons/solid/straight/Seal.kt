package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seal: ImageVector? = null

val Icons.Ss.Seal: ImageVector
    get() = _Seal ?: UXIcon(name = "Seal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24.02f)
                lineToRelative(-3.52f, -3.52f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(-4.98f)
                lineTo(-0.02f, 12f)
                lineToRelative(3.52f, -3.52f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(4.98f)
                lineTo(12f, -0.02f)
                lineToRelative(3.52f, 3.52f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(4.98f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(-3.52f, 3.52f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(-4.98f)
                lineToRelative(-3.52f, 3.52f)
                close()
            }
        }.also { _Seal = it}
