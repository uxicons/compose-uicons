package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseWindow: ImageVector? = null

val Icons.Ts.HouseWindow: ImageVector
    get() = _HouseWindow ?: UXIcon(name = "HouseWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.05f, 8.03f)
                lineTo(13.54f, 0.57f)
                curveToRelative(-0.91f, -0.71f, -2.18f, -0.71f, -3.09f, 0f)
                lineTo(0.95f, 8.03f)
                curveToRelative(-0.61f, 0.48f, -0.95f, 1.19f, -0.95f, 1.97f)
                verticalLineToRelative(14f)
                lineTo(24f, 24f)
                lineTo(24f, 10f)
                curveToRelative(0f, -0.77f, -0.35f, -1.49f, -0.95f, -1.97f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 10f)
                curveToRelative(0f, -0.46f, 0.21f, -0.89f, 0.57f, -1.18f)
                lineTo(11.07f, 1.35f)
                curveToRelative(0.55f, -0.43f, 1.31f, -0.43f, 1.85f, 0f)
                lineToRelative(9.5f, 7.47f)
                curveToRelative(0.36f, 0.28f, 0.57f, 0.71f, 0.57f, 1.18f)
                verticalLineToRelative(13f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(8f)
                lineTo(16f, 10f)
                lineTo(8f, 10f)
                verticalLineToRelative(8f)
                close()
                moveTo(9f, 11f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _HouseWindow = it}
