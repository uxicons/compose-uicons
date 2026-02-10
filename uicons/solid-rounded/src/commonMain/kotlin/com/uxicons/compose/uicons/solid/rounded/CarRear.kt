package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarRear: ImageVector? = null

val Icons.Sr.CarRear: ImageVector
    get() = _CarRear ?: UXIcon(name = "CarRear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.61f, 9f)
                lineTo(1.39f, 9f)
                lineToRelative(1.71f, -4.71f)
                curveToRelative(0.71f, -1.97f, 2.6f, -3.29f, 4.7f, -3.29f)
                horizontalLineToRelative(8.4f)
                curveToRelative(2.1f, 0f, 3.98f, 1.32f, 4.7f, 3.29f)
                lineToRelative(1.71f, 4.71f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.04f, -1.24f, 3.8f, -3f, 4.58f)
                verticalLineToRelative(1.42f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                lineTo(7f, 21f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1.42f)
                curveToRelative(-1.76f, -0.77f, -3f, -2.53f, -3f, -4.58f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(0.09f, 13f)
                curveToRelative(0.07f, -0.44f, 0.16f, -0.86f, 0.32f, -1.28f)
                lineToRelative(0.26f, -0.72f)
                horizontalLineToRelative(22.67f)
                lineToRelative(0.26f, 0.72f)
                curveToRelative(0.15f, 0.42f, 0.25f, 0.85f, 0.32f, 1.28f)
                horizontalLineToRelative(-2.91f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16f, 17f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _CarRear = it}
