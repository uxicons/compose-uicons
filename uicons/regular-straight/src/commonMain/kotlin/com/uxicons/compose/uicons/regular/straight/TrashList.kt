package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashList: ImageVector? = null

val Icons.Rs.TrashList: ImageVector
    get() = _TrashList ?: UXIcon(name = "TrashList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.33f, 21.11f)
                lineToRelative(-1.68f, -15.11f)
                horizontalLineToRelative(14.65f)
                lineToRelative(-0.22f, 2f)
                horizontalLineToRelative(2.01f)
                lineToRelative(0.22f, -2f)
                horizontalLineToRelative(1.68f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(0f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.64f)
                lineToRelative(1.7f, 15.33f)
                curveToRelative(0.17f, 1.52f, 1.45f, 2.67f, 2.98f, 2.67f)
                horizontalLineToRelative(7.67f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7.67f)
                curveToRelative(-0.51f, 0f, -0.94f, -0.38f, -0.99f, -0.89f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _TrashList = it}
