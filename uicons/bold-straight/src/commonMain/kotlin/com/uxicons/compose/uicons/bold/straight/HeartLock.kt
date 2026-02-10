package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartLock: ImageVector? = null

val Icons.Bs.HeartLock: ImageVector
    get() = _HeartLock ?: UXIcon(name = "HeartLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7.38f)
                verticalLineToRelative(-1.38f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(1.38f)
                curveToRelative(-2.04f, 0.8f, -3.5f, 2.79f, -3.5f, 5.12f)
                curveToRelative(0f, 4.72f, 5.54f, 8.68f, 8.52f, 10.8f)
                lineToRelative(0.98f, 0.7f)
                lineToRelative(0.98f, -0.7f)
                curveToRelative(2.98f, -2.13f, 8.52f, -6.08f, 8.52f, -10.8f)
                curveToRelative(0f, -2.33f, -1.46f, -4.32f, -3.5f, -5.12f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1.09f)
                curveToRelative(-1.18f, 0.19f, -2.22f, 0.7f, -3f, 1.44f)
                curveToRelative(-0.78f, -0.74f, -1.82f, -1.25f, -3f, -1.44f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(12f, 20.31f)
                curveToRelative(-2.51f, -1.82f, -6.5f, -4.95f, -6.5f, -7.81f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(1.4f, 0f, 2.5f, 0.88f, 2.5f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.12f, 1.1f, -2f, 2.5f, -2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 2.86f, -3.99f, 5.99f, -6.5f, 7.81f)
                close()
                moveTo(10.5f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _HeartLock = it}
