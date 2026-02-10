package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileBackup: ImageVector? = null

val Icons.Sr.FileBackup: ImageVector
    get() = _FileBackup ?: UXIcon(name = "FileBackup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 5f)
                curveToRelative(3.04f, 0f, 4.28f, -0.81f, 4.5f, -1.08f)
                verticalLineToRelative(-2.42f)
                curveToRelative(0f, -0.88f, -1.85f, -1.5f, -4.5f, -1.5f)
                reflectiveCurveToRelative(-4.5f, 0.62f, -4.5f, 1.5f)
                verticalLineToRelative(2.42f)
                curveToRelative(0.22f, 0.27f, 1.46f, 1.08f, 4.5f, 1.08f)
                moveToRelative(-12.23f, 8.3f)
                lineToRelative(-2.67f, 9.34f)
                curveToRelative(-0.98f, -0.91f, -1.6f, -2.2f, -1.6f, -3.64f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(2.66f, 1.33f)
                verticalLineToRelative(5.36f)
                curveToRelative(-2.63f, 0.01f, -4.98f, 1.77f, -5.73f, 4.3f)
                close()
                moveTo(23.88f, 14.28f)
                lineTo(22.36f, 20.39f)
                curveToRelative(-0.65f, 2.17f, -2.58f, 3.61f, -4.8f, 3.61f)
                horizontalLineToRelative(-12.56f)
                curveToRelative(-0.57f, 0f, -1.11f, -0.12f, -1.63f, -0.29f)
                lineToRelative(2.82f, -9.84f)
                curveToRelative(0.5f, -1.69f, 2.08f, -2.86f, 3.83f, -2.86f)
                horizontalLineToRelative(11.41f)
                curveToRelative(1.66f, -0.08f, 2.97f, 1.71f, 2.45f, 3.28f)
                close()
                moveTo(12.0f, 9.0f)
                verticalLineToRelative(-2.78f)
                curveToRelative(1.08f, 0.47f, 2.57f, 0.78f, 4.5f, 0.78f)
                reflectiveCurveToRelative(3.42f, -0.31f, 4.5f, -0.78f)
                verticalLineToRelative(2.78f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }.also { _FileBackup = it}
