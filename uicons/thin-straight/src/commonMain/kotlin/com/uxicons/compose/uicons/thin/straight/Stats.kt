package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stats: ImageVector? = null

val Icons.Ts.Stats: ImageVector
    get() = _Stats ?: UXIcon(name = "Stats") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.5f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-9f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1f)
                lineTo(11f, 6f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-9f)
                close()
                moveTo(19f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1f)
                lineTo(19f, 6f)
                close()
            }
        }.also { _Stats = it}
