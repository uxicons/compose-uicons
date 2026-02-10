package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldExclamation: ImageVector? = null

val Icons.Ss.ShieldExclamation: ImageVector
    get() = _ShieldExclamation ?: UXIcon(name = "ShieldExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.94f, 2.63f)
                lineToRelative(-7.94f, -2.63f)
                lineToRelative(-7.94f, 2.63f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.06f, 2.85f)
                verticalLineToRelative(6.51f)
                curveToRelative(0f, 7.52f, 9.2f, 11.68f, 9.59f, 11.85f)
                lineToRelative(0.35f, 0.16f)
                lineToRelative(0.37f, -0.12f)
                curveToRelative(0.4f, -0.13f, 9.68f, -3.31f, 9.68f, -11.89f)
                verticalLineToRelative(-6.51f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.06f, -2.85f)
                close()
                moveTo(13f, 19.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _ShieldExclamation = it}
