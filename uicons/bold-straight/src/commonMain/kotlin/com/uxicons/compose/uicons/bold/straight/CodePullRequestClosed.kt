package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodePullRequestClosed: ImageVector? = null

val Icons.Bs.CodePullRequestClosed: ImageVector
    get() = _CodePullRequestClosed ?: UXIcon(name = "CodePullRequestClosed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6.66f)
                verticalLineToRelative(10.67f)
                curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.4f, 0.82f, -2.6f, 2f, -3.16f)
                lineTo(2f, 6.66f)
                curveTo(0.82f, 6.1f, 0f, 4.9f, 0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
                close()
                moveTo(21f, 17.34f)
                verticalLineToRelative(-7.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7.34f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(23.81f, 2.31f)
                lineTo(21.69f, 0.19f)
                lineToRelative(-2.19f, 2.19f)
                lineTo(17.31f, 0.19f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.19f, 2.19f)
                lineToRelative(-2.19f, 2.19f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.19f, -2.19f)
                lineToRelative(2.19f, 2.19f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.19f, -2.19f)
                lineToRelative(2.19f, -2.19f)
                close()
            }
        }.also { _CodePullRequestClosed = it}
