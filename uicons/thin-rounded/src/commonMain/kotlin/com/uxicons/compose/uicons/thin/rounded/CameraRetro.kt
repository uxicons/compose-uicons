package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRetro: ImageVector? = null

val Icons.Tr.CameraRetro: ImageVector
    get() = _CameraRetro ?: UXIcon(name = "CameraRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                horizontalLineToRelative(-5.67f)
                curveToRelative(-0.67f, 0f, -1.3f, 0.26f, -1.77f, 0.73f)
                lineToRelative(-1.83f, 1.83f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                horizontalLineToRelative(-2.17f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveTo(2.02f, 3f, 0f, 5.02f, 0f, 7.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 4f)
                horizontalLineToRelative(4.67f)
                curveToRelative(0.67f, 0f, 1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
                horizontalLineToRelative(5.67f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-5.52f)
                curveToRelative(-0.25f, -2.8f, -2.61f, -5f, -5.48f, -5f)
                reflectiveCurveToRelative(-5.22f, 2.2f, -5.48f, 5f)
                lineTo(1f, 13.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(16.5f, 13.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(19.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(5.52f)
                curveToRelative(0.25f, 2.8f, 2.61f, 5f, 5.48f, 5f)
                reflectiveCurveToRelative(5.22f, -2.2f, 5.48f, -5f)
                horizontalLineToRelative(5.52f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _CameraRetro = it}
