package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardsBlank: ImageVector? = null

val Icons.Ss.CardsBlank: ImageVector
    get() = _CardsBlank ?: UXIcon(name = "CardsBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(0f, 24f)
                lineTo(16f, 24f)
                lineTo(16f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(23.88f, 6.69f)
                lineToRelative(-4.78f, 16.41f)
                lineToRelative(-1.1f, -0.41f)
                lineTo(18f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-4.24f)
                curveToRelative(0.24f, -0.69f, 0.72f, -1.27f, 1.37f, -1.63f)
                curveToRelative(0.7f, -0.39f, 1.51f, -0.47f, 2.28f, -0.25f)
                lineToRelative(9.44f, 2.86f)
                curveToRelative(1.58f, 0.46f, 2.49f, 2.13f, 2.03f, 3.72f)
                close()
            }
        }.also { _CardsBlank = it}
