package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraSlash: ImageVector? = null

val Icons.Ss.CameraSlash: ImageVector
    get() = _CameraSlash ?: UXIcon(name = "CameraSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 14f)
                curveToRelative(0f, -0.23f, 0.03f, -0.46f, 0.08f, -0.68f)
                lineToRelative(3.6f, 3.6f)
                curveToRelative(-0.22f, 0.05f, -0.45f, 0.08f, -0.68f, 0.08f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(14.23f, 18.48f)
                curveToRelative(-0.68f, 0.34f, -1.44f, 0.52f, -2.23f, 0.52f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -0.8f, 0.19f, -1.56f, 0.52f, -2.23f)
                lineTo(1.76f, 6.0f)
                curveToRelative(-0.47f, 0.53f, -0.76f, 1.23f, -0.76f, 2.0f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(17.76f)
                lineToRelative(-4.52f, -4.52f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(4.96f, 4.96f)
                horizontalLineToRelative(13.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(13.59f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-0.47f, 0f, -0.94f, 0.07f, -1.39f, 0.2f)
                lineToRelative(6.19f, 6.19f)
                curveToRelative(0.13f, -0.45f, 0.2f, -0.92f, 0.2f, -1.39f)
                close()
                moveTo(16.64f, 3f)
                lineToRelative(-1.39f, -2f)
                horizontalLineToRelative(-6.51f)
                lineToRelative(-1.34f, 2f)
                horizontalLineToRelative(9.24f)
                close()
            }
        }.also { _CameraSlash = it}
