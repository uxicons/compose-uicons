package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VanFast: ImageVector? = null

val Icons.Sr.VanFast: ImageVector
    get() = _VanFast ?: UXIcon(name = "VanFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(6f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(4f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(4.18f)
                horizontalLineToRelative(5f)
                close()
                moveTo(20.97f, 4.97f)
                curveToRelative(-0.8f, -1.8f, -2.6f, -2.97f, -4.57f, -2.97f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8.21f)
                close()
                moveTo(3.06f, 20f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                close()
                moveTo(16.06f, 20f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(-4.88f)
                close()
                moveTo(23.89f, 12f)
                horizontalLineToRelative(-18.07f)
                curveToRelative(-0.41f, 1.16f, -1.51f, 2f, -2.82f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-0.73f)
                curveToRelative(0f, -0.43f, -0.04f, -0.86f, -0.12f, -1.27f)
                close()
            }
        }.also { _VanFast = it}
