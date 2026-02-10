package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binary: ImageVector? = null

val Icons.Ts.Binary: ImageVector
    get() = _Binary ?: UXIcon(name = "Binary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.56f, 4.15f)
                lineToRelative(-0.72f, -0.7f)
                lineToRelative(3.36f, -3.45f)
                horizontalLineToRelative(0.8f)
                lineTo(19f, 11f)
                horizontalLineToRelative(-1f)
                lineTo(18f, 1.64f)
                lineToRelative(-2.44f, 2.51f)
                close()
                moveTo(7.2f, 13f)
                lineToRelative(-3.36f, 3.45f)
                lineToRelative(0.72f, 0.7f)
                lineToRelative(2.44f, -2.51f)
                verticalLineToRelative(9.36f)
                horizontalLineToRelative(1f)
                lineTo(8f, 13f)
                horizontalLineToRelative(-0.8f)
                close()
                moveTo(12f, 7f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-3f)
                curveTo(4f, 1.79f, 5.79f, 0f, 8f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20f, 17f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(19f, 17f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Binary = it}
