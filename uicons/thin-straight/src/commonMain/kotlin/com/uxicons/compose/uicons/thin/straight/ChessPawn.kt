package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Ts.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.41f)
                curveToRelative(2.04f, -1.23f, 3.41f, -3.45f, 3.41f, -6f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(5f, 3.14f, 5f, 7f)
                curveToRelative(0f, 2.55f, 1.37f, 4.78f, 3.41f, 6f)
                lineTo(4f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                verticalLineToRelative(1f)
                lineTo(22f, 24f)
                verticalLineToRelative(-1f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                close()
                moveTo(6f, 7f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(5.31f, 23f)
                curveToRelative(1.62f, -1.08f, 2.69f, -2.92f, 2.69f, -5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.08f, 1.07f, 3.92f, 2.69f, 5f)
                lineTo(5.31f, 23f)
                close()
            }
        }.also { _ChessPawn = it}
