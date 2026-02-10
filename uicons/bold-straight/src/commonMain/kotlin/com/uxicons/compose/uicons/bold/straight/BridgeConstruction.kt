package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BridgeConstruction: ImageVector? = null

val Icons.Bs.BridgeConstruction: ImageVector
    get() = _BridgeConstruction ?: UXIcon(name = "BridgeConstruction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10.9f)
                lineToRelative(-1.36f, 0.12f)
                curveToRelative(-2.07f, 0.19f, -3.63f, 1.9f, -3.63f, 3.98f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(2.23f, 0f, 4.21f, 1.05f, 5.49f, 2.67f)
                curveToRelative(0.88f, -1.12f, 2.09f, -1.97f, 3.51f, -2.38f)
                verticalLineToRelative(-2.29f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(7f, 3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _BridgeConstruction = it}
