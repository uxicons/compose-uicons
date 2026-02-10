package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Rs.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.54f, 5.47f)
                curveToRelative(1.2f, -1.02f, 2.46f, -2.55f, 2.46f, -4.47f)
                lineTo(17f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 1f)
                curveToRelative(0f, 1.92f, 1.26f, 3.45f, 2.46f, 4.47f)
                curveTo(4.75f, 7.15f, 1f, 13.12f, 1f, 18f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(10f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -4.88f, -3.75f, -10.85f, -8.46f, -12.53f)
                close()
                moveTo(9.21f, 2f)
                horizontalLineToRelative(5.58f)
                curveToRelative(-0.52f, 1.26f, -1.89f, 2.31f, -2.78f, 2.85f)
                curveToRelative(-0.75f, -0.46f, -2.25f, -1.51f, -2.8f, -2.85f)
                close()
                moveTo(17f, 22f)
                lineTo(7f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -5.16f, 4.6f, -10.98f, 9.0f, -10.98f)
                curveToRelative(4.48f, 0f, 9.0f, 5.82f, 9.0f, 10.98f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _Sack = it}
