package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareA: ImageVector? = null

val Icons.Tr.SquareA: ImageVector
    get() = _SquareA ?: UXIcon(name = "SquareA") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(15.18f, 6.24f)
                curveToRelative(-0.48f, -1.36f, -1.73f, -2.24f, -3.18f, -2.24f)
                reflectiveCurveToRelative(-2.69f, 0.88f, -3.17f, 2.24f)
                lineToRelative(-4.78f, 13.09f)
                curveToRelative(-0.1f, 0.26f, 0.04f, 0.55f, 0.3f, 0.64f)
                curveToRelative(0.26f, 0.09f, 0.55f, -0.04f, 0.64f, -0.3f)
                lineToRelative(1.7f, -4.67f)
                horizontalLineToRelative(10.61f)
                lineToRelative(1.7f, 4.67f)
                curveToRelative(0.07f, 0.2f, 0.27f, 0.33f, 0.47f, 0.33f)
                curveToRelative(0.06f, 0f, 0.12f, -0.01f, 0.17f, -0.03f)
                curveToRelative(0.26f, -0.1f, 0.39f, -0.38f, 0.3f, -0.64f)
                lineToRelative(-4.77f, -13.09f)
                close()
                moveTo(7.06f, 14f)
                lineToRelative(2.71f, -7.42f)
                curveToRelative(0.41f, -1.16f, 1.43f, -1.58f, 2.23f, -1.58f)
                reflectiveCurveToRelative(1.82f, 0.41f, 2.23f, 1.58f)
                lineToRelative(2.71f, 7.42f)
                lineTo(7.06f, 14f)
                close()
            }
        }.also { _SquareA = it}
