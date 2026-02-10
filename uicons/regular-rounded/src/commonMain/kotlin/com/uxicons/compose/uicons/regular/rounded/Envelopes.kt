package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelopes: ImageVector? = null

val Icons.Rr.Envelopes: ImageVector
    get() = _Envelopes ?: UXIcon(name = "Envelopes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                lineTo(9f, 1f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                lineTo(4f, 14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(0.89f, 0f, 1.69f, 0.39f, 2.24f, 1f)
                lineToRelative(-5.12f, 5.12f)
                curveToRelative(-1.17f, 1.17f, -3.07f, 1.17f, -4.24f, 0f)
                lineTo(6.76f, 4f)
                curveToRelative(0.55f, -0.62f, 1.35f, -1f, 2.24f, -1f)
                close()
                moveTo(19f, 17f)
                lineTo(9f, 17f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(6f, 6.07f)
                lineToRelative(4.46f, 4.46f)
                curveToRelative(0.97f, 0.97f, 2.26f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.56f, -0.49f, 3.54f, -1.46f)
                lineToRelative(4.46f, -4.46f)
                verticalLineToRelative(7.93f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(19f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Envelopes = it}
