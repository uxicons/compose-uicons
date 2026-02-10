package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareQ: ImageVector? = null

val Icons.Ts.SquareQ: ImageVector
    get() = _SquareQ ?: UXIcon(name = "SquareQ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(19f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                curveToRelative(1.75f, 0f, 3.35f, -0.65f, 4.58f, -1.71f)
                lineToRelative(2.06f, 2.06f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.06f, -2.06f)
                curveToRelative(1.07f, -1.23f, 1.71f, -2.83f, 1.71f, -4.58f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.48f, -0.54f, 2.83f, -1.42f, 3.87f)
                lineToRelative(-3.23f, -3.23f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.23f, 3.23f)
                curveToRelative(-1.05f, 0.89f, -2.4f, 1.42f, -3.87f, 1.42f)
                close()
            }
        }.also { _SquareQ = it}
