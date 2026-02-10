package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRotate: ImageVector? = null

val Icons.Ss.CameraRotate: ImageVector
    get() = _CameraRotate ?: UXIcon(name = "CameraRotate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.28f, 3f)
                lineToRelative(2.31f, -3f)
                horizontalLineToRelative(6.81f)
                lineToRelative(2.31f, 3f)
                lineTo(6.28f, 3f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(16f)
                lineTo(0f, 24f)
                lineTo(0f, 8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.45f, 1.72f, -2.01f, 3f, -3.87f, 3f)
                curveToRelative(-1.11f, 0f, -2.14f, -0.45f, -2.87f, -1.21f)
                lineToRelative(1.79f, -1.79f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(1.1f, 1.12f, 2.63f, 1.79f, 4.29f, 1.79f)
                curveToRelative(2.97f, 0f, 5.44f, -2.17f, 5.92f, -5f)
                close()
                moveTo(18f, 9f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-1.1f, -1.12f, -2.63f, -1.79f, -4.29f, -1.79f)
                curveToRelative(-2.97f, 0f, -5.44f, 2.17f, -5.92f, 5f)
                horizontalLineToRelative(2.04f)
                curveToRelative(0.45f, -1.72f, 2.01f, -3f, 3.87f, -3f)
                curveToRelative(1.11f, 0f, 2.14f, 0.45f, 2.87f, 1.21f)
                lineToRelative(-1.79f, 1.79f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _CameraRotate = it}
