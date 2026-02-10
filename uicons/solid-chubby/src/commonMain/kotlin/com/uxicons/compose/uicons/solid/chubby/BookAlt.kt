package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAlt: ImageVector? = null

val Icons.Sc.BookAlt: ImageVector
    get() = _BookAlt ?: UXIcon(name = "BookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.37f, 3.92f)
                curveToRelative(-0.06f, -0.32f, -0.28f, -0.59f, -0.58f, -0.72f)
                curveToRelative(-0.1f, -0.04f, -2.39f, -1.03f, -5.09f, -1.03f)
                curveToRelative(-0.64f, 0f, -1.25f, 0.1f, -1.82f, 0.24f)
                curveToRelative(-1.12f, 0.29f, -1.88f, 1.34f, -1.88f, 2.5f)
                verticalLineToRelative(14.15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(4.9f)
                curveToRelative(0f, -1.16f, -0.76f, -2.2f, -1.88f, -2.5f)
                curveToRelative(-0.57f, -0.15f, -1.18f, -0.24f, -1.82f, -0.24f)
                curveToRelative(-2.7f, 0f, -5.0f, 0.99f, -5.09f, 1.03f)
                curveToRelative(-0.3f, 0.13f, -0.52f, 0.4f, -0.58f, 0.72f)
                curveToRelative(-0.03f, 0.13f, -0.63f, 3.28f, -0.63f, 7.48f)
                curveToRelative(0f, 2.39f, 0.2f, 4.43f, 0.36f, 5.72f)
                curveToRelative(0.18f, 1.42f, 1.24f, 2.59f, 2.63f, 2.91f)
                lineToRelative(7.79f, 1.8f)
                curveToRelative(0.04f, 0.01f, 0.15f, 0.03f, 0.23f, 0.03f)
                curveToRelative(0.1f, 0f, 0.21f, -0.02f, 0.23f, -0.03f)
                lineToRelative(7.79f, -1.8f)
                curveToRelative(1.39f, -0.32f, 2.45f, -1.49f, 2.63f, -2.91f)
                curveToRelative(0.16f, -1.29f, 0.36f, -3.33f, 0.36f, -5.72f)
                curveToRelative(0f, -4.2f, -0.6f, -7.34f, -0.63f, -7.48f)
                close()
            }
        }.also { _BookAlt = it}
