package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Rs.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.98f, 22.56f)
                lineToRelative(-6.22f, -6.22f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveTo(20.02f, 4.51f, 15.54f, 0.02f, 10.02f, 0.02f)
                reflectiveCurveTo(0.02f, 4.51f, 0.02f, 10.02f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(6.22f, 6.22f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(10.02f, 18.02f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(5.61f, 2.02f, 10.02f, 2.02f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(10.0f, 4f)
                curveToRelative(-1.34f, 0f, -2.59f, 0.52f, -3.54f, 1.47f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.47f, 3.54f)
                lineToRelative(3.53f, 3.45f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                reflectiveCurveToRelative(-2.2f, -1.47f, -3.54f, -1.47f)
                close()
                moveTo(12.13f, 11.11f)
                lineToRelative(-2.13f, 2.08f)
                lineToRelative(-2.12f, -2.08f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.12f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.12f)
                curveToRelative(0.56f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                reflectiveCurveToRelative(1.55f, 0.31f, 2.12f, 0.88f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.87f, 2.11f)
                close()
                moveTo(11.0f, 8.99f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SearchLocation = it}
