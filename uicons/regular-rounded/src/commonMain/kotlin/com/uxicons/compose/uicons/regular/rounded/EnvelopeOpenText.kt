package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpenText: ImageVector? = null

val Icons.Rr.EnvelopeOpenText: ImageVector
    get() = _EnvelopeOpenText ?: UXIcon(name = "EnvelopeOpenText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(8f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 12.71f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0f, -1.36f, 0.56f, -2.67f, 1.54f, -3.61f)
                lineToRelative(1.46f, -1.4f)
                verticalLineToRelative(-3.7f)
                curveTo(3f, 1.79f, 4.79f, 0f, 7f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3.7f)
                lineToRelative(1.46f, 1.4f)
                curveToRelative(0.98f, 0.94f, 1.54f, 2.25f, 1.54f, 3.61f)
                close()
                moveTo(5f, 4f)
                lineTo(5f, 12.24f)
                lineToRelative(4.88f, 4.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(4.88f, -4.88f)
                lineTo(19f, 4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(7f, 2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(22f, 12.71f)
                curveToRelative(0f, -0.2f, -0.02f, -0.39f, -0.06f, -0.58f)
                lineToRelative(-6.41f, 6.41f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineTo(2.06f, 12.13f)
                curveToRelative(-0.04f, 0.19f, -0.06f, 0.38f, -0.06f, 0.58f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6.29f)
                close()
            }
        }.also { _EnvelopeOpenText = it}
