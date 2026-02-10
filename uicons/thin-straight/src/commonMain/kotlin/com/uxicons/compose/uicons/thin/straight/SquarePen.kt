package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePen: ImageVector? = null

val Icons.Ts.SquarePen: ImageVector
    get() = _SquarePen ?: UXIcon(name = "SquarePen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(14.73f, 5.73f)
                lineTo(5.0f, 15.46f)
                verticalLineToRelative(3.54f)
                horizontalLineToRelative(3.54f)
                lineToRelative(9.73f, -9.73f)
                curveToRelative(0.97f, -0.88f, 0.93f, -2.62f, 0.01f, -3.54f)
                curveToRelative(-1.25f, -1.25f, -2.92f, -0.61f, -3.54f, 0f)
                close()
                moveTo(8.12f, 18f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(-2.12f)
                lineToRelative(7.34f, -7.34f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(17.56f, 8.56f)
                lineTo(16.16f, 9.96f)
                lineTo(14.04f, 7.84f)
                lineTo(15.44f, 6.44f)
                curveToRelative(0.56f, -0.58f, 1.56f, -0.58f, 2.13f, 0.01f)
                curveToRelative(0.57f, 0.52f, 0.56f, 1.59f, -0.01f, 2.11f)
                close()
            }
        }.also { _SquarePen = it}
