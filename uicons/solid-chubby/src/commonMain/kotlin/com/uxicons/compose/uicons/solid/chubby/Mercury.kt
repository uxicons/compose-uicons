package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Sc.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 10f)
                curveToRelative(0f, -2.5f, -0.61f, -4.29f, -1.87f, -5.44f)
                curveToRelative(0.44f, -0.35f, 0.82f, -0.77f, 1.14f, -1.25f)
                curveToRelative(0.45f, -0.7f, 0.24f, -1.63f, -0.45f, -2.07f)
                curveToRelative(-0.7f, -0.45f, -1.62f, -0.24f, -2.07f, 0.45f)
                curveToRelative(-0.39f, 0.61f, -1.17f, 1.31f, -3.74f, 1.31f)
                reflectiveCurveToRelative(-3.35f, -0.7f, -3.74f, -1.31f)
                curveToRelative(-0.45f, -0.7f, -1.37f, -0.9f, -2.07f, -0.45f)
                curveToRelative(-0.7f, 0.45f, -0.9f, 1.38f, -0.45f, 2.07f)
                curveToRelative(0.31f, 0.49f, 0.69f, 0.9f, 1.14f, 1.25f)
                curveToRelative(-1.26f, 1.15f, -1.87f, 2.94f, -1.87f, 5.44f)
                curveToRelative(0f, 4.24f, 1.76f, 6.47f, 5.5f, 6.91f)
                verticalLineToRelative(1.09f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.09f)
                curveToRelative(3.74f, -0.45f, 5.5f, -2.67f, 5.5f, -6.91f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0f, -3.1f, 0.9f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 0.9f, 4f, 4f)
                reflectiveCurveToRelative(-0.9f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -0.9f, -4f, -4f)
                close()
            }
        }.also { _Mercury = it}
