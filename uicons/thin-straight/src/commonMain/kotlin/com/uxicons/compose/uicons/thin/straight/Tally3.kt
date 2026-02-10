package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally3: ImageVector? = null

val Icons.Ts.Tally3: ImageVector
    get() = _Tally3 ?: UXIcon(name = "Tally3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-1f)
                lineTo(1f, 0f)
                close()
                moveTo(15f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(1f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(24f)
                close()
            }
        }.also { _Tally3 = it}
