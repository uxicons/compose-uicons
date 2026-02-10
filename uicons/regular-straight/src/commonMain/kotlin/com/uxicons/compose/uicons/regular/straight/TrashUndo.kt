package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashUndo: ImageVector? = null

val Icons.Rs.TrashUndo: ImageVector
    get() = _TrashUndo ?: UXIcon(name = "TrashUndo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.58f, 14.41f)
                curveToRelative(-0.77f, -0.78f, -0.77f, -2.04f, 0f, -2.81f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.01f)
                lineToRelative(2.3f, 2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.3f, -3.3f)
                close()
                moveTo(23f, 6f)
                horizontalLineToRelative(-1.68f)
                lineToRelative(-1.7f, 15.33f)
                curveToRelative(-0.17f, 1.52f, -1.45f, 2.67f, -2.98f, 2.67f)
                lineTo(7.33f, 24f)
                curveToRelative(-1.53f, 0f, -2.81f, -1.15f, -2.98f, -2.67f)
                lineToRelative(-1.7f, -15.33f)
                horizontalLineToRelative(-1.64f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(19.3f, 6f)
                lineTo(4.66f, 6f)
                lineToRelative(1.68f, 15.11f)
                curveToRelative(0.06f, 0.51f, 0.48f, 0.89f, 0.99f, 0.89f)
                horizontalLineToRelative(9.3f)
                curveToRelative(0.51f, 0f, 0.94f, -0.38f, 0.99f, -0.89f)
                lineToRelative(1.68f, -15.11f)
                close()
            }
        }.also { _TrashUndo = it}
