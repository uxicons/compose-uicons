package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToRight: ImageVector? = null

val Icons.Bs.ArrowAltToRight: ImageVector
    get() = _ArrowAltToRight ?: UXIcon(name = "ArrowAltToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                curveToRelative(0f, 0.36f, -0.15f, 0.72f, -0.45f, 0.98f)
                lineToRelative(-5.55f, 5.02f)
                verticalLineToRelative(-4.5f)
                lineTo(0f, 13.5f)
                verticalLineToRelative(-3f)
                lineTo(15f, 10.5f)
                lineTo(15f, 6f)
                lineToRelative(5.55f, 5.02f)
                curveToRelative(0.3f, 0.26f, 0.45f, 0.62f, 0.45f, 0.98f)
                close()
                moveTo(21f, 3f)
                lineTo(21f, 21f)
                horizontalLineToRelative(3f)
                lineTo(24f, 3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ArrowAltToRight = it}
