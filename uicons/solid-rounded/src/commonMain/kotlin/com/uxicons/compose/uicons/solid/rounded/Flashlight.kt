package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flashlight: ImageVector? = null

val Icons.Sr.Flashlight: ImageVector
    get() = _Flashlight ?: UXIcon(name = "Flashlight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.27f, 14f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-4f, -4f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-1.27f)
                curveToRelative(0f, -2.55f, 1.2f, -5.34f, 3.14f, -7.28f)
                curveToRelative(0.59f, -0.59f, 1.55f, -0.59f, 2.14f, -0.0f)
                lineToRelative(8.27f, 8.27f)
                curveToRelative(0.29f, 0.29f, 0.44f, 0.67f, 0.44f, 1.07f)
                curveToRelative(0f, 0.4f, -0.16f, 0.79f, -0.45f, 1.07f)
                curveToRelative(-1.94f, 1.94f, -4.73f, 3.14f, -7.28f, 3.14f)
                close()
                moveTo(22.14f, 9.44f)
                verticalLineToRelative(0.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, -0.0f)
                close()
                moveTo(8.16f, 11.48f)
                lineTo(0.9f, 18.74f)
                curveToRelative(-1.2f, 1.2f, -1.2f, 3.15f, 0f, 4.36f)
                horizontalLineToRelative(0f)
                curveToRelative(1.2f, 1.2f, 3.15f, 1.2f, 4.36f, 0f)
                lineToRelative(7.26f, -7.26f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.94f, -2.94f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                close()
                moveTo(7.29f, 15.29f)
                lineToRelative(0.83f, -0.83f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-0.83f, 0.83f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _Flashlight = it}
