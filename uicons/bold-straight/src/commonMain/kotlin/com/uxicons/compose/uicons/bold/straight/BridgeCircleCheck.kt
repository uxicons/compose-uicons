package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BridgeCircleCheck: ImageVector? = null

val Icons.Bs.BridgeCircleCheck: ImageVector
    get() = _BridgeCircleCheck ?: UXIcon(name = "BridgeCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                lineTo(0f, 13.9f)
                lineToRelative(1.36f, 0.12f)
                curveToRelative(2.07f, 0.19f, 3.63f, 1.9f, 3.63f, 3.98f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.85f, 1.27f, -3.4f, 2.99f, -3.85f)
                curveToRelative(0.66f, -1.19f, 1.61f, -2.19f, 2.76f, -2.92f)
                curveToRelative(-0.56f, -0.15f, -1.15f, -0.23f, -1.75f, -0.23f)
                curveToRelative(-2.23f, 0f, -4.21f, 1.05f, -5.49f, 2.67f)
                curveToRelative(-0.88f, -1.12f, -2.09f, -1.97f, -3.51f, -2.38f)
                verticalLineToRelative(-3.29f)
                lineTo(21f, 8.0f)
                verticalLineToRelative(2.59f)
                curveToRelative(1.16f, 0.47f, 2.19f, 1.21f, 3f, 2.13f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(21f, 5f)
                horizontalLineToRelative(-4f)
                lineTo(17f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 3f)
                lineTo(7f, 3f)
                verticalLineToRelative(2f)
                lineTo(3f, 5f)
                lineTo(3f, 3f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.75f, 20.44f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
                close()
            }
        }.also { _BridgeCircleCheck = it}
