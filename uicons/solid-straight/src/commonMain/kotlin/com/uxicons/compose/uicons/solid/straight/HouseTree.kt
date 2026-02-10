package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTree: ImageVector? = null

val Icons.Ss.HouseTree: ImageVector
    get() = _HouseTree ?: UXIcon(name = "HouseTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.85f, 12.75f)
                lineToRelative(-5.45f, -4.26f)
                curveToRelative(-0.82f, -0.65f, -1.98f, -0.65f, -2.8f, 0f)
                lineTo(1.15f, 12.75f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.44f, -1.15f, 2.36f)
                verticalLineToRelative(8.89f)
                lineTo(16f, 24f)
                lineTo(16f, 15.11f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
                moveTo(10f, 19f)
                lineTo(6f, 19f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(23.99f, 24f)
                horizontalLineToRelative(-5.99f)
                lineTo(18f, 15.11f)
                curveToRelative(0f, -1.55f, -0.7f, -2.98f, -1.92f, -3.94f)
                lineToRelative(-5.45f, -4.26f)
                curveToRelative(-0.34f, -0.27f, -0.72f, -0.47f, -1.11f, -0.62f)
                lineTo(11.93f, 1.21f)
                curveToRelative(0.03f, -0.05f, 0.53f, -1.21f, 2.13f, -1.21f)
                horizontalLineToRelative(0f)
                curveToRelative(0.82f, 0f, 1.58f, 0.4f, 2.05f, 1.07f)
                lineToRelative(5.29f, 9.93f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(3.67f, 6f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(3.71f, 7f)
                close()
            }
        }.also { _HouseTree = it}
