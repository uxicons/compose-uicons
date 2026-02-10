package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBridge: ImageVector? = null

val Icons.Rs.RoadBridge: ImageVector
    get() = _RoadBridge ?: UXIcon(name = "RoadBridge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(0f, 0f)
                verticalLineToRelative(12.93f)
                lineToRelative(0.83f, 0.14f)
                curveToRelative(2.41f, 0.41f, 4.17f, 2.48f, 4.17f, 4.93f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.04f, 1.24f, -3.8f, 3f, -4.58f)
                verticalLineToRelative(-2.13f)
                curveToRelative(-1.69f, 0.51f, -3.1f, 1.65f, -3.99f, 3.13f)
                curveToRelative(-0.88f, -1.48f, -2.28f, -2.63f, -4.01f, -3.14f)
                verticalLineToRelative(-4.29f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.1f)
                curveToRelative(0.15f, -0.74f, 0.48f, -1.42f, 0.92f, -2f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _RoadBridge = it}
