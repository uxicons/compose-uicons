package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VrCardboard: ImageVector? = null

val Icons.Bs.VrCardboard: ImageVector
    get() = _VrCardboard ?: UXIcon(name = "VrCardboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(9.36f)
                lineToRelative(2.2f, -3.77f)
                curveToRelative(0.13f, -0.22f, 0.33f, -0.25f, 0.44f, -0.25f)
                reflectiveCurveToRelative(0.31f, 0.03f, 0.44f, 0.25f)
                lineToRelative(2.2f, 3.77f)
                horizontalLineToRelative(9.36f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-4.64f)
                lineToRelative(-1.33f, -2.29f)
                curveToRelative(-0.64f, -1.09f, -1.77f, -1.74f, -3.03f, -1.74f)
                reflectiveCurveToRelative(-2.39f, 0.65f, -3.03f, 1.74f)
                lineToRelative(-1.33f, 2.29f)
                lineTo(3f, 18f)
                lineTo(3f, 6.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(19f, 10.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(10f, 10.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _VrCardboard = it}
