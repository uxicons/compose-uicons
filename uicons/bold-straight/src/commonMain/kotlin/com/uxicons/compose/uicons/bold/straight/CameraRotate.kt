package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRotate: ImageVector? = null

val Icons.Bs.CameraRotate: ImageVector
    get() = _CameraRotate ?: UXIcon(name = "CameraRotate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                horizontalLineToRelative(-2.25f)
                lineTo(15.75f, 0f)
                horizontalLineToRelative(-7.5f)
                lineToRelative(-3f, 4f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(24f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 7f)
                horizontalLineToRelative(3.75f)
                lineToRelative(3f, -4f)
                horizontalLineToRelative(4.5f)
                lineToRelative(3f, 4f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(14f)
                close()
                moveTo(16.49f, 9.51f)
                lineToRelative(1.51f, -1.51f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                lineToRelative(1.36f, -1.36f)
                curveToRelative(-0.56f, -0.72f, -1.42f, -1.14f, -2.36f, -1.14f)
                curveToRelative(-1.1f, 0f, -2.06f, 0.61f, -2.58f, 1.5f)
                horizontalLineToRelative(-3.22f)
                curveToRelative(0.67f, -2.58f, 3.01f, -4.5f, 5.8f, -4.5f)
                curveToRelative(1.75f, 0f, 3.37f, 0.75f, 4.49f, 2.01f)
                close()
                moveTo(14.58f, 15f)
                horizontalLineToRelative(3.2f)
                curveToRelative(-0.67f, 2.58f, -2.99f, 4.5f, -5.78f, 4.5f)
                curveToRelative(-1.75f, 0f, -3.37f, -0.75f, -4.49f, -2.01f)
                lineToRelative(-1.51f, 1.51f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                lineToRelative(-1.36f, 1.36f)
                curveToRelative(0.56f, 0.72f, 1.42f, 1.14f, 2.36f, 1.14f)
                curveToRelative(1.1f, 0f, 2.06f, -0.61f, 2.58f, -1.5f)
                close()
            }
        }.also { _CameraRotate = it}
