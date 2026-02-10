package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheeseburger: ImageVector? = null

val Icons.Bs.Cheeseburger: ImageVector
    get() = _Cheeseburger ?: UXIcon(name = "Cheeseburger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.09f, 16f)
                lineTo(1.0f, 16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.08f)
                lineToRelative(-3.41f, 3.41f)
                lineToRelative(-3.41f, -3.41f)
                close()
                moveTo(15.5f, 22.24f)
                lineToRelative(-4.24f, -4.24f)
                lineTo(1.0f, 18f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.26f)
                lineToRelative(-4.24f, 4.24f)
                close()
                moveTo(23.11f, 11f)
                lineTo(0.88f, 11f)
                lineToRelative(0.18f, -1.66f)
                curveTo(1.64f, 3.93f, 6.24f, 0f, 12.0f, 0f)
                reflectiveCurveToRelative(10.37f, 3.93f, 10.94f, 9.34f)
                lineToRelative(0.17f, 1.66f)
                close()
                moveTo(19.59f, 8f)
                curveToRelative(-1.04f, -3.01f, -3.95f, -5f, -7.59f, -5f)
                curveToRelative(-3.57f, 0f, -6.52f, 2.02f, -7.58f, 5f)
                horizontalLineToRelative(15.17f)
                close()
            }
        }.also { _Cheeseburger = it}
