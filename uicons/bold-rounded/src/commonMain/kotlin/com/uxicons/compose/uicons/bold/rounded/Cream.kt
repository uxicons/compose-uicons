package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cream: ImageVector? = null

val Icons.Br.Cream: ImageVector
    get() = _Cream ?: UXIcon(name = "Cream") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 11.35f)
            verticalLineToRelative(-1.85f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.04f, -3.45f)
            arcToRelative(12.69f, 12.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.62f, -5.64f)
            arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.69f, 0.15f)
            arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.69f, 2.46f)
            horizontalLineToRelative(-1.96f)
            curveToRelative(-3.08f, 0f, -4.26f, 1.7f, -4.71f, 3.01f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.29f, 3.48f)
            verticalLineToRelative(1.85f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 3.15f)
            verticalLineToRelative(4f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, -5.5f)
            verticalLineToRelative(-4f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -3.15f)
            close()
            moveTo(5.5f, 9f)
            horizontalLineToRelative(13f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-14f)
            verticalLineToRelative(-1.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
            close()
            moveTo(21f, 18.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -2.5f)
            verticalLineToRelative(-4f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
            horizontalLineToRelative(17f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
            close()
        }
    }.also { _Cream = it }
