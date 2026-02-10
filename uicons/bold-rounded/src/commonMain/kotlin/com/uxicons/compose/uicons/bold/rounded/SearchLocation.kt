package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Br.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.6f, 21.55f)
            lineToRelative(-5.56f, -5.56f)
            curveToRelative(1.25f, -1.67f, 1.98f, -3.73f, 1.98f, -5.97f)
            curveTo(20.02f, 4.51f, 15.54f, 0.02f, 10.02f, 0.02f)
            reflectiveCurveTo(0.02f, 4.51f, 0.02f, 10.02f)
            reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
            curveToRelative(2.2f, 0f, 4.23f, -0.71f, 5.88f, -1.92f)
            lineToRelative(5.57f, 5.57f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(3.02f, 10.02f)
            curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
            close()
            moveTo(10f, 5.01f)
            curveToRelative(-1.14f, 0f, -2.27f, 0.43f, -3.14f, 1.3f)
            curveToRelative(-1.73f, 1.73f, -1.73f, 4.54f, 0f, 6.27f)
            lineToRelative(2.01f, 1.97f)
            curveToRelative(0.63f, 0.61f, 1.63f, 0.61f, 2.25f, 0f)
            lineToRelative(2.01f, -1.97f)
            curveToRelative(1.73f, -1.73f, 1.73f, -4.54f, 0f, -6.27f)
            curveToRelative(-0.87f, -0.87f, -2.0f, -1.3f, -3.14f, -1.3f)
            close()
            moveTo(10f, 10.99f)
            curveToRelative(-0.82f, 0f, -1.49f, -0.67f, -1.49f, -1.49f)
            reflectiveCurveToRelative(0.67f, -1.49f, 1.49f, -1.49f)
            reflectiveCurveToRelative(1.49f, 0.67f, 1.49f, 1.49f)
            reflectiveCurveToRelative(-0.67f, 1.49f, -1.49f, 1.49f)
            close()
        }
    }.also { _SearchLocation = it }
