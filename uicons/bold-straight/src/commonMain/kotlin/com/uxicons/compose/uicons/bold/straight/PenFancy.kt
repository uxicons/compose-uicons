package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Bs.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.09f)
                curveToRelative(0f, -1.09f, -0.42f, -2.12f, -1.2f, -2.89f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.59f, -1.59f, -4.19f, -1.59f, -5.78f, -0.0f)
                lineTo(7.5f, 10.69f)
                lineToRelative(-4.75f, 1.06f)
                lineTo(0.02f, 23.98f)
                lineToRelative(12.26f, -2.72f)
                lineToRelative(0.95f, -4.74f)
                lineToRelative(9.58f, -9.54f)
                curveToRelative(0.77f, -0.77f, 1.2f, -1.8f, 1.2f, -2.89f)
                close()
                moveTo(5.83f, 19.61f)
                lineToRelative(2.47f, -2.47f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.51f, 2.51f)
                lineToRelative(0.89f, -3.99f)
                lineToRelative(3.96f, -0.48f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(-0.74f, 3.72f)
                lineToRelative(-3.89f, 0.86f)
                close()
                moveTo(20.68f, 4.85f)
                lineToRelative(-8.09f, 8.06f)
                lineToRelative(-1.54f, -1.54f)
                lineTo(19.15f, 3.32f)
                curveToRelative(0.42f, -0.42f, 1.11f, -0.42f, 1.54f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.2f, 0.21f, 0.32f, 0.48f, 0.32f, 0.77f)
                reflectiveCurveToRelative(-0.11f, 0.56f, -0.32f, 0.77f)
                close()
            }
        }.also { _PenFancy = it}
