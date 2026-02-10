package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodePullRequestClosed: ImageVector? = null

val Icons.Ss.CodePullRequestClosed: ImageVector
    get() = _CodePullRequestClosed ?: UXIcon(name = "CodePullRequestClosed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 4f)
                curveTo(8f, 1.79f, 6.21f, 0f, 4f, 0f)
                reflectiveCurveTo(0f, 1.79f, 0f, 4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(8.28f)
                curveToRelative(-1.72f, 0.45f, -3f, 2f, -3f, 3.86f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                lineTo(5f, 7.86f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                close()
                moveTo(21f, 16.14f)
                verticalLineToRelative(-7.14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2f, -3f, 3.86f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                close()
                moveTo(16.04f, 6.55f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(-2.55f, -2.55f)
                lineTo(17.45f, 0.04f)
                lineToRelative(2.55f, 2.55f)
                lineTo(22.55f, 0.04f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.55f, 2.55f)
                lineToRelative(2.55f, 2.55f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.55f, -2.55f)
                lineToRelative(-2.55f, 2.55f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.also { _CodePullRequestClosed = it}
