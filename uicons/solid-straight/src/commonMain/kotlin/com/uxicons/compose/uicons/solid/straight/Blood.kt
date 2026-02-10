package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Ss.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 10.49f)
                lineToRelative(-3.89f, 4.12f)
                curveToRelative(-1.04f, 1.04f, -1.61f, 2.42f, -1.61f, 3.89f)
                reflectiveCurveToRelative(0.57f, 2.85f, 1.61f, 3.89f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                curveToRelative(2.15f, -2.15f, 2.15f, -5.63f, 0.02f, -7.76f)
                lineToRelative(-3.91f, -4.14f)
                close()
                moveTo(22.53f, 9.46f)
                lineToRelative(-3.53f, -3.45f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, -0.01f, -7.08f)
                close()
                moveTo(10f, 0.41f)
                lineToRelative(-2.83f, 2.77f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                reflectiveCurveToRelative(0.42f, 2.07f, 1.17f, 2.83f)
                curveToRelative(0.76f, 0.76f, 1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.1f, -0.01f, -5.66f)
                lineTo(10f, 0.41f)
                close()
            }
        }.also { _Blood = it}
