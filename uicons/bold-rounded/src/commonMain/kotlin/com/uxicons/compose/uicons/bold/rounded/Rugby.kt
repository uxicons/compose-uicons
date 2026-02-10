package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rugby: ImageVector? = null

val Icons.Br.Rugby: ImageVector
    get() = _Rugby ?: UXIcon(name = "Rugby") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.02f, 1.98f)
            curveToRelative(-3.52f, -3.53f, -12.65f, -2.15f, -17.42f, 2.62f)
            reflectiveCurveToRelative(-6.15f, 13.9f, -2.62f, 17.42f)
            arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.94f, 1.98f)
            arcToRelative(17.03f, 17.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.49f, -4.6f)
            curveToRelative(4.78f, -4.78f, 6.15f, -13.9f, 2.62f, -17.42f)
            close()
            moveTo(17.28f, 17.28f)
            arcToRelative(14.04f, 14.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.84f, 3.61f)
            lineToRelative(-6.32f, -6.32f)
            arcToRelative(14.04f, 14.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.61f, -7.85f)
            arcToRelative(14.04f, 14.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.85f, -3.61f)
            lineToRelative(6.32f, 6.32f)
            arcToRelative(14.04f, 14.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.61f, 7.85f)
            close()
            moveTo(17.56f, 11.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0f)
            lineToRelative(-0.44f, -0.44f)
            lineToRelative(-0.88f, 0.88f)
            lineToRelative(0.44f, 0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
            lineToRelative(-0.44f, -0.44f)
            lineToRelative(-0.88f, 0.88f)
            lineToRelative(0.44f, 0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
            lineToRelative(-3f, -3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineToRelative(0.44f, 0.44f)
            lineToRelative(0.88f, -0.88f)
            lineToRelative(-0.44f, -0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineToRelative(0.44f, 0.44f)
            lineToRelative(0.88f, -0.88f)
            lineToRelative(-0.44f, -0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineToRelative(3f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.12f)
            close()
        }
    }.also { _Rugby = it }
