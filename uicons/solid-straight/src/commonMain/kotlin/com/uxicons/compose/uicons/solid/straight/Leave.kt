package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leave: ImageVector? = null

val Icons.Ss.Leave: ImageVector
    get() = _Leave ?: UXIcon(name = "Leave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.47f, 16.25f)
                lineToRelative(-2.86f, 2.86f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.7f, -1.7f)
                horizontalLineToRelative(-6.89f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.96f)
                lineToRelative(-1.76f, -1.76f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.86f, 2.86f)
                curveToRelative(0.71f, 0.71f, 0.71f, 1.85f, 0f, 2.56f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.0f)
                lineTo(0f, 24.0f)
                lineTo(0f, 4.2f)
                curveTo(0f, 2.77f, 1.01f, 1.54f, 2.41f, 1.26f)
                lineTo(8.41f, 0.06f)
                curveToRelative(0.89f, -0.17f, 1.79f, 0.05f, 2.49f, 0.62f)
                curveToRelative(0.43f, 0.35f, 0.73f, 0.81f, 0.91f, 1.32f)
                horizontalLineToRelative(1.19f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 12.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Leave = it}
