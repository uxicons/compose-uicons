package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeMerge: ImageVector? = null

val Icons.Sr.CodeMerge: ImageVector
    get() = _CodeMerge ?: UXIcon(name = "CodeMerge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                curveToRelative(-1.86f, 0f, -3.43f, 1.28f, -3.87f, 3f)
                horizontalLineTo(8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-0.13f)
                curveToRelative(1.72f, -0.45f, 3f, -2.01f, 3f, -3.87f)
                curveTo(8f, 1.79f, 6.21f, 0f, 4f, 0f)
                reflectiveCurveTo(0f, 1.79f, 0f, 4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.43f, 3f, 3.87f)
                verticalLineToRelative(8.25f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.01f, -3f, 3.87f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.43f, -3f, -3.87f)
                verticalLineToRelative(-4.13f)
                curveToRelative(0.84f, 0.63f, 1.88f, 1.0f, 3f, 1.0f)
                horizontalLineToRelative(8.13f)
                curveToRelative(0.45f, 1.72f, 2.01f, 3f, 3.87f, 3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _CodeMerge = it}
