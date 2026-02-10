package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldInterrogation: ImageVector? = null

val Icons.Ss.ShieldInterrogation: ImageVector
    get() = _ShieldInterrogation ?: UXIcon(name = "ShieldInterrogation") {
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
                moveTo(13.93f, 12.56f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.93f, 1.75f)
                verticalLineToRelative(0.74f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.74f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.96f, -3.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.0f, -2.12f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.37f, 1.97f)
                horizontalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, -3.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, 6.57f)
                close()
            }
        }.also { _ShieldInterrogation = it}
