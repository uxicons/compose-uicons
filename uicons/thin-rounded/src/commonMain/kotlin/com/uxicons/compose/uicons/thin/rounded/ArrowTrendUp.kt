package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendUp: ImageVector? = null

val Icons.Tr.ArrowTrendUp: ImageVector
    get() = _ArrowTrendUp ?: UXIcon(name = "ArrowTrendUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 6f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.23f, 0f, 0.45f, 0.05f, 0.65f, 0.15f)
                lineTo(13.44f, 15.85f)
                curveToRelative(-0.24f, 0.24f, -0.64f, 0.24f, -0.88f, 0f)
                lineToRelative(-4.36f, -4.36f)
                curveToRelative(-0.66f, -0.66f, -1.74f, -0.66f, -2.4f, 0f)
                lineTo(0.15f, 17.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(5.65f, -5.65f)
                curveToRelative(0.26f, -0.26f, 0.72f, -0.26f, 0.98f, 0f)
                lineToRelative(4.36f, 4.36f)
                curveToRelative(0.61f, 0.61f, 1.68f, 0.61f, 2.3f, 0f)
                lineTo(22.85f, 7.85f)
                curveToRelative(0.09f, 0.2f, 0.15f, 0.41f, 0.15f, 0.65f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _ArrowTrendUp = it}
