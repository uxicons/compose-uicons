package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToRight: ImageVector? = null

val Icons.Ss.ArrowAltToRight: ImageVector
    get() = _ArrowAltToRight ?: UXIcon(name = "ArrowAltToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                curveToRelative(0f, 0.36f, -0.15f, 0.72f, -0.45f, 0.98f)
                lineToRelative(-5.55f, 5.02f)
                verticalLineToRelative(-5f)
                lineTo(0f, 13f)
                verticalLineToRelative(-2f)
                lineTo(16f, 11f)
                lineTo(16f, 6f)
                lineToRelative(5.55f, 5.02f)
                curveToRelative(0.3f, 0.26f, 0.45f, 0.62f, 0.45f, 0.98f)
                close()
                moveTo(22f, 3f)
                lineTo(22f, 21f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _ArrowAltToRight = it}
