package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishingRod: ImageVector? = null

val Icons.Ss.FishingRod: ImageVector
    get() = _FishingRod ?: UXIcon(name = "FishingRod") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 22.87f)
                lineToRelative(0.14f, 1.13f)
                lineToRelative(-3f, -1f)
                lineToRelative(-3f, 1f)
                lineToRelative(0.14f, -1.13f)
                curveToRelative(0.14f, -1.08f, 0.7f, -1.99f, 1.24f, -2.64f)
                curveToRelative(-1.0f, -1.02f, -2.38f, -2.79f, -2.38f, -4.89f)
                curveToRelative(0f, -3.23f, 3.26f, -5.7f, 3.4f, -5.8f)
                lineToRelative(0.6f, -0.45f)
                lineToRelative(0.6f, 0.45f)
                curveToRelative(0.14f, 0.1f, 3.4f, 2.58f, 3.4f, 5.8f)
                curveToRelative(0f, 2.1f, -1.38f, 3.88f, -2.38f, 4.89f)
                curveToRelative(0.54f, 0.65f, 1.11f, 1.56f, 1.24f, 2.64f)
                close()
                moveTo(8f, 15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.07f, -1f, -0.18f)
                verticalLineToRelative(4.18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.78f, 0.45f, -1.44f, 1.09f, -1.77f)
                curveTo(1.6f, 9.37f, 4.58f, 0f, 20f, 0f)
                horizontalLineToRelative(1f)
                lineTo(21f, 8f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 2.02f)
                curveTo(7.91f, 2.33f, 4.42f, 8.0f, 3.39f, 12.47f)
                curveToRelative(0.47f, -0.3f, 1.01f, -0.47f, 1.61f, -0.47f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _FishingRod = it}
