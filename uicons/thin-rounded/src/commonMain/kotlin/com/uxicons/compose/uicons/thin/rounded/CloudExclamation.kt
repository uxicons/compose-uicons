package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Tr.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(11.5f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18.15f, 7.19f)
                curveToRelative(-0.44f, -0.1f, -0.81f, -0.38f, -1f, -0.77f)
                curveToRelative(-1.62f, -3.22f, -5.1f, -4.94f, -8.68f, -4.28f)
                curveToRelative(-3.13f, 0.58f, -5.67f, 3.08f, -6.31f, 6.22f)
                curveToRelative(-0.19f, 0.93f, -0.22f, 1.87f, -0.08f, 2.8f)
                curveToRelative(0.08f, 0.57f, -0.06f, 1.07f, -0.39f, 1.39f)
                curveTo(0.6f, 13.59f, 0.0f, 15.0f, 0f, 16.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0.0f, -1.23f, 0.49f, -2.38f, 1.39f, -3.23f)
                curveToRelative(0.57f, -0.54f, 0.81f, -1.36f, 0.69f, -2.25f)
                curveToRelative(-0.12f, -0.81f, -0.09f, -1.63f, 0.07f, -2.45f)
                curveToRelative(0.56f, -2.74f, 2.77f, -4.93f, 5.51f, -5.43f)
                curveToRelative(3.13f, -0.58f, 6.18f, 0.92f, 7.6f, 3.74f)
                curveToRelative(0.33f, 0.66f, 0.94f, 1.13f, 1.68f, 1.29f)
                curveToRelative(3.05f, 0.69f, 5.18f, 3.45f, 5.07f, 6.58f)
                curveToRelative(-0.13f, 3.44f, -3.16f, 6.25f, -6.76f, 6.25f)
                horizontalLineToRelative(-0.74f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.74f)
                curveToRelative(4.13f, 0f, 7.61f, -3.23f, 7.76f, -7.21f)
                curveToRelative(0.13f, -3.61f, -2.33f, -6.81f, -5.85f, -7.6f)
                close()
            }
        }.also { _CloudExclamation = it}
