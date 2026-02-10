package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeHeart: ImageVector? = null

val Icons.Rr.EnvelopeHeart: ImageVector
    get() = _EnvelopeHeart ?: UXIcon(name = "EnvelopeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.11f, 8.34f)
                curveToRelative(0.56f, 0.45f, 1.23f, 0.67f, 1.89f, 0.67f)
                reflectiveCurveToRelative(1.34f, -0.22f, 1.89f, -0.67f)
                curveToRelative(1.2f, -0.96f, 3.11f, -3.2f, 3.11f, -5.14f)
                curveToRelative(0f, -1.76f, -1.35f, -3.2f, -3f, -3.2f)
                curveToRelative(-0.75f, 0f, -1.46f, 0.31f, -2f, 0.81f)
                curveToRelative(-0.54f, -0.49f, -1.25f, -0.81f, -2f, -0.81f)
                curveToRelative(-1.65f, 0f, -3f, 1.44f, -3f, 3.2f)
                curveToRelative(0f, 1.94f, 1.91f, 4.18f, 3.11f, 5.14f)
                close()
                moveTo(17f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.55f, 1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.45f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.54f, 1f, 1.2f)
                curveToRelative(0f, 0.97f, -1.24f, 2.69f, -2.35f, 3.57f)
                curveToRelative(-0.38f, 0.3f, -0.91f, 0.3f, -1.29f, 0f)
                curveToRelative(-1.11f, -0.89f, -2.35f, -2.6f, -2.35f, -3.57f)
                curveToRelative(0f, -0.66f, 0.45f, -1.2f, 1f, -1.2f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 8f)
                curveTo(0f, 5.24f, 2.24f, 3f, 5f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(5f, 5f)
                curveToRelative(-1.15f, 0f, -2.13f, 0.66f, -2.64f, 1.6f)
                lineToRelative(7.52f, 7.52f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(3.17f, -3.17f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.17f, 3.17f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.47f, -3.54f, 1.47f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.47f)
                lineTo(2f, 9.07f)
                verticalLineToRelative(9.93f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _EnvelopeHeart = it}
