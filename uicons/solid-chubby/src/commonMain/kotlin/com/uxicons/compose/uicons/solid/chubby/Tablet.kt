package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tablet: ImageVector? = null

val Icons.Sc.Tablet: ImageVector
    get() = _Tablet ?: UXIcon(name = "Tablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.57f, 16.06f)
                curveToRelative(0.12f, -1.21f, 0.2f, -2.58f, 0.2f, -4.06f)
                curveToRelative(0f, -5.16f, -1.0f, -8.95f, -1.04f, -9.11f)
                curveToRelative(-0.09f, -0.33f, -0.34f, -0.59f, -0.66f, -0.69f)
                curveToRelative(-0.15f, -0.05f, -3.78f, -1.2f, -8.07f, -1.2f)
                reflectiveCurveTo(4.08f, 2.15f, 3.93f, 2.2f)
                curveToRelative(-0.33f, 0.1f, -0.57f, 0.37f, -0.66f, 0.7f)
                curveToRelative(-0.04f, 0.16f, -1.04f, 3.99f, -1.04f, 9.11f)
                curveToRelative(0f, 1.49f, 0.08f, 2.86f, 0.2f, 4.06f)
                horizontalLineTo(21.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18.06f)
                verticalLineToRelative(0.78f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.78f)
                horizontalLineTo(2.67f)
                curveToRelative(0.27f, 1.83f, 0.57f, 2.96f, 0.59f, 3.04f)
                curveToRelative(0.09f, 0.33f, 0.34f, 0.59f, 0.66f, 0.69f)
                curveToRelative(0.15f, 0.05f, 3.78f, 1.2f, 8.07f, 1.2f)
                reflectiveCurveToRelative(7.92f, -1.15f, 8.07f, -1.2f)
                curveToRelative(0.33f, -0.1f, 0.57f, -0.37f, 0.66f, -0.7f)
                curveToRelative(0.02f, -0.09f, 0.32f, -1.22f, 0.59f, -3.04f)
                horizontalLineTo(13f)
                close()
            }
        }.also { _Tablet = it}
