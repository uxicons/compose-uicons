package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeMerge: ImageVector? = null

val Icons.Tr.CodeMerge: ImageVector
    get() = _CodeMerge ?: UXIcon(name = "CodeMerge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 8f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                lineTo(7.5f, 11f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-0.54f)
                curveToRelative(1.69f, -0.24f, 3f, -1.7f, 3f, -3.46f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveTo(0f, 1.57f, 0f, 3.5f)
                curveToRelative(0f, 1.76f, 1.31f, 3.22f, 3f, 3.46f)
                verticalLineToRelative(10.07f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.22f, -3f, -3.46f)
                verticalLineToRelative(-6.71f)
                curveToRelative(0.82f, 1.02f, 2.09f, 1.67f, 3.5f, 1.67f)
                horizontalLineToRelative(9.54f)
                curveToRelative(0.24f, 1.69f, 1.7f, 3f, 3.46f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(1f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1f, 4.88f, 1f, 3.5f)
                close()
                moveTo(6f, 20.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(20.5f, 14f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _CodeMerge = it}
