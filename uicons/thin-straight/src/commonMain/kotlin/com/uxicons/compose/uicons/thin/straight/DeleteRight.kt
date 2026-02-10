package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteRight: ImageVector? = null

val Icons.Ts.DeleteRight: ImageVector
    get() = _DeleteRight ?: UXIcon(name = "DeleteRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.29f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.79f)
                lineToRelative(7.65f, -10f)
                lineToRelative(-7.65f, -10f)
                close()
                moveTo(15.8f, 21f)
                lineTo(2.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13.3f)
                lineToRelative(6.88f, 9f)
                lineToRelative(-6.88f, 9f)
                close()
                moveTo(13.98f, 8.72f)
                lineToRelative(-3.27f, 3.27f)
                lineToRelative(3.27f, 3.27f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.27f, -3.27f)
                lineToRelative(-3.27f, 3.27f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.27f, -3.27f)
                lineToRelative(-3.27f, -3.27f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.27f, 3.27f)
                lineToRelative(3.27f, -3.27f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _DeleteRight = it}
