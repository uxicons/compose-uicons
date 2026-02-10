package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseReturn: ImageVector? = null

val Icons.Bs.HouseReturn: ImageVector
    get() = _HouseReturn ?: UXIcon(name = "HouseReturn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3f, 14f)
                verticalLineToRelative(-6.51f)
                curveToRelative(0f, -0.26f, 0.12f, -0.5f, 0.32f, -0.66f)
                lineToRelative(4.67f, -3.65f)
                curveToRelative(0.3f, -0.24f, 0.72f, -0.24f, 1.03f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(2.99f, 2.34f, 2.99f, 2.34f)
                verticalLineToRelative(-3.01f)
                curveToRelative(0f, -0.25f, 0.02f, -0.5f, 0.06f, -0.75f)
                lineToRelative(-1.2f, -0.94f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-1.39f, -1.09f, -3.33f, -1.09f, -4.72f, 0f)
                lineTo(1.47f, 4.47f)
                curveToRelative(-0.94f, 0.73f, -1.47f, 1.83f, -1.47f, 3.02f)
                verticalLineToRelative(9.52f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.03f)
                lineToRelative(-1.22f, -1.97f)
                lineTo(3f, 14f)
                close()
                moveTo(19.26f, 6.35f)
                reflectiveCurveToRelative(-0.6f, -0.35f, -1.44f, -0.35f)
                curveToRelative(-1.39f, 0f, -2.66f, 0.98f, -3.11f, 2.41f)
                lineToRelative(-0.49f, 1.61f)
                lineToRelative(-4.02f, 2.49f)
                lineToRelative(1.58f, 2.55f)
                lineToRelative(3.21f, -1.99f)
                verticalLineToRelative(2.04f)
                lineToRelative(-3f, 2.1f)
                verticalLineToRelative(6.78f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.22f)
                lineToRelative(3.51f, -2.46f)
                curveToRelative(0.94f, -0.65f, 1.49f, -1.73f, 1.49f, -2.87f)
                verticalLineToRelative(-3.19f)
                lineToRelative(1f, 0.59f)
                verticalLineToRelative(3.14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.86f)
                lineToRelative(-4.74f, -2.79f)
                close()
                moveTo(19.58f, 17.99f)
                lineToRelative(-1.84f, 1.3f)
                lineToRelative(1.93f, 4.71f)
                horizontalLineToRelative(3.24f)
                lineToRelative(-2.67f, -6.52f)
                curveToRelative(-0.2f, 0.18f, -0.42f, 0.35f, -0.66f, 0.5f)
                close()
                moveTo(5f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _HouseReturn = it}
