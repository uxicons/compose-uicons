package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Tr.LampFloor: ImageVector
    get() = _LampFloor ?: UXIcon(name = "LampFloor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.0f, 11f)
                curveToRelative(0.88f, 0f, 1.72f, -0.39f, 2.29f, -1.06f)
                reflectiveCurveToRelative(0.81f, -1.56f, 0.67f, -2.43f)
                lineToRelative(-0.83f, -5f)
                curveToRelative(-0.24f, -1.45f, -1.49f, -2.51f, -2.96f, -2.51f)
                lineTo(7.83f, 0.0f)
                curveToRelative(-1.47f, 0f, -2.72f, 1.05f, -2.96f, 2.51f)
                lineToRelative(-0.83f, 5f)
                curveToRelative(-0.15f, 0.87f, 0.1f, 1.76f, 0.67f, 2.43f)
                curveToRelative(0.57f, 0.67f, 1.41f, 1.06f, 2.29f, 1.06f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(5.47f, 9.29f)
                curveToRelative(-0.38f, -0.45f, -0.54f, -1.04f, -0.45f, -1.62f)
                lineToRelative(0.83f, -5f)
                curveToRelative(0.16f, -0.97f, 0.99f, -1.67f, 1.97f, -1.67f)
                horizontalLineToRelative(8.33f)
                curveToRelative(0.98f, 0f, 1.81f, 0.7f, 1.97f, 1.67f)
                lineToRelative(0.83f, 5f)
                curveToRelative(0.1f, 0.58f, -0.07f, 1.17f, -0.45f, 1.62f)
                reflectiveCurveToRelative(-0.94f, 0.71f, -1.53f, 0.71f)
                lineTo(7f, 10.0f)
                curveToRelative(-0.59f, 0f, -1.15f, -0.26f, -1.53f, -0.71f)
                close()
            }
        }.also { _LampFloor = it}
