package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTurret: ImageVector? = null

val Icons.Sr.HouseTurret: ImageVector
    get() = _HouseTurret ?: UXIcon(name = "HouseTurret") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                lineTo(12f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(24f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(14.08f, 11.41f)
                lineToRelative(-3f, -2.35f)
                curveToRelative(-1.81f, -1.42f, -4.35f, -1.42f, -6.16f, 0f)
                lineToRelative(-3f, 2.35f)
                curveToRelative(-1.22f, 0.95f, -1.92f, 2.39f, -1.92f, 3.94f)
                verticalLineToRelative(4.15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-4.15f)
                curveToRelative(0f, -1.55f, -0.7f, -2.98f, -1.92f, -3.94f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(22f, 9f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.3f, -1.96f, 4.16f, -4.29f, 3.99f)
                lineToRelative(-1.52f, 0.0f)
                curveToRelative(1.12f, -1.17f, 1.81f, -2.75f, 1.81f, -4.49f)
                verticalLineToRelative(-4.15f)
                curveToRelative(0f, -2.17f, -0.98f, -4.17f, -2.69f, -5.51f)
                lineToRelative(-1.07f, -0.84f)
                horizontalLineToRelative(7.75f)
                close()
            }
        }.also { _HouseTurret = it}
