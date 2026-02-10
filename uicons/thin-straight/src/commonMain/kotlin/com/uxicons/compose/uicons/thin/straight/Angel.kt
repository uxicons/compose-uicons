package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angel: ImageVector? = null

val Icons.Ts.Angel: ImageVector
    get() = _Angel ?: UXIcon(name = "Angel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 5.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(13.5f, 5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(7f, 3f)
                curveToRelative(0f, -1.71f, 2.15f, -3f, 5f, -3f)
                reflectiveCurveToRelative(5f, 1.29f, 5f, 3f)
                curveToRelative(0f, 0.72f, -0.4f, 1.36f, -1.06f, 1.87f)
                curveToRelative(-0.06f, -0.37f, -0.18f, -0.72f, -0.33f, -1.05f)
                curveToRelative(0.24f, -0.25f, 0.39f, -0.54f, 0.39f, -0.85f)
                curveToRelative(0f, -1.12f, -1.72f, -1.97f, -4f, -1.97f)
                reflectiveCurveToRelative(-4f, 0.85f, -4f, 1.97f)
                curveToRelative(0f, 0.31f, 0.15f, 0.59f, 0.39f, 0.85f)
                curveToRelative(-0.16f, 0.33f, -0.27f, 0.68f, -0.33f, 1.05f)
                curveToRelative(-0.66f, -0.51f, -1.06f, -1.15f, -1.06f, -1.87f)
                close()
                moveTo(20.5f, 6f)
                curveToRelative(-3.39f, 0f, -6.05f, 3.01f, -6.57f, 3.65f)
                curveToRelative(-1.25f, 0.47f, -2.62f, 0.47f, -3.86f, 0f)
                curveToRelative(-0.52f, -0.63f, -3.18f, -3.65f, -6.57f, -3.65f)
                curveTo(0.17f, 6f, 0f, 14.75f, 0f, 16.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.24f)
                lineToRelative(-1.28f, 2.76f)
                horizontalLineToRelative(18.57f)
                lineToRelative(-1.28f, -2.76f)
                verticalLineToRelative(-2.24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.75f, -0.17f, -10.5f, -3.5f, -10.5f)
                close()
                moveTo(3f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.06f, -3.9f, 0.84f, -9f, 2.5f, -9f)
                curveToRelative(2.71f, 0f, 5.01f, 2.38f, 5.67f, 3.14f)
                lineToRelative(-4.17f, 8.96f)
                verticalLineToRelative(-1.1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(4.29f, 23f)
                lineToRelative(5.74f, -12.31f)
                curveToRelative(1.28f, 0.41f, 2.67f, 0.41f, 3.95f, 0f)
                lineToRelative(5.74f, 12.31f)
                lineTo(4.29f, 23f)
                close()
                moveTo(21f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.1f)
                lineToRelative(-4.17f, -8.96f)
                curveToRelative(0.66f, -0.76f, 2.96f, -3.14f, 5.67f, -3.14f)
                curveToRelative(1.65f, 0f, 2.43f, 5.1f, 2.5f, 9f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }.also { _Angel = it}
