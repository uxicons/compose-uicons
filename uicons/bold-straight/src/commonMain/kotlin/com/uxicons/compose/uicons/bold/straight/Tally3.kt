package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally3: ImageVector? = null

val Icons.Bs.Tally3: ImageVector
    get() = _Tally3 ?: UXIcon(name = "Tally3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(24f)
                lineTo(0f, 24f)
                lineTo(0f, 0f)
                close()
                moveTo(14f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(7f, 24f)
                horizontalLineToRelative(3f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(24f)
                close()
            }
        }.also { _Tally3 = it}
