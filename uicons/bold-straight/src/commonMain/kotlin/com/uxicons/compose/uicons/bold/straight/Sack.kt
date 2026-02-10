package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Bs.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.68f, 5.19f)
                curveToRelative(1.45f, -1.07f, 3.32f, -2.9f, 3.32f, -5.19f)
                lineTo(7f, 0f)
                curveToRelative(0f, 2.29f, 1.87f, 4.12f, 3.32f, 5.19f)
                curveTo(5.15f, 6.34f, 1f, 12.58f, 1f, 17.77f)
                curveToRelative(0f, 3.43f, 2.8f, 6.23f, 6.25f, 6.23f)
                horizontalLineToRelative(9.5f)
                curveToRelative(3.45f, 0f, 6.25f, -2.79f, 6.25f, -6.23f)
                curveToRelative(0f, -5.2f, -4.15f, -11.43f, -9.32f, -12.58f)
                close()
                moveTo(16.75f, 21f)
                lineTo(7.25f, 21f)
                curveToRelative(-1.79f, 0f, -3.25f, -1.45f, -3.25f, -3.23f)
                curveToRelative(0f, -4.57f, 4.26f, -9.77f, 8f, -9.77f)
                reflectiveCurveToRelative(8f, 5.21f, 8f, 9.77f)
                curveToRelative(0f, 1.78f, -1.46f, 3.23f, -3.25f, 3.23f)
                close()
            }
        }.also { _Sack = it}
