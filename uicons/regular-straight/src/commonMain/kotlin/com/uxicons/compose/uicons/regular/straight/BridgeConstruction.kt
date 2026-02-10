package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BridgeConstruction: ImageVector? = null

val Icons.Rs.BridgeConstruction: ImageVector
    get() = _BridgeConstruction ?: UXIcon(name = "BridgeConstruction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(1.64f, 0f, 3.09f, 0.81f, 4f, 2.03f)
                curveToRelative(0.91f, -1.23f, 2.36f, -2.03f, 4f, -2.03f)
                reflectiveCurveToRelative(3.09f, 0.81f, 4.0f, 2.03f)
                curveToRelative(0.72f, -0.97f, 1.77f, -1.68f, 3.0f, -1.93f)
                verticalLineToRelative(-3.1f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.51f)
                lineToRelative(2f, 2f)
                close()
                moveTo(6f, 6f)
                lineTo(5.96f, 5.28f)
                lineTo(4.68f, 4f)
                horizontalLineToRelative(-0.68f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BridgeConstruction = it}
