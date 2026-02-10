package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mace: ImageVector? = null

val Icons.Ss.Mace: ImageVector
    get() = _Mace ?: UXIcon(name = "Mace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.5f)
                lineToRelative(-2.13f, -1.28f)
                curveToRelative(-0.13f, -0.66f, -0.36f, -1.27f, -0.67f, -1.84f)
                lineToRelative(2.8f, -5.38f)
                lineToRelative(-5.38f, 2.8f)
                curveToRelative(-0.57f, -0.31f, -1.19f, -0.54f, -1.84f, -0.67f)
                lineToRelative(-1.28f, -2.13f)
                lineToRelative(-1.28f, 2.13f)
                curveToRelative(-0.46f, 0.09f, -0.91f, 0.23f, -1.33f, 0.42f)
                lineTo(8f, 0f)
                lineToRelative(2.36f, 4.53f)
                curveToRelative(-0.6f, 0.78f, -1.03f, 1.69f, -1.23f, 2.69f)
                lineToRelative(-2.13f, 1.28f)
                lineToRelative(2.13f, 1.28f)
                curveToRelative(0.19f, 0.94f, 0.58f, 1.81f, 1.13f, 2.56f)
                lineTo(0.04f, 22.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(10.21f, -10.21f)
                curveToRelative(0.75f, 0.55f, 1.62f, 0.94f, 2.56f, 1.13f)
                lineToRelative(1.28f, 2.13f)
                lineToRelative(1.28f, -2.13f)
                curveToRelative(1.0f, -0.2f, 1.92f, -0.63f, 2.69f, -1.23f)
                lineToRelative(4.53f, 2.36f)
                lineToRelative(-2.54f, -4.89f)
                curveToRelative(0.18f, -0.42f, 0.33f, -0.87f, 0.42f, -1.33f)
                lineToRelative(2.13f, -1.28f)
                close()
                moveTo(15.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Mace = it}
