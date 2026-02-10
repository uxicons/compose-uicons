package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartUpsideDown: ImageVector? = null

val Icons.Ts.HeartUpsideDown: ImageVector
    get() = _HeartUpsideDown ?: UXIcon(name = "HeartUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.29f, 1.28f)
                lineToRelative(-0.29f, -0.21f)
                lineToRelative(-0.29f, 0.21f)
                curveTo(9.75f, 2.68f, 0f, 9.99f, 0f, 16.75f)
                curveToRelative(0f, 3.45f, 2.8f, 6.25f, 6.25f, 6.25f)
                curveToRelative(2.5f, 0f, 4.78f, -1.85f, 5.75f, -4.35f)
                curveToRelative(0.97f, 2.5f, 3.25f, 4.35f, 5.75f, 4.35f)
                curveToRelative(3.45f, 0f, 6.25f, -2.8f, 6.25f, -6.25f)
                curveToRelative(0f, -6.76f, -9.75f, -14.07f, -11.71f, -15.47f)
                close()
                moveTo(17.75f, 22f)
                curveToRelative(-2.75f, 0f, -5.25f, -2.86f, -5.25f, -6f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 3.14f, -2.5f, 6f, -5.25f, 6f)
                curveToRelative(-2.9f, 0f, -5.25f, -2.35f, -5.25f, -5.25f)
                curveTo(1f, 11.98f, 6.86f, 6.04f, 12f, 2.31f)
                curveToRelative(5.14f, 3.74f, 11f, 9.67f, 11f, 14.44f)
                curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
                close()
            }
        }.also { _HeartUpsideDown = it}
