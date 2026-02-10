package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorAlert: ImageVector? = null

val Icons.Rs.SensorAlert: ImageVector
    get() = _SensorAlert ?: UXIcon(name = "SensorAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(24f, 20.47f)
                lineToRelative(-2f, -3.43f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 22f)
                horizontalLineToRelative(3.11f)
                lineToRelative(-1.17f, 2f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(5f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(10f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(6.26f, 24f)
                horizontalLineToRelative(5.74f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.26f)
                lineToRelative(5.26f, -9.02f)
                lineToRelative(5.26f, 9.02f)
                horizontalLineToRelative(-2.26f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.74f)
                lineTo(15f, 9.02f)
                lineTo(6.26f, 24f)
                close()
                moveTo(14f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
                moveTo(14f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SensorAlert = it}
