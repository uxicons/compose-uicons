package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Ss.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(6.24f, 6.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.24f, -6.24f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                close()
                moveTo(13.54f, 12.54f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.53f, -3.45f)
                curveToRelative(-0.95f, -0.95f, -1.47f, -2.21f, -1.47f, -3.54f)
                reflectiveCurveToRelative(0.52f, -2.59f, 1.47f, -3.54f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.47f, 3.54f, -1.47f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.47f)
                reflectiveCurveToRelative(1.47f, 2.2f, 1.47f, 3.54f)
                reflectiveCurveToRelative(-0.52f, 2.59f, -1.47f, 3.54f)
                close()
                moveTo(10f, 6f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.31f, -2.12f, 0.88f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.88f, 2.12f)
                lineToRelative(2.12f, 2.08f)
                lineToRelative(2.13f, -2.08f)
                curveToRelative(0.56f, -0.56f, 0.87f, -1.31f, 0.87f, -2.11f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                close()
                moveTo(10f, 9.99f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _SearchLocation = it}
