package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeBranch: ImageVector? = null

val Icons.Br.CodeBranch: ImageVector
    get() = _CodeBranch ?: UXIcon(name = "CodeBranch") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 3.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            curveToRelative(0f, 1.4f, 0.82f, 2.6f, 2f, 3.16f)
            verticalLineToRelative(1.84f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(7.5f)
            curveToRelative(-0.9f, 0f, -1.75f, 0.22f, -2.5f, 0.6f)
            verticalLineTo(6.66f)
            curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveTo(0f, 1.57f, 0f, 3.5f)
            curveToRelative(0f, 1.4f, 0.82f, 2.6f, 2f, 3.16f)
            verticalLineToRelative(10.67f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
            curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
            verticalLineToRelative(-0.84f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-1.84f)
            curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
            close()
        }
    }.also { _CodeBranch = it }
