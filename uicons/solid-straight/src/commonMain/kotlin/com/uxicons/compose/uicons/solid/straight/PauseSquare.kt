package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PauseSquare: ImageVector? = null

val Icons.Ss.PauseSquare: ImageVector
    get() = _PauseSquare ?: UXIcon(name = "PauseSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(11f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _PauseSquare = it}
