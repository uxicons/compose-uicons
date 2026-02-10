package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Ts.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.73f, 8.79f)
                lineToRelative(0.27f, 0.17f)
                lineToRelative(0.27f, -0.17f)
                curveToRelative(0.19f, -0.12f, 4.73f, -3.08f, 4.73f, -5.87f)
                curveToRelative(0f, -1.62f, -1.23f, -2.93f, -2.75f, -2.93f)
                curveToRelative(-0.95f, 0f, -1.76f, 0.43f, -2.25f, 1.13f)
                curveToRelative(-0.49f, -0.69f, -1.3f, -1.13f, -2.25f, -1.13f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.31f, -2.75f, 2.93f)
                curveToRelative(0f, 2.79f, 4.54f, 5.74f, 4.73f, 5.87f)
                close()
                moveTo(9.75f, 1f)
                curveToRelative(1.01f, 0f, 1.75f, 0.74f, 1.75f, 1.75f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0f, -1.01f, 0.74f, -1.75f, 1.75f, -1.75f)
                curveToRelative(0.96f, 0f, 1.75f, 0.87f, 1.75f, 1.93f)
                curveToRelative(0f, 1.73f, -2.67f, 3.93f, -4f, 4.84f)
                curveToRelative(-1.33f, -0.91f, -4f, -3.11f, -4f, -4.84f)
                curveToRelative(0f, -1.06f, 0.79f, -1.93f, 1.75f, -1.93f)
                close()
                moveTo(9f, 14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
                moveTo(14f, 14f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(16f, 18.71f)
                verticalLineToRelative(5.29f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.29f)
                lineToRelative(-5.85f, -5.85f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(5.85f, 5.85f)
                horizontalLineToRelative(6.59f)
                lineToRelative(5.85f, -5.85f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-5.85f, 5.85f)
                close()
            }
        }.also { _Life = it}
