package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRetro: ImageVector? = null

val Icons.Rs.CameraRetro: ImageVector
    get() = _CameraRetro ?: UXIcon(name = "CameraRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-8.41f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-2.59f)
                lineTo(7f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 5f)
                horizontalLineToRelative(7.41f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(7.59f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-4.08f)
                curveToRelative(-0.48f, -2.83f, -2.95f, -5f, -5.92f, -5f)
                reflectiveCurveToRelative(-5.44f, 2.17f, -5.92f, 5f)
                lineTo(2f, 12f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4.08f)
                curveToRelative(0.48f, 2.83f, 2.95f, 5f, 5.92f, 5f)
                reflectiveCurveToRelative(5.44f, -2.17f, 5.92f, -5f)
                horizontalLineToRelative(4.08f)
                verticalLineToRelative(8f)
                lineTo(2f, 22f)
                close()
            }
        }.also { _CameraRetro = it}
