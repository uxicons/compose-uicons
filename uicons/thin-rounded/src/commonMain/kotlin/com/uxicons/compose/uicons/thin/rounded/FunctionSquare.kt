package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FunctionSquare: ImageVector? = null

val Icons.Tr.FunctionSquare: ImageVector
    get() = _FunctionSquare ?: UXIcon(name = "FunctionSquare") {
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
                moveTo(9f, 7.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(17.92f, 12.78f)
                lineToRelative(-1.81f, 2.72f)
                lineToRelative(1.81f, 2.72f)
                curveToRelative(0.15f, 0.23f, 0.09f, 0.54f, -0.14f, 0.69f)
                curveToRelative(-0.09f, 0.06f, -0.18f, 0.08f, -0.28f, 0.08f)
                curveToRelative(-0.16f, 0f, -0.32f, -0.08f, -0.42f, -0.22f)
                lineToRelative(-1.58f, -2.38f)
                lineToRelative(-1.58f, 2.38f)
                curveToRelative(-0.1f, 0.14f, -0.26f, 0.22f, -0.42f, 0.22f)
                curveToRelative(-0.1f, 0f, -0.19f, -0.03f, -0.28f, -0.08f)
                curveToRelative(-0.23f, -0.15f, -0.29f, -0.46f, -0.14f, -0.69f)
                lineToRelative(1.81f, -2.72f)
                lineToRelative(-1.81f, -2.72f)
                curveToRelative(-0.15f, -0.23f, -0.09f, -0.54f, 0.14f, -0.69f)
                reflectiveCurveToRelative(0.54f, -0.09f, 0.69f, 0.14f)
                lineToRelative(1.58f, 2.38f)
                lineToRelative(1.58f, -2.38f)
                curveToRelative(0.15f, -0.23f, 0.46f, -0.29f, 0.69f, -0.14f)
                curveToRelative(0.23f, 0.15f, 0.29f, 0.46f, 0.14f, 0.69f)
                close()
            }
        }.also { _FunctionSquare = it}
