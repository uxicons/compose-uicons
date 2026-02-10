package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookSpells: ImageVector? = null

val Icons.Rs.BookSpells: ImageVector
    get() = _BookSpells ?: UXIcon(name = "BookSpells") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 12.5f)
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
                moveTo(22f, 2f)
                verticalLineToRelative(22f)
                lineTo(5f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(4f, 3f)
                verticalLineToRelative(15.17f)
                curveToRelative(0.31f, -0.11f, 0.65f, -0.17f, 1f, -0.17f)
                horizontalLineToRelative(15f)
                lineTo(20f, 2f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(20f, 22f)
                verticalLineToRelative(-2f)
                lineTo(5f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15f)
                close()
            }
        }.also { _BookSpells = it}
