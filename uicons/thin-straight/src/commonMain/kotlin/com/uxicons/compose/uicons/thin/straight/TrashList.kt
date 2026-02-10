package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashList: ImageVector? = null

val Icons.Ts.TrashList: ImageVector
    get() = _TrashList ?: UXIcon(name = "TrashList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.13f, 23f)
                lineTo(5.83f, 23f)
                curveToRelative(-0.77f, 0f, -1.41f, -0.58f, -1.49f, -1.34f)
                lineTo(2.56f, 5f)
                horizontalLineToRelative(16.89f)
                lineToRelative(-0.22f, 2f)
                horizontalLineToRelative(1.01f)
                lineToRelative(0.22f, -2f)
                horizontalLineToRelative(1.55f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.55f)
                lineToRelative(1.8f, 16.77f)
                curveToRelative(0.14f, 1.27f, 1.21f, 2.23f, 2.48f, 2.23f)
                horizontalLineToRelative(10.29f)
                curveToRelative(1.2f, 0f, 2.2f, -0.85f, 2.44f, -2f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-0.21f, 0.58f, -0.74f, 1f, -1.39f, 1f)
                close()
                moveTo(7f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(7f, 4f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1f)
                close()
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _TrashList = it}
