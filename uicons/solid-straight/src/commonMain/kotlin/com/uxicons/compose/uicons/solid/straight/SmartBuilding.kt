package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartBuilding: ImageVector? = null

val Icons.Ss.SmartBuilding: ImageVector
    get() = _SmartBuilding ?: UXIcon(name = "SmartBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.28f)
                curveToRelative(-0.35f, -0.59f, -0.98f, -1f, -1.72f, -1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.72f, -1f)
                horizontalLineToRelative(4.28f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-2.28f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.28f)
                curveToRelative(0.35f, 0.59f, 0.98f, 1f, 1.72f, 1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                curveToRelative(-0.74f, 0f, -1.38f, 0.41f, -1.72f, 1f)
                horizontalLineToRelative(-2.28f)
                verticalLineToRelative(-3f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(11f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _SmartBuilding = it}
