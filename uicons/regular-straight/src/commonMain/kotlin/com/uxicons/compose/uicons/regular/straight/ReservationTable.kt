package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReservationTable: ImageVector? = null

val Icons.Rs.ReservationTable: ImageVector
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
                horizontalLineToRelative(-2.48f)
                lineToRelative(2.36f, -13.36f)
                lineToRelative(2.71f, 15.36f)
                close()
                moveTo(17.83f, 4f)
                curveToRelative(0.54f, 0f, 1.01f, 0.39f, 1.1f, 0.92f)
                lineToRelative(2.66f, 15.08f)
                horizontalLineToRelative(-12.45f)
                lineTo(6.31f, 4f)
                horizontalLineToRelative(11.52f)
                close()
                moveTo(9.58f, 11f)
                horizontalLineToRelative(8.39f)
                lineToRelative(0.35f, 2f)
                horizontalLineToRelative(-8.39f)
                lineToRelative(-0.35f, -2f)
                close()
                moveTo(9.22f, 9f)
                lineToRelative(-0.35f, -2f)
                horizontalLineToRelative(8.39f)
                lineToRelative(0.35f, 2f)
                horizontalLineToRelative(-8.39f)
                close()
                moveTo(10.28f, 15f)
                horizontalLineToRelative(8.39f)
                lineToRelative(0.35f, 2f)
                horizontalLineToRelative(-8.39f)
                lineToRelative(-0.35f, -2f)
                close()
            }
        }.also { _ReservationTable = it}
