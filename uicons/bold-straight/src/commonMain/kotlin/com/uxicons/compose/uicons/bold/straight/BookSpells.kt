package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookSpells: ImageVector? = null

val Icons.Bs.BookSpells: ImageVector
    get() = _BookSpells ?: UXIcon(name = "BookSpells") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11.5f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-2.33f, -1.17f)
                close()
                moveTo(8.5f, 10.5f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, -1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1f, -2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                close()
                moveTo(23f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(5f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 4f)
                curveTo(1f, 1.79f, 2.79f, 0f, 5f, 0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(4f, 4f)
                verticalLineToRelative(12.13f)
                curveToRelative(0.32f, -0.08f, 0.66f, -0.13f, 1f, -0.13f)
                horizontalLineToRelative(15f)
                lineTo(20f, 3f)
                lineTo(5f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(20f, 21f)
                verticalLineToRelative(-2f)
                lineTo(5f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15f)
                close()
            }
        }.also { _BookSpells = it}
