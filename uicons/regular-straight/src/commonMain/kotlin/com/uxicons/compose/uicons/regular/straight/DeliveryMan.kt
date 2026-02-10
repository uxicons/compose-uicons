package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeliveryMan: ImageVector? = null

val Icons.Rs.DeliveryMan: ImageVector
    get() = _DeliveryMan ?: UXIcon(name = "DeliveryMan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6f)
                close()
                moveTo(2f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(4f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 17.35f)
                verticalLineToRelative(-0.85f)
                lineToRelative(-2.23f, -8.5f)
                horizontalLineToRelative(-3.58f)
                lineToRelative(-4.82f, -1.93f)
                curveToRelative(-0.91f, -0.25f, -1.94f, 0.01f, -2.57f, 0.57f)
                curveToRelative(-0.52f, 0.45f, -0.8f, 1.09f, -0.8f, 1.81f)
                verticalLineToRelative(4.28f)
                curveToRelative(0f, 1.13f, 0.62f, 2.15f, 1.63f, 2.67f)
                lineToRelative(3.37f, 1.72f)
                verticalLineToRelative(2.89f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.35f)
                curveToRelative(0.56f, 1.18f, 1.76f, 2f, 3.15f, 2f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.39f, -0.82f, -2.58f, -2f, -3.15f)
                close()
                moveTo(10f, 12.72f)
                verticalLineToRelative(-4.28f)
                curveToRelative(0f, -0.18f, 0.06f, -0.25f, 0.12f, -0.3f)
                curveToRelative(0.13f, -0.12f, 0.37f, -0.18f, 0.64f, -0.16f)
                lineToRelative(0.24f, 0.1f)
                verticalLineToRelative(5.77f)
                lineToRelative(-0.46f, -0.23f)
                curveToRelative(-0.33f, -0.17f, -0.54f, -0.51f, -0.54f, -0.89f)
                close()
                moveTo(17.05f, 20f)
                horizontalLineToRelative(-2.05f)
                verticalLineToRelative(-4.11f)
                lineToRelative(-2f, -1.02f)
                verticalLineToRelative(-5.99f)
                lineToRelative(2.81f, 1.12f)
                horizontalLineToRelative(2.42f)
                lineToRelative(1.77f, 6.63f)
                verticalLineToRelative(0.42f)
                curveToRelative(-1.53f, 0.22f, -2.73f, 1.42f, -2.95f, 2.95f)
                close()
                moveTo(20.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.32f, 17.12f)
                lineToRelative(-2.04f, -3.12f)
                horizontalLineToRelative(-6.28f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.71f)
                curveToRelative(-1.03f, 0.82f, -1.71f, 2.08f, -1.71f, 3.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -0.87f, -0.26f, -1.68f, -0.69f, -2.37f)
                close()
                moveTo(4.5f, 22f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(1.39f, 0f, 2.5f, 1.14f, 2.5f, 2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _DeliveryMan = it}
