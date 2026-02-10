package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BridgeCircleCheck: ImageVector? = null

val Icons.Ss.BridgeCircleCheck: ImageVector
    get() = _BridgeCircleCheck ?: UXIcon(name = "BridgeCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 20.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.62f, 3.62f)
                close()
                moveTo(18f, 10f)
                curveToRelative(2.39f, 0f, 4.53f, 1.06f, 6f, 2.72f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 12.93f)
                lineToRelative(0.83f, 0.14f)
                curveToRelative(2.41f, 0.41f, 4.17f, 2.48f, 4.17f, 4.93f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.67f, 2.11f, -4.84f, 4.74f, -4.97f)
                curveToRelative(1.47f, -1.84f, 3.72f, -3.03f, 6.26f, -3.03f)
                close()
                moveTo(18.5f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                lineTo(18.5f, 2f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                lineTo(13f, 2f)
                close()
                moveTo(5.5f, 5f)
                lineTo(2f, 5f)
                lineTo(2f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(7.5f, 5f)
                lineTo(7.5f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }.also { _BridgeCircleCheck = it}
