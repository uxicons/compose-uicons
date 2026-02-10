package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeliveryMan: ImageVector? = null

val Icons.Ss.DeliveryMan: ImageVector
    get() = _DeliveryMan ?: UXIcon(name = "DeliveryMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 12f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                close()
                moveTo(10.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(6f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                close()
                moveTo(8.32f, 17.12f)
                lineTo(6.28f, 14f)
                horizontalLineToRelative(-6.28f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.71f)
                curveToRelative(-1.03f, 0.82f, -1.71f, 2.08f, -1.71f, 3.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -0.87f, -0.26f, -1.68f, -0.69f, -2.37f)
                close()
                moveTo(24f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.39f, 0f, -2.58f, -0.82f, -3.15f, -2f)
                horizontalLineToRelative(-6.35f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.89f)
                lineToRelative(-3.37f, -1.72f)
                curveToRelative(-1.0f, -0.52f, -1.63f, -1.54f, -1.63f, -2.67f)
                verticalLineToRelative(-4.28f)
                curveToRelative(0f, -0.72f, 0.28f, -1.36f, 0.8f, -1.81f)
                curveToRelative(0.63f, -0.56f, 1.66f, -0.82f, 2.57f, -0.57f)
                lineToRelative(4.82f, 1.93f)
                horizontalLineToRelative(3.58f)
                lineToRelative(2.23f, 8.5f)
                verticalLineToRelative(0.85f)
                curveToRelative(1.18f, 0.56f, 2f, 1.76f, 2f, 3.15f)
                close()
                moveTo(20f, 17.05f)
                verticalLineToRelative(-0.42f)
                lineToRelative(-1.77f, -6.63f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(-2.81f, -1.12f)
                verticalLineToRelative(5.99f)
                lineToRelative(2f, 1.02f)
                verticalLineToRelative(4.11f)
                horizontalLineToRelative(2.05f)
                curveToRelative(0.22f, -1.53f, 1.42f, -2.73f, 2.95f, -2.95f)
                close()
            }
        }.also { _DeliveryMan = it}
