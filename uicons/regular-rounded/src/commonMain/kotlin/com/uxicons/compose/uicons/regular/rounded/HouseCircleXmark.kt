package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleXmark: ImageVector? = null

val Icons.Rr.HouseCircleXmark: ImageVector
    get() = _HouseCircleXmark ?: UXIcon(name = "HouseCircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.71f, 15.71f)
                lineToRelative(-1.29f, 1.29f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(9f, 22f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -1.0f, 0.49f, -1.93f, 1.32f, -2.49f)
                lineToRelative(7f, -4.72f)
                curveToRelative(1.02f, -0.69f, 2.34f, -0.69f, 3.35f, 0f)
                lineToRelative(7.0f, 4.72f)
                curveToRelative(0.66f, 0.45f, 1.13f, 1.16f, 1.27f, 1.94f)
                curveToRelative(0.1f, 0.54f, 0.62f, 0.9f, 1.17f, 0.8f)
                curveToRelative(0.54f, -0.1f, 0.9f, -0.62f, 0.8f, -1.17f)
                curveToRelative(-0.23f, -1.23f, -0.93f, -2.32f, -1.92f, -3.07f)
                lineTo(14.8f, 0.85f)
                curveToRelative(-1.7f, -1.15f, -3.9f, -1.15f, -5.59f, 0f)
                lineTo(2.2f, 5.58f)
                curveToRelative(-1.38f, 0.93f, -2.2f, 2.48f, -2.2f, 4.14f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _HouseCircleXmark = it}
