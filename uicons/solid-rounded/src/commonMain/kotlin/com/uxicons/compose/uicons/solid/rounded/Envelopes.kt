package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelopes: ImageVector? = null

val Icons.Sr.Envelopes: ImageVector
    get() = _Envelopes ?: UXIcon(name = "Envelopes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 23f)
                lineTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(11.88f, 9.12f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(6.52f, -6.52f)
                curveToRelative(-0.91f, -0.98f, -2.2f, -1.6f, -3.64f, -1.6f)
                lineTo(9f, 1f)
                curveToRelative(-1.44f, 0f, -2.73f, 0.62f, -3.64f, 1.6f)
                lineToRelative(6.52f, 6.52f)
                close()
                moveTo(17.54f, 10.53f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(4.3f, 4.37f)
                curveToRelative(-0.18f, 0.51f, -0.3f, 1.06f, -0.3f, 1.63f)
                lineTo(4f, 14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 6f)
                curveToRelative(0f, -0.57f, -0.12f, -1.12f, -0.3f, -1.63f)
                lineToRelative(-6.17f, 6.17f)
                close()
            }
        }.also { _Envelopes = it}
