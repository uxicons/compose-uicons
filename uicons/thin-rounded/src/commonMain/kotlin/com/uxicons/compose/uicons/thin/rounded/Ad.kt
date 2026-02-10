package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ad: ImageVector? = null

val Icons.Tr.Ad: ImageVector
    get() = _Ad ?: UXIcon(name = "Ad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(11f)
                close()
                moveTo(19.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.55f)
                curveToRelative(-0.64f, -0.65f, -1.52f, -1.05f, -2.5f, -1.05f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.98f, 0f, 1.86f, -0.4f, 2.5f, -1.05f)
                verticalLineToRelative(0.55f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(20f, 6.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(16.5f, 17f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(8.48f, 6.35f)
                curveToRelative(-0.13f, -0.41f, -0.82f, -0.41f, -0.95f, 0f)
                lineToRelative(-3.5f, 11f)
                curveToRelative(-0.08f, 0.26f, 0.06f, 0.54f, 0.33f, 0.63f)
                curveToRelative(0.26f, 0.09f, 0.54f, -0.06f, 0.63f, -0.33f)
                lineToRelative(0.53f, -1.65f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.53f, 1.65f)
                curveToRelative(0.07f, 0.21f, 0.27f, 0.35f, 0.48f, 0.35f)
                curveToRelative(0.05f, 0f, 0.1f, -0.01f, 0.15f, -0.02f)
                curveToRelative(0.26f, -0.08f, 0.41f, -0.36f, 0.33f, -0.63f)
                lineToRelative(-3.5f, -11f)
                close()
                moveTo(5.82f, 15f)
                lineToRelative(2.18f, -6.85f)
                lineToRelative(2.18f, 6.85f)
                lineTo(5.82f, 15f)
                close()
            }
        }.also { _Ad = it}
