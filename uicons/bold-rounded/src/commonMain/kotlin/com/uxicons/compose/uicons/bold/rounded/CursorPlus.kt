package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorPlus: ImageVector? = null

val Icons.Br.CursorPlus: ImageVector
    get() = _CursorPlus ?: UXIcon(name = "CursorPlus") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.5f, 7f)
            arcToRelative(8.5f, 8.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.5f, 8.5f)
            arcToRelative(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.5f, -8.5f)
            close()
            moveTo(15.5f, 21f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.5f, -5.5f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
            close()
            moveTo(18.5f, 14f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(1.5f)
            close()
            moveTo(7.75f, 7.75f)
            lineTo(5.89f, 11.45f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0.56f)
            horizontalLineToRelative(-0.02f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.89f, -0.59f)
            lineToRelative(-3.94f, -8.68f)
            arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, -2.15f)
            arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.06f, -0.48f)
            arcToRelative(0.89f, 0.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 0.04f)
            lineToRelative(8.68f, 3.94f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, 1.8f)
            close()
        }
    }.also { _CursorPlus = it }
