package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffin: ImageVector? = null

val Icons.Ts.Coffin: ImageVector
    get() = _Coffin ?: UXIcon(name = "Coffin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.46f, 1.61f)
                curveToRelative(-0.37f, -0.96f, -1.31f, -1.61f, -2.33f, -1.61f)
                lineTo(7.88f, 0f)
                curveToRelative(-1.03f, 0f, -1.97f, 0.65f, -2.33f, 1.61f)
                lineToRelative(-2.56f, 6.69f)
                lineToRelative(3.11f, 15.7f)
                horizontalLineToRelative(11.82f)
                lineToRelative(3.11f, -15.7f)
                lineToRelative(-2.56f, -6.69f)
                close()
                moveTo(17.09f, 23f)
                lineTo(6.91f, 23f)
                lineToRelative(-2.89f, -14.62f)
                lineTo(6.47f, 1.96f)
                curveToRelative(0.22f, -0.58f, 0.78f, -0.96f, 1.4f, -0.96f)
                horizontalLineToRelative(8.25f)
                curveToRelative(0.62f, 0f, 1.18f, 0.39f, 1.4f, 0.96f)
                lineToRelative(2.46f, 6.42f)
                lineToRelative(-2.89f, 14.62f)
                close()
            }
        }.also { _Coffin = it}
