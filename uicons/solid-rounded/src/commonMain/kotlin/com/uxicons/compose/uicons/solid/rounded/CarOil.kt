package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarOil: ImageVector? = null

val Icons.Sr.CarOil: ImageVector
    get() = _CarOil ?: UXIcon(name = "CarOil") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.41f, 13.59f)
                curveToRelative(0.78f, 0.74f, 0.78f, 2.08f, 0f, 2.83f)
                curveToRelative(-0.76f, 0.76f, -2.07f, 0.76f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.01f, -2.84f)
                lineToRelative(1.41f, -1.44f)
                lineToRelative(1.41f, 1.45f)
                close()
                moveTo(22f, 9.46f)
                verticalLineToRelative(9.54f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(5.54f)
                curveToRelative(1.6f, 0f, 3.11f, 0.62f, 4.24f, 1.76f)
                lineToRelative(0.23f, 0.23f)
                lineToRelative(0.6f, -0.6f)
                curveToRelative(0.51f, -0.51f, 1.34f, -0.51f, 1.85f, 0f)
                lineToRelative(1.65f, 1.65f)
                curveToRelative(0.51f, 0.51f, 0.51f, 1.34f, 0f, 1.85f)
                lineToRelative(-0.62f, 0.62f)
                curveToRelative(0.97f, 1.1f, 1.5f, 2.48f, 1.5f, 3.96f)
                close()
                moveTo(10f, 5f)
                curveToRelative(1.64f, 0f, 2.97f, -1.32f, 3.0f, -2.96f)
                curveToRelative(-0.15f, -0.02f, -0.3f, -0.04f, -0.45f, -0.04f)
                horizontalLineToRelative(-5.54f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(16f, 15f)
                curveToRelative(0f, -1.07f, -0.42f, -2.07f, -1.16f, -2.82f)
                lineToRelative(-1.65f, -1.69f)
                curveToRelative(-0.65f, -0.65f, -1.72f, -0.65f, -2.38f, 0.01f)
                lineToRelative(-1.63f, 1.67f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.1f, 0f, 5.66f)
                curveToRelative(1.49f, 1.55f, 4.17f, 1.55f, 5.66f, 0f)
                curveToRelative(0.76f, -0.76f, 1.17f, -1.76f, 1.17f, -2.83f)
                close()
            }
        }.also { _CarOil = it}
