package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bahai: ImageVector? = null

val Icons.Ss.Bahai: ImageVector
    get() = _Bahai ?: UXIcon(name = "Bahai") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.18f, 24f)
                lineToRelative(-4.17f, -3.33f)
                lineToRelative(-4.17f, 3.33f)
                lineToRelative(-1.05f, -5.23f)
                lineToRelative(-5.33f, -0.13f)
                lineToRelative(2.55f, -4.69f)
                lineTo(0f, 10.42f)
                lineToRelative(4.97f, -1.95f)
                lineToRelative(-0.8f, -5.28f)
                lineToRelative(5.06f, 1.7f)
                lineTo(12.01f, 0.34f)
                lineToRelative(2.78f, 4.56f)
                lineToRelative(5.06f, -1.7f)
                lineToRelative(-0.8f, 5.28f)
                lineToRelative(4.97f, 1.95f)
                lineToRelative(-4.0f, 3.53f)
                lineToRelative(2.55f, 4.69f)
                lineToRelative(-5.33f, 0.13f)
                lineToRelative(-1.05f, 5.23f)
                close()
            }
        }.also { _Bahai = it}
