package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resume: ImageVector? = null

val Icons.Sr.Resume: ImageVector
    get() = _Resume ?: UXIcon(name = "Resume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.98f, 9f)
                horizontalLineToRelative(-5.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(13f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -1.32f, -0.02f, -1.49f, -0.02f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 9.48f)
                curveToRelative(0f, -0.16f, -0.01f, -0.32f, -0.02f, -0.48f)
                close()
                moveTo(9f, 5.0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(6.26f, 11.39f)
                curveToRelative(0.11f, -0.14f, 1.11f, -1.39f, 2.77f, -1.39f)
                reflectiveCurveToRelative(2.66f, 1.25f, 2.77f, 1.39f)
                curveToRelative(0.34f, 0.44f, 0.25f, 1.07f, -0.19f, 1.4f)
                curveToRelative(-0.18f, 0.14f, -0.4f, 0.21f, -0.61f, 0.21f)
                curveToRelative(-0.3f, 0f, -0.6f, -0.14f, -0.8f, -0.39f)
                curveToRelative(0f, 0f, -0.5f, -0.61f, -1.18f, -0.61f)
                reflectiveCurveToRelative(-1.18f, 0.6f, -1.18f, 0.61f)
                curveToRelative(-0.34f, 0.44f, -0.96f, 0.52f, -1.4f, 0.19f)
                curveToRelative(-0.44f, -0.34f, -0.52f, -0.96f, -0.19f, -1.4f)
                close()
                moveTo(17f, 21f)
                lineTo(7f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 17f)
                lineTo(7f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(16f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(15f, 0.94f)
                curveToRelative(0.53f, 0.3f, 1.02f, 0.67f, 1.47f, 1.11f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.44f, 0.44f, 0.81f, 0.94f, 1.11f, 1.46f)
                horizontalLineToRelative(-5.06f)
                close()
            }
        }.also { _Resume = it}
