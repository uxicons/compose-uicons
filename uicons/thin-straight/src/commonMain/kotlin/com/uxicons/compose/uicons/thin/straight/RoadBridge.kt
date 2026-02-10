package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBridge: ImageVector? = null

val Icons.Ts.RoadBridge: ImageVector
    get() = _RoadBridge ?: UXIcon(name = "RoadBridge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(18f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(0f, 0f)
                verticalLineToRelative(12.09f)
                curveToRelative(2.3f, 0.5f, 4.01f, 2.54f, 4f, 4.91f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.41f, 1.72f, -4.43f, 4f, -4.9f)
                verticalLineToRelative(-1.01f)
                curveToRelative(-2.83f, 0.48f, -5f, 2.94f, -5f, 5.91f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.54f, -1.63f, -4.81f, -4f, -5.65f)
                verticalLineToRelative(-6.35f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.26f)
                curveToRelative(0.13f, -0.35f, 0.29f, -0.69f, 0.5f, -1f)
                close()
                moveTo(1f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _RoadBridge = it}
