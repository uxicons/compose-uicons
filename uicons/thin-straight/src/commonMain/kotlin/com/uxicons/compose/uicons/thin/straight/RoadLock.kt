package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadLock: ImageVector? = null

val Icons.Ts.RoadLock: ImageVector
    get() = _RoadLock ?: UXIcon(name = "RoadLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11.5f, 13f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(23f, 16f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(19f, 18.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                close()
                moveTo(1.25f, 23f)
                lineTo(4.88f, 2.24f)
                curveToRelative(0.12f, -0.72f, 0.75f, -1.24f, 1.48f, -1.24f)
                horizontalLineToRelative(11.28f)
                curveToRelative(0.73f, 0f, 1.35f, 0.52f, 1.48f, 1.24f)
                lineToRelative(1.06f, 6.02f)
                curveToRelative(0.39f, 0.12f, 0.76f, 0.29f, 1.1f, 0.5f)
                lineToRelative(-1.18f, -6.7f)
                curveToRelative(-0.21f, -1.2f, -1.25f, -2.07f, -2.46f, -2.07f)
                horizontalLineToRelative(-11.28f)
                curveToRelative(-1.22f, 0f, -2.25f, 0.87f, -2.46f, 2.07f)
                lineToRelative(-3.84f, 21.93f)
                horizontalLineToRelative(11.7f)
                curveToRelative(-0.21f, -0.31f, -0.37f, -0.65f, -0.5f, -1f)
                close()
            }
        }.also { _RoadLock = it}
