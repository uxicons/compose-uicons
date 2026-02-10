package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lamp: ImageVector? = null

val Icons.Rs.Lamp: ImageVector
    get() = _Lamp ?: UXIcon(name = "Lamp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.11f, 18.0f)
                curveToRelative(-0.36f, -0.08f, -2.1f, -0.53f, -2.1f, -2.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-2.03f, -12.48f)
                curveToRelative(-0.24f, -1.46f, -1.48f, -2.52f, -2.96f, -2.52f)
                lineTo(5.0f, -0f)
                curveToRelative(-1.48f, 0f, -2.72f, 1.06f, -2.96f, 2.52f)
                lineTo(0.0f, 15f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.83f, -1.54f, 1.99f, -2f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.62f, -1.29f, -2.94f, -2.9f, -3.0f)
                close()
                moveTo(4.01f, 2.84f)
                curveToRelative(0.08f, -0.49f, 0.49f, -0.84f, 0.99f, -0.84f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.49f, 0f, 0.91f, 0.35f, 0.99f, 0.84f)
                lineToRelative(1.66f, 10.16f)
                lineTo(2.35f, 13f)
                lineToRelative(1.66f, -10.16f)
                close()
                moveTo(15f, 22f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(0.98f, 0f, 2.26f, -0.4f, 3.1f, -1.38f)
                curveToRelative(0.84f, 0.82f, 1.98f, 1.24f, 2.73f, 1.36f)
                lineToRelative(0.16f, 0.01f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Lamp = it}
