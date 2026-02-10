package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BridgeCircleCheck: ImageVector? = null

val Icons.Rs.BridgeCircleCheck: ImageVector
    get() = _BridgeCircleCheck ?: UXIcon(name = "BridgeCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 24f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(17f, 12f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(16.36f, 20f)
                curveToRelative(-0.45f, 0f, -0.86f, -0.17f, -1.18f, -0.49f)
                lineToRelative(-1.85f, -1.79f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.63f, 1.58f)
                lineToRelative(3.23f, -3.17f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.46f, 3.4f)
                curveToRelative(-0.31f, 0.31f, -0.73f, 0.48f, -1.17f, 0.48f)
                close()
                moveTo(0f, 0f)
                lineTo(0f, 12.93f)
                lineToRelative(0.83f, 0.14f)
                curveToRelative(2.41f, 0.41f, 4.17f, 2.48f, 4.17f, 4.93f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.3f, 0.51f, -2.47f, 1.32f, -3.36f)
                curveToRelative(0.34f, -1.25f, 0.93f, -2.39f, 1.73f, -3.36f)
                curveToRelative(-1.71f, 0.5f, -3.15f, 1.65f, -4.04f, 3.15f)
                curveToRelative(-0.88f, -1.48f, -2.28f, -2.63f, -4.01f, -3.14f)
                lineTo(2.0f, 7f)
                lineTo(22f, 7f)
                verticalLineToRelative(2.52f)
                curveToRelative(0.76f, 0.51f, 1.43f, 1.12f, 2f, 1.83f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                lineTo(13f, 2f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(-3.5f)
                lineTo(7.5f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(2f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                lineTo(2f, 5f)
                lineTo(2f, 2f)
                close()
                moveTo(18.5f, 5f)
                lineTo(18.5f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }.also { _BridgeCircleCheck = it}
