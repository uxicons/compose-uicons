package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReservationTable: ImageVector? = null

val Icons.Ss.ReservationTable: ImageVector
    get() = _ReservationTable ?: UXIcon(name = "ReservationTable") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.46f, 22f)
                horizontalLineToRelative(16.52f)
                lineToRelative(-3.08f, -17.42f)
                curveToRelative(-0.26f, -1.49f, -1.55f, -2.58f, -3.07f, -2.58f)
                lineTo(6.15f, 2f)
                curveToRelative(-1.52f, 0f, -2.81f, 1.08f, -3.07f, 2.58f)
                lineTo(0.0f, 22f)
                horizontalLineToRelative(5.2f)
                lineToRelative(-0.33f, -2f)
                lineToRelative(-1.15f, -7.55f)
                lineToRelative(1.02f, -5.81f)
                lineToRelative(2.71f, 15.36f)
                close()
                moveTo(19.03f, 17f)
                horizontalLineToRelative(-8.39f)
                lineToRelative(-0.35f, -2f)
                horizontalLineToRelative(8.39f)
                lineToRelative(0.35f, 2f)
                close()
                moveTo(17.97f, 11f)
                lineToRelative(0.35f, 2f)
                horizontalLineToRelative(-8.39f)
                lineToRelative(-0.35f, -2f)
                horizontalLineToRelative(8.39f)
                close()
                moveTo(17.26f, 7f)
                lineToRelative(0.35f, 2f)
                horizontalLineToRelative(-8.39f)
                lineToRelative(-0.35f, -2f)
                horizontalLineToRelative(8.39f)
                close()
            }
        }.also { _ReservationTable = it}
