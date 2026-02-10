package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flute: ImageVector? = null

val Icons.Ss.Flute: ImageVector
    get() = _Flute ?: UXIcon(name = "Flute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.55f, 4.21f)
                lineTo(0f, 17.77f)
                lineToRelative(6.24f, 6.24f)
                lineToRelative(13.55f, -13.55f)
                lineToRelative(-6.24f, -6.24f)
                close()
                moveTo(6.1f, 19.32f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(8.6f, 16.82f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(11.1f, 14.31f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(12.19f, 10.4f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(15.0f, 2.84f)
                lineToRelative(0.31f, 0.01f)
                curveToRelative(1.87f, 0.08f, 4.16f, -2.06f, 4.18f, -2.07f)
                lineToRelative(0.62f, -0.56f)
                lineToRelative(3.69f, 3.68f)
                lineToRelative(-0.57f, 0.62f)
                curveToRelative(-0.01f, 0.01f, -2.13f, 2.3f, -2.07f, 4.17f)
                lineToRelative(0.01f, 0.31f)
                lineToRelative(-6.17f, -6.17f)
                close()
            }
        }.also { _Flute = it}
