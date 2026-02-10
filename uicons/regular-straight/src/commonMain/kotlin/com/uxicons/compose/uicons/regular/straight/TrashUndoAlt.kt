package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashUndoAlt: ImageVector? = null

val Icons.Rs.TrashUndoAlt: ImageVector
    get() = _TrashUndoAlt ?: UXIcon(name = "TrashUndoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.58f, 14.4f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.04f, 0f, -2.81f)
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
                moveTo(22f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(4f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 6f)
                lineTo(6f, 6f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(18f, 6f)
                close()
            }
        }.also { _TrashUndoAlt = it}
