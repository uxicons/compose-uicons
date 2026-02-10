package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartUpsideDown: ImageVector? = null

val Icons.Rs.HeartUpsideDown: ImageVector
    get() = _HeartUpsideDown ?: UXIcon(name = "HeartUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 23f)
                curveToRelative(-2.28f, 0f, -4.34f, -1.35f, -5.5f, -3.33f)
                curveToRelative(-1.16f, 1.98f, -3.22f, 3.33f, -5.5f, 3.33f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                curveTo(0f, 9.78f, 9.51f, 2.64f, 11.42f, 1.28f)
                lineToRelative(0.58f, -0.41f)
                lineToRelative(0.58f, 0.41f)
                curveToRelative(1.91f, 1.36f, 11.42f, 8.5f, 11.42f, 15.22f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(13f, 16f)
                curveToRelative(0f, 2.66f, 2.1f, 5f, 4.5f, 5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -4.28f, -5.26f, -9.66f, -10f, -13.17f)
                curveTo(7.26f, 6.84f, 2f, 12.22f, 2f, 16.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(2.4f, 0f, 4.5f, -2.34f, 4.5f, -5f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _HeartUpsideDown = it}
