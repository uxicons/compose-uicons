package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Tc.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.68f, 21.67f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(0.62f, -1.69f, 2.69f, -7.58f, 2.69f, -11.19f)
                curveToRelative(0f, -0.2f, -0.12f, -0.38f, -0.3f, -0.46f)
                curveToRelative(-4.3f, -1.88f, -7.08f, -2.87f, -9.78f, -2.98f)
                verticalLineToRelative(-2.97f)
                horizontalLineToRelative(2.16f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.16f)
                verticalLineTo(1.17f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(-2.16f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.16f)
                verticalLineToRelative(2.97f)
                curveToRelative(-2.7f, 0.11f, -5.48f, 1.1f, -9.78f, 2.98f)
                curveToRelative(-0.18f, 0.08f, -0.3f, 0.26f, -0.3f, 0.46f)
                curveToRelative(0f, 3.64f, 2.07f, 9.51f, 2.69f, 11.19f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(20.68f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(2.43f, 10.8f)
                curveToRelative(8.5f, -3.69f, 10.64f, -3.69f, 19.14f, 0f)
                curveToRelative(-0.13f, 3.77f, -2.43f, 10.01f, -2.75f, 10.87f)
                horizontalLineTo(5.18f)
                curveToRelative(-0.32f, -0.85f, -2.62f, -7.07f, -2.75f, -10.87f)
                close()
            }
        }.also { _ChessKing = it}
