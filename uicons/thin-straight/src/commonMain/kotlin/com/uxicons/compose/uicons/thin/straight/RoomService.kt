package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoomService: ImageVector? = null

val Icons.Ts.RoomService: ImageVector
    get() = _RoomService ?: UXIcon(name = "RoomService") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 20f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -5.9f, -4.67f, -10.73f, -10.5f, -10.99f)
                verticalLineToRelative(-1.07f)
                curveToRelative(0.86f, -0.22f, 1.5f, -1.01f, 1.5f, -1.94f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.93f, 0.64f, 1.71f, 1.5f, 1.94f)
                verticalLineToRelative(1.07f)
                curveToRelative(-5.83f, 0.26f, -10.5f, 5.09f, -10.5f, 10.99f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(2f, 17f)
                curveToRelative(0f, -5.51f, 4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _RoomService = it}
