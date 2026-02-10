package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodePullRequest: ImageVector? = null

val Icons.Bs.CodePullRequest: ImageVector
    get() = _CodePullRequest ?: UXIcon(name = "CodePullRequest") {
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
                moveTo(22f, 17.34f)
                lineTo(22f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-4.5f)
                lineTo(14f, 0f)
                lineToRelative(-3.71f, 3.79f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.71f, 3.79f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10.84f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
                close()
            }
        }.also { _CodePullRequest = it}
