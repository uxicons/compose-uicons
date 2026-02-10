package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardsBlank: ImageVector? = null

val Icons.Ts.CardsBlank: ImageVector
    get() = _CardsBlank ?: UXIcon(name = "CardsBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.21f, 3.66f)
                lineTo(11.14f, 0.1f)
                curveToRelative(-1.32f, -0.39f, -2.71f, 0.38f, -3.1f, 1.7f)
                lineToRelative(-0.66f, 2.2f)
                lineTo(2.5f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(0f, 24f)
                lineTo(16f, 24f)
                verticalLineToRelative(-1.22f)
                lineToRelative(2.31f, 0.87f)
                lineTo(23.9f, 6.76f)
                curveToRelative(0.39f, -1.32f, -0.38f, -2.71f, -1.69f, -3.1f)
                close()
                moveTo(15f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(13.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(15f, 23f)
                close()
                moveTo(22.95f, 6.46f)
                lineToRelative(-5.26f, 15.89f)
                lineToRelative(-1.69f, -0.64f)
                lineTo(16f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.08f)
                lineToRelative(0.58f, -1.92f)
                curveToRelative(0.23f, -0.79f, 1.07f, -1.25f, 1.85f, -1.02f)
                lineToRelative(11.07f, 3.56f)
                curveToRelative(0.79f, 0.23f, 1.25f, 1.07f, 1.02f, 1.84f)
                close()
            }
        }.also { _CardsBlank = it}
