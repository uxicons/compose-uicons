package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSlice: ImageVector? = null

val Icons.Ts.BreadSlice: ImageVector
    get() = _BreadSlice ?: UXIcon(name = "BreadSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 4.68f)
                curveToRelative(0f, 1.53f, -0.74f, 2.93f, -2f, 3.81f)
                verticalLineToRelative(15.51f)
                lineTo(2f, 24.0f)
                verticalLineToRelative(-15.51f)
                curveToRelative(-1.26f, -0.88f, -2f, -2.29f, -2f, -3.81f)
                curveTo(0f, 2.1f, 2.1f, 0f, 4.68f, 0f)
                horizontalLineToRelative(14.64f)
                curveToRelative(2.58f, 0f, 4.68f, 2.1f, 4.68f, 4.68f)
                close()
                moveTo(23f, 4.68f)
                curveToRelative(0f, -2.03f, -1.65f, -3.68f, -3.68f, -3.68f)
                lineTo(4.68f, 1f)
                curveToRelative(-2.03f, 0f, -3.68f, 1.65f, -3.68f, 3.68f)
                curveToRelative(0f, 1.27f, 0.66f, 2.44f, 1.76f, 3.12f)
                lineToRelative(0.24f, 0.15f)
                verticalLineToRelative(15.06f)
                horizontalLineToRelative(18f)
                lineTo(21f, 7.94f)
                lineToRelative(0.24f, -0.15f)
                curveToRelative(1.1f, -0.68f, 1.76f, -1.84f, 1.76f, -3.12f)
                close()
            }
        }.also { _BreadSlice = it}
