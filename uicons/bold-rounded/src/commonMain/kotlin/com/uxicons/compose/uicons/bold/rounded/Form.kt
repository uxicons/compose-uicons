package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Form: ImageVector? = null

val Icons.Br.Form: ImageVector
    get() = _Form ?: UXIcon(name = "Form") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 17.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            close()
            moveTo(22f, 7.16f)
            verticalLineToRelative(11.34f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
            horizontalLineToRelative(-9f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, -5.5f)
            verticalLineToRelative(-13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, -5.5f)
            horizontalLineToRelative(7.34f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.89f, 1.61f)
            lineToRelative(1.66f, 1.66f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, 3.89f)
            close()
            moveTo(18.98f, 7f)
            horizontalLineToRelative(-1.99f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
            verticalLineToRelative(-1.98f)
            curveToRelative(-0.05f, -0.0f, -7.5f, -0.02f, -7.5f, -0.02f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.5f)
            horizontalLineToRelative(9f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -2.5f)
            reflectiveCurveToRelative(-0.01f, -11.45f, -0.01f, -11.5f)
            close()
            moveTo(14.5f, 9f)
            horizontalLineToRelative(-5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
            horizontalLineToRelative(5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5f)
            close()
        }
    }.also { _Form = it }
