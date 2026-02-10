package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReservationTable: ImageVector? = null

val Icons.Ts.ReservationTable: ImageVector
    get() = _ReservationTable ?: UXIcon(name = "ReservationTable") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.44f, 3.69f)
                lineToRelative(3.23f, 18.31f)
                horizontalLineToRelative(16.3f)
                lineToRelative(-3.13f, -17.74f)
                curveToRelative(-0.23f, -1.31f, -1.36f, -2.26f, -2.69f, -2.26f)
                lineTo(5.82f, 2f)
                curveToRelative(-1.33f, 0f, -2.46f, 0.95f, -2.69f, 2.26f)
                lineTo(0f, 22f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-0.17f, -1f)
                lineTo(1.19f, 21f)
                lineTo(4.12f, 4.43f)
                curveToRelative(0.05f, -0.28f, 0.16f, -0.53f, 0.32f, -0.74f)
                close()
                moveTo(5.82f, 3f)
                horizontalLineToRelative(12.33f)
                curveToRelative(0.84f, 0f, 1.56f, 0.6f, 1.71f, 1.43f)
                lineToRelative(2.92f, 16.57f)
                horizontalLineToRelative(-14.27f)
                lineTo(5.34f, 3.07f)
                curveToRelative(0.15f, -0.04f, 0.31f, -0.07f, 0.48f, -0.07f)
                close()
                moveTo(9.05f, 8f)
                lineToRelative(-0.18f, -1f)
                horizontalLineToRelative(8.39f)
                lineToRelative(0.18f, 1f)
                horizontalLineToRelative(-8.39f)
                close()
                moveTo(9.58f, 11f)
                horizontalLineToRelative(8.39f)
                lineToRelative(0.18f, 1f)
                horizontalLineToRelative(-8.39f)
                lineToRelative(-0.18f, -1f)
                close()
                moveTo(10.28f, 15f)
                horizontalLineToRelative(8.39f)
                lineToRelative(0.18f, 1f)
                horizontalLineToRelative(-8.39f)
                lineToRelative(-0.18f, -1f)
                close()
            }
        }.also { _ReservationTable = it}
