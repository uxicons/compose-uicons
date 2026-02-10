package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToRight: ImageVector? = null

val Icons.Ts.ArrowAltToRight: ImageVector
    get() = _ArrowAltToRight ?: UXIcon(name = "ArrowAltToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.39f, 10.64f)
                lineToRelative(-6.39f, -5.77f)
                verticalLineToRelative(6.62f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(16f, 12.5f)
                verticalLineToRelative(6.62f)
                lineToRelative(6.39f, -5.77f)
                curveToRelative(0.39f, -0.34f, 0.61f, -0.84f, 0.61f, -1.36f)
                reflectiveCurveToRelative(-0.22f, -1.01f, -0.61f, -1.35f)
                close()
                moveTo(21.72f, 12.61f)
                lineToRelative(-4.72f, 4.26f)
                lineTo(17f, 7.12f)
                lineToRelative(4.72f, 4.26f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.18f, 0.16f, 0.28f, 0.37f, 0.28f, 0.61f)
                reflectiveCurveToRelative(-0.1f, 0.45f, -0.28f, 0.61f)
                close()
                moveTo(24f, 3.0f)
                lineTo(24f, 21f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 3f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _ArrowAltToRight = it}
