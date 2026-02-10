package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishingRod: ImageVector? = null

val Icons.Rs.FishingRod: ImageVector
    get() = _FishingRod ?: UXIcon(name = "FishingRod") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.62f, 20.23f)
                curveToRelative(1.0f, -1.02f, 2.38f, -2.79f, 2.38f, -4.89f)
                curveToRelative(0f, -3.23f, -3.26f, -5.7f, -3.4f, -5.8f)
                lineToRelative(-0.6f, -0.45f)
                lineToRelative(-0.6f, 0.45f)
                curveToRelative(-0.14f, 0.1f, -3.4f, 2.58f, -3.4f, 5.8f)
                curveToRelative(0f, 2.1f, 1.38f, 3.87f, 2.38f, 4.89f)
                curveToRelative(-0.54f, 0.65f, -1.1f, 1.57f, -1.24f, 2.64f)
                lineToRelative(-0.14f, 1.13f)
                lineToRelative(3f, -1f)
                lineToRelative(3f, 1f)
                lineToRelative(-0.14f, -1.13f)
                curveToRelative(-0.14f, -1.07f, -0.7f, -1.99f, -1.24f, -2.64f)
                close()
                moveTo(20.0f, 11.66f)
                curveToRelative(0.77f, 0.73f, 2.0f, 2.15f, 2.0f, 3.68f)
                curveToRelative(0f, 1.53f, -1.23f, 2.95f, -2f, 3.68f)
                curveToRelative(-0.77f, -0.73f, -2f, -2.14f, -2f, -3.68f)
                reflectiveCurveToRelative(1.23f, -2.94f, 2.0f, -3.68f)
                close()
                moveTo(5f, 12.0f)
                curveToRelative(-0.59f, 0f, -1.14f, 0.17f, -1.61f, 0.47f)
                curveTo(4.42f, 8.0f, 7.92f, 2.33f, 19f, 2.02f)
                verticalLineToRelative(5.99f)
                horizontalLineToRelative(2f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-1f)
                curveTo(4.59f, 0f, 1.6f, 9.35f, 1.09f, 14.22f)
                curveToRelative(-0.65f, 0.33f, -1.09f, 1.01f, -1.09f, 1.78f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4.17f)
                curveToRelative(0.31f, 0.11f, 0.65f, 0.17f, 1f, 0.17f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 16.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _FishingRod = it}
