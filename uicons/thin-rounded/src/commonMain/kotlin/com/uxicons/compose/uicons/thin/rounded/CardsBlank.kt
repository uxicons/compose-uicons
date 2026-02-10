package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardsBlank: ImageVector? = null

val Icons.Tr.CardsBlank: ImageVector
    get() = _CardsBlank ?: UXIcon(name = "CardsBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 4.78f)
                curveToRelative(-0.55f, -1.08f, -1.48f, -1.88f, -2.63f, -2.25f)
                lineTo(13.72f, 0.22f)
                curveToRelative(-1.16f, -0.37f, -2.39f, -0.27f, -3.47f, 0.3f)
                curveToRelative(-1.08f, 0.57f, -1.87f, 1.52f, -2.22f, 2.69f)
                lineToRelative(-0.24f, 0.79f)
                horizontalLineToRelative(-3.29f)
                curveTo(2.02f, 4f, 0f, 6.02f, 0f, 8.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.58f, 0f, 2.97f, -0.83f, 3.77f, -2.07f)
                curveToRelative(0.24f, 0.04f, 0.48f, 0.07f, 0.71f, 0.07f)
                curveToRelative(1.9f, 0f, 3.65f, -1.22f, 4.27f, -3.09f)
                lineToRelative(3.56f, -10.69f)
                curveToRelative(0.38f, -1.15f, 0.29f, -2.37f, -0.26f, -3.45f)
                close()
                moveTo(11.5f, 23f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(22.86f, 7.92f)
                lineToRelative(-3.56f, 10.69f)
                curveToRelative(-0.51f, 1.54f, -2.0f, 2.5f, -3.58f, 2.38f)
                curveToRelative(0.16f, -0.47f, 0.27f, -0.96f, 0.27f, -1.48f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.66f)
                lineToRelative(0.15f, -0.51f)
                curveToRelative(0.27f, -0.91f, 0.89f, -1.65f, 1.73f, -2.09f)
                curveToRelative(0.84f, -0.44f, 1.8f, -0.52f, 2.7f, -0.23f)
                lineToRelative(7.2f, 2.32f)
                curveToRelative(0.9f, 0.29f, 1.62f, 0.91f, 2.05f, 1.75f)
                curveToRelative(0.43f, 0.84f, 0.5f, 1.79f, 0.2f, 2.68f)
                close()
            }
        }.also { _CardsBlank = it}
