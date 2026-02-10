package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartRate: ImageVector? = null

val Icons.Bs.HeartRate: ImageVector
    get() = _HeartRate ?: UXIcon(name = "HeartRate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.47f, 23.82f)
                lineToRelative(-4.55f, -14.17f)
                lineToRelative(-4.32f, 11.99f)
                lineToRelative(-3.6f, -8.64f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(6f, 0f)
                lineToRelative(1.4f, 3.35f)
                lineToRelative(4.68f, -13.01f)
                lineToRelative(4.45f, 13.83f)
                lineToRelative(1.39f, -4.18f)
                lineToRelative(6.08f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-3.92f, 0f)
                lineToRelative(-3.61f, 10.82f)
                close()
            }
        }.also { _HeartRate = it}
