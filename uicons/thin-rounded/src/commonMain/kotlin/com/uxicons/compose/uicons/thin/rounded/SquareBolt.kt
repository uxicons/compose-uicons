package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareBolt: ImageVector? = null

val Icons.Tr.SquareBolt: ImageVector
    get() = _SquareBolt ?: UXIcon(name = "SquareBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                curveToRelative(-0.09f, 0f, -0.18f, -0.02f, -0.26f, -0.07f)
                curveToRelative(-0.24f, -0.14f, -0.31f, -0.45f, -0.17f, -0.69f)
                lineToRelative(3.4f, -5.56f)
                reflectiveCurveToRelative(0.03f, -0.09f, 0.01f, -0.12f)
                curveToRelative(-0.02f, -0.04f, -0.05f, -0.05f, -0.09f, -0.05f)
                horizontalLineToRelative(-5.78f)
                curveToRelative(-0.36f, 0f, -0.68f, -0.16f, -0.9f, -0.45f)
                curveToRelative(-0.21f, -0.29f, -0.28f, -0.65f, -0.17f, -0.99f)
                curveToRelative(0.01f, -0.04f, 3.53f, -5.82f, 3.53f, -5.82f)
                curveToRelative(0.14f, -0.24f, 0.45f, -0.31f, 0.69f, -0.17f)
                curveToRelative(0.24f, 0.14f, 0.31f, 0.45f, 0.17f, 0.69f)
                lineToRelative(-3.43f, 5.63f)
                reflectiveCurveToRelative(0.01f, 0.05f, 0.02f, 0.06f)
                curveToRelative(0.02f, 0.02f, 0.04f, 0.05f, 0.09f, 0.05f)
                horizontalLineToRelative(5.78f)
                curveToRelative(0.41f, 0f, 0.78f, 0.22f, 0.97f, 0.58f)
                curveToRelative(0.19f, 0.36f, 0.17f, 0.79f, -0.05f, 1.13f)
                lineToRelative(-3.39f, 5.55f)
                curveToRelative(-0.09f, 0.15f, -0.26f, 0.24f, -0.43f, 0.24f)
                close()
                moveTo(24f, 19.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(19.5f, 1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                close()
            }
        }.also { _SquareBolt = it}
