package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRotate: ImageVector? = null

val Icons.Ts.CameraRotate: ImageVector
    get() = _CameraRotate ?: UXIcon(name = "CameraRotate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 4f)
                horizontalLineToRelative(-3.25f)
                lineTo(15.25f, 0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-3f, 4f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9.25f, 1f)
                horizontalLineToRelative(5.5f)
                lineToRelative(2.25f, 3f)
                lineTo(7f, 4f)
                lineToRelative(2.25f, -3f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.02f, 0f, 0.04f, -0.0f, 0.07f, -0.01f)
                curveToRelative(-0.77f, -1.76f, -2.52f, -3.0f, -4.57f, -3.0f)
                curveToRelative(-2.42f, 0f, -4.44f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(0.48f, -2.84f, 2.94f, -5f, 5.91f, -5f)
                curveToRelative(2.09f, 0f, 3.93f, 1.07f, 5f, 2.7f)
                verticalLineToRelative(-2.7f)
                close()
                moveTo(16.9f, 15f)
                horizontalLineToRelative(1.01f)
                curveToRelative(-0.48f, 2.84f, -2.94f, 5f, -5.91f, 5f)
                curveToRelative(-2.09f, 0f, -3.93f, -1.08f, -5f, -2.7f)
                verticalLineToRelative(2.7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.02f, 0f, -0.04f, 0.0f, -0.06f, 0.0f)
                curveToRelative(0.77f, 1.76f, 2.52f, 3.0f, 4.56f, 3.0f)
                curveToRelative(2.42f, 0f, 4.44f, -1.72f, 4.9f, -4f)
                close()
            }
        }.also { _CameraRotate = it}
