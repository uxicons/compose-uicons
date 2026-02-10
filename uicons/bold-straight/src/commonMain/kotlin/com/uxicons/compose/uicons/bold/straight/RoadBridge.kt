package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBridge: ImageVector? = null

val Icons.Bs.RoadBridge: ImageVector
    get() = _RoadBridge ?: UXIcon(name = "RoadBridge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(16f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(16f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(0f, 0f)
                verticalLineToRelative(13.9f)
                lineToRelative(1.36f, 0.12f)
                curveToRelative(2.07f, 0.19f, 3.63f, 1.9f, 3.63f, 3.98f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.0f, 0.39f, -1.91f, 1f, -2.62f)
                verticalLineToRelative(-3.7f)
                curveToRelative(-0.98f, 0.47f, -1.82f, 1.16f, -2.48f, 2f)
                curveToRelative(-0.88f, -1.12f, -2.09f, -1.98f, -3.52f, -2.4f)
                verticalLineToRelative(-3.29f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                curveToRelative(0.1f, -1.13f, 0.57f, -2.17f, 1.26f, -3f)
                close()
                moveTo(3f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _RoadBridge = it}
