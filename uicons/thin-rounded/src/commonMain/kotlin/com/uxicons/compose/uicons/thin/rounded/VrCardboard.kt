package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VrCardboard: ImageVector? = null

val Icons.Tr.VrCardboard: ImageVector
    get() = _VrCardboard ?: UXIcon(name = "VrCardboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(17f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(17f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(19.5f, 3f)
                lineTo(4.5f, 3f)
                curveTo(2.02f, 3f, 0f, 5.02f, 0f, 7.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.94f, 0f, 1.8f, -0.52f, 2.23f, -1.36f)
                lineToRelative(1.47f, -2.88f)
                curveToRelative(0.27f, -0.47f, 0.76f, -0.75f, 1.3f, -0.75f)
                reflectiveCurveToRelative(1.03f, 0.28f, 1.29f, 0.72f)
                lineToRelative(1.5f, 2.92f)
                curveToRelative(0.43f, 0.83f, 1.28f, 1.35f, 2.22f, 1.35f)
                horizontalLineToRelative(2.49f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 16.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.49f)
                curveToRelative(-0.56f, 0f, -1.07f, -0.31f, -1.33f, -0.81f)
                lineToRelative(-1.52f, -2.94f)
                curveToRelative(-0.45f, -0.78f, -1.26f, -1.24f, -2.16f, -1.24f)
                reflectiveCurveToRelative(-1.71f, 0.46f, -2.18f, 1.27f)
                lineToRelative(-1.48f, 2.91f)
                curveToRelative(-0.26f, 0.51f, -0.77f, 0.82f, -1.34f, 0.82f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 7.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _VrCardboard = it}
