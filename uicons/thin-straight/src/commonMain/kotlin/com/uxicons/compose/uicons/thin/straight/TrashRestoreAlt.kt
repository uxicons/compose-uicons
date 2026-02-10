package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashRestoreAlt: ImageVector? = null

val Icons.Ts.TrashRestoreAlt: ImageVector
    get() = _TrashRestoreAlt ?: UXIcon(name = "TrashRestoreAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                lineTo(2f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(20f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(8f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(19f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(6.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(5f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(8.11f, 13.48f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(0.77f, -0.77f, 2.02f, -0.77f, 2.79f, 0f)
                lineToRelative(3.2f, 3.2f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.2f, -3.2f)
                curveToRelative(-0.06f, -0.06f, -0.12f, -0.11f, -0.19f, -0.15f)
                verticalLineToRelative(7.87f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.87f)
                curveToRelative(-0.07f, 0.04f, -0.13f, 0.09f, -0.19f, 0.15f)
                lineToRelative(-3.2f, 3.2f)
                close()
            }
        }.also { _TrashRestoreAlt = it}
