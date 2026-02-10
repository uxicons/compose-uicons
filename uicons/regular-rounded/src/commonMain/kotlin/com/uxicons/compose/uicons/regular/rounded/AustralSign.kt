package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AustralSign: ImageVector? = null

val Icons.Rr.AustralSign: ImageVector
    get() = _AustralSign ?: UXIcon(name = "AustralSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.07f)
                lineToRelative(-0.79f, -2f)
                horizontalLineToRelative(2.86f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.64f)
                lineToRelative(-3.21f, -8.17f)
                curveToRelative(-0.68f, -1.74f, -2.27f, -2.83f, -4.14f, -2.83f)
                reflectiveCurveToRelative(-3.46f, 1.08f, -4.14f, 2.83f)
                lineToRelative(-3.21f, 8.17f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(3.86f)
                lineToRelative(-0.79f, 2f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.29f)
                lineTo(0.07f, 22.65f)
                curveToRelative(-0.2f, 0.51f, 0.05f, 1.09f, 0.57f, 1.3f)
                curveToRelative(0.51f, 0.2f, 1.09f, -0.05f, 1.3f, -0.57f)
                lineToRelative(2.5f, -6.38f)
                horizontalLineToRelative(15.13f)
                lineToRelative(2.5f, 6.38f)
                curveToRelative(0.15f, 0.39f, 0.53f, 0.63f, 0.93f, 0.63f)
                curveToRelative(0.12f, 0f, 0.25f, -0.02f, 0.37f, -0.07f)
                curveToRelative(0.51f, -0.2f, 0.77f, -0.78f, 0.57f, -1.3f)
                lineToRelative(-2.22f, -5.65f)
                horizontalLineToRelative(1.29f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(9.72f, 3.56f)
                curveToRelative(0.45f, -1.15f, 1.47f, -1.56f, 2.28f, -1.56f)
                reflectiveCurveToRelative(1.83f, 0.41f, 2.28f, 1.56f)
                lineToRelative(2.92f, 7.44f)
                horizontalLineTo(6.79f)
                lineToRelative(2.92f, -7.44f)
                close()
                moveTo(5.22f, 15f)
                lineToRelative(0.79f, -2f)
                horizontalLineToRelative(11.99f)
                lineToRelative(0.79f, 2f)
                horizontalLineTo(5.22f)
                close()
            }
        }.also { _AustralSign = it}
