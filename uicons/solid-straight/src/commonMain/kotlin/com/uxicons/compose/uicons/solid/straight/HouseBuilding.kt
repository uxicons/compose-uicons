package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseBuilding: ImageVector? = null

val Icons.Ss.HouseBuilding: ImageVector
    get() = _HouseBuilding ?: UXIcon(name = "HouseBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(13f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.22f, 0.12f, 0.43f, 0.25f, 0.63f, 0.41f)
                lineToRelative(3.37f, 2.64f)
                verticalLineToRelative(-0.54f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.11f)
                lineToRelative(0.08f, 0.06f)
                curveToRelative(1.22f, 0.95f, 1.92f, 2.39f, 1.92f, 3.94f)
                verticalLineToRelative(1.89f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(14.85f, 12.75f)
                lineToRelative(-5.45f, -4.26f)
                curveToRelative(-0.82f, -0.65f, -1.98f, -0.65f, -2.8f, 0f)
                lineTo(1.15f, 12.75f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.44f, -1.15f, 2.36f)
                verticalLineToRelative(8.89f)
                lineTo(16f, 24f)
                lineTo(16f, 15.11f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
                moveTo(10f, 19f)
                lineTo(6f, 19f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _HouseBuilding = it}
