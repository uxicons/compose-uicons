package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ss7: ImageVector? = null

val Icons.Ss.Ss7: ImageVector
    get() = _Ss7 ?: UXIcon(name = "Ss7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.93f, 24.01f)
                lineToRelative(-1.79f, -0.89f)
                lineToRelative(10.55f, -21.12f)
                lineToRelative(-13.69f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(16f, 0f)
                lineToRelative(0f, 1.85f)
                lineToRelative(-11.07f, 22.16f)
                close()
            }
        }.also { _Ss7 = it}
