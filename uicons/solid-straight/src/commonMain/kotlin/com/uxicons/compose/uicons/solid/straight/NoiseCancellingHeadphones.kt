package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoiseCancellingHeadphones: ImageVector? = null

val Icons.Ss.NoiseCancellingHeadphones: ImageVector
    get() = _NoiseCancellingHeadphones ?: UXIcon(name = "NoiseCancellingHeadphones") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(16f, 18f)
                curveToRelative(0f, 0.74f, -0.21f, 1.42f, -0.57f, 2.02f)
                lineToRelative(-5.45f, -5.45f)
                curveToRelative(0.59f, -0.35f, 1.28f, -0.57f, 2.02f, -0.57f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(8f, 18f)
                curveToRelative(0f, -0.74f, 0.21f, -1.42f, 0.57f, -2.02f)
                lineToRelative(5.45f, 5.45f)
                curveToRelative(-0.59f, 0.35f, -1.28f, 0.57f, -2.02f, 0.57f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveTo(24f, 14f)
                curveToRelative(0f, 2.43f, -1.75f, 4.46f, -4.05f, 4.9f)
                curveToRelative(0.03f, -0.3f, 0.06f, -0.6f, 0.06f, -0.9f)
                curveToRelative(0f, -2.52f, -1.17f, -4.77f, -3f, -6.24f)
                verticalLineToRelative(-2.76f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.76f)
                curveToRelative(-1.83f, 1.47f, -3f, 3.71f, -3f, 6.24f)
                curveToRelative(0f, 0.31f, 0.02f, 0.61f, 0.06f, 0.9f)
                curveToRelative(-2.31f, -0.44f, -4.05f, -2.47f, -4.05f, -4.9f)
                curveToRelative(0f, -2.04f, 1.24f, -3.8f, 3f, -4.58f)
                verticalLineToRelative(-0.42f)
                curveTo(3f, 4.04f, 7.04f, 0f, 12f, 0f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(0.42f)
                curveToRelative(1.76f, 0.77f, 3f, 2.53f, 3f, 4.58f)
                close()
            }
        }.also { _NoiseCancellingHeadphones = it}
