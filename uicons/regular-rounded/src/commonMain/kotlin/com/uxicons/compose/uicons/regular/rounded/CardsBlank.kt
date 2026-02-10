package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardsBlank: ImageVector? = null

val Icons.Rr.CardsBlank: ImageVector
    get() = _CardsBlank ?: UXIcon(name = "CardsBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.47f, 1.97f)
                lineTo(14.78f, 0.22f)
                curveToRelative(-2.61f, -0.8f, -5.41f, 0.66f, -6.22f, 3.24f)
                lineToRelative(-0.19f, 0.54f)
                horizontalLineToRelative(-3.37f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.6f, 0f, 3.0f, -0.77f, 3.92f, -1.93f)
                curveToRelative(0.23f, 0.03f, 0.46f, 0.05f, 0.69f, 0.05f)
                curveToRelative(2.17f, 0f, 4.14f, -1.41f, 4.78f, -3.56f)
                lineToRelative(3.41f, -10.4f)
                curveToRelative(0.77f, -2.61f, -0.73f, -5.39f, -3.33f, -6.19f)
                close()
                moveTo(11f, 22f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(21.89f, 7.56f)
                lineToRelative(-3.41f, 10.4f)
                curveToRelative(-0.36f, 1.21f, -1.41f, 2.02f, -2.6f, 2.13f)
                curveToRelative(0.08f, -0.35f, 0.13f, -0.72f, 0.13f, -1.09f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-0.51f)
                curveToRelative(0.53f, -1.5f, 2.16f, -2.34f, 3.7f, -1.87f)
                lineToRelative(5.69f, 1.75f)
                curveToRelative(1.56f, 0.48f, 2.46f, 2.15f, 2.01f, 3.68f)
                close()
            }
        }.also { _CardsBlank = it}
