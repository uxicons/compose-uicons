package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mace: ImageVector? = null

val Icons.Rs.Mace: ImageVector
    get() = _Mace ?: UXIcon(name = "Mace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.87f, 9.78f)
                curveToRelative(-0.09f, 0.46f, -0.23f, 0.91f, -0.42f, 1.33f)
                lineToRelative(2.54f, 4.89f)
                lineToRelative(-4.53f, -2.36f)
                curveToRelative(-0.78f, 0.6f, -1.69f, 1.03f, -2.69f, 1.23f)
                lineToRelative(-1.28f, 2.13f)
                lineToRelative(-1.28f, -2.13f)
                curveToRelative(-0.94f, -0.19f, -1.81f, -0.58f, -2.56f, -1.13f)
                lineTo(1.45f, 23.96f)
                lineTo(0.04f, 22.55f)
                lineToRelative(10.21f, -10.21f)
                curveToRelative(-0.55f, -0.75f, -0.94f, -1.62f, -1.13f, -2.56f)
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
                moveTo(15.5f, 13f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                close()
            }
        }.also { _Mace = it}
