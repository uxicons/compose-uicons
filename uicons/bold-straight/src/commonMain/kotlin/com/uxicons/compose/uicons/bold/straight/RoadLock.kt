package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadLock: ImageVector? = null

val Icons.Bs.RoadLock: ImageVector
    get() = _RoadLock ?: UXIcon(name = "RoadLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 21f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.03f, 3f)
                horizontalLineToRelative(-12.04f)
                lineToRelative(3.56f, -21.09f)
                curveToRelative(0.29f, -1.69f, 1.75f, -2.91f, 3.45f, -2.91f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.7f, 0f, 3.15f, 1.22f, 3.45f, 2.89f)
                lineToRelative(0.8f, 4.72f)
                curveToRelative(-0.83f, -0.39f, -1.76f, -0.61f, -2.74f, -0.61f)
                curveToRelative(-0.14f, 0f, -0.27f, 0.01f, -0.41f, 0.02f)
                lineToRelative(-0.61f, -3.62f)
                curveToRelative(-0.04f, -0.23f, -0.25f, -0.4f, -0.49f, -0.4f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-0.24f, 0f, -0.45f, 0.17f, -0.49f, 0.41f)
                lineToRelative(-2.96f, 17.59f)
                close()
                moveTo(10.49f, 14f)
                horizontalLineToRelative(1.51f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.29f, 0.38f, -2.49f, 1.03f, -3.5f)
                horizontalLineToRelative(-2.54f)
                verticalLineToRelative(4f)
                close()
                moveTo(13.49f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _RoadLock = it}
