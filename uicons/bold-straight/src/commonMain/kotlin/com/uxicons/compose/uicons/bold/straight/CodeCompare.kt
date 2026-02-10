package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCompare: ImageVector? = null

val Icons.Bs.CodeCompare: ImageVector
    get() = _CodeCompare ?: UXIcon(name = "CodeCompare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6.62f)
                verticalLineToRelative(10.88f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                lineToRelative(-3.71f, -3.79f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(3.71f, -3.79f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(6.62f)
                curveToRelative(-1.18f, -0.56f, -2f, -1.77f, -2f, -3.16f)
                curveTo(17f, 1.53f, 18.57f, -0.04f, 20.5f, -0.04f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
                close()
                moveTo(5f, 17.34f)
                verticalLineTo(6.46f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3.04f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(10f, 0f)
                verticalLineTo(2.96f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.88f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
                close()
            }
        }.also { _CodeCompare = it}
