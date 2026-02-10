package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Demographic: ImageVector? = null

val Icons.Rs.Demographic: ImageVector
    get() = _Demographic ?: UXIcon(name = "Demographic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(14f, 6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(15f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22.5f, 5f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(0.08f, 0.32f, 0.14f, 0.65f, 0.14f, 1f)
                reflectiveCurveToRelative(-0.05f, 0.68f, -0.14f, 1f)
                horizontalLineToRelative(2.14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.73f, 16.32f)
                lineTo(23.96f, 22.54f)
                lineTo(22.54f, 23.96f)
                lineTo(16.32f, 17.73f)
                curveToRelative(-1.72f, 1.41f, -3.92f, 2.27f, -6.32f, 2.27f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveToRelative(4.49f, -10f, 10f, -10f)
                curveToRelative(2.24f, 0f, 4.31f, 0.75f, 5.98f, 2.0f)
                curveToRelative(-0.91f, 0.01f, -1.74f, 0.33f, -2.41f, 0.85f)
                curveToRelative(-0.79f, -0.4f, -1.65f, -0.66f, -2.56f, -0.78f)
                verticalLineToRelative(8.35f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(1.35f, 1.05f, 3.05f, 1.68f, 4.89f, 1.68f)
                curveToRelative(2.95f, 0f, 5.53f, -1.61f, 6.92f, -4f)
                horizontalLineToRelative(2.24f)
                curveToRelative(-0.37f, 0.84f, -0.85f, 1.62f, -1.43f, 2.32f)
                close()
                moveTo(3.69f, 14.9f)
                lineTo(9.01f, 9.59f)
                verticalLineToRelative(-7.52f)
                curveToRelative(-3.94f, 0.49f, -7.01f, 3.86f, -7.01f, 7.93f)
                curveToRelative(0f, 1.85f, 0.64f, 3.55f, 1.69f, 4.91f)
                close()
            }
        }.also { _Demographic = it}
