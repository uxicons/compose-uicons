package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEmpty: ImageVector? = null

val Icons.Rs.PlateEmpty: ImageVector
    get() = _PlateEmpty ?: UXIcon(name = "PlateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 6.07f)
                curveToRelative(-0.57f, -0.68f, -1.42f, -1.07f, -2.3f, -1.07f)
                lineTo(3.01f, 5f)
                curveToRelative(-0.89f, 0f, -1.73f, 0.39f, -2.3f, 1.07f)
                curveTo(0.14f, 6.74f, -0.1f, 7.62f, 0.04f, 8.48f)
                curveToRelative(0.78f, 4.6f, 3.87f, 8.69f, 7.73f, 10.52f)
                horizontalLineToRelative(8.45f)
                curveToRelative(3.87f, -1.82f, 6.96f, -5.91f, 7.73f, -10.52f)
                curveToRelative(0.15f, -0.86f, -0.1f, -1.74f, -0.66f, -2.42f)
                close()
                moveTo(21.99f, 8.15f)
                curveToRelative(-0.65f, 3.83f, -3.08f, 7.27f, -6.22f, 8.85f)
                horizontalLineToRelative(-7.54f)
                curveToRelative(-3.14f, -1.57f, -5.57f, -5.02f, -6.22f, -8.85f)
                curveToRelative(-0.07f, -0.38f, 0.11f, -0.66f, 0.22f, -0.79f)
                curveToRelative(0.19f, -0.23f, 0.48f, -0.36f, 0.78f, -0.36f)
                lineTo(20.99f, 7.0f)
                curveToRelative(0.3f, 0f, 0.58f, 0.13f, 0.78f, 0.36f)
                curveToRelative(0.11f, 0.13f, 0.28f, 0.41f, 0.22f, 0.79f)
                close()
            }
        }.also { _PlateEmpty = it}
