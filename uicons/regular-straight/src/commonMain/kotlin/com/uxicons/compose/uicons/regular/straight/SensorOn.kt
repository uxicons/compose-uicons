package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorOn: ImageVector? = null

val Icons.Rs.SensorOn: ImageVector
    get() = _SensorOn ?: UXIcon(name = "SensorOn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8f)
                lineTo(3f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(16f, 24f)
                lineTo(16f, 11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(14f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(13f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                close()
                moveTo(24f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                lineTo(13f, 0f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                close()
                moveTo(20f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                verticalLineToRelative(-2f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                close()
                moveTo(6f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SensorOn = it}
