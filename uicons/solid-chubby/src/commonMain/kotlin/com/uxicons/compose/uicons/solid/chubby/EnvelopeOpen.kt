package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpen: ImageVector? = null

val Icons.Sc.EnvelopeOpen: ImageVector
    get() = _EnvelopeOpen ?: UXIcon(name = "EnvelopeOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.23f, 14.26f)
                curveToRelative(-2.23f, 1.72f, -4.69f, 3.06f, -4.79f, 3.12f)
                curveToRelative(-0.44f, 0.24f, -0.94f, 0.37f, -1.44f, 0.37f)
                reflectiveCurveToRelative(-1.0f, -0.13f, -1.44f, -0.37f)
                curveToRelative(-0.1f, -0.06f, -2.56f, -1.4f, -4.79f, -3.12f)
                curveToRelative(-1.69f, -1.3f, -2.96f, -2.52f, -3.67f, -3.25f)
                curveToRelative(-0.17f, 1.03f, -0.3f, 2.25f, -0.3f, 3.58f)
                curveToRelative(0f, 3.85f, 1.07f, 6.79f, 1.12f, 6.91f)
                curveToRelative(0.12f, 0.32f, 0.39f, 0.56f, 0.72f, 0.63f)
                curveToRelative(0.16f, 0.04f, 4.07f, 0.88f, 8.35f, 0.88f)
                curveToRelative(4.43f, 0f, 8.2f, -0.84f, 8.36f, -0.88f)
                curveToRelative(0.33f, -0.07f, 0.6f, -0.31f, 0.72f, -0.62f)
                curveToRelative(0.05f, -0.12f, 1.12f, -3.04f, 1.12f, -6.91f)
                curveToRelative(0f, -1.34f, -0.13f, -2.55f, -0.29f, -3.58f)
                curveToRelative(-0.71f, 0.73f, -1.98f, 1.95f, -3.67f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.74f)
                curveToRelative(-0.17f, 0f, -0.33f, -0.04f, -0.48f, -0.12f)
                curveToRelative(-0.1f, -0.05f, -2.45f, -1.35f, -4.53f, -2.95f)
                curveToRelative(-2.43f, -1.88f, -3.94f, -3.57f, -4.0f, -3.64f)
                curveToRelative(-0.33f, -0.38f, -0.33f, -0.95f, 0f, -1.32f)
                curveToRelative(0.06f, -0.07f, 1.57f, -1.76f, 4.0f, -3.64f)
                curveToRelative(2.08f, -1.6f, 4.43f, -2.89f, 4.53f, -2.95f)
                curveToRelative(0.3f, -0.16f, 0.66f, -0.16f, 0.96f, 0f)
                curveToRelative(0.1f, 0.05f, 2.45f, 1.35f, 4.53f, 2.95f)
                curveToRelative(2.43f, 1.88f, 3.94f, 3.57f, 4.0f, 3.64f)
                curveToRelative(0.33f, 0.38f, 0.33f, 0.95f, 0f, 1.32f)
                curveToRelative(-0.06f, 0.07f, -1.57f, 1.76f, -4.0f, 3.64f)
                curveToRelative(-2.08f, 1.6f, -4.43f, 2.89f, -4.53f, 2.95f)
                curveToRelative(-0.15f, 0.08f, -0.31f, 0.12f, -0.48f, 0.12f)
                close()
            }
        }.also { _EnvelopeOpen = it}
