package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadLock: ImageVector? = null

val Icons.Rs.RoadLock: ImageVector
    get() = _RoadLock ?: UXIcon(name = "RoadLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.1f, 22f)
                curveToRelative(0.15f, 0.74f, 0.48f, 1.42f, 0.92f, 2f)
                horizontalLineToRelative(-11.06f)
                lineToRelative(3.77f, -21.52f)
                curveToRelative(0.25f, -1.44f, 1.5f, -2.48f, 2.96f, -2.48f)
                horizontalLineToRelative(10.64f)
                curveToRelative(1.46f, 0f, 2.7f, 1.04f, 2.96f, 2.48f)
                lineToRelative(0.96f, 5.48f)
                curveToRelative(-0.65f, -0.42f, -1.39f, -0.72f, -2.18f, -0.86f)
                lineToRelative(-0.75f, -4.27f)
                curveToRelative(-0.08f, -0.48f, -0.5f, -0.83f, -0.98f, -0.83f)
                horizontalLineToRelative(-10.64f)
                curveToRelative(-0.49f, 0f, -0.9f, 0.35f, -0.98f, 0.83f)
                lineToRelative(-3.35f, 19.17f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11.01f, 12.01f)
                lineTo(12.09f, 12.0f)
                curveToRelative(0.12f, -0.72f, 0.37f, -1.4f, 0.72f, -2.0f)
                lineToRelative(-1.81f, 0.01f)
                close()
                moveTo(13f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _RoadLock = it}
