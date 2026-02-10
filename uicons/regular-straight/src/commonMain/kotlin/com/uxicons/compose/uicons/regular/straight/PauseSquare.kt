package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PauseSquare: ImageVector? = null

val Icons.Rs.PauseSquare: ImageVector
    get() = _PauseSquare ?: UXIcon(name = "PauseSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 7f)
                close()
                moveTo(9f, 17f)
                horizontalLineToRelative(2f)
                lineTo(11f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                close()
                moveTo(24f, 3f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 22f)
                lineTo(22f, 22f)
                lineTo(22f, 3f)
                close()
            }
        }.also { _PauseSquare = it}
