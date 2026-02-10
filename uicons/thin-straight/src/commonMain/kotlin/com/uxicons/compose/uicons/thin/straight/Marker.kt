package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Ts.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24.0f)
                lineToRelative(-0.7f, -0.59f)
                curveTo(9.09f, 21.54f, 1.91f, 15.08f, 1.91f, 10.09f)
                curveTo(1.91f, 4.53f, 6.44f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10.09f, 4.53f, 10.09f, 10.09f)
                curveToRelative(0f, 4.99f, -7.18f, 11.45f, -9.39f, 13.31f)
                lineToRelative(-0.7f, 0.59f)
                close()
                moveTo(12f, 1f)
                curveTo(6.99f, 1f, 2.91f, 5.08f, 2.91f, 10.09f)
                curveToRelative(0f, 4.67f, 7.52f, 11.27f, 9.03f, 12.55f)
                lineToRelative(0.06f, 0.05f)
                lineToRelative(0.06f, -0.05f)
                curveToRelative(1.51f, -1.28f, 9.03f, -7.88f, 9.03f, -12.55f)
                curveToRelative(0f, -5.01f, -4.08f, -9.09f, -9.09f, -9.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Marker = it}
