package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorTextAlt: ImageVector? = null

val Icons.Br.CursorTextAlt: ImageVector
    get() = _CursorTextAlt ?: UXIcon(name = "CursorTextAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 17.75f)
            verticalLineToRelative(-11.5f)
            arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.25f, -4.25f)
            horizontalLineToRelative(-11.5f)
            arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.25f, 4.25f)
            verticalLineToRelative(11.5f)
            arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.25f, 4.25f)
            horizontalLineToRelative(11.5f)
            arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.25f, -4.25f)
            close()
            moveTo(5f, 18.02f)
            verticalLineToRelative(-12.04f)
            arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.98f, -0.98f)
            horizontalLineToRelative(12.04f)
            arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.98f, 0.98f)
            verticalLineToRelative(12.04f)
            arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, 0.98f)
            horizontalLineToRelative(-12.04f)
            arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, -0.98f)
            close()
            moveTo(13.5f, 14f)
            verticalLineToRelative(0.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -0.64f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0.64f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(0.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
            verticalLineToRelative(-0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            verticalLineToRelative(-1.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(0.5f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0.64f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -0.64f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
    }.also { _CursorTextAlt = it }
