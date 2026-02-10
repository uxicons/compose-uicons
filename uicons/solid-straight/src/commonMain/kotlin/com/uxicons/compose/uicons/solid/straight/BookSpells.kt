package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookSpells: ImageVector? = null

val Icons.Ss.BookSpells: ImageVector
    get() = _BookSpells ?: UXIcon(name = "BookSpells") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 20f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(4f)
                lineTo(4f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(22f, 2f)
                verticalLineToRelative(16f)
                lineTo(4f, 18f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(9.5f, 7.5f)
                lineToRelative(2f, -1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1f, -2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                close()
                moveTo(19f, 11.5f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                close()
            }
        }.also { _BookSpells = it}
