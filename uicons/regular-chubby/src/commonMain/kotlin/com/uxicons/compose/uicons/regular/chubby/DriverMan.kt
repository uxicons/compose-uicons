package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverMan: ImageVector? = null

val Icons.Rc.DriverMan: ImageVector
    get() = _DriverMan ?: UXIcon(name = "DriverMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                curveToRelative(4.15f, 0f, 6f, -1.85f, 6f, -6f)
                reflectiveCurveToRelative(-1.85f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                close()
                moveTo(12f, 3f)
                curveToRelative(3.03f, 0f, 4f, 0.97f, 4f, 4f)
                reflectiveCurveToRelative(-0.97f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -0.97f, -4f, -4f)
                reflectiveCurveToRelative(0.97f, -4f, 4f, -4f)
                close()
                moveTo(17f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.3f, -0.7f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 0.7f, -3f, 3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.41f, 1.59f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.59f, 5f, 5f)
                close()
                moveTo(21.0f, 21.95f)
                curveToRelative(0.03f, 0.55f, -0.4f, 1.02f, -0.95f, 1.05f)
                curveToRelative(-0.55f, 0.03f, -1.02f, -0.39f, -1.05f, -0.95f)
                curveToRelative(-0.23f, -4.41f, -2.13f, -6.05f, -7.0f, -6.05f)
                reflectiveCurveToRelative(-6.77f, 1.64f, -7.0f, 6.05f)
                curveToRelative(-0.03f, 0.55f, -0.52f, 0.97f, -1.05f, 0.95f)
                curveToRelative(-0.55f, -0.03f, -0.97f, -0.5f, -0.95f, -1.05f)
                curveToRelative(0.29f, -5.5f, 3.07f, -7.95f, 9.0f, -7.95f)
                reflectiveCurveToRelative(8.71f, 2.45f, 9.0f, 7.95f)
                close()
            }
        }.also { _DriverMan = it}
