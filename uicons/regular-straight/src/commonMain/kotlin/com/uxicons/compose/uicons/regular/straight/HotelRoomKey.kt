package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HotelRoomKey: ImageVector? = null

val Icons.Rs.HotelRoomKey: ImageVector
    get() = _HotelRoomKey ?: UXIcon(name = "HotelRoomKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 18.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.19f, 0f, -2.19f, -0.84f, -2.44f, -1.96f)
                curveToRelative(-1.4f, 0.05f, -3.02f, 0.17f, -4.56f, 0.46f)
                curveToRelative(-2.82f, 0.52f, -6.34f, 0.5f, -8.5f, 0.5f)
                verticalLineToRelative(-2f)
                curveToRelative(2.11f, -0.0f, 6.19f, -0.58f, 9f, -1.12f)
                verticalLineToRelative(-9.88f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-17f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9.52f)
                curveToRelative(1.72f, -0.3f, 3.28f, -0.52f, 4.5f, -0.52f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
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
                moveTo(15f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.81f)
                curveToRelative(-0.71f, 0.07f, -1.39f, 0.15f, -2f, 0.26f)
                close()
            }
        }.also { _HotelRoomKey = it}
