package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltDown: ImageVector? = null

val Icons.Ts.ArrowAltDown: ImageVector
    get() = _ArrowAltDown ?: UXIcon(name = "ArrowAltDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 17f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 17f)
                lineTo(4.79f, 17f)
                lineToRelative(5.85f, 6.39f)
                curveToRelative(0.35f, 0.39f, 0.85f, 0.61f, 1.37f, 0.61f)
                reflectiveCurveToRelative(1.02f, -0.22f, 1.37f, -0.61f)
                lineToRelative(5.85f, -6.39f)
                horizontalLineToRelative(-6.71f)
                close()
                moveTo(12.63f, 22.72f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.32f, 0.36f, -0.92f, 0.36f, -1.25f, -0.0f)
                lineToRelative(-4.32f, -4.72f)
                horizontalLineToRelative(9.89f)
                lineToRelative(-4.32f, 4.72f)
                close()
            }
        }.also { _ArrowAltDown = it}
