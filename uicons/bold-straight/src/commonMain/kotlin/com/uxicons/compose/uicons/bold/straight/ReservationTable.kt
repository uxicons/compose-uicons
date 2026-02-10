package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReservationTable: ImageVector? = null

val Icons.Bs.ReservationTable: ImageVector
    get() = _ReservationTable ?: UXIcon(name = "ReservationTable") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.31f, 10.99f)
                lineToRelative(-0.5f, -3f)
                horizontalLineToRelative(6.58f)
                lineToRelative(0.5f, 3f)
                horizontalLineToRelative(-6.58f)
                close()
                moveTo(11.14f, 15.99f)
                horizontalLineToRelative(6.58f)
                lineToRelative(-0.5f, -3f)
                horizontalLineToRelative(-6.58f)
                lineToRelative(0.5f, 3f)
                close()
                moveTo(5.15f, 10.13f)
                lineToRelative(-1.56f, 8.87f)
                horizontalLineToRelative(1.12f)
                lineToRelative(0.5f, 3f)
                lineTo(0.01f, 22f)
                lineTo(3.03f, 4.89f)
                curveToRelative(0.29f, -1.68f, 1.75f, -2.89f, 3.45f, -2.89f)
                horizontalLineToRelative(11.03f)
                curveToRelative(1.7f, 0f, 3.15f, 1.22f, 3.45f, 2.89f)
                lineToRelative(3.02f, 17.11f)
                lineTo(7.24f, 22f)
                lineToRelative(-2.09f, -11.87f)
                close()
                moveTo(7.29f, 5f)
                lineToRelative(2.47f, 14f)
                horizontalLineToRelative(10.63f)
                lineToRelative(-2.4f, -13.59f)
                curveToRelative(-0.04f, -0.24f, -0.25f, -0.41f, -0.49f, -0.41f)
                lineTo(7.29f, 5f)
                close()
            }
        }.also { _ReservationTable = it}
