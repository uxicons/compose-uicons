package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeMarker: ImageVector? = null

val Icons.Ts.EnvelopeMarker: ImageVector
    get() = _EnvelopeMarker ?: UXIcon(name = "EnvelopeMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0f)
                verticalLineToRelative(9.45f)
                curveToRelative(0f, 0.6f, 0.34f, 1.14f, 0.88f, 1.4f)
                curveToRelative(0.54f, 0.26f, 1.17f, 0.19f, 1.64f, -0.19f)
                lineToRelative(1.48f, -1.19f)
                lineToRelative(1.48f, 1.19f)
                curveToRelative(0.28f, 0.23f, 0.62f, 0.34f, 0.97f, 0.34f)
                curveToRelative(0.23f, 0f, 0.46f, -0.05f, 0.68f, -0.15f)
                curveToRelative(0.54f, -0.26f, 0.88f, -0.8f, 0.88f, -1.4f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(23f, 9.45f)
                curveToRelative(0f, 0.22f, -0.12f, 0.4f, -0.31f, 0.5f)
                curveToRelative(-0.2f, 0.09f, -0.41f, 0.07f, -0.58f, -0.07f)
                lineToRelative(-2.11f, -1.69f)
                lineToRelative(-2.11f, 1.69f)
                curveToRelative(-0.17f, 0.14f, -0.39f, 0.16f, -0.58f, 0.07f)
                curveToRelative(-0.2f, -0.09f, -0.31f, -0.28f, -0.31f, -0.5f)
                lineTo(17f, 1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(8.45f)
                close()
                moveTo(23f, 13f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(11f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveTo(0f, 5.12f, 1.12f, 4f, 2.5f, 4f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.53f, 0f, -1.0f, 0.28f, -1.27f, 0.7f)
                lineToRelative(8.27f, 8.28f)
                curveToRelative(1.36f, 1.36f, 3.58f, 1.36f, 4.95f, 0f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.05f, 0.03f, 0.1f, 0.06f, 0.15f, 0.08f)
                curveToRelative(0.29f, 0.14f, 0.6f, 0.23f, 0.9f, 0.28f)
                lineToRelative(-1.75f, 1.75f)
                curveToRelative(-0.88f, 0.88f, -2.03f, 1.32f, -3.18f, 1.32f)
                reflectiveCurveToRelative(-2.31f, -0.44f, -3.18f, -1.32f)
                lineTo(1f, 6.88f)
                verticalLineToRelative(16.12f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-10f)
                close()
            }
        }.also { _EnvelopeMarker = it}
