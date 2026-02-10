package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dress: ImageVector? = null

val Icons.Sr.Dress: ImageVector
    get() = _Dress ?: UXIcon(name = "Dress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.78f, 14.67f)
                curveToRelative(1.27f, 0.83f, 1.59f, 2.54f, 0.75f, 3.81f)
                curveToRelative(-2.27f, 3.42f, -6.32f, 5.6f, -10.53f, 5.58f)
                curveToRelative(-4.22f, 0.02f, -8.25f, -2.35f, -10.52f, -5.77f)
                curveToRelative(-0.84f, -1.26f, -0.52f, -2.97f, 0.75f, -3.8f)
                lineToRelative(5.77f, -3.49f)
                horizontalLineToRelative(8f)
                lineToRelative(5.78f, 3.67f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(8f)
                lineToRelative(0.74f, -2.21f)
                curveToRelative(0.17f, -0.78f, 0.26f, -1.58f, 0.26f, -2.39f)
                lineTo(17f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.1f)
                curveToRelative(-1.33f, 0.25f, -2.35f, 0.94f, -3f, 1.51f)
                curveToRelative(-0.65f, -0.58f, -1.67f, -1.26f, -3f, -1.51f)
                lineTo(9f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.8f, 0.09f, 1.6f, 0.26f, 2.39f)
                lineToRelative(0.74f, 2.21f)
                close()
            }
        }.also { _Dress = it}
