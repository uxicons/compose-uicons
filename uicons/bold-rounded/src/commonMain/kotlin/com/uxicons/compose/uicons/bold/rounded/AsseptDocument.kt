package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AsseptDocument: ImageVector? = null

val Icons.Br.AsseptDocument: ImageVector
    get() = _AsseptDocument ?: UXIcon(name = "AsseptDocument") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.39f, 4.27f)
            lineToRelative(-2.66f, -2.66f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.89f, -1.61f)
            horizontalLineToRelative(-6.34f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 5.5f)
            verticalLineToRelative(13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, -5.5f)
            verticalLineToRelative(-10.34f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.61f, -3.89f)
            close()
            moveTo(16.5f, 21f)
            horizontalLineToRelative(-9f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -2.5f)
            verticalLineToRelative(-13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(4f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(9.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            close()
            moveTo(17.09f, 11.47f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.05f, 2.12f)
            lineToRelative(-3.59f, 3.41f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.92f, -0.03f)
            lineToRelative(-1.52f, -1.35f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2.24f)
            lineToRelative(1.59f, 1.41f)
            arcToRelative(0.58f, 0.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, 0.21f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, -0.15f)
            lineToRelative(3.61f, -3.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 0.05f)
            close()
        }
    }.also { _AsseptDocument = it }
