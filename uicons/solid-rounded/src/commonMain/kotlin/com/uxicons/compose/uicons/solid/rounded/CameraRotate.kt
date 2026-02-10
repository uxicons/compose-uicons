package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRotate: ImageVector? = null

val Icons.Sr.CameraRotate: ImageVector
    get() = _CameraRotate ?: UXIcon(name = "CameraRotate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 5f)
                lineTo(5f, 5f)
                curveTo(2.24f, 5f, 0f, 7.24f, 0f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17.5f, 17.4f)
                curveToRelative(-0.96f, 2.19f, -3.12f, 3.6f, -5.5f, 3.6f)
                curveToRelative(-1.47f, 0f, -2.88f, -0.55f, -3.96f, -1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.96f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.64f)
                curveToRelative(0.72f, 0.63f, 1.66f, 1f, 2.64f, 1f)
                curveToRelative(1.59f, 0f, 3.03f, -0.94f, 3.67f, -2.4f)
                curveToRelative(0.22f, -0.51f, 0.81f, -0.74f, 1.32f, -0.52f)
                curveToRelative(0.51f, 0.22f, 0.74f, 0.81f, 0.52f, 1.32f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.64f)
                curveToRelative(-0.72f, -0.63f, -1.66f, -1f, -2.64f, -1f)
                curveToRelative(-1.59f, 0f, -3.03f, 0.94f, -3.67f, 2.4f)
                curveToRelative(-0.17f, 0.38f, -0.53f, 0.6f, -0.92f, 0.6f)
                curveToRelative(-0.13f, 0f, -0.27f, -0.03f, -0.4f, -0.08f)
                curveToRelative(-0.51f, -0.22f, -0.74f, -0.81f, -0.52f, -1.32f)
                curveToRelative(0.96f, -2.19f, 3.12f, -3.6f, 5.5f, -3.6f)
                curveToRelative(1.49f, 0f, 2.91f, 0.56f, 4f, 1.53f)
                verticalLineToRelative(-0.53f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(6.25f, 3f)
                lineToRelative(1.35f, -1.8f)
                curveToRelative(0.56f, -0.75f, 1.46f, -1.2f, 2.4f, -1.2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.94f, 0f, 1.83f, 0.45f, 2.4f, 1.2f)
                lineToRelative(1.35f, 1.8f)
                lineTo(6.25f, 3f)
                close()
            }
        }.also { _CameraRotate = it}
