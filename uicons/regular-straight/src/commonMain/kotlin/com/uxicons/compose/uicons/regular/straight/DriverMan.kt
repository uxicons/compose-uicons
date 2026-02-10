package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverMan: ImageVector? = null

val Icons.Rs.DriverMan: ImageVector
    get() = _DriverMan ?: UXIcon(name = "DriverMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(18f, 24f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22.5f, 24f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(-1.97f, -6.46f)
                curveToRelative(-0.43f, -1.49f, -1.81f, -2.54f, -3.37f, -2.54f)
                horizontalLineToRelative(-6.35f)
                curveToRelative(-1.55f, 0f, -2.94f, 1.04f, -3.37f, 2.54f)
                lineToRelative(-1.75f, 6.46f)
                lineTo(1.56f, 24f)
                lineToRelative(2.0f, -7.01f)
                curveToRelative(0.67f, -2.35f, 2.85f, -3.99f, 5.29f, -3.99f)
                horizontalLineToRelative(6.35f)
                curveToRelative(2.44f, 0f, 4.62f, 1.64f, 5.29f, 3.99f)
                lineToRelative(2.0f, 7.01f)
                close()
            }
        }.also { _DriverMan = it}
