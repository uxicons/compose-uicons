package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tubes: ImageVector? = null

val Icons.Ts.Tubes: ImageVector
    get() = _Tubes ?: UXIcon(name = "Tubes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                lineTo(10f, 1f)
                horizontalLineToRelative(1f)
                lineTo(11f, 0f)
                close()
                moveTo(6f, 23f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(9f, 9f)
                lineTo(3f, 9f)
                lineTo(3f, 1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 0f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                lineTo(22f, 1f)
                horizontalLineToRelative(1f)
                lineTo(23f, 0f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(10f)
                close()
                moveTo(21f, 9f)
                horizontalLineToRelative(-6f)
                lineTo(15f, 1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Tubes = it}
