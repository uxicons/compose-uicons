package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally4: ImageVector? = null

val Icons.Ts.Tally4: ImageVector
    get() = _Tally4 ?: UXIcon(name = "Tally4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-1f)
                lineTo(1f, 0f)
                close()
                moveTo(22f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                lineTo(23f, 0f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(1f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(24f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(1f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(24f)
                close()
            }
        }.also { _Tally4 = it}
