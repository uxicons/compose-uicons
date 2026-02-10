package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Bs.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-2.96f)
                lineToRelative(-2.46f, -3f)
                horizontalLineToRelative(2.42f)
                lineTo(21.0f, 4.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(2.42f)
                lineToRelative(-2.46f, 3f)
                lineTo(0f, 19f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(14.5f, 14.17f)
                lineToRelative(7.23f, 8.83f)
                lineTo(2.27f, 23f)
                lineToRelative(7.23f, -8.82f)
                curveToRelative(0.63f, -0.75f, 1.54f, -1.18f, 2.5f, -1.18f)
                horizontalLineToRelative(0f)
                curveToRelative(0.97f, 0f, 1.88f, 0.43f, 2.5f, 1.17f)
                close()
                moveTo(15.39f, 20f)
                lineToRelative(-3.21f, -3.92f)
                curveToRelative(-0.11f, -0.13f, -0.25f, -0.14f, -0.38f, 0.01f)
                lineToRelative(-3.2f, 3.91f)
                horizontalLineToRelative(6.79f)
                close()
            }
        }.also { _Airplay = it}
