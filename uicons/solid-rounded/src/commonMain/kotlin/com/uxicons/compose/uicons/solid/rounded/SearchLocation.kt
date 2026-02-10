package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Sr.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-5.95f, -5.95f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.33f)
                curveTo(20.02f, 4.51f, 15.54f, 0.02f, 10.02f, 0.02f)
                reflectiveCurveTo(0.02f, 4.51f, 0.02f, 10.02f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.33f, -2.26f)
                lineToRelative(5.95f, 5.95f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(13.54f, 12.54f)
                lineToRelative(-1.82f, 1.78f)
                curveToRelative(-0.47f, 0.46f, -1.09f, 0.69f, -1.71f, 0.69f)
                reflectiveCurveToRelative(-1.24f, -0.23f, -1.72f, -0.69f)
                lineToRelative(-1.81f, -1.77f)
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
                lineToRelative(1.8f, 1.77f)
                curveToRelative(0.17f, 0.17f, 0.46f, 0.17f, 0.63f, 0f)
                lineToRelative(1.81f, -1.77f)
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
