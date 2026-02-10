package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ad: ImageVector? = null

val Icons.Rr.Ad: ImageVector
    get() = _Ad ?: UXIcon(name = "Ad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                lineTo(5f, 2f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(10f)
                close()
                moveTo(19f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.34f)
                curveToRelative(-0.46f, -0.22f, -0.96f, -0.34f, -1.5f, -0.34f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.61f, 0f, 1.18f, -0.16f, 1.68f, -0.43f)
                curveToRelative(0.18f, 0.26f, 0.48f, 0.43f, 0.82f, 0.43f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(20f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(16.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.96f, 6.71f)
                curveToRelative(-0.13f, -0.42f, -0.52f, -0.71f, -0.96f, -0.71f)
                reflectiveCurveToRelative(-0.83f, 0.29f, -0.96f, 0.71f)
                lineToRelative(-3f, 10f)
                curveToRelative(-0.16f, 0.53f, 0.14f, 1.09f, 0.67f, 1.25f)
                reflectiveCurveToRelative(1.09f, -0.14f, 1.25f, -0.67f)
                lineToRelative(0.39f, -1.29f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.39f, 1.29f)
                curveToRelative(0.13f, 0.43f, 0.53f, 0.71f, 0.96f, 0.71f)
                curveToRelative(0.1f, 0f, 0.19f, -0.01f, 0.29f, -0.04f)
                curveToRelative(0.53f, -0.16f, 0.83f, -0.72f, 0.67f, -1.25f)
                lineToRelative(-3f, -10f)
                close()
                moveTo(6.94f, 14f)
                lineToRelative(1.06f, -3.52f)
                lineToRelative(1.06f, 3.52f)
                horizontalLineToRelative(-2.11f)
                close()
            }
        }.also { _Ad = it}
