package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeliveryMan: ImageVector? = null

val Icons.Bs.DeliveryMan: ImageVector
    get() = _DeliveryMan ?: UXIcon(name = "DeliveryMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                close()
                moveTo(6f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-5.28f)
                lineToRelative(-1.61f, -0.83f)
                curveToRelative(-1.17f, -0.6f, -1.89f, -1.79f, -1.89f, -3.11f)
                verticalLineToRelative(-3.23f)
                curveToRelative(0f, -0.33f, 0f, -1.33f, 0.78f, -2.01f)
                curveToRelative(0.94f, -0.76f, 1.93f, -0.56f, 2.73f, -0.4f)
                lineToRelative(5.26f, 1.86f)
                horizontalLineToRelative(3.89f)
                reflectiveCurveToRelative(1.85f, 7.28f, 1.85f, 7.5f)
                verticalLineToRelative(2.68f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                close()
                moveTo(14f, 13.89f)
                verticalLineToRelative(4.11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.42f)
                curveToRelative(-0.08f, -0.48f, -0.6f, -2.51f, -1.15f, -4.58f)
                horizontalLineToRelative(-2.11f)
                lineToRelative(-3.74f, -1.32f)
                verticalLineToRelative(3.19f)
                lineToRelative(2f, 1.03f)
                close()
                moveTo(8.35f, 17.21f)
                curveToRelative(0.4f, 0.67f, 0.65f, 1.45f, 0.65f, 2.29f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(6.32f)
                lineToRelative(2.03f, 3.21f)
                close()
                moveTo(6f, 19.5f)
                curveToRelative(-0.0f, -0.81f, -0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _DeliveryMan = it}
