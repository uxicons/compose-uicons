package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSlice: ImageVector? = null

val Icons.Sc.BreadSlice: ImageVector
    get() = _BreadSlice ?: UXIcon(name = "BreadSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5.12f)
                curveToRelative(0f, -1.95f, -1.68f, -3.69f, -3.66f, -3.81f)
                curveToRelative(-1.73f, -0.1f, -4.41f, -0.23f, -7.34f, -0.23f)
                reflectiveCurveToRelative(-5.61f, 0.12f, -7.34f, 0.23f)
                curveToRelative(-1.98f, 0.12f, -3.66f, 1.86f, -3.66f, 3.81f)
                curveToRelative(0f, 1.52f, 0.77f, 2.46f, 1.51f, 2.97f)
                curveToRelative(-0.22f, 1.31f, -0.43f, 3.09f, -0.43f, 5.09f)
                curveToRelative(0f, 4.5f, 1.03f, 7.82f, 1.07f, 7.96f)
                curveToRelative(0.1f, 0.32f, 0.35f, 0.56f, 0.67f, 0.66f)
                curveToRelative(0.15f, 0.04f, 3.83f, 1.11f, 8.18f, 1.11f)
                reflectiveCurveToRelative(8.03f, -1.07f, 8.18f, -1.11f)
                curveToRelative(0.32f, -0.09f, 0.57f, -0.34f, 0.67f, -0.66f)
                curveToRelative(0.04f, -0.14f, 1.07f, -3.46f, 1.07f, -7.96f)
                curveToRelative(0f, -2.0f, -0.21f, -3.79f, -0.43f, -5.09f)
                curveToRelative(0.74f, -0.51f, 1.51f, -1.45f, 1.51f, -2.97f)
                close()
                moveTo(12.75f, 19.27f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.14f, 19.27f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.14f, 14.8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _BreadSlice = it}
