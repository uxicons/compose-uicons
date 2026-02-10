package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverMan: ImageVector? = null

val Icons.Bs.DriverMan: ImageVector
    get() = _DriverMan ?: UXIcon(name = "DriverMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(18f, 24f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22.77f, 24f)
                horizontalLineToRelative(-3.12f)
                lineToRelative(-1.77f, -6.19f)
                curveToRelative(-0.3f, -1.07f, -1.29f, -1.81f, -2.4f, -1.81f)
                horizontalLineToRelative(-6.97f)
                curveToRelative(-1.11f, 0f, -2.1f, 0.75f, -2.4f, 1.81f)
                lineToRelative(-1.77f, 6.19f)
                lineTo(1.23f, 24f)
                lineToRelative(2.0f, -7.01f)
                curveToRelative(0.67f, -2.35f, 2.85f, -3.99f, 5.29f, -3.99f)
                horizontalLineToRelative(6.97f)
                curveToRelative(2.44f, 0f, 4.62f, 1.64f, 5.29f, 3.99f)
                lineToRelative(2.0f, 7.01f)
                close()
            }
        }.also { _DriverMan = it}
