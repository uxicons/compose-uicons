package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverMan: ImageVector? = null

val Icons.Sc.DriverMan: ImageVector
    get() = _DriverMan ?: UXIcon(name = "DriverMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.0f, 21.95f)
                curveToRelative(0.04f, 0.56f, -0.44f, 1.06f, -1.0f, 1.05f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(0.03f, -0.32f, 0.06f, -0.64f, 0.06f, -1f)
                curveToRelative(0f, -4.15f, -1.85f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 1.85f, -6f, 6f)
                curveToRelative(0f, 0.36f, 0.03f, 0.68f, 0.06f, 1f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-0.56f, 0.01f, -1.04f, -0.5f, -1.0f, -1.05f)
                curveToRelative(0.29f, -5.5f, 3.07f, -7.95f, 9.0f, -7.95f)
                reflectiveCurveToRelative(8.71f, 2.45f, 9.0f, 7.95f)
                close()
                moveTo(12f, 13f)
                curveToRelative(4.15f, 0f, 6f, -1.85f, 6f, -6f)
                reflectiveCurveToRelative(-1.85f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.03f, 0f, -4f, 0.97f, -4f, 4f)
                curveToRelative(0f, 0.36f, 0.02f, 0.69f, 0.05f, 1f)
                horizontalLineToRelative(7.91f)
                curveToRelative(0.03f, -0.31f, 0.05f, -0.64f, 0.05f, -1f)
                curveToRelative(0f, -3.03f, -0.97f, -4f, -4f, -4f)
                close()
            }
        }.also { _DriverMan = it}
