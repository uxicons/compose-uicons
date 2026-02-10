package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTurret: ImageVector? = null

val Icons.Ss.HouseTurret: ImageVector
    get() = _HouseTurret ?: UXIcon(name = "HouseTurret") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(10f, 4.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2f)
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
                moveTo(22f, 9f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-4f)
                lineTo(18f, 15.11f)
                curveToRelative(0f, -1.55f, -0.7f, -2.98f, -1.92f, -3.94f)
                lineToRelative(-2.78f, -2.17f)
                horizontalLineToRelative(8.7f)
                close()
            }
        }.also { _HouseTurret = it}
