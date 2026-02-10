package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassStart: ImageVector? = null

val Icons.Bs.HourglassStart: ImageVector
    get() = _HourglassStart ?: UXIcon(name = "HourglassStart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.03f, 12f)
                curveToRelative(2.03f, -1.97f, 3.97f, -4.84f, 3.97f, -8.59f)
                curveToRelative(0f, -1.88f, -1.53f, -3.41f, -3.41f, -3.41f)
                lineTo(6.41f, 0f)
                curveToRelative(-1.88f, 0f, -3.41f, 1.53f, -3.41f, 3.41f)
                curveToRelative(0f, 3.75f, 1.95f, 6.62f, 3.99f, 8.59f)
                curveToRelative(-2.04f, 1.97f, -3.99f, 4.83f, -3.99f, 8.59f)
                verticalLineToRelative(3.41f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3.41f)
                curveToRelative(0f, -3.75f, -1.94f, -6.62f, -3.97f, -8.59f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                verticalLineToRelative(-0.41f)
                curveToRelative(0f, -3.38f, 2.28f, -5.9f, 4.2f, -7.41f)
                lineToRelative(1.49f, -1.18f)
                lineToRelative(-1.49f, -1.18f)
                curveToRelative(-1.91f, -1.51f, -4.2f, -4.03f, -4.2f, -7.42f)
                curveToRelative(0f, -0.23f, 0.18f, -0.41f, 0.41f, -0.41f)
                horizontalLineToRelative(11.18f)
                curveToRelative(0.23f, 0f, 0.41f, 0.18f, 0.41f, 0.41f)
                curveToRelative(0f, 3.38f, -2.27f, 5.9f, -4.18f, 7.42f)
                lineToRelative(-1.48f, 1.17f)
                lineToRelative(1.48f, 1.17f)
                curveToRelative(1.91f, 1.52f, 4.18f, 4.03f, 4.18f, 7.42f)
                verticalLineToRelative(0.41f)
                close()
                moveTo(12.58f, 9.26f)
                lineToRelative(-0.57f, 0.45f)
                lineToRelative(-0.58f, -0.46f)
                curveToRelative(-1.23f, -0.97f, -2.64f, -2.43f, -3.2f, -4.25f)
                horizontalLineToRelative(7.52f)
                curveToRelative(-0.55f, 1.83f, -1.96f, 3.29f, -3.18f, 4.26f)
                close()
            }
        }.also { _HourglassStart = it}
