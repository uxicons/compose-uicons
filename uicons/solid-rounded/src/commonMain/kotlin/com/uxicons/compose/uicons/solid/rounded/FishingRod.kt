package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishingRod: ImageVector? = null

val Icons.Sr.FishingRod: ImageVector
    get() = _FishingRod ?: UXIcon(name = "FishingRod") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.99f, 22.88f)
                curveToRelative(0.04f, 0.34f, -0.09f, 0.68f, -0.36f, 0.9f)
                curveToRelative(-0.18f, 0.15f, -0.41f, 0.23f, -0.63f, 0.23f)
                curveToRelative(-0.26f, 0f, -2f, -0.61f, -2f, -0.61f)
                lineToRelative(-1.68f, 0.56f)
                curveToRelative(-0.33f, 0.11f, -0.69f, 0.04f, -0.95f, -0.17f)
                curveToRelative(-0.27f, -0.22f, -0.4f, -0.56f, -0.36f, -0.9f)
                lineToRelative(0.1f, -0.75f)
                curveToRelative(0.11f, -0.9f, 0.56f, -1.66f, 0.99f, -2.2f)
                curveToRelative(-0.96f, -1.05f, -2.09f, -2.69f, -2.09f, -4.58f)
                curveToRelative(0f, -1.43f, 0.65f, -2.93f, 1.88f, -4.35f)
                curveToRelative(1.07f, -1.23f, 3.17f, -1.23f, 4.24f, 0f)
                curveToRelative(1.23f, 1.42f, 1.88f, 2.93f, 1.88f, 4.35f)
                curveToRelative(0f, 1.9f, -1.13f, 3.54f, -2.09f, 4.58f)
                curveToRelative(0.43f, 0.54f, 0.87f, 1.29f, 0.99f, 2.2f)
                lineToRelative(0.1f, 0.75f)
                close()
                moveTo(8f, 15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.06f, -1f, -0.17f)
                verticalLineToRelative(4.17f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.78f, 0.45f, -1.45f, 1.1f, -1.78f)
                curveTo(1.59f, 9.48f, 4.45f, 0.41f, 18.95f, -0.0f)
                curveToRelative(0.54f, -0.0f, 1.05f, 0.19f, 1.44f, 0.56f)
                curveToRelative(0.39f, 0.38f, 0.61f, 0.9f, 0.61f, 1.44f)
                lineTo(21f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(19f, 2f)
                curveTo(7.91f, 2.31f, 4.42f, 8.0f, 3.39f, 12.47f)
                curveToRelative(0.47f, -0.3f, 1.02f, -0.47f, 1.61f, -0.47f)
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
