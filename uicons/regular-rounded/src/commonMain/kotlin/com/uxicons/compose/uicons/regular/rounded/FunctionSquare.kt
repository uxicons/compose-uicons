package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FunctionSquare: ImageVector? = null

val Icons.Rr.FunctionSquare: ImageVector
    get() = _FunctionSquare ?: UXIcon(name = "FunctionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(9f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(18.83f, 12.55f)
                lineToRelative(-1.63f, 2.44f)
                lineToRelative(1.63f, 2.44f)
                curveToRelative(0.31f, 0.46f, 0.18f, 1.08f, -0.28f, 1.39f)
                curveToRelative(-0.17f, 0.11f, -0.36f, 0.17f, -0.55f, 0.17f)
                curveToRelative(-0.32f, 0f, -0.64f, -0.16f, -0.83f, -0.45f)
                lineToRelative(-1.17f, -1.75f)
                lineToRelative(-1.17f, 1.75f)
                curveToRelative(-0.19f, 0.29f, -0.51f, 0.45f, -0.83f, 0.45f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.06f, -0.55f, -0.17f)
                curveToRelative(-0.46f, -0.31f, -0.58f, -0.93f, -0.28f, -1.39f)
                lineToRelative(1.63f, -2.44f)
                lineToRelative(-1.63f, -2.44f)
                curveToRelative(-0.31f, -0.46f, -0.18f, -1.08f, 0.28f, -1.39f)
                curveToRelative(0.46f, -0.31f, 1.08f, -0.18f, 1.39f, 0.28f)
                lineToRelative(1.17f, 1.75f)
                lineToRelative(1.17f, -1.75f)
                curveToRelative(0.31f, -0.46f, 0.93f, -0.58f, 1.39f, -0.28f)
                curveToRelative(0.46f, 0.31f, 0.58f, 0.93f, 0.28f, 1.39f)
                close()
            }
        }.also { _FunctionSquare = it}
