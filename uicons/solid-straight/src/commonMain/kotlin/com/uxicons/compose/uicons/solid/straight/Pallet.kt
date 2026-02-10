package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pallet: ImageVector? = null

val Icons.Ss.Pallet: ImageVector
    get() = _Pallet ?: UXIcon(name = "Pallet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 17f)
                lineToRelative(0f, 5f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(9f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(9f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(-24f, 0f)
                close()
            }
        }.also { _Pallet = it}
