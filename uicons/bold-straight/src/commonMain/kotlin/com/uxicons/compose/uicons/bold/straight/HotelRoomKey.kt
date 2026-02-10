package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HotelRoomKey: ImageVector? = null

val Icons.Bs.HotelRoomKey: ImageVector
    get() = _HotelRoomKey ?: UXIcon(name = "HotelRoomKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-1.56f, 0f, -2.82f, -1.2f, -2.97f, -2.71f)
                curveToRelative(-1.19f, 0.17f, -2.5f, 0.41f, -3.8f, 0.64f)
                curveToRelative(-2.97f, 0.53f, -6.03f, 1.07f, -8.23f, 1.07f)
                verticalLineToRelative(-3f)
                curveToRelative(1.98f, 0.0f, 5.15f, -0.57f, 8f, -1.08f)
                verticalLineToRelative(-11.92f)
                curveToRelative(1.71f, 0.25f, 3f, 1.71f, 3f, 3.49f)
                verticalLineToRelative(7.92f)
                curveToRelative(1.53f, -0.24f, 2.92f, -0.41f, 4f, -0.41f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(0f, 7.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-19.95f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                close()
                moveTo(14f, 20.99f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.53f)
                curveToRelative(-1.0f, 0.17f, -2.01f, 0.35f, -3f, 0.52f)
                close()
                moveTo(13f, 12f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(11f, 4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _HotelRoomKey = it}
