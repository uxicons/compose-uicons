package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseSignal: ImageVector? = null

val Icons.Rs.HouseSignal: ImageVector
    get() = _HouseSignal ?: UXIcon(name = "HouseSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.18f)
                verticalLineToRelative(9.82f)
                horizontalLineToRelative(-9.94f)
                curveToRelative(-0.27f, -0.69f, -0.58f, -1.36f, -0.95f, -2f)
                horizontalLineToRelative(8.89f)
                verticalLineToRelative(-7.82f)
                curveToRelative(0f, -0.62f, -0.28f, -1.19f, -0.77f, -1.57f)
                lineToRelative(-5.62f, -4.4f)
                curveToRelative(-0.36f, -0.28f, -0.87f, -0.28f, -1.23f, 0f)
                lineToRelative(-5.62f, 4.4f)
                curveToRelative(-0.49f, 0.38f, -0.77f, 0.96f, -0.77f, 1.57f)
                verticalLineToRelative(2.71f)
                curveToRelative(-0.64f, -0.37f, -1.3f, -0.69f, -2f, -0.95f)
                verticalLineToRelative(-1.76f)
                curveToRelative(0f, -1.24f, 0.56f, -2.39f, 1.53f, -3.15f)
                lineTo(13.15f, 0.64f)
                curveToRelative(1.09f, -0.85f, 2.61f, -0.85f, 3.7f, 0f)
                lineToRelative(5.62f, 4.4f)
                curveToRelative(0.98f, 0.76f, 1.53f, 1.91f, 1.53f, 3.15f)
                close()
                moveTo(1.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1f, 16f)
                verticalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(1f, 11f)
                verticalLineToRelative(2f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
                close()
                moveTo(17f, 9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _HouseSignal = it}
