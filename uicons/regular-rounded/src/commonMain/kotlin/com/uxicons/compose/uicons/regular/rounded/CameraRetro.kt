package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRetro: ImageVector? = null

val Icons.Rr.CameraRetro: ImageVector
    get() = _CameraRetro ?: UXIcon(name = "CameraRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-5.17f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.31f, -2.12f, 0.88f)
                lineToRelative(-1.83f, 1.83f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                horizontalLineToRelative(-2.17f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveTo(2.24f, 3f, 0f, 5.24f, 0f, 8f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(4.17f)
                curveToRelative(0.8f, 0f, 1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
                horizontalLineToRelative(5.17f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4.08f)
                curveToRelative(-0.48f, -2.83f, -2.95f, -5f, -5.92f, -5f)
                reflectiveCurveToRelative(-5.44f, 2.17f, -5.92f, 5f)
                lineTo(2f, 12f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4.08f)
                curveToRelative(0.48f, 2.83f, 2.95f, 5f, 5.92f, 5f)
                reflectiveCurveToRelative(5.44f, -2.17f, 5.92f, -5f)
                horizontalLineToRelative(4.08f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _CameraRetro = it}
