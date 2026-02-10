package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OliveOil: ImageVector? = null

val Icons.Sc.OliveOil: ImageVector
    get() = _OliveOil ?: UXIcon(name = "OliveOil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.58f, 11.58f)
                curveToRelative(0.97f, -0.53f, 1.48f, -1.55f, 1.48f, -3.02f)
                curveToRelative(0f, -2.29f, -1.16f, -3.45f, -3.45f, -3.45f)
                curveToRelative(-0.39f, 0f, -0.74f, 0.03f, -1.06f, 0.1f)
                lineToRelative(0.0f, -1.7f)
                curveToRelative(0f, -0.04f, -0.0f, -0.08f, -0.01f, -0.12f)
                curveToRelative(-0.03f, -0.24f, -0.4f, -2.39f, -4.28f, -2.39f)
                curveToRelative(-3.67f, 0f, -4.52f, 1.93f, -4.61f, 2.15f)
                curveToRelative(-0.2f, 0.52f, 0.05f, 1.12f, 0.56f, 1.32f)
                curveToRelative(0.39f, 0.15f, 0.81f, 0.06f, 1.07f, -0.22f)
                verticalLineToRelative(4.34f)
                curveToRelative(-0.58f, 0.4f, -1.17f, 0.89f, -1.76f, 1.48f)
                curveToRelative(-0.78f, 0.78f, -1.43f, 1.63f, -1.92f, 2.52f)
                horizontalLineToRelative(14.6f)
                curveToRelative(-0.2f, -0.35f, -0.41f, -0.68f, -0.64f, -1.0f)
                close()
                moveTo(15.55f, 7.31f)
                curveToRelative(0.21f, -0.14f, 0.56f, -0.2f, 1.06f, -0.2f)
                curveToRelative(1.09f, 0f, 1.45f, 0.21f, 1.45f, 1.45f)
                curveToRelative(0f, 1.1f, -0.32f, 1.33f, -0.86f, 1.41f)
                curveToRelative(-0.57f, -0.56f, -1.12f, -1.02f, -1.66f, -1.4f)
                lineToRelative(0.0f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.11f, 14.58f)
                horizontalLineTo(3.79f)
                curveToRelative(-0.3f, 1.08f, -0.38f, 2.17f, -0.2f, 3.21f)
                curveToRelative(0.33f, 1.91f, 1.48f, 3.41f, 3.23f, 4.23f)
                curveToRelative(1.4f, 0.66f, 3.21f, 0.98f, 5.05f, 0.98f)
                reflectiveCurveToRelative(3.67f, -0.32f, 5.13f, -0.97f)
                curveToRelative(2.4f, -1.07f, 3.18f, -2.78f, 3.41f, -4.04f)
                curveToRelative(0.2f, -1.11f, 0.06f, -2.28f, -0.3f, -3.41f)
                close()
            }
        }.also { _OliveOil = it}
