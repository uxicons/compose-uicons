package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Sc.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 10.5f)
                horizontalLineToRelative(-2.21f)
                curveToRelative(-0.13f, -1.14f, -0.42f, -2.06f, -0.82f, -2.8f)
                lineToRelative(1.3f, -1.28f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0.01f, -2.12f)
                curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.01f)
                lineToRelative(-1.3f, 1.29f)
                curveToRelative(-0.89f, -0.48f, -1.88f, -0.71f, -2.86f, -0.81f)
                verticalLineTo(2.6f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.17f)
                curveToRelative(-0.97f, 0.1f, -1.97f, 0.33f, -2.86f, 0.81f)
                lineToRelative(-1.3f, -1.29f)
                curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
                curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.01f, 2.12f)
                lineToRelative(1.3f, 1.28f)
                curveToRelative(-0.4f, 0.74f, -0.69f, 1.66f, -0.82f, 2.8f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.21f)
                curveToRelative(0.13f, 1.14f, 0.42f, 2.06f, 0.82f, 2.8f)
                lineToRelative(-1.3f, 1.28f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
                curveToRelative(0.29f, 0.3f, 0.68f, 0.45f, 1.07f, 0.45f)
                curveToRelative(0.38f, 0f, 0.76f, -0.14f, 1.05f, -0.43f)
                lineToRelative(1.3f, -1.29f)
                curveToRelative(0.89f, 0.48f, 1.88f, 0.71f, 2.86f, 0.81f)
                verticalLineToRelative(2.17f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.17f)
                curveToRelative(0.97f, -0.1f, 1.97f, -0.33f, 2.86f, -0.81f)
                lineToRelative(1.3f, 1.29f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
                curveToRelative(0.39f, 0f, 0.77f, -0.15f, 1.07f, -0.45f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
                lineToRelative(-1.3f, -1.28f)
                curveToRelative(0.4f, -0.74f, 0.69f, -1.66f, 0.82f, -2.8f)
                horizontalLineToRelative(2.21f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _Sun = it}
