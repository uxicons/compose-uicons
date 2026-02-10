package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRotate: ImageVector? = null

val Icons.Rs.CameraRotate: ImageVector
    get() = _CameraRotate ?: UXIcon(name = "CameraRotate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                horizontalLineToRelative(-2.5f)
                lineTo(15.5f, 0f)
                horizontalLineToRelative(-7f)
                lineToRelative(-3f, 4f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(24f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(9.5f, 2f)
                horizontalLineToRelative(5f)
                lineToRelative(1.5f, 2f)
                lineTo(8f, 4f)
                lineToRelative(1.5f, -2f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(15.96f, 15f)
                horizontalLineToRelative(2.04f)
                curveToRelative(-0.48f, 2.83f, -2.95f, 5f, -5.92f, 5f)
                curveToRelative(-1.66f, 0f, -3.19f, -0.67f, -4.29f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(0.73f, 0.76f, 1.76f, 1.21f, 2.87f, 1.21f)
                curveToRelative(1.86f, 0f, 3.43f, -1.28f, 3.87f, -3f)
                close()
                moveTo(16.2f, 9.79f)
                lineToRelative(1.79f, -1.79f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(-0.73f, -0.76f, -1.76f, -1.21f, -2.87f, -1.21f)
                curveToRelative(-1.86f, 0f, -3.43f, 1.28f, -3.87f, 3f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5f, 5.92f, -5f)
                curveToRelative(1.66f, 0f, 3.19f, 0.67f, 4.29f, 1.79f)
                close()
            }
        }.also { _CameraRotate = it}
