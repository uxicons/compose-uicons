package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleList: ImageVector? = null

val Icons.Ts.RectangleList: ImageVector
    get() = _RectangleList ?: UXIcon(name = "RectangleList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 1f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 22f)
                lineTo(1f, 22f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(18.5f)
                close()
                moveTo(9f, 6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 6.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(9f, 11.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(9f, 17f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 17.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _RectangleList = it}
