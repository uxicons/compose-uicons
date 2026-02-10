package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Asterik: ImageVector? = null

val Icons.Ss.Asterik: ImageVector
    get() = _Asterik ?: UXIcon(name = "Asterik") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.58f, 8.54f)
                lineToRelative(-3.36f, -5.4f)
                lineToRelative(-4.95f, 3.08f)
                verticalLineToRelative(-6.22f)
                horizontalLineToRelative(-6.55f)
                verticalLineToRelative(6.22f)
                lineToRelative(-4.95f, -3.08f)
                lineToRelative(-3.36f, 5.4f)
                lineToRelative(5.56f, 3.46f)
                lineToRelative(-5.56f, 3.46f)
                lineToRelative(3.36f, 5.4f)
                lineToRelative(4.95f, -3.08f)
                verticalLineToRelative(6.22f)
                horizontalLineToRelative(6.55f)
                verticalLineToRelative(-6.22f)
                lineToRelative(4.95f, 3.08f)
                lineToRelative(3.36f, -5.4f)
                lineToRelative(-5.56f, -3.46f)
                close()
            }
        }.also { _Asterik = it}
