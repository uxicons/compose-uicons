package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraCctv: ImageVector? = null

val Icons.Rs.CameraCctv: ImageVector
    get() = _CameraCctv ?: UXIcon(name = "CameraCctv") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.96f, 11.35f)
                lineToRelative(3.05f, -2.18f)
                lineTo(8.3f, 0.36f)
                curveToRelative(-1.45f, -0.78f, -3.27f, -0.24f, -4.06f, 1.2f)
                lineToRelative(-1.82f, 3.34f)
                curveToRelative(-0.79f, 1.45f, -0.26f, 3.28f, 1.18f, 4.06f)
                lineToRelative(6.05f, 3.43f)
                lineToRelative(-1.64f, 4.92f)
                curveToRelative(-0.14f, 0.41f, -0.52f, 0.68f, -0.95f, 0.68f)
                horizontalLineTo(2f)
                verticalLineToRelative(-4f)
                horizontalLineTo(0f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5.06f)
                curveToRelative(1.29f, 0f, 2.44f, -0.82f, 2.85f, -2.05f)
                lineToRelative(1.52f, -4.55f)
                lineToRelative(6.43f, 3.65f)
                lineToRelative(0.99f, -1.82f)
                lineToRelative(2.2f, 1.22f)
                lineToRelative(2.01f, -3.69f)
                lineToRelative(-2.2f, -1.22f)
                lineToRelative(0.1f, -0.18f)
                close()
                moveTo(4.57f, 7.21f)
                curveToRelative(-0.48f, -0.27f, -0.66f, -0.87f, -0.4f, -1.36f)
                lineToRelative(1.82f, -3.34f)
                curveToRelative(0.18f, -0.33f, 0.53f, -0.52f, 0.88f, -0.52f)
                curveToRelative(0.16f, 0f, 0.31f, 0.04f, 0.46f, 0.12f)
                lineToRelative(12.96f, 7.26f)
                lineToRelative(-0.86f, 0.62f)
                lineToRelative(-2.35f, 4.31f)
                lineTo(4.57f, 7.21f)
                close()
            }
        }.also { _CameraCctv = it}
