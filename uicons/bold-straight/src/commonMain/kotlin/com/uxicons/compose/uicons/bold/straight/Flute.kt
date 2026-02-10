package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flute: ImageVector? = null

val Icons.Bs.Flute: ImageVector
    get() = _Flute ?: UXIcon(name = "Flute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 4.26f)
                lineTo(19.73f, -0.0f)
                reflectiveCurveToRelative(-1.72f, 2.16f, -4.22f, 1.37f)
                lineTo(0.01f, 16.87f)
                lineToRelative(7.09f, 7.09f)
                lineToRelative(15.54f, -15.47f)
                curveToRelative(-0.57f, -2.34f, 1.37f, -4.22f, 1.37f, -4.22f)
                close()
                moveTo(7.1f, 19.72f)
                lineToRelative(-2.85f, -2.85f)
                lineTo(15.51f, 5.61f)
                lineToRelative(2.87f, 2.87f)
                lineToRelative(-11.29f, 11.24f)
                close()
                moveTo(13.29f, 9.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(10.79f, 11.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(8.29f, 14.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.5f, -1.5f)
                close()
            }
        }.also { _Flute = it}
