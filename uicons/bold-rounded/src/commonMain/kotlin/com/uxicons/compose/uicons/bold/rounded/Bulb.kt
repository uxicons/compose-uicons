package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Br.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.94f, 2.27f)
            arcToRelative(8.84f, 8.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.98f, -2.21f)
            arcToRelative(9.17f, 9.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.1f, 15.75f)
            curveToRelative(0.95f, 0.9f, 1.15f, 2.19f, 1.15f, 3.97f)
            verticalLineToRelative(0.15f)
            arcToRelative(4.05f, 4.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.02f, 4.07f)
            horizontalLineToRelative(1.96f)
            arcToRelative(4.05f, 4.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.02f, -4.07f)
            verticalLineToRelative(-0.52f)
            curveToRelative(0f, -1.67f, 0.15f, -2.71f, 0.94f, -3.42f)
            arcToRelative(9.22f, 9.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.72f)
            close()
            moveTo(14f, 19.93f)
            arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.02f, 1.07f)
            horizontalLineToRelative(-1.96f)
            arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.02f, -1.07f)
            verticalLineToRelative(-0.15f)
            curveToRelative(0f, -0.26f, 0f, -0.52f, -0.01f, -0.78f)
            horizontalLineToRelative(4.02f)
            curveToRelative(0f, 0.14f, -0.01f, 0.27f, -0.01f, 0.41f)
            close()
            moveTo(15.95f, 13.76f)
            arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.49f, 2.25f)
            horizontalLineToRelative(-0.96f)
            verticalLineToRelative(-4.92f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -2.58f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 2.58f)
            verticalLineToRelative(4.92f)
            horizontalLineToRelative(-1.04f)
            arcToRelative(6.06f, 6.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -2.37f)
            arcToRelative(6.18f, 6.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.87f, -5.31f)
            arcToRelative(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, -5.28f)
            arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, -0.04f)
            arcToRelative(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.94f, 1.51f)
            arcToRelative(6.22f, 6.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 9.25f)
            close()
        }
    }.also { _Bulb = it }
