package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spine: ImageVector? = null

val Icons.Ss.Spine: ImageVector
    get() = _Spine ?: UXIcon(name = "Spine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.24f, 1.42f, 1.47f, 2.5f, 2.95f, 2.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.48f, 0f, 2.71f, -1.08f, 2.95f, -2.5f)
                horizontalLineToRelative(3.05f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(17.95f, 2.5f)
                curveToRelative(-0.24f, -1.42f, -1.47f, -2.5f, -2.95f, -2.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.48f, 0f, -2.71f, 1.08f, -2.95f, 2.5f)
                horizontalLineToRelative(-3.05f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Spine = it}
