package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlantWilt: ImageVector? = null

val Icons.Sr.PlantWilt: ImageVector
    get() = _PlantWilt ?: UXIcon(name = "PlantWilt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.99f, 12.12f)
                curveToRelative(-0.14f, -4.51f, -2.75f, -6.12f, -4.99f, -6.12f)
                curveToRelative(-1.01f, 0f, -2.1f, 0.33f, -3f, 1.1f)
                verticalLineToRelative(-0.6f)
                curveTo(13f, 1.7f, 10.31f, 0f, 8f, 0f)
                curveTo(5.75f, 0f, 3.14f, 1.61f, 3.01f, 6.12f)
                curveToRelative(-1.73f, 0.44f, -3.01f, 2.01f, -3.01f, 3.88f)
                curveToRelative(0f, 1.74f, 1.11f, 3.8f, 2.06f, 5.04f)
                curveToRelative(0.47f, 0.61f, 1.18f, 0.96f, 1.95f, 0.96f)
                reflectiveCurveToRelative(1.48f, -0.35f, 1.95f, -0.96f)
                curveToRelative(0.95f, -1.24f, 2.06f, -3.3f, 2.06f, -5.04f)
                curveToRelative(0f, -1.86f, -1.27f, -3.42f, -2.99f, -3.87f)
                curveToRelative(0.13f, -3.82f, 2.31f, -4.13f, 2.99f, -4.13f)
                curveToRelative(0.7f, 0f, 3f, 0.33f, 3f, 4.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -4.17f, 2.3f, -4.5f, 3f, -4.5f)
                curveToRelative(0.68f, 0f, 2.86f, 0.3f, 2.99f, 4.13f)
                curveToRelative(-1.72f, 0.45f, -2.99f, 2.01f, -2.99f, 3.87f)
                curveToRelative(0f, 1.74f, 1.11f, 3.8f, 2.06f, 5.04f)
                curveToRelative(0.47f, 0.61f, 1.18f, 0.96f, 1.95f, 0.96f)
                reflectiveCurveToRelative(1.48f, -0.35f, 1.95f, -0.96f)
                curveToRelative(0.95f, -1.24f, 2.06f, -3.3f, 2.06f, -5.04f)
                curveToRelative(0f, -1.86f, -1.28f, -3.43f, -3.01f, -3.88f)
                close()
            }
        }.also { _PlantWilt = it}
