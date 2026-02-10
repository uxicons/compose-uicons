package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartBuilding: ImageVector? = null

val Icons.Bs.SmartBuilding: ImageVector
    get() = _SmartBuilding ?: UXIcon(name = "SmartBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 18f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.51f)
                curveToRelative(-0.46f, -0.6f, -1.17f, -1f, -1.99f, -1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.81f, 0f, 1.53f, -0.4f, 1.99f, -1f)
                horizontalLineToRelative(5.51f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.46f, 0.6f, 1.17f, 1f, 1.99f, 1f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.81f, 0f, -1.53f, 0.4f, -1.99f, 1f)
                horizontalLineToRelative(-2.51f)
                close()
                moveTo(6f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(13f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _SmartBuilding = it}
