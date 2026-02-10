package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHome: ImageVector? = null

val Icons.Rs.SmartHome: ImageVector
    get() = _SmartHome ?: UXIcon(name = "SmartHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.81f, 7.63f)
                lineTo(13.91f, 0.66f)
                curveToRelative(-1.12f, -0.88f, -2.69f, -0.88f, -3.81f, 0f)
                lineTo(1.19f, 7.63f)
                curveToRelative(-0.76f, 0.59f, -1.19f, 1.48f, -1.19f, 2.44f)
                verticalLineToRelative(13.93f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, -0.43f, -1.85f, -1.19f, -2.44f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-11.93f)
                curveToRelative(0f, -0.34f, 0.15f, -0.66f, 0.42f, -0.86f)
                lineTo(11.33f, 2.23f)
                curveToRelative(0.4f, -0.31f, 0.95f, -0.31f, 1.35f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.27f, 0.21f, 0.42f, 0.52f, 0.42f, 0.86f)
                verticalLineToRelative(11.93f)
                close()
                moveTo(13.5f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(15.54f, 13.46f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0f)
                close()
                moveTo(18.36f, 10.64f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-2.73f, -2.73f, -7.17f, -2.73f, -9.9f, 0f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(3.51f, -3.51f, 9.22f, -3.51f, 12.73f, 0f)
                close()
            }
        }.also { _SmartHome = it}
