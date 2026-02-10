package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yen: ImageVector? = null

val Icons.Ts.Yen: ImageVector
    get() = _Yen ?: UXIcon(name = "Yen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.99f, 0.63f)
                lineToRelative(-0.79f, -0.61f)
                lineToRelative(-11.2f, 14.56f)
                lineToRelative(-11.2f, -14.56f)
                lineToRelative(-0.79f, 0.61f)
                lineToRelative(11.05f, 14.37f)
                lineToRelative(-6.06f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(6.5f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-6.5f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(6.5f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -4f)
                lineToRelative(6.5f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(-6.5f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(6.5f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(-6.06f, 0f)
                lineToRelative(11.05f, -14.37f)
                close()
            }
        }.also { _Yen = it}
