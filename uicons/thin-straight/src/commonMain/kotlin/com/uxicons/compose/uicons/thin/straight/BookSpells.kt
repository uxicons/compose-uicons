package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookSpells: ImageVector? = null

val Icons.Ts.BookSpells: ImageVector
    get() = _BookSpells ?: UXIcon(name = "BookSpells") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17.5f)
                lineTo(22f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                lineTo(4.5f, 19f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.19f, -1.5f, 0.5f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(16.5f)
                verticalLineToRelative(3f)
                lineTo(4.5f, 23f)
                close()
                moveTo(14.14f, 13.85f)
                lineToRelative(1.37f, 2.75f)
                lineToRelative(1.37f, -2.75f)
                lineToRelative(2.75f, -1.37f)
                lineToRelative(-2.75f, -1.37f)
                lineToRelative(-1.37f, -2.75f)
                lineToRelative(-1.37f, 2.75f)
                lineToRelative(-2.75f, 1.37f)
                lineToRelative(2.75f, 1.37f)
                close()
                moveTo(14.89f, 11.85f)
                lineToRelative(0.63f, -1.25f)
                lineToRelative(0.63f, 1.25f)
                lineToRelative(1.25f, 0.63f)
                lineToRelative(-1.25f, 0.63f)
                lineToRelative(-0.63f, 1.25f)
                lineToRelative(-0.63f, -1.25f)
                lineToRelative(-1.25f, -0.63f)
                lineToRelative(1.25f, -0.63f)
                close()
                moveTo(8.54f, 10.52f)
                lineToRelative(1.17f, -2.35f)
                lineToRelative(2.35f, -1.17f)
                lineToRelative(-2.35f, -1.17f)
                lineToRelative(-1.17f, -2.35f)
                lineToRelative(-1.17f, 2.35f)
                lineToRelative(-2.35f, 1.17f)
                lineToRelative(2.35f, 1.17f)
                lineToRelative(1.17f, 2.35f)
                close()
                moveTo(8.11f, 6.57f)
                lineToRelative(0.43f, -0.85f)
                lineToRelative(0.43f, 0.85f)
                lineToRelative(0.85f, 0.43f)
                lineToRelative(-0.85f, 0.43f)
                lineToRelative(-0.43f, 0.85f)
                lineToRelative(-0.43f, -0.85f)
                lineToRelative(-0.85f, -0.43f)
                lineToRelative(0.85f, -0.43f)
                close()
            }
        }.also { _BookSpells = it}
