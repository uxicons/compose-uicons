package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Sr.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.24f, 7.42f)
                lineToRelative(4.97f, -4.95f)
                curveToRelative(0.94f, -0.95f, 2.2f, -1.47f, 3.54f, -1.47f)
                reflectiveCurveToRelative(2.6f, 0.52f, 3.54f, 1.47f)
                lineToRelative(3.25f, 3.27f)
                curveToRelative(1.94f, 1.95f, 1.94f, 5.11f, 0f, 7.06f)
                lineToRelative(-4.97f, 4.99f)
                lineTo(7.24f, 7.42f)
                close()
                moveTo(23f, 21f)
                horizontalLineToRelative(-8.63f)
                lineToRelative(1.79f, -1.8f)
                lineTo(5.82f, 8.83f)
                lineTo(1.46f, 13.18f)
                curveToRelative(-1.94f, 1.95f, -1.94f, 5.11f, 0f, 7.06f)
                lineToRelative(1.58f, 1.59f)
                curveToRelative(0.74f, 0.75f, 1.78f, 1.18f, 2.83f, 1.18f)
                horizontalLineToRelative(17.12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Eraser = it}
