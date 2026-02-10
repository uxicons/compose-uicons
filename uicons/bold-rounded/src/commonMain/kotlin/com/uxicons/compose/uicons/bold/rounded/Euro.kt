package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Euro: ImageVector? = null

val Icons.Br.Euro: ImageVector
    get() = _Euro ?: UXIcon(name = "Euro") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.94f, 17.73f)
            arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.99f, -1.73f)
            horizontalLineToRelative(8.55f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-9.44f)
            arcToRelative(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
            horizontalLineToRelative(9.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-8.55f)
            arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.99f, -1.73f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.31f, -1.91f)
            arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.56f, 3.64f)
            horizontalLineToRelative(-1.2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(0.55f)
            curveToRelative(-0.03f, 0.33f, -0.05f, 0.66f, -0.05f, 1f)
            reflectiveCurveToRelative(0.02f, 0.67f, 0.05f, 1f)
            horizontalLineToRelative(-0.55f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1.2f)
            arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.56f, 3.64f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.31f, -1.91f)
            close()
        }
    }.also { _Euro = it }
