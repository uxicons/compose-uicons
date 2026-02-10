package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTurret: ImageVector? = null

val Icons.Rs.HouseTurret: ImageVector
    get() = _HouseTurret ?: UXIcon(name = "HouseTurret") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(14f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-6.89f)
                curveToRelative(0f, -0.31f, 0.14f, -0.6f, 0.38f, -0.79f)
                lineToRelative(5.45f, -4.26f)
                curveToRelative(0.1f, -0.08f, 0.24f, -0.08f, 0.34f, 0f)
                lineToRelative(5.45f, 4.26f)
                curveToRelative(0.24f, 0.19f, 0.38f, 0.48f, 0.38f, 0.79f)
                verticalLineToRelative(6.89f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(6f, 19f)
                verticalLineToRelative(-4f)
                close()
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
                lineTo(10f, 5.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(0.03f)
                lineToRelative(2f, 1.56f)
                verticalLineToRelative(-1.54f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineTo(22f, 7.95f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22f, 5.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(12.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _HouseTurret = it}
