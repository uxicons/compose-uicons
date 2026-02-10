package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _K: ImageVector? = null

val Icons.Rs.K: ImageVector
    get() = _K ?: UXIcon(name = "K") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.56f, 24f)
                lineToRelative(2.45f, 0f)
                lineToRelative(-7.82f, -11.04f)
                lineToRelative(7.79f, -12.96f)
                lineToRelative(-2.33f, 0f)
                lineToRelative(-7.22f, 12f)
                lineToRelative(-8.44f, 0f)
                lineToRelative(0f, -12f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 24f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -10f)
                lineToRelative(8.48f, 0f)
                lineToRelative(7.09f, 10f)
                close()
            }
        }.also { _K = it}
