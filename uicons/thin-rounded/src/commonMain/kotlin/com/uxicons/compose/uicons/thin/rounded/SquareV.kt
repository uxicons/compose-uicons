package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareV: ImageVector? = null

val Icons.Tr.SquareV: ImageVector
    get() = _SquareV ?: UXIcon(name = "SquareV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.95f, 4.67f)
                lineToRelative(-4.77f, 13.09f)
                curveToRelative(-0.48f, 1.36f, -1.73f, 2.24f, -3.17f, 2.24f)
                reflectiveCurveToRelative(-2.69f, -0.88f, -3.18f, -2.24f)
                lineTo(4.05f, 4.67f)
                curveToRelative(-0.1f, -0.26f, 0.04f, -0.55f, 0.3f, -0.64f)
                curveToRelative(0.26f, -0.09f, 0.55f, 0.04f, 0.64f, 0.3f)
                lineToRelative(4.77f, 13.09f)
                curveToRelative(0.41f, 1.17f, 1.43f, 1.58f, 2.23f, 1.58f)
                reflectiveCurveToRelative(1.82f, -0.41f, 2.23f, -1.58f)
                lineToRelative(4.78f, -13.09f)
                curveToRelative(0.1f, -0.26f, 0.39f, -0.39f, 0.64f, -0.3f)
                curveToRelative(0.26f, 0.1f, 0.39f, 0.38f, 0.3f, 0.64f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 4.5f)
                close()
            }
        }.also { _SquareV = it}
