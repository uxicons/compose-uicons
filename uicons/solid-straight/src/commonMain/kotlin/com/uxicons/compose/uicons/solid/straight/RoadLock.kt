package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadLock: ImageVector? = null

val Icons.Ss.RoadLock: ImageVector
    get() = _RoadLock ?: UXIcon(name = "RoadLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(10f, 21f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5f, 5.92f, -5f)
                curveToRelative(1.2f, 0f, 2.31f, 0.36f, 3.24f, 0.97f)
                lineToRelative(-0.97f, -5.49f)
                curveToRelative(-0.25f, -1.44f, -1.5f, -2.48f, -2.96f, -2.48f)
                horizontalLineToRelative(-10.64f)
                curveToRelative(-1.46f, 0f, -2.7f, 1.04f, -2.96f, 2.48f)
                lineToRelative(-3.77f, 21.52f)
                horizontalLineToRelative(11.06f)
                curveToRelative(-0.64f, -0.84f, -1.03f, -1.87f, -1.03f, -3f)
                close()
                moveTo(11f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _RoadLock = it}
