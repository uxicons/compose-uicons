package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UiUx: ImageVector? = null

val Icons.Sr.UiUx: ImageVector
    get() = _UiUx ?: UXIcon(name = "UiUx") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(13f, 15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(8f, 9f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(12f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                lineTo(6f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
                moveTo(14.5f, 8.87f)
                curveToRelative(0.16f, 0.09f, 0.33f, 0.13f, 0.49f, 0.13f)
                curveToRelative(0.35f, 0f, 0.69f, -0.18f, 0.87f, -0.5f)
                lineToRelative(1.13f, -1.98f)
                lineToRelative(1.13f, 1.98f)
                curveToRelative(0.18f, 0.32f, 0.52f, 0.5f, 0.87f, 0.5f)
                curveToRelative(0.17f, 0f, 0.34f, -0.04f, 0.49f, -0.13f)
                curveToRelative(0.48f, -0.27f, 0.65f, -0.89f, 0.37f, -1.36f)
                lineToRelative(-1.72f, -3.0f)
                lineToRelative(1.72f, -3.0f)
                curveToRelative(0.27f, -0.48f, 0.11f, -1.09f, -0.37f, -1.36f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.11f, -1.36f, 0.37f)
                lineToRelative(-1.13f, 1.98f)
                lineToRelative(-1.13f, -1.98f)
                curveToRelative(-0.27f, -0.48f, -0.89f, -0.65f, -1.36f, -0.37f)
                curveToRelative(-0.48f, 0.27f, -0.65f, 0.89f, -0.37f, 1.36f)
                lineToRelative(1.72f, 3.0f)
                lineToRelative(-1.72f, 3.0f)
                curveToRelative(-0.27f, 0.48f, -0.11f, 1.09f, 0.37f, 1.36f)
                close()
            }
        }.also { _UiUx = it}
