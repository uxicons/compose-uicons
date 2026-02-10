package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartRate: ImageVector? = null

val Icons.Ts.HeartRate: ImageVector
    get() = _HeartRate ?: UXIcon(name = "HeartRate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.53f, 22.42f)
                lineToRelative(-4.57f, -17.15f)
                lineToRelative(-4.43f, 13.69f)
                lineToRelative(-2.86f, -6.95f)
                lineToRelative(-4.67f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(5.33f, 0f)
                lineToRelative(2.08f, 5.05f)
                lineToRelative(4.64f, -14.31f)
                lineToRelative(4.49f, 16.85f)
                lineToRelative(2.08f, -7.58f)
                lineToRelative(5.38f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(-4.62f, 0f)
                lineToRelative(-2.85f, 10.42f)
                close()
            }
        }.also { _HeartRate = it}
