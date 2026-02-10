package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SchoolBus: ImageVector? = null

val Icons.Br.SchoolBus: ImageVector
    get() = _SchoolBus ?: UXIcon(name = "SchoolBus") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 10.26f)
            verticalLineToRelative(-4.76f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, -4.5f)
            horizontalLineToRelative(-12f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 4.5f)
            verticalLineToRelative(11f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3.45f)
            verticalLineToRelative(0.05f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
            horizontalLineToRelative(6f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
            curveToRelative(0f, -0.02f, 0f, -0.03f, 0f, -0.05f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3.45f)
            verticalLineToRelative(-2f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -4.24f)
            close()
            moveTo(3f, 6f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(9f, 6f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(15f, 6f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(3f, 13f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
            close()
            moveTo(21f, 16.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            close()
        }
    }.also { _SchoolBus = it }
