package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WhiteSpace: ImageVector? = null

val Icons.Bs.WhiteSpace: ImageVector
    get() = _WhiteSpace ?: UXIcon(name = "WhiteSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 0f)
                lineTo(3f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 0f)
                lineTo(3f, 0f)
                close()
                moveTo(21.04f, 0f)
                lineTo(21.04f, 24f)
                horizontalLineToRelative(3f)
                lineTo(24.04f, 0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(16f, 7f)
                verticalLineToRelative(3.5f)
                lineTo(8f, 10.5f)
                verticalLineToRelative(-3.5f)
                lineTo(3.37f, 11.24f)
                curveToRelative(-0.25f, 0.22f, -0.37f, 0.53f, -0.37f, 0.83f)
                reflectiveCurveToRelative(0.12f, 0.61f, 0.37f, 0.83f)
                lineToRelative(4.63f, 4.24f)
                verticalLineToRelative(-3.63f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3.63f)
                lineToRelative(4.63f, -4.24f)
                curveToRelative(0.49f, -0.44f, 0.49f, -1.22f, 0f, -1.66f)
                lineToRelative(-4.63f, -4.24f)
                close()
            }
        }.also { _WhiteSpace = it}
