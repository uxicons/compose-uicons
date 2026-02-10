package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlag: ImageVector? = null

val Icons.Sr.HouseFlag: ImageVector
    get() = _HouseFlag ?: UXIcon(name = "HouseFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.73f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.02f, -6.89f)
                lineToRelative(4.91f, -2.06f)
                curveToRelative(0.63f, -0.32f, 1.05f, -0.94f, 1.1f, -1.64f)
                curveToRelative(0.06f, -0.71f, -0.25f, -1.38f, -0.83f, -1.8f)
                curveToRelative(-0.03f, -0.02f, -4.27f, -2.4f, -4.27f, -2.4f)
                curveToRelative(-0.63f, -0.31f, -1.35f, -0.28f, -1.95f, 0.09f)
                curveToRelative(-0.59f, 0.37f, -0.95f, 1.0f, -0.95f, 1.7f)
                verticalLineToRelative(13.0f)
                lineTo(5f, 24.0f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -1.67f, 0.82f, -3.21f, 2.2f, -4.14f)
                lineTo(9.2f, 0.86f)
                curveToRelative(1.7f, -1.15f, 3.9f, -1.15f, 5.59f, 0f)
                lineToRelative(7.2f, 4.88f)
                curveToRelative(1.25f, 0.94f, 2f, 2.41f, 2f, 3.99f)
                close()
                moveTo(16.97f, 14.95f)
                lineToRelative(4.08f, -1.71f)
                lineToRelative(-4.1f, -2.26f)
                lineToRelative(0.01f, 3.97f)
                close()
            }
        }.also { _HouseFlag = it}
