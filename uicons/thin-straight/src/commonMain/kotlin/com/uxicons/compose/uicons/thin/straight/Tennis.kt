package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tennis: ImageVector? = null

val Icons.Ts.Tennis: ImageVector
    get() = _Tennis ?: UXIcon(name = "Tennis") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.48f, 3.52f)
                curveTo(15.81f, -1.16f, 8.19f, -1.16f, 3.52f, 3.52f)
                curveTo(-1.16f, 8.19f, -1.16f, 15.81f, 3.52f, 20.48f)
                curveToRelative(2.34f, 2.34f, 5.41f, 3.51f, 8.48f, 3.51f)
                reflectiveCurveToRelative(6.15f, -1.17f, 8.48f, -3.51f)
                curveToRelative(4.68f, -4.68f, 4.68f, -12.29f, 0f, -16.97f)
                close()
                moveTo(22.94f, 10.94f)
                curveToRelative(-2.7f, 0.32f, -5.4f, -0.61f, -7.33f, -2.55f)
                curveToRelative(-1.94f, -1.94f, -2.87f, -4.64f, -2.55f, -7.33f)
                curveToRelative(2.45f, 0.23f, 4.84f, 1.29f, 6.72f, 3.17f)
                reflectiveCurveToRelative(2.93f, 4.26f, 3.17f, 6.72f)
                close()
                moveTo(1.06f, 13.06f)
                curveToRelative(2.69f, -0.32f, 5.4f, 0.61f, 7.33f, 2.55f)
                curveToRelative(1.94f, 1.94f, 2.87f, 4.64f, 2.55f, 7.33f)
                curveToRelative(-2.45f, -0.23f, -4.84f, -1.29f, -6.72f, -3.17f)
                curveToRelative(-1.88f, -1.88f, -2.93f, -4.26f, -3.17f, -6.72f)
                close()
                moveTo(19.78f, 19.78f)
                curveToRelative(-2.16f, 2.16f, -5.0f, 3.23f, -7.84f, 3.21f)
                curveToRelative(0.33f, -2.98f, -0.7f, -5.95f, -2.84f, -8.09f)
                curveToRelative(-2.14f, -2.14f, -5.11f, -3.17f, -8.09f, -2.84f)
                curveToRelative(-0.01f, -2.84f, 1.06f, -5.68f, 3.22f, -7.84f)
                curveToRelative(2.16f, -2.16f, 5.0f, -3.23f, 7.84f, -3.22f)
                curveToRelative(-0.33f, 2.98f, 0.7f, 5.95f, 2.84f, 8.09f)
                curveToRelative(1.88f, 1.88f, 4.4f, 2.9f, 7.0f, 2.9f)
                curveToRelative(0.36f, 0f, 0.73f, -0.02f, 1.09f, -0.06f)
                curveToRelative(0.01f, 2.84f, -1.06f, 5.68f, -3.22f, 7.84f)
                close()
            }
        }.also { _Tennis = it}
