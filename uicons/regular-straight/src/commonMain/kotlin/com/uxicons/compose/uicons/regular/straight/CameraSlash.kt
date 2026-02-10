package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraSlash: ImageVector? = null

val Icons.Rs.CameraSlash: ImageVector
    get() = _CameraSlash ?: UXIcon(name = "CameraSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 21.59f)
                verticalLineToRelative(-13.59f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(-2.73f, -4f)
                horizontalLineToRelative(-6.51f)
                lineToRelative(-2.57f, 3.76f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-0.96f, -0.96f)
                close()
                moveTo(21f, 8f)
                verticalLineToRelative(11.59f)
                lineToRelative(-4.2f, -4.2f)
                curveToRelative(0.13f, -0.45f, 0.2f, -0.92f, 0.2f, -1.39f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-0.47f, 0f, -0.94f, 0.07f, -1.39f, 0.2f)
                lineToRelative(-2.2f, -2.2f)
                horizontalLineToRelative(11.59f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(9.8f, 3f)
                horizontalLineToRelative(4.4f)
                lineToRelative(1.36f, 2f)
                horizontalLineToRelative(-7.12f)
                lineToRelative(1.36f, -2f)
                close()
                moveTo(9.08f, 13.32f)
                curveToRelative(-0.05f, 0.22f, -0.08f, 0.45f, -0.08f, 0.68f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(0.23f, 0f, 0.46f, -0.03f, 0.68f, -0.08f)
                lineToRelative(1.55f, 1.55f)
                curveToRelative(-0.68f, 0.34f, -1.44f, 0.52f, -2.23f, 0.52f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -0.8f, 0.19f, -1.56f, 0.52f, -2.23f)
                lineToRelative(1.55f, 1.55f)
                close()
                moveTo(16.76f, 21f)
                lineToRelative(2f, 2f)
                lineTo(1f, 23f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -0.77f, 0.29f, -1.47f, 0.76f, -2.0f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(-0.12f, 0.16f, -0.18f, 0.36f, -0.18f, 0.57f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(13.76f)
                close()
            }
        }.also { _CameraSlash = it}
