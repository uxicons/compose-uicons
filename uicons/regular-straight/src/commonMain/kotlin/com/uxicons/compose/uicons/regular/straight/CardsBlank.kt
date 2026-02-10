package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardsBlank: ImageVector? = null

val Icons.Rs.CardsBlank: ImageVector
    get() = _CardsBlank ?: UXIcon(name = "CardsBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.85f, 2.98f)
                lineTo(12.41f, 0.12f)
                curveToRelative(-0.77f, -0.23f, -1.58f, -0.14f, -2.28f, 0.25f)
                curveToRelative(-0.7f, 0.39f, -1.21f, 1.02f, -1.44f, 1.78f)
                lineToRelative(-0.56f, 1.85f)
                lineTo(3f, 4.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(0f, 24f)
                lineTo(16f, 24f)
                verticalLineToRelative(-2.04f)
                lineToRelative(3.1f, 1.15f)
                lineTo(23.88f, 6.69f)
                curveToRelative(0.46f, -1.59f, -0.45f, -3.26f, -2.03f, -3.72f)
                close()
                moveTo(14f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(13f, 6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(21.96f, 6.13f)
                lineToRelative(-4.18f, 14.35f)
                lineToRelative(-1.78f, -0.66f)
                lineTo(16f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2.77f)
                lineToRelative(0.39f, -1.28f)
                curveToRelative(0.07f, -0.26f, 0.24f, -0.47f, 0.48f, -0.6f)
                curveToRelative(0.23f, -0.13f, 0.51f, -0.16f, 0.75f, -0.09f)
                lineToRelative(9.44f, 2.86f)
                curveToRelative(0.53f, 0.15f, 0.83f, 0.71f, 0.68f, 1.24f)
                close()
            }
        }.also { _CardsBlank = it}
