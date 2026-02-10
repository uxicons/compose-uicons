package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Violin: ImageVector? = null

val Icons.Ss.Violin: ImageVector
    get() = _Violin ?: UXIcon(name = "Violin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.97f, 1.53f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(17.64f, 0.03f, 18.47f, 0.03f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(22.47f, 4.03f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16.3f, 7.7f)
                lineToRelative(0.0f, 0.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.24f, 0.24f, 0.45f, 0.5f, 0.64f, 0.77f)
                lineToRelative(6.74f, -6.74f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-6.74f, 6.74f)
                curveToRelative(0.27f, 0.19f, 0.53f, 0.4f, 0.77f, 0.64f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                close()
                moveTo(16.94f, 8.47f)
                curveToRelative(1.41f, 2.0f, 1.41f, 4.7f, -0.04f, 6.73f)
                lineToRelative(-0.61f, 0.89f)
                reflectiveCurveToRelative(-2.29f, -1.1f, -3.79f, 1.4f)
                reflectiveCurveToRelative(0.28f, 4.17f, 0.28f, 4.17f)
                curveToRelative(-2.6f, 2.77f, -6.87f, 3.09f, -9.86f, 0.82f)
                lineToRelative(2.08f, -1.99f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.08f, 1.99f)
                curveToRelative(-2.27f, -2.98f, -1.95f, -7.25f, 0.82f, -9.86f)
                curveToRelative(0f, 0f, 1.67f, 1.78f, 4.17f, 0.28f)
                reflectiveCurveToRelative(1.4f, -3.79f, 1.4f, -3.79f)
                lineToRelative(0.89f, -0.61f)
                curveToRelative(2.03f, -1.45f, 4.73f, -1.45f, 6.73f, -0.04f)
                lineToRelative(-6.44f, 6.53f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.44f, -6.53f)
                close()
                moveTo(9f, 18.09f)
                lineToRelative(-3f, -3f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3f, 3f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _Violin = it}
