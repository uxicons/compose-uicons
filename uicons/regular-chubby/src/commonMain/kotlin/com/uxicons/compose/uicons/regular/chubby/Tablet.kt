package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tablet: ImageVector? = null

val Icons.Rc.Tablet: ImageVector
    get() = _Tablet ?: UXIcon(name = "Tablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.73f, 2.89f)
                curveToRelative(-0.09f, -0.33f, -0.34f, -0.59f, -0.66f, -0.69f)
                curveToRelative(-0.15f, -0.05f, -3.78f, -1.2f, -8.07f, -1.2f)
                reflectiveCurveTo(4.08f, 2.15f, 3.93f, 2.2f)
                curveToRelative(-0.33f, 0.1f, -0.57f, 0.37f, -0.66f, 0.7f)
                curveToRelative(-0.04f, 0.16f, -1.04f, 3.99f, -1.04f, 9.11f)
                curveToRelative(0f, 5.16f, 1.0f, 8.95f, 1.04f, 9.11f)
                curveToRelative(0.09f, 0.33f, 0.34f, 0.59f, 0.66f, 0.69f)
                curveToRelative(0.15f, 0.05f, 3.78f, 1.2f, 8.07f, 1.2f)
                reflectiveCurveToRelative(7.92f, -1.15f, 8.07f, -1.2f)
                curveToRelative(0.33f, -0.1f, 0.57f, -0.37f, 0.66f, -0.7f)
                curveToRelative(0.04f, -0.16f, 1.04f, -3.99f, 1.04f, -9.11f)
                curveToRelative(0f, -5.16f, -1.0f, -8.95f, -1.04f, -9.11f)
                close()
                moveTo(5.07f, 3.95f)
                curveToRelative(1.12f, -0.3f, 3.88f, -0.95f, 6.93f, -0.95f)
                reflectiveCurveToRelative(5.81f, 0.65f, 6.93f, 0.95f)
                curveToRelative(0.27f, 1.19f, 0.85f, 4.25f, 0.85f, 8.05f)
                curveToRelative(0f, 1.09f, -0.05f, 2.12f, -0.12f, 3.06f)
                lineTo(4.35f, 15.06f)
                curveToRelative(-0.07f, -0.94f, -0.12f, -1.97f, -0.12f, -3.06f)
                curveToRelative(0f, -3.76f, 0.58f, -6.85f, 0.85f, -8.05f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.05f, 0f, -5.81f, -0.65f, -6.93f, -0.95f)
                curveToRelative(-0.13f, -0.59f, -0.34f, -1.63f, -0.52f, -2.99f)
                horizontalLineToRelative(6.44f)
                verticalLineToRelative(0.78f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.78f)
                horizontalLineToRelative(6.44f)
                curveToRelative(-0.18f, 1.35f, -0.38f, 2.4f, -0.51f, 2.99f)
                curveToRelative(-1.12f, 0.3f, -3.88f, 0.95f, -6.93f, 0.95f)
                close()
            }
        }.also { _Tablet = it}
