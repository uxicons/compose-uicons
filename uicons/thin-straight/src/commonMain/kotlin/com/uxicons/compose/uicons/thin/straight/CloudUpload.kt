package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudUpload: ImageVector? = null

val Icons.Ts.CloudUpload: ImageVector
    get() = _CloudUpload ?: UXIcon(name = "CloudUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.79f, 7.21f)
                curveToRelative(-0.83f, -3.62f, -4.05f, -6.21f, -7.79f, -6.21f)
                curveTo(5.59f, 1f, 2f, 4.59f, 2f, 9f)
                curveToRelative(0f, 1.27f, 0.31f, 2.53f, 0.89f, 3.66f)
                curveToRelative(-1.77f, 0.95f, -2.89f, 2.8f, -2.89f, 4.84f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-1f)
                horizontalLineTo(5.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -1.82f, 1.09f, -3.46f, 2.78f, -4.16f)
                lineToRelative(0.54f, -0.22f)
                lineToRelative(-0.3f, -0.5f)
                curveToRelative(-0.67f, -1.1f, -1.02f, -2.35f, -1.02f, -3.62f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(3.37f, 0f, 6.26f, 2.41f, 6.88f, 5.72f)
                lineToRelative(0.06f, 0.34f)
                lineToRelative(0.34f, 0.06f)
                curveToRelative(3.31f, 0.61f, 5.72f, 3.51f, 5.72f, 6.88f)
                curveToRelative(0f, 3.52f, -2.61f, 6.43f, -6f, 6.92f)
                verticalLineToRelative(1.01f)
                curveToRelative(3.94f, -0.49f, 7f, -3.86f, 7f, -7.93f)
                curveToRelative(0f, -3.74f, -2.59f, -6.96f, -6.21f, -7.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.1f, 16.35f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.25f, -3.25f)
                curveToRelative(-0.56f, -0.56f, -1.56f, -0.56f, -2.12f, 0f)
                lineToRelative(-3.25f, 3.25f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.1f, -3.1f)
                verticalLineToRelative(10.75f)
                horizontalLineToRelative(1f)
                verticalLineTo(13.25f)
                lineToRelative(3.1f, 3.1f)
                close()
            }
        }.also { _CloudUpload = it}
