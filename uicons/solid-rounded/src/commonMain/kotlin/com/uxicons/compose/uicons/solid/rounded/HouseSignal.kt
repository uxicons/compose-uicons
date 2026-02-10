package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseSignal: ImageVector? = null

val Icons.Sr.HouseSignal: ImageVector
    get() = _HouseSignal ?: UXIcon(name = "HouseSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.05f, 3.85f)
                lineToRelative(-4.57f, -3.08f)
                curveToRelative(-1.51f, -1.02f, -3.45f, -1.02f, -4.96f, 0f)
                lineToRelative(-4.57f, 3.08f)
                curveToRelative(-1.22f, 0.82f, -1.95f, 2.2f, -1.95f, 3.67f)
                verticalLineToRelative(1.74f)
                curveToRelative(0f, 0.4f, 0.23f, 0.76f, 0.6f, 0.92f)
                curveToRelative(3.24f, 1.42f, 5.81f, 3.98f, 7.23f, 7.23f)
                curveToRelative(0.16f, 0.36f, 0.52f, 0.6f, 0.92f, 0.6f)
                horizontalLineToRelative(5.21f)
                curveToRelative(2.23f, 0f, 4.05f, -1.81f, 4.05f, -4.05f)
                verticalLineToRelative(-6.44f)
                curveToRelative(0f, -1.47f, -0.73f, -2.85f, -1.95f, -3.67f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(1.5f, 21f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(12f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _HouseSignal = it}
