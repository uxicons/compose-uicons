package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorAlert: ImageVector? = null

val Icons.Sr.SensorAlert: ImageVector
    get() = _SensorAlert ?: UXIcon(name = "SensorAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.84f, 22.25f)
                lineToRelative(-6.86f, -11.67f)
                curveToRelative(-0.44f, -0.77f, -1.53f, -0.77f, -1.97f, 0f)
                lineToRelative(-6.86f, 11.67f)
                curveToRelative(-0.44f, 0.78f, 0.1f, 1.75f, 0.99f, 1.75f)
                horizontalLineToRelative(13.71f)
                curveToRelative(0.88f, 0f, 1.43f, -0.98f, 0.99f, -1.75f)
                close()
                moveTo(16f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                close()
                moveTo(6.42f, 21.25f)
                lineToRelative(6.87f, -11.69f)
                curveToRelative(0.55f, -0.96f, 1.59f, -1.56f, 2.71f, -1.56f)
                reflectiveCurveToRelative(2.16f, 0.61f, 2.72f, 1.58f)
                lineToRelative(5.28f, 8.98f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(-0.35f, -0.89f, -0.31f, -1.9f, 0.17f, -2.75f)
                close()
                moveTo(8f, 3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(4f, 5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _SensorAlert = it}
