package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Bs.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.01f, 21.89f)
                lineToRelative(-5.94f, -5.94f)
                curveToRelative(1.23f, -1.66f, 1.95f, -3.71f, 1.95f, -5.93f)
                curveTo(20.02f, 4.51f, 15.54f, 0.02f, 10.02f, 0.02f)
                reflectiveCurveTo(0.02f, 4.51f, 0.02f, 10.02f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.22f, 0f, 4.27f, -0.73f, 5.93f, -1.95f)
                lineToRelative(5.94f, 5.94f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(10.02f, 17.02f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveTo(6.16f, 3.02f, 10.02f, 3.02f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(10.0f, 5.0f)
                curveToRelative(-1.02f, 0f, -2.05f, 0.39f, -2.83f, 1.17f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0f, 5.66f)
                lineToRelative(2.83f, 2.77f)
                lineToRelative(2.83f, -2.77f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0f, -5.66f)
                curveToRelative(-0.78f, -0.78f, -1.8f, -1.17f, -2.83f, -1.17f)
                close()
                moveTo(10.0f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SearchLocation = it}
