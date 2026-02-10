package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hammer: ImageVector? = null

val Icons.Bs.Hammer: ImageVector
    get() = _Hammer ?: UXIcon(name = "Hammer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 9.56f)
                lineToRelative(-7.07f, -7.07f)
                curveTo(12.88f, -0.83f, 7.49f, -0.83f, 4.18f, 2.49f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(7.25f, 7.25f)
                lineTo(0f, 21.17f)
                lineToRelative(2.83f, 2.83f)
                lineTo(13.2f, 13.63f)
                lineToRelative(3.0f, 3.0f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f)
                lineToRelative(3.54f, -3.54f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
                close()
                moveTo(7.51f, 3.69f)
                curveToRelative(2.09f, -1.17f, 4.79f, -0.86f, 6.57f, 0.91f)
                lineToRelative(2.47f, 2.48f)
                lineToRelative(-2.83f, 2.83f)
                lineTo(7.51f, 3.69f)
                close()
                moveTo(17.97f, 14.15f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.83f, 2.83f)
                close()
            }
        }.also { _Hammer = it}
