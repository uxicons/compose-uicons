package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Ss.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 3f)
                horizontalLineToRelative(2f)
                lineTo(22f, 21f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 3f)
                horizontalLineToRelative(2f)
                lineTo(18f, 21f)
                close()
                moveTo(2f, 21.0f)
                lineTo(2f, 3.0f)
                lineToRelative(10.88f, 6.95f)
                curveToRelative(0.7f, 0.44f, 1.12f, 1.2f, 1.12f, 2.04f)
                reflectiveCurveToRelative(-0.42f, 1.6f, -1.14f, 2.05f)
                lineTo(2f, 21.0f)
                close()
            }
        }.also { _PlayPause = it}
