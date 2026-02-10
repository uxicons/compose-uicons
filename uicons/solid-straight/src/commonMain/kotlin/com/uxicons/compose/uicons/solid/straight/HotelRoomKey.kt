package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HotelRoomKey: ImageVector? = null

val Icons.Ss.HotelRoomKey: ImageVector
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
                moveTo(21.5f, 16f)
                curveToRelative(-1.22f, 0f, -2.78f, 0.22f, -4.5f, 0.52f)
                verticalLineToRelative(-9.52f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                verticalLineToRelative(9.82f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-9.82f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-2.81f)
                curveToRelative(-0.77f, 0.07f, -1.49f, 0.16f, -2.13f, 0.28f)
                curveToRelative(-3.23f, 0.58f, -6.56f, 0.53f, -8.87f, 0.53f)
                verticalLineToRelative(-2f)
                curveToRelative(2.16f, 0f, 5.68f, 0.02f, 8.5f, -0.5f)
                curveToRelative(1.54f, -0.29f, 3.16f, -0.41f, 4.56f, -0.46f)
                curveToRelative(0.25f, 1.12f, 1.25f, 1.96f, 2.44f, 1.96f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _HotelRoomKey = it}
