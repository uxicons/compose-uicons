package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mace: ImageVector? = null

val Icons.Bs.Mace: ImageVector
    get() = _Mace ?: UXIcon(name = "Mace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(21.87f, 9.78f)
                curveToRelative(-0.09f, 0.46f, -0.23f, 0.91f, -0.42f, 1.33f)
                lineToRelative(2.54f, 4.89f)
                lineToRelative(-4.53f, -2.36f)
                curveToRelative(-0.78f, 0.6f, -1.69f, 1.03f, -2.69f, 1.23f)
                lineToRelative(-1.28f, 2.13f)
                lineToRelative(-1.28f, -2.13f)
                curveToRelative(-0.77f, -0.15f, -1.49f, -0.44f, -2.13f, -0.84f)
                lineTo(2.15f, 23.97f)
                lineTo(0.03f, 21.85f)
                lineToRelative(9.94f, -9.94f)
                curveToRelative(-0.4f, -0.65f, -0.69f, -1.37f, -0.84f, -2.13f)
                lineToRelative(-2.13f, -1.28f)
                lineToRelative(2.13f, -1.28f)
                curveToRelative(0.2f, -1.0f, 0.63f, -1.92f, 1.23f, -2.69f)
                lineTo(8f, 0f)
                lineToRelative(4.89f, 2.54f)
                curveToRelative(0.42f, -0.18f, 0.87f, -0.33f, 1.33f, -0.42f)
                lineToRelative(1.28f, -2.13f)
                lineToRelative(1.28f, 2.13f)
                curveToRelative(0.66f, 0.13f, 1.27f, 0.36f, 1.84f, 0.67f)
                lineToRelative(5.38f, -2.8f)
                lineToRelative(-2.8f, 5.38f)
                curveToRelative(0.31f, 0.57f, 0.54f, 1.19f, 0.67f, 1.84f)
                lineToRelative(2.13f, 1.28f)
                lineToRelative(-2.13f, 1.28f)
                close()
                moveTo(19f, 8.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _Mace = it}
