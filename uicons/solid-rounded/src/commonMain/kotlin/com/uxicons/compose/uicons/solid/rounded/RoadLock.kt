package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadLock: ImageVector? = null

val Icons.Sr.RoadLock: ImageVector
    get() = _RoadLock ?: UXIcon(name = "RoadLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14.56f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.56f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.97f, -2f, 3.44f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, -0.81f, -2.75f, -2f, -3.44f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(10f, 20f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.52f, 0.6f, -2.98f, 1.62f, -4.07f)
                curveToRelative(-0.37f, -0.15f, -0.62f, -0.51f, -0.62f, -0.93f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.26f, 0f, 0.49f, 0.1f, 0.67f, 0.26f)
                curveToRelative(1.0f, -1.93f, 3.01f, -3.26f, 5.33f, -3.26f)
                curveToRelative(1.68f, 0f, 3.19f, 0.69f, 4.28f, 1.8f)
                lineToRelative(-0.82f, -4.67f)
                curveToRelative(-0.42f, -2.4f, -2.49f, -4.13f, -4.92f, -4.13f)
                horizontalLineToRelative(-9.09f)
                curveToRelative(-2.44f, 0f, -4.51f, 1.74f, -4.92f, 4.14f)
                lineToRelative(-2.45f, 14f)
                curveToRelative(-0.26f, 1.46f, 0.14f, 2.94f, 1.1f, 4.08f)
                curveToRelative(0.95f, 1.13f, 2.35f, 1.78f, 3.83f, 1.78f)
                horizontalLineToRelative(6.54f)
                curveToRelative(-0.95f, -1.06f, -1.54f, -2.46f, -1.54f, -4f)
                close()
                moveTo(11.0f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _RoadLock = it}
