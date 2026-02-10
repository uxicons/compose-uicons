package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Ss.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.8f, 6f)
                lineTo(0f, 3.3f)
                lineTo(0f, 1f)
                lineTo(24f, 1f)
                lineTo(24f, 3.3f)
                lineToRelative(-1.8f, 2.7f)
                lineTo(1.8f, 6f)
                close()
                moveTo(22f, 8f)
                lineTo(2f, 8f)
                verticalLineToRelative(13f)
                lineTo(0f, 21f)
                verticalLineToRelative(2f)
                lineTo(8f, 23f)
                lineTo(8f, 15f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 8f)
                close()
            }
        }.also { _Archway = it}
