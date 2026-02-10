package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRetro: ImageVector? = null

val Icons.Sr.CameraRetro: ImageVector
    get() = _CameraRetro ?: UXIcon(name = "CameraRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 12f)
                verticalLineToRelative(-4f)
                curveTo(0f, 5.24f, 2.24f, 3f, 5f, 3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.17f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(5.17f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6.09f)
                curveToRelative(-0.48f, -2.83f, -2.94f, -5f, -5.91f, -5f)
                reflectiveCurveToRelative(-5.43f, 2.17f, -5.91f, 5f)
                lineTo(0f, 12f)
                close()
                moveTo(8f, 13f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(17.91f, 14f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                reflectiveCurveToRelative(-5.43f, -2.17f, -5.91f, -5f)
                lineTo(0f, 14f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6.09f)
                close()
            }
        }.also { _CameraRetro = it}
