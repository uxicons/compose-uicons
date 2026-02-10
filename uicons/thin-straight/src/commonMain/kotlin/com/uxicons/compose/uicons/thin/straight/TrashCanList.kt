package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanList: ImageVector? = null

val Icons.Ts.TrashCanList: ImageVector
    get() = _TrashCanList ?: UXIcon(name = "TrashCanList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(1f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                close()
                moveTo(16.91f, 22f)
                horizontalLineToRelative(1.04f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                lineTo(4.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 5f)
                lineTo(0f, 5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                lineTo(3f, 5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.65f, 0f, 1.2f, -0.42f, 1.41f, -1f)
                close()
                moveTo(6f, 4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _TrashCanList = it}
