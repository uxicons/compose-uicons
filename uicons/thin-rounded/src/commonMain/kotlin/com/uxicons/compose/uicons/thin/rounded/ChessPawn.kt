package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Tr.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(2.04f, -1.23f, 3.4f, -3.46f, 3.4f, -6f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(5f, 3.14f, 5f, 7f)
                curveToRelative(0f, 2.54f, 1.36f, 4.77f, 3.4f, 6f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(22.5f, 24f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(6f, 7f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(4.96f, 23f)
                curveToRelative(1.82f, -1.15f, 3.04f, -3.19f, 3.04f, -5.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 2.31f, 1.21f, 4.35f, 3.04f, 5.5f)
                lineTo(4.96f, 23f)
                close()
            }
        }.also { _ChessPawn = it}
