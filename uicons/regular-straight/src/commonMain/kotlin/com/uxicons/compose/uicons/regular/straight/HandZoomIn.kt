package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandZoomIn: ImageVector? = null

val Icons.Rs.HandZoomIn: ImageVector
    get() = _HandZoomIn ?: UXIcon(name = "HandZoomIn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18.31f)
                verticalLineToRelative(5.73f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.35f)
                lineToRelative(-8f, -3f)
                verticalLineToRelative(-5.59f)
                curveToRelative(0f, -0.54f, -0.36f, -1.02f, -0.82f, -1.09f)
                curveToRelative(-0.6f, -0.12f, -1.19f, 0.38f, -1.18f, 0.99f)
                verticalLineToRelative(11.75f)
                lineToRelative(-4.26f, -3.39f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(-0.42f, -0.38f, -1.07f, -0.43f, -1.48f, 0.01f)
                curveToRelative(-0.38f, 0.4f, -0.36f, 1.04f, 0.05f, 1.42f)
                lineToRelative(3.29f, 3.2f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(-1.78f, -1.75f)
                curveToRelative(-1.2f, -1.12f, -1.26f, -3.02f, -0.13f, -4.23f)
                curveToRelative(1.11f, -1.19f, 2.96f, -1.26f, 4.17f, -0.19f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(1.01f, 0.81f)
                verticalLineToRelative(-7.6f)
                curveToRelative(-0.04f, -1.8f, 1.72f, -3.29f, 3.5f, -2.96f)
                curveToRelative(1.43f, 0.23f, 2.5f, 1.55f, 2.5f, 3.07f)
                verticalLineToRelative(4.2f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(7.59f, -7.59f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-7.59f, 7.59f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _HandZoomIn = it}
