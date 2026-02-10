package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square7: ImageVector? = null

val Icons.Rr.Square7: ImageVector
    get() = _Square7 ?: UXIcon(name = "Square7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(5f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 2f)
                close()
                moveTo(10.87f, 17.5f)
                lineToRelative(4.92f, -8.6f)
                curveToRelative(0.31f, -0.62f, 0.28f, -1.35f, -0.09f, -1.95f)
                reflectiveCurveToRelative(-1.0f, -0.95f, -1.7f, -0.95f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineToRelative(5.03f, -0.05f)
                lineToRelative(-4.89f, 8.55f)
                curveToRelative(-0.27f, 0.48f, -0.11f, 1.09f, 0.37f, 1.36f)
                curveToRelative(0.16f, 0.09f, 0.33f, 0.13f, 0.5f, 0.13f)
                curveToRelative(0.35f, 0f, 0.68f, -0.18f, 0.87f, -0.5f)
                close()
            }
        }.also { _Square7 = it}
