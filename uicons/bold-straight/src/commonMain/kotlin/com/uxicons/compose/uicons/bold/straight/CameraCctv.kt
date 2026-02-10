package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraCctv: ImageVector? = null

val Icons.Bs.CameraCctv: ImageVector
    get() = _CameraCctv ?: UXIcon(name = "CameraCctv") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 8.93f)
                lineTo(8.68f, 0.42f)
                curveToRelative(-1.69f, -0.91f, -3.81f, -0.28f, -4.74f, 1.4f)
                lineToRelative(-1.93f, 3.54f)
                curveToRelative(-0.45f, 0.82f, -0.55f, 1.77f, -0.28f, 2.66f)
                curveToRelative(0.26f, 0.9f, 0.86f, 1.64f, 1.67f, 2.08f)
                lineToRelative(5.6f, 3.15f)
                lineToRelative(-1.47f, 4.4f)
                curveToRelative(-0.07f, 0.2f, -0.26f, 0.34f, -0.47f, 0.34f)
                lineTo(3f, 17.99f)
                verticalLineToRelative(-3f)
                lineTo(0f, 14.99f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.06f)
                curveToRelative(1.51f, 0f, 2.84f, -0.96f, 3.32f, -2.39f)
                lineToRelative(1.28f, -3.85f)
                lineToRelative(5.41f, 3.04f)
                lineToRelative(1.03f, -1.89f)
                lineToRelative(2.57f, 1.4f)
                lineToRelative(2.53f, -4.66f)
                lineToRelative(-2.5f, -1.37f)
                lineToRelative(3.28f, -2.35f)
                close()
                moveTo(4.85f, 7.48f)
                curveToRelative(-0.16f, -0.09f, -0.22f, -0.22f, -0.24f, -0.3f)
                curveToRelative(-0.02f, -0.07f, -0.04f, -0.22f, 0.04f, -0.38f)
                lineToRelative(1.93f, -3.54f)
                curveToRelative(0.09f, -0.17f, 0.27f, -0.26f, 0.44f, -0.26f)
                curveToRelative(0.07f, 0f, 0.15f, 0.02f, 0.22f, 0.05f)
                lineToRelative(11.14f, 6.2f)
                lineToRelative(-0.11f, 0.08f)
                lineToRelative(-2.38f, 4.36f)
                lineTo(4.85f, 7.48f)
                close()
            }
        }.also { _CameraCctv = it}
