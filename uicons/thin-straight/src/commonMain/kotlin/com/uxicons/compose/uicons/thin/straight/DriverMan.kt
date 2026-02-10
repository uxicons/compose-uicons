package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverMan: ImageVector? = null

val Icons.Ts.DriverMan: ImageVector
    get() = _DriverMan ?: UXIcon(name = "DriverMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(9.24f, 1f, 12f, 1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.2f, 0.44f, -2.28f, 1.15f, -3.15f)
                lineToRelative(2.14f, 2.14f)
                curveToRelative(-0.18f, 0.3f, -0.28f, 0.64f, -0.28f, 1.01f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.37f, -0.11f, -0.71f, -0.28f, -1.01f)
                lineToRelative(2.14f, -2.14f)
                curveToRelative(0.7f, 0.86f, 1.15f, 1.95f, 1.15f, 3.15f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(10.99f, 22.28f)
                lineToRelative(-2.14f, -2.14f)
                curveToRelative(0.86f, -0.7f, 1.95f, -1.15f, 3.15f, -1.15f)
                reflectiveCurveToRelative(2.28f, 0.44f, 3.15f, 1.15f)
                lineToRelative(-2.14f, 2.14f)
                curveToRelative(-0.3f, -0.18f, -0.64f, -0.28f, -1.01f, -0.28f)
                reflectiveCurveToRelative(-0.71f, 0.11f, -1.01f, 0.28f)
                close()
                moveTo(22.5f, 24f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(-1.9f, -6.74f)
                curveToRelative(-0.55f, -1.92f, -2.33f, -3.26f, -4.33f, -3.26f)
                horizontalLineToRelative(-6.42f)
                curveToRelative(-2.0f, 0f, -3.78f, 1.34f, -4.33f, 3.26f)
                lineToRelative(-1.9f, 6.74f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(2.0f, -7.01f)
                curveToRelative(0.67f, -2.35f, 2.85f, -3.99f, 5.29f, -3.99f)
                horizontalLineToRelative(6.42f)
                curveToRelative(2.44f, 0f, 4.62f, 1.64f, 5.29f, 3.99f)
                lineToRelative(2.0f, 7.01f)
                close()
            }
        }.also { _DriverMan = it}
