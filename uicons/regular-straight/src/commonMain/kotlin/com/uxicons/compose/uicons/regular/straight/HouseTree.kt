package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTree: ImageVector? = null

val Icons.Rs.HouseTree: ImageVector
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
                moveTo(14f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-6.89f)
                curveToRelative(0f, -0.31f, 0.14f, -0.6f, 0.38f, -0.79f)
                lineToRelative(5.45f, -4.26f)
                curveToRelative(0.1f, -0.08f, 0.24f, -0.08f, 0.34f, 0f)
                lineToRelative(5.45f, 4.26f)
                curveToRelative(0.24f, 0.19f, 0.38f, 0.48f, 0.38f, 0.79f)
                verticalLineToRelative(6.89f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(6f, 19f)
                verticalLineToRelative(-4f)
                close()
                moveTo(18f, 22f)
                horizontalLineToRelative(2.67f)
                lineToRelative(-3.71f, -7f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-3.67f, -6f)
                horizontalLineToRelative(2.75f)
                lineToRelative(-3.62f, -6.82f)
                curveToRelative(-0.13f, -0.15f, -0.29f, -0.18f, -0.38f, -0.18f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.09f, 0f, -0.25f, 0.02f, -0.37f, 0.17f)
                lineToRelative(-2.47f, 5.2f)
                lineToRelative(-0.59f, -0.46f)
                curveToRelative(-0.34f, -0.27f, -0.72f, -0.47f, -1.11f, -0.62f)
                curveToRelative(0f, 0f, 2.51f, -5.24f, 2.51f, -5.25f)
                curveToRelative(0.47f, -0.65f, 1.22f, -1.04f, 2.03f, -1.04f)
                horizontalLineToRelative(0f)
                curveToRelative(0.82f, 0f, 1.58f, 0.4f, 2.05f, 1.07f)
                lineToRelative(5.29f, 9.93f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(3.67f, 6f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(3.71f, 7f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _HouseTree = it}
