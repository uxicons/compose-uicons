package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeBranch: ImageVector? = null

val Icons.Bs.CodeBranch: ImageVector
    get() = _CodeBranch ?: UXIcon(name = "CodeBranch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 1.4f, 0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(2.84f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.53f, 0f, -1.03f, 0.09f, -1.5f, 0.26f)
                verticalLineToRelative(-3.59f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveTo(0f, 1.57f, 0f, 3.5f)
                curveToRelative(0f, 1.4f, 0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(10.67f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
                verticalLineToRelative(-2.84f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.84f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                close()
            }
        }.also { _CodeBranch = it}
