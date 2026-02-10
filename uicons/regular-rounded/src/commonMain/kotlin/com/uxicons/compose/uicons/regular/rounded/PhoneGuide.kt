package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneGuide: ImageVector? = null

val Icons.Rr.PhoneGuide: ImageVector
    get() = _PhoneGuide ?: UXIcon(name = "PhoneGuide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.66f, 22.59f)
                lineToRelative(-0.52f, 0.6f)
                curveToRelative(-0.55f, 0.55f, -1.28f, 0.81f, -2f, 0.81f)
                curveToRelative(-3.71f, 0f, -9.14f, -5.14f, -9.14f, -9.14f)
                curveToRelative(0f, -0.72f, 0.26f, -1.45f, 0.81f, -2f)
                lineToRelative(0.6f, -0.52f)
                curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
                lineToRelative(1.21f, 1.3f)
                curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
                lineToRelative(-1.02f, 1.04f)
                curveToRelative(0.9f, 2.24f, 2.43f, 3.71f, 4.5f, 4.5f)
                lineToRelative(1.04f, -1.02f)
                curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
                lineToRelative(1.3f, 1.21f)
                curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
                close()
                moveTo(14f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(18f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6f, 2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(2f, 5f)
                verticalLineToRelative(11.56f)
                curveToRelative(0.59f, -0.34f, 1.27f, -0.56f, 2f, -0.56f)
                lineTo(4f, 2.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                close()
            }
        }.also { _PhoneGuide = it}
